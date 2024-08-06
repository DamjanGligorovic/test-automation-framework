class Login_Registration_Ad_Sasomange {
     generateEmailAddress(baseEmail = 'damjan') {
        // You can use any unique identifier here, such as a timestamp or a random string
        const uniqueIdentifier = Date.now();
        return `${baseEmail}+${uniqueIdentifier}@example.com`;

      }
        insertPassword (password)  {

        cy.get("#resident-password").type(password);
                }
        tickTheCheckbox () {
            cy.get("label[for='registration-terms-residential-default-consent']").click();
        }
        clickTheButtonRegister () {
            cy.get('#register-resident-user-screen-default > .gigya-register-form > .submit > .btn').click();
        }
        clickPravilaKoriscenja(){
            cy.get('#register-resident-user-screen-default > form > div.form-group.consent-group > div > label > span.d-none.d-sm-block > a:nth-child(1)').invoke('removeAttr', 'target').click({ force: true });

        }
        clickPolitikaPrivatnosti () {
            cy.get('#register-resident-user-screen-default > form > div.form-group.consent-group > div > label > span.d-none.d-sm-block > a:nth-child(2)').invoke('removeAttr', 'target').click({ force: true });
        }
        linkPrijaviSe () {
            cy.get('#register-resident-user-screen-default > .gigya-register-form > .login-form-footer > p > .btn--type-link').click({ force: true });
        }
        invalidEmail (email, password) {
            cy.get('.gigya-composite-control-active #resident-email').type(email);
            cy.get("#resident-password").type(password);

        }
        LeaveEmptyEmail (password)  {
            cy.get('.gigya-composite-control-active #resident-email').type(password)
    
        }
        insertinputEmail2 (email) {

            cy.get('#gigya-textbox-email-loginID').type(email);
            
        }
        insertinputEmail (email)  {

            cy.get('#gigya-textbox-loginID').type(email);
            
        }
        clickEyeButton ()  {
            cy.get("#login-screen > form > div.form-group.gigya-composite-control.gigya-composite-control-textbox.password-wrapper > div > button").click({force:true}); 
        }
        insertPassword (password) {

            cy.get('#gigya-textbox-password').type(password);
            
        }
        passwordRecoveryLink ()  {
            cy.get("#login-screen > form > div.form-group.action-link > a").click({force:true}); 
        }
        clickTheButtonPrijaviSe() {
            cy.get('#login-screen > .gigya-login-form > .submit > .btn').click({force:true});
        }
        clickTheLinkRegister() {
            cy.get('#login-screen > form > footer > p > a').click({force:true});
        }
        promenaLozinkeButton ()  {
            cy.get("#forgot-password-screen > form > div.form-group.submit > button").click({force:true}); 
        }
        clickTheButtonDodajOglas ()  {
            cy.get('.add-btn').click({force:true});
        }
        clickTheButtonVozila ()  {
            cy.get('.category-list-wrapper > :nth-child(1) > :nth-child(27)').click({force:true});
        }
        clickTheButtonAutomobili ()  {
            cy.get('.category-list-wrapper > :nth-child(2) > :nth-child(1)').click({force:true});
        }
        clickTheButtonPolovniAutomobili ()  {
            cy.get('.category-list-wrapper > :nth-child(3) > :nth-child(1)').click({force:true});
        }
        clickTheButtonNastavi ()  {
            cy.get('.step-btns-wrapper > .btn').click({force:true});
        }
        selectAudi ()  {
            cy.get('.narrow > .single-dropdown > :nth-child(1) > .selected-options').click({force:true});
            cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});        
            cy.wait(3000);
        }   
        selectCitroen ()  {
            cy.get('.narrow > .single-dropdown > :nth-child(1) > .selected-options').click({force:true});
            cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > section > div > ul > li:nth-child(21) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
            cy.wait(3000);

        }
        selectC3 ()  {
            cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > div > p').click({force:true});    
            cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > section > div > ul > li:nth-child(12) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
            cy.wait(3000);

        }

            selectA3 ()  {
            cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > div > p').click({force:true});    
            cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > section > div > ul > li:nth-child(7) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
            cy.wait(3000);

            }
            selectDizel ()  {
            cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > div > p').click({force:true});    
            cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
            cy.wait(3000);
            
            }
            selectBenzin ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > div > p').click({force:true});    
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
                cy.wait(3000);

            }
            selectLimuzina () {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > div > p').click({force:true});    
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
                cy.wait(3000);

            }
            selectHecbek ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > div > p').click({force:true});    
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > section > div > ul > li > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
                cy.wait(3000);

                    }
            select45 ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > div > p').click({force:true});    
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > section > div > ul > li > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
                cy.wait(3000);
            }
            select2022 () {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > div > p').click({force:true});    
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(3) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
                cy.wait(3000);
            }
            select2020 () {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > div > p').click({force:true});    
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(5) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
                cy.wait(3000);

            }
            selectTip ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > div > p').click({force:true});    
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > section > div > ul > li:nth-child(6) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
                cy.wait(3000);
            }
            selectTip5 ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > div > p').click({force:true});    
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > section > div > ul > li:nth-child(7) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
                cy.wait(3000);

            }
            clickKliznaVrata ()  {
                cy.get('body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > section:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > button:nth-child(1)').click({force:true});
                cy.wait(3000);

            }
            clickPlayVideo ()  {
                cy.get('.iframe').click({force:true});
                cy.wait(3000);

            }
            insertInputKapacitetPogonskeBaterije (input)  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > label > input').type(input); 
                cy.wait(3000);

            }
            selectTBelaBoja ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(11) > section > div > p').click({force:true});    
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(11) > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign').click({force:true});
                cy.wait(3000);

            }
            selectMetalik ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(11) > section > div > p').click({force:true});
                cy.wait(3000);

            }
            selectMat () {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(13) > section > ul > li:nth-child(1) > button').click({force:true});
                cy.wait(3000);

            }
            select32025 ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > div > p').click({force:true}); 
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > section > div > ul > li:nth-child(3) > label > span.checkbox-sign.round-checkbox-sign').click({force:true}); 
                cy.wait(3000);

            }
            clickCheckbox ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div.full-column.inline-checkbox > section > div:nth-child(2) > label > span.checkbox-sign.squared-checkbox-sign').click({force:true}); 
                cy.wait(3000);

            }
            insertBrojSasije (text)  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(3) > section > div.section-content-wrapper > div:nth-child(5) > section > label > input').type(text);
                cy.wait(3000);

            }
            brojRegistracijeVozila  (text)  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(3) > section > div.section-content-wrapper > div:nth-child(6) > section > label > input').type(text);
                cy.wait(3000);

            }
            predjeniKilometri (kilometri) {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > section > label > input').type(kilometri); 
                cy.wait(3000);
            }
            selectEuro2 ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > div > p').click({force:true}); 
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign').click({force:true}); 
                cy.wait(3000);

            }
            select22025 ()  {
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > div > p').click({force:true}); 
                cy.get('#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign').click({force:true}); 
                cy.wait(3000);

            }
            insertText (text)  {
                cy.get('#rich-text-editor > div.ql-editor.ql-blank').type(text);
                cy.wait(3000);

            }
            insertText1 (text)  {
                cy.get('#rich-text-editor > div.ql-editor.ql-blank').type(text);
                cy.wait(3000);

            }
            insertCena (cena)  {
                cy.get('#info-about-product > section:nth-child(2) > section:nth-child(4) > div.section-content-wrapper > section.price-section > section:nth-child(1) > label > input').type(cena);
                cy.wait(3000);

            }
            insertCena1 (cena)  {
                cy.get('#info-about-product > section:nth-child(2) > section:nth-child(4) > div.section-content-wrapper > section.price-section > section:nth-child(1) > label > input').type(cena);
                cy.wait(3000);

            }
            clickUmestoCene ()  {
                cy.get('#info-about-product > section:nth-child(2) > section:nth-child(4) > div.section-content-wrapper > section.price-section > section.null-price-titles > label:nth-child(4) > span.checkbox-sign.round-checkbox-sign').click({force:true});
                cy.wait(3000);

            }
            insertSifraArtikla (text)  {
                cy.get('#info-about-product > section:nth-child(2) > section:nth-child(4) > div.section-content-wrapper > section.add-product-half-width-section > section > label > input').type(text);
                cy.wait(3000);

            }
           
            chooseLocation (location)  {
                cy.get('#searchLocations_wrapper').click({force:true}); 
                cy.wait(3000);
                cy.get('#searchLocations_wrapper').type(location);
                cy.wait(3000);
                cy.get('#searchLocations_wrapper').type('ograd{enter}');
                cy.wait(3000);
            }
            chooseLocation1 (location)  {
                cy.get('#searchLocations_wrapper').click({force:true}); 
                cy.get('#searchLocations_wrapper').type(location);
                cy.get('#searchLocations_wrapper').type('vi Sad{enter}');
                cy.wait(3000);

            }
            clickButtonNastavi () {
                cy.get('#info-about-product > div > button.btn.btn--type-primary.step-next').click({force:true}); 
                cy.wait(3000);

            }
            typeThePhoneNumber (number)  {
                cy.get(':nth-child(1) > .form-group > .phone-prefix-wrapper > .prefix4').type(number);
                cy.wait(3000);

            }
            lickButtonSacuvajInformacije ()  {
                cy.get('.product-seller-info > form > .step-btns-wrapper > .btn--type-primary').click({force:true}); 
                cy.wait(3000);

            }
            clickPhoneNumberLink () {
                cy.get('#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element > section > section > div > div:nth-child(2) > div.contact-info-wrapper > div > ul > li > a').click({force:true}); 
                cy.get('#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element > section > section > div > div:nth-child(2) > div.contact-info-wrapper > div > ul > li > a').type('{escape}');

            }
            insertSearchBox (text)  {
                cy.get('#category-search').type(text);
                cy.wait(3000);

            }
            uploadPhotos ()  {
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

            }
            uploadPhotos2 ()  {
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

            }
            
            deleteButtonBin ()  {
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

                        }
            uploadPhotos1 ()  {
    
                cy.get('#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label').selectFile("C:/Users/Damja/OneDrive/Desktop/cypress-automation-framework/cypress/pictures/31.jpg", { force: true });
                cy.wait(5000);
            
            }
            clickOnTheButtonNazad ()  {
                cy.get("#info-about-product > div > button.btn.button--type-bordered-tertiary.step-back").click({force:true}); 
                cy.get('.buttons > .btn--type-primary').click({force:true}); 

            }
            insertYoutubeVideo (text)  {
                cy.get('.youtube-video-container > :nth-child(1) > .main-input').type(text);
                cy.wait(3000);

            }
            clickUcitajVideo ()  {
                cy.get('.youtube-video-container > :nth-child(1) > .btn').click({force:true}); 
                cy.wait(3000);

                    }
            clickRandomBackground ()  {
                cy.get('#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element').click({force:true}); 
                cy.wait(3000);

            }
            clickIconClose ()  {
                cy.get('.qr-app-banner > .icon-close').click({force:true}); 
                cy.wait(3000);

            
            }
        }
export default Login_Registration_Ad_Sasomange;