// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
//
//
// -- This is a parent command --
// Cypress.Commands.add("login", (email, password) => { ... })
//
//
// -- This is a child command --
// Cypress.Commands.add("drag", { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add("dismiss", { prevSubject: 'optional'}, (subject, options) => { ... })
Cypress.Commands.add("navigateTo_WebdriverUni_Homepage", () => {
    cy.visit("/")
})

Cypress.Commands.add("navigateTo_WebdriverUni_Checkbox_Page", () => {
    cy.visit("/" + "/Dropdown-Checkboxes-RadioButtons/index.html")
})


Cypress.Commands.add("selectProduct", productName => {
    cy.get(".fixed_wrapper .prdocutname").each(($el, index, $list) => {
        if($el.text().includes(productName)) {
            cy.wrap($el).click()
        }
    });
});

Cypress.Commands.add("addProductToBasket", productName => {
    cy.get(".fixed_wrapper .prdocutname").each(($el, index, $list) => {
        if($el.text() === productName) {
            cy.log($el.text())
            cy.get('.productcart').eq(index).click();
        }
    });
});


Cypress.Commands.add("webdriverUni_ContactForm_Submission", (firstName, lastName, email, comment, $selector, textToLocate) => {
    cy.get('[name="first_name"]').type(firstName);
    cy.get('[name="last_name"]').type(lastName);
    cy.get('[name="email"]').type(email)
    cy.get('textarea.feedback-input').type(comment)
    cy.get('[type="submit"]').click();
    cy.get($selector).contains(textToLocate)
})
Cypress.Commands.add("pcPress_Booking_Submission", (name, address, postnum, city, num, email, napomena) => {
    cy.get('input[name=ime]').type(name);
    cy.get('[name="adresa"]').type(address);
    cy.get('[name="postbroj"]').type(postnum);
    cy.get('[name="grad"]').type(city);
    cy.get('[name="telefon"]').type(num);
    cy.get('[name="email"]').type(email);
    cy.get('[name="napomena"]').type(napomena);
    
});
Cypress.Commands.add("clearInputName", ( address, postnum, city, num, email) => {
    
    cy.get('[name="adresa"]').type(address);
    cy.get('[name="postbroj"]').type(postnum);
    cy.get('[name="grad"]').type(city);
    cy.get('[name="telefon"]').type(num);
    cy.get('[name="email"]').type(email);
});
Cypress.Commands.add("clearInputAddress", ( name, postnum, city, num, email) => {
    cy.get('input[name=ime]').type(name);
    cy.get('[name="postbroj"]').type(postnum);
    cy.get('[name="grad"]').type(city);
    cy.get('[name="telefon"]').type(num);
    cy.get('[name="email"]').type(email);
});
Cypress.Commands.add("clearInputNumber", ( name, address, postnum, city, email) => {
    cy.get('input[name=ime]').type(name);
    cy.get('[name="adresa"]').type(address);
    cy.get('[name="postbroj"]').type(postnum);
    cy.get('[name="grad"]').type(city);
    cy.get('[name="email"]').type(email);
});
Cypress.Commands.add("clearInputEmail", ( name, address, postnum, city, num) => {
    cy.get('input[name=ime]').type(name);
    cy.get('[name="adresa"]').type(address);
    cy.get('[name="postbroj"]').type(postnum);
    cy.get('[name="grad"]').type(city);
    cy.get('[name="telefon"]').type(num);

});

// For JavaScript (commands.js)
Cypress.Commands.add('generateEmailAddress', (baseEmail = 'user') => {
    // You can use any unique identifier here, such as a timestamp or a random string
    const uniqueIdentifier = Date.now();
    return `${baseEmail}+${uniqueIdentifier}@example.com`;
  });

  Cypress.Commands.add("insertPassword", (password) => {

    cy.get("#resident-password").type(password);
    
});
Cypress.Commands.add("insertinputEmail2", (email) => {

    cy.get('#gigya-textbox-email-loginID').type(email);
    
});
Cypress.Commands.add("insertinputEmail", (email) => {

    cy.get('#gigya-textbox-loginID').type(email);
    
});

Cypress.Commands.add("clickPravilaKoriscenja", () => {
    cy.get('#register-resident-user-screen-default > form > div.form-group.consent-group > div > label > span.d-none.d-sm-block > a:nth-child(1)').invoke('removeAttr', 'target').click({ force: true });
})
Cypress.Commands.add("clickPolitikaPrivatnosti", () => {
    cy.get('#register-resident-user-screen-default > form > div.form-group.consent-group > div > label > span.d-none.d-sm-block > a:nth-child(2)').invoke('removeAttr', 'target').click({ force: true });
})
Cypress.Commands.add("clickOnTheLinkPrijaviSe", () => {
    cy.get('#register-resident-user-screen-default > .gigya-register-form > .login-form-footer > p > .btn--type-link').click({ force: true });
})
Cypress.Commands.add("invalidEmail", (email, password) => {
    cy.get('.gigya-composite-control-active #resident-email').type(email)
    cy.get("#resident-password").type(password);

})

Cypress.Commands.add("tickTheCheckbox", () => {
    cy.get("label[for='registration-terms-residential-default-consent']").click();
})
Cypress.Commands.add("clickTheButtonRegister", () => {
    cy.get('#register-resident-user-screen-default > .gigya-register-form > .submit > .btn').click();
})
Cypress.Commands.add("clickTheButtonRegister1", () => {
    cy.get('#login-screen > .gigya-login-form > .submit > .btn').click();
})
Cypress.Commands.add("clickTheButtonDodajOglas", () => {
    cy.get('.add-btn').click({force:true});
})
Cypress.Commands.add("clickTheLinkRegister", () => {
    cy.get('#login-screen > form > footer > p > a').click({force:true});
})
Cypress.Commands.add("clickTheButtonVozila", () => {
    cy.get('.category-list-wrapper > :nth-child(1) > :nth-child(27)').click({force:true});
})
Cypress.Commands.add("clickTheButtonAutomobili", () => {
    cy.get('.category-list-wrapper > :nth-child(2) > :nth-child(1)').click({force:true});
})
Cypress.Commands.add("clickTheButtonPolovniAutomobili", () => {
    cy.get('.category-list-wrapper > :nth-child(3) > :nth-child(1)').click({force:true});
})
Cypress.Commands.add("clickTheButtonNastavi", () => {
    cy.get('.step-btns-wrapper > .btn').click({force:true});
})
Cypress.Commands.add("clickIconClose", () => {
    cy.get('.icon-close').click({force:true});
})
Cypress.Commands.add("clickKliznaVrata", () => {
    cy.get('body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > section:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > button:nth-child(1)').click({force:true});
    cy.wait(3000);
})
Cypress.Commands.add("clickPlayVideo", () => {
    cy.get('.iframe').click({force:true});
    cy.wait(3000);
})
Cypress.Commands.add("clickUmestoCene", () => {
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(4) > div.section-content-wrapper > section.price-section > section.null-price-titles > label:nth-child(4) > span.checkbox-sign.round-checkbox-sign').click({force:true});
})
Cypress.Commands.add("selectAudi", () => {
    cy.get('.narrow > .single-dropdown > :nth-child(1) > .selected-options').click({force:true});
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
})
Cypress.Commands.add("selectCitroen", () => {
    cy.get('.narrow > .single-dropdown > :nth-child(1) > .selected-options').click({force:true});
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > section > div > ul > li:nth-child(21) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
})
Cypress.Commands.add("selectA3", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > section > div > ul > li:nth-child(7) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("selectC3", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > section > div > ul > li:nth-child(12) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("selectDizel", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("selectBenzin", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("selectLimuzina", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("selectHecbek", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > section > div > ul > li > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("select45", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > section > div > ul > li > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("select2022", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(3) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("select2020", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(5) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("selectTip", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > section > div > ul > li:nth-child(6) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("selectTip5", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > section > div > ul > li:nth-child(7) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("insertInputKapacitetPogonskeBaterije", (input) => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > label > input').type(input); 
})
Cypress.Commands.add("selectTBelaBoja", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(11) > section > div > p').click({force:true});    
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(11) > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});

})
Cypress.Commands.add("predjeniKilometri", (kilometri) => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > section > label > input').type(kilometri); 

})
Cypress.Commands.add("selectMetalik", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(11) > section > div > p').click({force:true});
})
Cypress.Commands.add("selectMat", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(13) > section > ul > li:nth-child(1) > button').click({force:true});
})
Cypress.Commands.add("selectEuro2", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > div > p').click({force:true}); 
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign').click({force:true}); 

})
Cypress.Commands.add("select22025", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > div > p').click({force:true}); 
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign').click({force:true}); 

})
Cypress.Commands.add("select32025", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > div > p').click({force:true}); 
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > section > div > ul > li:nth-child(3) > label > span.checkbox-sign.round-checkbox-sign').click({force:true}); 

})
Cypress.Commands.add("insertText", (text) => {
    cy.get('#rich-text-editor > div.ql-editor.ql-blank').type(text);

})
Cypress.Commands.add("insertSifraArtikla", (text) => {
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(4) > div.section-content-wrapper > section.add-product-half-width-section > section > label > input').type(text);

})
Cypress.Commands.add("insertText1", (text) => {
    cy.get('#rich-text-editor > div.ql-editor.ql-blank').type(text);

})
Cypress.Commands.add("insertCena", (cena) => {
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(4) > div.section-content-wrapper > section.price-section > section:nth-child(1) > label > input').type(cena);

})
Cypress.Commands.add("insertCena1", (cena) => {
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(4) > div.section-content-wrapper > section.price-section > section:nth-child(1) > label > input').type(cena);

})
Cypress.Commands.add("chooseLocation", (location) => {
    cy.get('#searchLocations_wrapper').click({force:true}); 
    cy.get('#searchLocations_wrapper').type(location);
    cy.get('#searchLocations_wrapper').type('Beograd{enter}');

})
Cypress.Commands.add("chooseLocation1", (location) => {
    cy.get('#searchLocations_wrapper').click({force:true}); 
    cy.get('#searchLocations_wrapper').type(location);
    cy.get('#searchLocations_wrapper').type('vi Sad{enter}');

})
Cypress.Commands.add("clickButtonNastavi", () => {
    cy.get('#info-about-product > div > button.btn.btn--type-primary.step-next').click({force:true}); 


})
Cypress.Commands.add("typeThePhoneNumber", (number) => {
    cy.get(':nth-child(1) > .form-group > .phone-prefix-wrapper > .prefix4').type(number);

})
Cypress.Commands.add("clickButtonSacuvajInformacije", () => {
    cy.get('.product-seller-info > form > .step-btns-wrapper > .btn--type-primary').click({force:true}); 
})
Cypress.Commands.add("clickUcitajVideo", () => {
    cy.get('.youtube-video-container > :nth-child(1) > .btn').click({force:true}); 
})
Cypress.Commands.add("clickCheckbox", () => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div.full-column.inline-checkbox > section > div:nth-child(2) > label > span.checkbox-sign.squared-checkbox-sign').click({force:true}); 
})
Cypress.Commands.add("clickPhoneNumberLink", () => {
    cy.get('#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element > section > section > div > div:nth-child(2) > div.contact-info-wrapper > div > ul > li > a').click({force:true});
    cy.get('#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element > section > section > div > div:nth-child(2) > div.contact-info-wrapper > div > ul > li > a').type('{escape}');
})
Cypress.Commands.add("insertSearchBox", (text) => {
    cy.get('#category-search').type(text);

})
Cypress.Commands.add("insertYoutubeVideo", (text) => {
    cy.get('.youtube-video-container > :nth-child(1) > .main-input').type(text);

})
Cypress.Commands.add("insertBrojSasije", (text) => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(3) > section > div.section-content-wrapper > div:nth-child(5) > section > label > input').type(text);

})
Cypress.Commands.add("brojRegistracijeVozila ", (text) => {
    cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(3) > section > div.section-content-wrapper > div:nth-child(6) > section > label > input').type(text);

})
Cypress.Commands.add("uploadPhotos", () => {
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div.input-photo-field.big > label').click({force:true});

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div.input-photo-field.big > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/1.jpg", { force: true });
    cy.wait(3000);
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').click({force:true});

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/2.jpg", { force: true });
    cy.wait(5000);
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/3.jpg", { force: true });
    cy.wait(5000);
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/4.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/5.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/6.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/7.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/8.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/9.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/10.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/11.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/12.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/13.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/14.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/15.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/16.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/17.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/18.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/19.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/20.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/21.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/22.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/23.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/24.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/25.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/26.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/27.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/28.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/29.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/30.jpg", { force: true });
    cy.wait(5000);

})
Cypress.Commands.add("uploadPhotos2", () => {
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div.input-photo-field.big > label').click({force:true});

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div.input-photo-field.big > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/1.jpg", { force: true });
    cy.wait(3000);
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').click({force:true});

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/2.jpg", { force: true });
    cy.wait(5000);
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/3.jpg", { force: true });
    cy.wait(5000);
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/4.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/5.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/6.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/7.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/8.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/9.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/10.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/11.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/12.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/13.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/14.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/15.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/16.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/17.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/18.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/19.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/20.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/21.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/22.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/23.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/24.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/25.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/26.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/27.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/28.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/29.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/30.jpg", { force: true });
    cy.wait(5000);

    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/31.jpg", { force: true });
    cy.wait(5000);

})


Cypress.Commands.add("clickRandomBackground", () => {
    cy.get('#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element').click({force:true}); 
})
Cypress.Commands.add("deleteButtonBin", () => {
    cy.get(':nth-child(1) > .photo-placeholder-wrapper > .edit-photo-options > .red').click({force:true}); 
                cy.wait(5000);
                cy.get('body > div.modal.confirmation-modal-user-profile.vfm.vfm--fixed.vfm--inset > div.vfm__content.vfm--outline-none.modal-dialog > div > div.modal-body > div > button.btn.btn--type-primary').click({force:true}); 
                cy.wait(5000);
                cy.get(':nth-child(1) > .photo-placeholder-wrapper > .edit-photo-options > .green').click({force:true}); 
                cy.wait(5000);
                cy.get('.image-edit-buttons-wrapper > :nth-child(1)').click({force: true});
                cy.wait(5000);
                cy.get('.image-edit-buttons-wrapper > :nth-child(2)').click({force:true}); 
                cy.wait(5000);
                cy.get('.image-edit-buttons-wrapper > :nth-child(3)').click({force:true}); 
                cy.wait(5000);
                cy.get('#productImageModal > div.vfm__content.vfm--outline-none.modal-dialog > div > div.modal-body > div > button').click({force:true}); 

})
Cypress.Commands.add("uploadPhotos1", () => {
    
    cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/31.jpg", { force: true });
    cy.wait(5000);

})
Cypress.Commands.add("clickIconClose", () => {
    cy.get('.qr-app-banner > .icon-close').click({force:true}); 


})
Cypress.Commands.add('clearInput', (selector) => {
    cy.get(selector).clear();
  });
  Cypress.Commands.add('clearInput1', (selector1) => {
    cy.get(selector1).clear();
  });
  Cypress.Commands.add('clearInput2', (selector2) => {
    cy.get(selector2).clear();
  });


  
  
Cypress.Commands.add("amountKolicina_Inserting", (amount) => {
    cy.get("#kolselektor0").type(amount)
})
Cypress.Commands.add("passwordRecoveryLink", () => {
    cy.get("#login-screen > form > div.form-group.action-link > a").click({force:true}); 
})
Cypress.Commands.add("promenaLozinkeButton", () => {
    cy.get("#forgot-password-screen > form > div.form-group.submit > button").click({force:true}); 
})
Cypress.Commands.add("clickOnTheButtonNazad", () => {
    cy.get("#info-about-product > div > button.btn.button--type-bordered-tertiary.step-back").click({force:true}); 
    cy.get('.buttons > .btn--type-primary').click({force:true}); 
})
Cypress.Commands.add("clickEyeButton", () => {
    cy.get("#login-screen > form > div.form-group.gigya-composite-control.gigya-composite-control-textbox.password-wrapper > div > button").click({force:true}); 
})
Cypress.Commands.add("verifyRadiantTee", () => {
    cy.url().should('include', "https://magento.softwaretestingboard.com/");
        cy.title().should('include', "Home Page");
        cy.get('.product-item-info').eq(0).contains('Radiant Tee').invoke('text').then((itemBeforeClick) => {     
        cy.get('.product-item-info').eq(0).click();
        cy.url().should('include', "/radiant-tee.html");
        cy.title().should('include', "Radiant Tee");
        cy.get('.base', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
        });
    });
    Cypress.Commands.add("verifyRadiantTee1", () => {
        cy.visit("https://magento.softwaretestingboard.com/");
        cy.url().should('include', "https://magento.softwaretestingboard.com/");
        cy.title().should('include', "Home Page");
        cy.get('.product-item-info').eq(0).contains('$22.00')
        .invoke('text')
        .then((itemBeforeClick) => {
        cy.get('.product-item-info').eq(0).click(); 
        cy.url().should('include', "/radiant-tee.html");
        cy.title().should('include', "Radiant Tee");
        cy.get('#product-price-1556 > span', { timeout: 30000 })
        .should('have.text', itemBeforeClick.trim());
    });
});
        Cypress.Commands.add("verifyRadiantTee2", () => {
            cy.url().should('include', "https://magento.softwaretestingboard.com/");
            cy.title().should('include', "Home Page");
            const expectedSrc = 'https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/s/ws12-orange_main_2.jpg';
            cy.get('.product-item-info').eq(0).click();
            cy.url().should('include', "/radiant-tee.html");
            cy.title().should('include', "Radiant Tee");
            cy.get("[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/w/s/ws12-orange_main_2.jpg']", { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
            expect(actualSrc).to.not.equal(expectedSrc);
                });
            });
            Cypress.Commands.add("verifyBreatheEasyTank", () => {
                cy.url().should('include', "https://magento.softwaretestingboard.com/");
                cy.title().should('include', "Home Page");
                const expectedSrc = 'https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/s/ws12-orange_main_2.jpg';
                cy.get('.product-item-info').eq(0).click();
                cy.url().should('include', "/radiant-tee.html");
                cy.title().should('include', "Radiant Tee");
                cy.get("[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/w/s/ws12-orange_main_2.jpg']", { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
                expect(actualSrc).to.not.equal(expectedSrc);
                    });
                });
                Cypress.Commands.add("verifyBreatheEasyTank1", () => {
                    cy.url().should('include', "https://magento.softwaretestingboard.com/");
                    cy.title().should('include', "Home Page");
                    cy.get('.product-item-info').eq(1).contains('$34.00').invoke('text').then((itemBeforeClick) => {     
                    cy.get('.product-item-info').eq(1).click();
                    cy.url().should('include', "/breathe-easy-tank.html");
                    cy.title().should('include', "Breathe-Easy Tank");
                    cy.get('#product-price-1812 > span', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
                    });
                });
                Cypress.Commands.add("verifyBreatheEasyTank2", () => {
                    cy.url().should('include', "https://magento.softwaretestingboard.com/");
                    cy.title().should('include', "Home Page");
                    cy.get('.product-item-info').eq(1).contains('$34.00').invoke('text').then((itemBeforeClick) => {     
                    cy.get('.product-item-info').eq(1).click();
                    cy.url().should('include', "/breathe-easy-tank.html");
                    cy.title().should('include', "Breathe-Easy Tank");
                    cy.get('#product-price-1812 > span', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
                    });
                });
                Cypress.Commands.add("verifyArgusAllWeatherTank", () => {
                    cy.visit("https://magento.softwaretestingboard.com/");
                    cy.url().should('include', "https://magento.softwaretestingboard.com/");
                    cy.title().should('include', "Home Page");
                    cy.get('.product-item-info').eq(2).contains('Argus All-Weather Tank').invoke('text') .then((itemBeforeClick) => {
                    cy.get('.product-item-info').eq(2).click();
                    cy.url().should('include', "/argus-all-weather-tank.html");
                    cy.title().should('include', "Argus All-Weather Tank");
                    cy.get('.base', { timeout: 30000 })
                    .should('have.text', itemBeforeClick.trim());
                    });
                });
                Cypress.Commands.add("verifyArgusAllWeatherTank1", () => {
                    cy.url().should('include', "https://magento.softwaretestingboard.com/");
                    cy.title().should('include', "Home Page");
                    cy.get('.product-item-info').eq(2).contains('$22.00').invoke('text').then((itemBeforeClick) => {     
                    cy.get('.product-item-info').eq(2).click();
                    cy.url().should('include', "/argus-all-weather-tank.html");
                    cy.title().should('include', "Argus All-Weather Tank");
                    cy.get('#product-price-694', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
                    });
                });
                    Cypress.Commands.add("verifyArgusAllWeatherTank2", () => {
                        cy.url().should('include', "https://magento.softwaretestingboard.com/");
                        cy.title().should('include', "Home Page");
                        const expectedSrc = '[src="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/m/t/mt07-gray_main_1.jpg"]';
                        cy.get('.product-item-info').eq(2).click();
                        cy.url().should('include', "/argus-all-weather-tank.html");
                        cy.title().should('include', "Argus All-Weather Tank");
                        cy.get("[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/m/t/mt07-gray_main_1.jpg']", { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
                        expect(actualSrc).to.not.equal(expectedSrc);
                        });
                });
                Cypress.Commands.add("verifyHeroHoodie", () => {
                    cy.url().should('include', "https://magento.softwaretestingboard.com/");
                    cy.title().should('include', "Home Page");
                    cy.get('.product-item-info').eq(3).contains('Hero Hoodie').invoke('text').then((itemBeforeClick) => {
                    cy.get('.product-item-info').eq(3).click()
                    cy.url().should('include', "/hero-hoodie.html");
                    cy.title().should('include', "Hero Hoodie");
                    cy.get('.base', {timeout: 30000}).should('have.text', itemBeforeClick.trim());
                    });
                });
                    Cypress.Commands.add("verifyHeroHoodie1", () => {
                        cy.url().should('include', "https://magento.softwaretestingboard.com/");
            cy.url().should('include', "https://magento.softwaretestingboard.com/");
            cy.title().should('include', "Home Page");
            cy.get('.product-item-info').eq(3).contains('$54.00').invoke('text').then((itemBeforeClick) => {     
            cy.get('.product-item-info').eq(3).click();
            cy.url().should('include', "/hero-hoodie.html");
            cy.title().should('include', "Hero Hoodie");
            cy.get('#product-price-158 > span', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
            });
        });
                        Cypress.Commands.add("verifyHeroHoodie2", () => {
                            cy.url().should('include', "https://magento.softwaretestingboard.com/");
                cy.title().should('include', "Home Page");
                const expectedSrc = '[src="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/m/h/mh07-gray_main_2.jpg"]';
                cy.get('.product-item-info').eq(3).click();
                cy.url().should('include', "/hero-hoodie.html");
                cy.title().should('include', "Hero Hoodie");
                cy.get("[src='https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/m/h/mh07-gray_main_2.jpg']", { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
                expect(actualSrc).to.not.equal(expectedSrc);
                });
            });
            
            Cypress.Commands.add("verifyFusionBackpack", () => {
                cy.url().should('include', "https://magento.softwaretestingboard.com/");
                cy.title().should('include', "Home Page");
                cy.get('.product-item-info').eq(4).contains('Fusion Backpack').invoke('text').then((itemBeforeClick) => {
                cy.get('.product-item-info').eq(4).click()
                cy.url().should('include', "/fusion-backpack.html");
                cy.title().should('include', "Fusion Backpack");
                cy.get('.base', {timeout: 30000}).should('have.text', itemBeforeClick.trim());
                });
});
Cypress.Commands.add("verifyFusionBackpack", () => {
    cy.url().should('include', "https://magento.softwaretestingboard.com/");
                        cy.title().should('include', "Home Page");
                        cy.get('.product-item-info').eq(4).contains('$59.00').invoke('text').then((itemBeforeClick) => {     
                        cy.get('.product-item-info').eq(4).click();
                        cy.url().should('include', "/fusion-backpack.html");
                        cy.title().should('include', "Fusion Backpack");
                        cy.get('#product-price-6 > span', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
                        });
});
Cypress.Commands.add("verifyPushItMessengerBag", () => {
    cy.url().should('include', "https://magento.softwaretestingboard.com/");
                            cy.title().should('include', "Home Page");
                            cy.get('.product-item-info').eq(5).contains('Push It Messenger Bag').invoke('text').then((itemBeforeClick) => {
                            cy.get('.product-item-info').eq(5).click();
                            cy.url().should('include', "/fusion-backpack.html");
                            cy.title().should('include', "Push It Messenger Bag");
                            cy.get('.base', {timeout: 30000}).should('have.text', itemBeforeClick.trim());
                            });
                        });
                        Cypress.Commands.add("verifyPushItMessengerBag1", () => {
                            cy.url().should('include', "https://magento.softwaretestingboard.com/");
                                cy.title().should('include', "Home Page");
                                cy.get('.product-item-info').eq(5).contains('$45.00').invoke('text').then((itemBeforeClick) => {     
                                cy.get('.product-item-info').eq(5).click();
                                cy.url().should('include', "/push-it-messenger-bag.html");
                                cy.title().should('include', "Push It Messenger Bag");
                                cy.get('#product-price-14 > span', { timeout: 30000 }).should('have.text', itemBeforeClick.trim());
                                });
                            });
                                Cypress.Commands.add("verifyPushItMessengerBag2", () => {
                                    cy.url().should('include', "https://magento.softwaretestingboard.com/");
                                    cy.title().should('include', "Home Page");
                                    const expectedSrc = '[src="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/b/wb04-blue-0.jpg"]';
                                    cy.get('.product-item-info').eq(5).click();
                                    cy.url().should('include', "/push-it-messenger-bag.html");
                                    cy.title().should('include', "Push It Messenger Bag");
                                    cy.get('[src="https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/d34482110da20c5e24f97c38fb219fb3/w/b/wb04-blue-0.jpg"]', { timeout: 30000 }).invoke('attr', 'src').then((actualSrc) => {
                                    expect(actualSrc).to.not.equal(expectedSrc);
                                    });
                                                });
Cypress.Commands.add("napomenaField_Inserting", (napomena) => {
    cy.get('textarea[placeholder=Dodatne informacije...][name=napomena]').type(napomena)
})
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite("visit", (originalFn, url, options) => { ... })
import 'cypress-file-upload';
