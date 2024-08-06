import Homepage_PCPRESS from '../../support/pageObjects/webdriver-uni/Homepage_PCPRESS';
import Proinvoice_Form_PCPRESS from '../../support/pageObjects/webdriver-uni/Proinvoice_Form_PCPRESS';

/// <reference types="cypress" />

describe('Booking the journal', () => {
  const homepage_PCPRESS = new Homepage_PCPRESS();
  const proinvoice_Form_PCPRESS = new Proinvoice_Form_PCPRESS();

  beforeEach(function () {
    homepage_PCPRESS.visitHomepage();
    
    // Load the fixture and store data in the test context
    cy.fixture('pcpress').then((data) => {
      this.data = data;
    });
   
    Cypress.on('uncaught:exception', (err, runnable) => {
      // Return false if you don't want Cypress to fail the test
      return false;
    });

    // Clear cookies and reload within the command chain
    cy.wrap(null).then(() => {
      cy.clearCookies();
      cy.reload();
    });
  });

  it('Order 1 of "Godisnja pretplata na časopis PS(11 brojeva) via Plaćam uplatnicom" option by using valid data in mandatory fields 1', function () {
    homepage_PCPRESS.clickOnTheCheckbox();
    homepage_PCPRESS.clickOnTheMainButtonKupujem();
    proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
      this.data.name,
      this.data.address,
      this.data.postnum,
      this.data.city,
      this.data.num,
      this.data.email
    );

    homepage_PCPRESS.clickOnTheButtonNarucujem();

    // Assertions
    cy.url().should('include', "/naruceno.php");
    cy.contains('Greška! Molimo Vas unesite ispravno Ime i prezime.Greška! Molimo Vas unesite ispravnu Ulicu i Broj.').should('be.visible');
  });

  it('Order 100 of "Polugodisnja pretplata na casopis PC (6 brojeva)" via "Plaćam uplatnicom" option by using valid data in all fields', function () {
    homepage_PCPRESS.clickOnTheCheckbox0();
    homepage_PCPRESS.typeAmountTheKolicina(
    this.data.amount
    );
    homepage_PCPRESS.clickOnTheMainButtonKupujem();
    proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
      this.data.name1,
      this.data.address1,
      this.data.postnum1,
      this.data.city1,
      this.data.num1,
      this.data.email1
    );
    proinvoice_Form_PCPRESS.napomenaField_Inserting(
      this.data.napomena1
    );

    homepage_PCPRESS.clickOnTheButtonNarucujem();

    // Assertions
    cy.url().should('include', "/naruceno.php");
    cy.contains('Greška! Molimo Vas unesite ispravno Ime i prezime.Greška! Molimo Vas unesite ispravnu Ulicu i Broj.').should('be.visible');
  });
  it('Order 2 of "Pretplata na digitalno izdanje časopisa PCPolugodišnja" via "Plaćam uplatnicom" option by using valid data in mandatory fields', function () {
    homepage_PCPRESS.clickOnTheCheckbox15();
    cy.clearInput("#kolselektor15");
    homepage_PCPRESS.typeAmountTheKolicina15(
    this.data.amount1
    );
    homepage_PCPRESS.clickOnTheMainButtonKupujem();
    proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
      this.data.name2,
      this.data.address2,
      this.data.postnum2,
      this.data.city2,
      this.data.num2,
      this.data.email2
    );
   

    homepage_PCPRESS.clickOnTheButtonNarucujem();

    // Assertions
    cy.url().should('include', "/naruceno.php");
    cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('be.visible');
  });
  it('Order 99 of "Knjiga 50 godina računarstva u Srbiji" via "Plaćam uplatnicom"option by using valid data in mandatory fields', function () {
    homepage_PCPRESS.clickOnTheCheckbox4();
    cy.clearInput1("#kolselektor4");
    homepage_PCPRESS.typeAmountTheKolicina4(
    this.data.amount2
    );
    homepage_PCPRESS.clickOnTheMainButtonKupujem();
    proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
      this.data.name3,
      this.data.address3,
      this.data.postnum3,
      this.data.city3,
      this.data.num3,
      this.data.email3
    );
   

    homepage_PCPRESS.clickOnTheButtonNarucujem();

    // Assertions
    cy.url().should('include', "/naruceno.php");
    cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('be.visible');
  });
  it('Order magazine with dropdown menu via "Plaćam uplatnicom"option by using valid data in mandatory fields', function () {
    homepage_PCPRESS.clickOnTheCheckboxArhiva();
    homepage_PCPRESS.clickOnTheDropdownOption37();
    homepage_PCPRESS.clickOnTheMainButtonKupujem();
    proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
      this.data.name4,
      this.data.address4,
      this.data.postnum4,
      this.data.city4,
      this.data.num4,
      this.data.email4
    );
   

    homepage_PCPRESS.clickOnTheButtonNarucujem();

    // Assertions
    cy.url().should('include', "/naruceno.php");
    cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('be.visible');
  });
  it('Order a magazine with dropdown menu and with “Kolicina “ field via "Plaćam uplatnicom" option by using valid data in mandatory fields', function () {
    homepage_PCPRESS.clickOnTheCheckbox6();
    homepage_PCPRESS.clickOnTheDropdownOption310();
    homepage_PCPRESS.clickOnTheCheckbox();
    homepage_PCPRESS.clickOnTheMainButtonKupujem();
    proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
      this.data.name5,
      this.data.address5,
      this.data.postnum5,
      this.data.city5,
      this.data.num5,
      this.data.email5
    );
   

    homepage_PCPRESS.clickOnTheButtonNarucujem();

    // Assertions
    cy.url().should('include', "/naruceno.php");
    cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('be.visible');
  });
  it('Inspect the “PC press” logo located in header of the page', function () {
   
   homepage_PCPRESS.clickOnTheLogoPCPressHomePageHeader();

   

    cy.url().should('include', "https://pcpress.rs/");
    cy.title().should('include', "PC Press - Business & ICT News");

  });
  it('Inspect the link under the Feed icon', function () {
    homepage_PCPRESS.clickOnTheFeedLogo();
    cy.url().should('include', "https://pcpress.rs/feed/");
    cy.title().should('not.include', "PC Press - Business & ICT News");
  });
  it('Inspect the PC press logo located in footer', function () {
    homepage_PCPRESS.clickOnThePCPressFooterLogo();
    cy.url().should('include', "https://pcpress.rs/");
    cy.title().should('include', "PC Press - Business & ICT News");
});
it('Inspect the link under the Newsletter icon', function () {
    homepage_PCPRESS.clickOnThePCPressNewsletter();
    cy.url().should('include', "https://pcpress.rs/newsletter/");
    cy.title().should('include', "403 Forbidden");
    cy.contains("Forbidden You don't have permission to access /newsletter/ on this server.")
});
it('Inspect the link under the Facebook icon', function () {
  homepage_PCPRESS.clickOnThePCPressFacebook();
  cy.url().should('include', "https://www.facebook.com/pcpress.rs");
  cy.title().should('include', "Facebook");
});
it('Inspect the link under the Twiter icon', function () {
  homepage_PCPRESS.clickOnThePCPressTwitter();
  cy.url().should('include', "https://x.com/i/flow/login?redirect_after_login=%2FPCPressRS");
  cy.title().should('include', "Log in to X / X");
});
it('Inspect the link Pravila Koriscenja', function () {
  homepage_PCPRESS.clickOnThePCPressPravilaKoriscenja();
  cy.url().should('include', "https://pcpress.rs/pravila-koriscenja-sajta/");
  cy.title().should('include', "Pravila korišćenja sajta | PC Press");

});
it('On Predracun inspect the link prodavnica.pcpress.rs', function () {
   homepage_PCPRESS.clickOnTheCheckbox9();
   homepage_PCPRESS.clickOnTheMainButtonKupujem();
   proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name6,
      this.data.address6,
      this.data.postnum6,
      this.data.city6,
      this.data.num6,
      this.data.email6
   );
   homepage_PCPRESS.clickOnTheButtonNarucujem();
   cy.url().should('include', "/naruceno.php");
   cy.title().should('include', "PC prodavnica");
   cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('be.visible');
    homepage_PCPRESS.clickOnProdavnicaLinkProinvoice();
    cy.url().should('include', "https://prodavnica.pcpress.rs/");
    cy.title().should('include', "PC Press");
  });

it('On Predracun inspect the link prodaja@pcpress.rs', function () {
  homepage_PCPRESS.clickOnTheCheckbox10();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
   this.data.name7,
     this.data.address7,
     this.data.postnum7,
     this.data.city7,
     this.data.num7,
     this.data.email7
  );
  homepage_PCPRESS.clickOnTheButtonNarucujem();
  cy.url().should('include', "/naruceno.php");
  cy.title().should('include', "PC prodavnica");
  cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('be.visible');
   homepage_PCPRESS.clickOnProdajaPCPres();

   cy.url().should('include', "/naruceno.php");

});
it('On Predracun inspect the link PC Prodavnice', function () {
  homepage_PCPRESS.clickOnTheCheckbox12();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
     this.data.name8,
     this.data.address8,
     this.data.postnum8,
     this.data.city8,
     this.data.num8,
     this.data.email8
  );
  homepage_PCPRESS.clickOnTheButtonNarucujem();
  cy.url().should('include', "/naruceno.php");
  cy.title().should('include', "PC prodavnica");
  cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('be.visible');
   homepage_PCPRESS.clickOnProdavnicaLinkProdavnice();

   cy.url().should('include', "https://pcpress.rs/prodavnica/index.php");
});
it('On Predracun inspect the link PC Prodavnice', function () {
  homepage_PCPRESS.clickOnTheCheckbox();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
     this.data.name9,
     this.data.address9,
     this.data.postnum9,
     this.data.city9,
     this.data.num9,
     this.data.email9
  );
  homepage_PCPRESS.clickOnTheButtonNarucujem();
  cy.url().should('include', "/naruceno.php");
  cy.title().should('include', "PC prodavnica");
  cy.contains('Greška! Molimo Vas unesite ispravno Ime i prezime.').should('be.visible');
   homepage_PCPRESS.clickOnLinkPovratakNarudzbenici();

   cy.url().should('include', "chrome-error://chromewebdata/");

});

it('Inspect the button “Odustajem', function () {
  homepage_PCPRESS.clickOnTheCheckbox();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  homepage_PCPRESS.clickOnButtonOdustajem();
  cy.url().should('include', "https://pcpress.rs/prodavnica/index.php");
  cy.title().should('include', "PC prodavnica");



})
it('Inspect the button X-closeispis', function () {
  homepage_PCPRESS.clickOnTheCheckbox();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  homepage_PCPRESS.clickOnButtonX();
  cy.url().should('include', "https://pcpress.rs/prodavnica/index.php");
  cy.title().should('include', "PC prodavnica");

});
it('Order a magazine by using negative inputs in “Kolicina” field', function () {
  homepage_PCPRESS.clickOnTheCheckbox();
  cy.clearInput2("#kolselektor1");
  homepage_PCPRESS.typeAmountTheKolicina1(
    this.data.amount3,
  );
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
      this.data.name2,
      this.data.address2,
      this.data.postnum2,
      this.data.city2,
      this.data.num2,
      this.data.email2
 );
 homepage_PCPRESS.clickOnTheButtonNarucujem();
 cy.url().should('include', "/naruceno.php");
 cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('not.exist');
});

 it('Order a magazine by using negative inputs in “Kolicina” field', function () {

  homepage_PCPRESS.clickOnTheCheckbox();
  cy.clearInput2("#kolselektor1");
  homepage_PCPRESS.typeAmountTheKolicina1(
    this.data.amount4,
  );
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
      this.data.name2,
      this.data.address2,
      this.data.postnum2,
      this.data.city2,
      this.data.num2,
      this.data.email2
 );
 homepage_PCPRESS.clickOnTheButtonNarucujem();
 cy.url().should('include', "/naruceno.php");
 cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('not.exist');
 it('Order a magazine by using negative inputs in “Kolicina” field', function () {
 });
  
  homepage_PCPRESS.clickOnTheCheckbox();
  cy.clearInput2("#kolselektor1");
  homepage_PCPRESS.typeAmountTheKolicina1(
    this.data.amount5,
  );
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
      this.data.name2,
      this.data.address2,
      this.data.postnum2,
      this.data.city2,
      this.data.num2,
      this.data.email2
 );
 homepage_PCPRESS.clickOnTheButtonNarucujem();
 cy.url().should('include', "/naruceno.php");
 cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('not.exist');
});
 it('Order a magazine by using negative inputs in “Kolicina” field', function () {

  homepage_PCPRESS.clickOnTheCheckbox();
 cy.clearInput2("#kolselektor1");
 homepage_PCPRESS.typeAmountTheKolicina1(
   this.data.amount6,
 );
 homepage_PCPRESS.clickOnTheMainButtonKupujem();
 proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
     this.data.name2,
     this.data.address2,
     this.data.postnum2,
     this.data.city2,
     this.data.num2,
     this.data.email2
);
homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('exist');

 });
it('Order a magazine by using negative inputs in “Kolicina” field', function () {
  homepage_PCPRESS.clickOnTheCheckbox();
cy.clearInput2("#kolselektor1");

homepage_PCPRESS.clickOnTheMainButtonKupujem();



cy.contains('Greška! U izabranom artiklu Godišnja pretplata na časopis PC (11 brojeva) niste upisali količinu.').should('exist');
cy.contains('Greška! U izabranom artiklu Godišnja pretplata na časopis PC (11 brojeva) upisana količina mora biti broj.').should('exist');
});
it('Order a magazine by using negative inputs in “Kolicina” field', function () {


homepage_PCPRESS.clickOnTheCheckbox();
cy.clearInput2("#kolselektor1");
homepage_PCPRESS.typeAmountTheKolicina1(
  this.data.amount8,
);
homepage_PCPRESS.clickOnTheMainButtonKupujem();
cy.contains("Greška! U izabranom artiklu Godišnja pretplata na časopis PC (11 brojeva) upisana količina mora biti broj.").should('exist');


});



it('Order a magazine by using negative inputs in “Kolicina” field', function () {
  homepage_PCPRESS.clickOnTheCheckbox();
cy.clearInput2("#kolselektor1");
homepage_PCPRESS.typeAmountTheKolicina1(
  this.data.amount9,
);
homepage_PCPRESS.clickOnTheMainButtonKupujem();
cy.contains("Greška! U izabranom artiklu Godišnja pretplata na časopis PC (11 brojeva) upisana količina mora biti broj.").should('exist');
});
it('Order more than one magazine from drop down menu', function () {
  homepage_PCPRESS.clickOnTheCheckbox6();
  homepage_PCPRESS.clickOnTheDropdownOptionBroj310();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
      this.data.name2,
      this.data.address2,
      this.data.postnum2,
      this.data.city2,
      this.data.num2,
      this.data.email2
 );
 homepage_PCPRESS.clickOnTheButtonNarucujem();
 cy.url().should('include', "/naruceno.php");
 cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('be.visible');
});
it('Order a magazine by clicking directly on the button Kupujem', function () {
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  cy.url().should('include', "https://pcpress.rs/prodavnica/index.php");
  cy.contains("Greška! Molimo izaberite jedan od ponuđenih artikala klikom na checkbox polje.").should('exist');
});
it('Order a magazine by using negative inputs in Ime i Prezime field', function () {
  homepage_PCPRESS.clickOnTheCheckbox0();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name10,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email2
);
homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravno Ime i prezime.').should('be.visible');

});

it('Order a magazine by using negative inputs in Ime i Prezime field', function () {
  homepage_PCPRESS.clickOnTheCheckbox0();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name11,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email2
);
homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravno Ime i prezime.').should('be.visible');

});

it('Order a magazine by using negative inputs in Ime i Prezime field', function () {
  homepage_PCPRESS.clickOnTheCheckbox0();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.clearInputName(
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email2
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravno Ime i prezime.').should('be.visible');

});
it('Order a magazine by using negative inputs in Ime i Prezime field', function () {
  homepage_PCPRESS.clickOnTheCheckbox0();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name12,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email2
);
homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravno Ime i prezime.').should('be.visible');

});
it('Order a magazine by using negative inputs in Ulica i Broj field', function () {
  homepage_PCPRESS.clickOnTheCheckbox0();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name2,
    this.data.address10,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email2
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravno Ime i prezime.').should('be.visible');

});
it('Order a magazine by using negative inputs in Ulica i Broj field', function () {
  homepage_PCPRESS.clickOnTheCheckbox0();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.clearInputAddress(
    this.data.name2,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email2
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravnu Ulicu i Broj.').should('be.visible');

});
it('Order a magazine by using negative inputs in Ulica i Broj field', function () {
  homepage_PCPRESS.clickOnTheCheckbox0();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name2,
    this.data.address11,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email2
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravnu Ulicu i Broj.').should('be.visible');

});
it('Order a magazine by using negative inputs in Ulica i Broj field', function () {
  homepage_PCPRESS.clickOnTheCheckbox0();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name2,
    this.data.address12,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email2
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravnu Ulicu i Broj.').should('be.visible');

});

it('Order a magazine by using mismatched data in Postanski broj and Grad field', function () {
  homepage_PCPRESS.clickOnTheCheckbox0();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name2,
    this.data.address2,
    this.data.postnum10,
    this.data.city10,
    this.data.num2,
    this.data.email2
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('not.exist');

});
it('Order a magazine by using invalid data in Telefon field', function () {
  homepage_PCPRESS.clickOnTheCheckbox4();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name2,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num10,
    this.data.email2
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('not.exist');

});

it('Order a magazine by using invalid data in Telefon field', function () {
  homepage_PCPRESS.clickOnTheCheckbox4();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name2,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num11,
    this.data.email2
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('not.exist');

});
it('Order a magazine by using invalid data in Telefon field', function () {
  homepage_PCPRESS.clickOnTheCheckbox4();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.clearInputNumber(
    this.data.name2,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.email2
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('not.exist');

});
it('Order a magazine by using invalid email form in Email field', function () {
  homepage_PCPRESS.clickOnTheCheckbox10();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name2,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email10
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:').should('not.exist');

});
it('Order a magazine by using invalid email form in Email field', function () {
  homepage_PCPRESS.clickOnTheCheckbox10();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name2,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email11
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravan Email.').should('exist');

});
it('Order a magazine by using invalid email form in Email field', function () {
  homepage_PCPRESS.clickOnTheCheckbox10();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name2,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email12
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravan Email.').should('exist');

});
it('Order a magazine by using invalid email form in Email field', function () {
  homepage_PCPRESS.clickOnTheCheckbox10();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.pcPress_Booking_Submission(
    this.data.name2,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
    this.data.email13
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravan Email.').should('exist');

});
it('Order a magazine by using invalid email form in Email field', function () {
  homepage_PCPRESS.clickOnTheCheckbox10();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  proinvoice_Form_PCPRESS.clearInputEmail(
    this.data.name2,
    this.data.address2,
    this.data.postnum2,
    this.data.city2,
    this.data.num2,
  )
  homepage_PCPRESS.clickOnTheButtonNarucujem();
cy.url().should('include', "/naruceno.php");
cy.contains('Greška! Molimo Vas unesite ispravan Email.').should('exist');

});
it('Order a magazine by leaving the “Narudzenica” form empty', function () {
  homepage_PCPRESS.clickOnTheCheckbox12();
  homepage_PCPRESS.clickOnTheMainButtonKupujem();
  homepage_PCPRESS.clickOnTheButtonNarucujem();
  cy.url().should('include', "/naruceno.php");

  cy.contains('Greška! Molimo Vas unesite ispravno Ime i prezime.').should('exist');
  cy.contains('Greška! Molimo Vas unesite ispravnu Ulicu i Broj.').should('exist');
  cy.contains('Greška! Molimo Vas unesite ispravan Poštanski broj.').should('exist');
  cy.contains('Greška! Molimo Vas unesite ispravan Grad.').should('exist');
  cy.contains('Greška! Molimo Vas unesite ispravan Telefon.').should('exist');
  cy.contains('Greška! Molimo Vas unesite ispravan Email.').should('exist');

});
});
