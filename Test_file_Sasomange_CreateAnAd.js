import Homepage_Sasomange from '../../support/pageObjects/webdriver-uni/Homepage_Sasomange';
import Login_Registration_Ad_Sasomange from '../../support/pageObjects/webdriver-uni/Login_Registration_Ad_Sasomange';
/// <reference types="cypress" />

describe('Login into account', () => {
    const homepage_Sasomange = new Homepage_Sasomange();
    const login_Registration_Ad_Sasomange = new Login_Registration_Ad_Sasomange();
  
    beforeEach(function () {
        homepage_Sasomange.visitLoginPage();
      
      // Load the fixture and store data in the test context
      cy.fixture('sasomange').then((data) => {
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
  
    it('Create an ad without uploading images and fill all mandatory fields with valid inputs', function () {
        cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
        cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
        cy.url().should('include', 'https://sasomange.rs/uloguj-se')
        cy.title().should('include', 'Prijava na nalog | Sasomange.rs oglasnik');
        login_Registration_Ad_Sasomange.insertinputEmail(
            this.data.email5
        );
        login_Registration_Ad_Sasomange.insertPassword(
        this.data.password8
        );
        login_Registration_Ad_Sasomange.clickTheButtonPrijaviSe();
        cy.url().should('include', 'https://sasomange.rs/')
        cy.title().should('include', 'Oglasi | Nekretnine, Market, Auto-moto');
        cy.contains('Uspešna prijava').should('be.visible');
        login_Registration_Ad_Sasomange.clickTheButtonDodajOglas();
        cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
        cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
        cy.contains('Izbor kategorije').should('be.visible');

        login_Registration_Ad_Sasomange.clickTheButtonVozila();
        login_Registration_Ad_Sasomange.clickTheButtonAutomobili();
        login_Registration_Ad_Sasomange.clickTheButtonPolovniAutomobili();

        login_Registration_Ad_Sasomange.clickTheButtonNastavi();
        cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
        cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
        cy.contains('O oglasu').should('be.visible');

        login_Registration_Ad_Sasomange.clickIconClose();
        login_Registration_Ad_Sasomange.selectAudi();
        login_Registration_Ad_Sasomange.selectA3();
        login_Registration_Ad_Sasomange.selectDizel();
        login_Registration_Ad_Sasomange.selectLimuzina();
        login_Registration_Ad_Sasomange.select45();
        login_Registration_Ad_Sasomange.select2022();
        login_Registration_Ad_Sasomange.selectTip();
        login_Registration_Ad_Sasomange.predjeniKilometri(
          this.data.kilometri
        );
        login_Registration_Ad_Sasomange.selectEuro2();
        login_Registration_Ad_Sasomange.select22025();
        login_Registration_Ad_Sasomange.insertText(
          this.data.text
        );
        login_Registration_Ad_Sasomange.insertCena(
          this.data.cena
        );
        login_Registration_Ad_Sasomange.chooseLocation(
          this.data.location
        );

        login_Registration_Ad_Sasomange.clickButtonNastavi();
        cy.contains('O oglašivaču').should('be.visible');
        cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
        cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
        //login_Registration_Ad_Sasomange.typeThePhoneNumber(
         // this.data.number
       // );
        login_Registration_Ad_Sasomange.lickButtonSacuvajInformacije();
        cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
        cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
        cy.contains("Čestitamo, tvoj oglas je uspešno objavljen!").should('be.visible');
        cy.log('Test completed');
    })
    it('Create an ad with maximum amount of images/inspecting all variables and populate all fields with valid data', function () {
      cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
      cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
      login_Registration_Ad_Sasomange.insertinputEmail(
          this.data.email5
      );
      login_Registration_Ad_Sasomange.insertPassword(
      this.data.password8
      );
      login_Registration_Ad_Sasomange.clickTheButtonPrijaviSe();
      cy.url().should('include', 'https://sasomange.rs/')
      cy.title().should('include', 'Oglasi | Nekretnine, Market, Auto-moto');
      cy.contains('Uspešna prijava').should('be.visible');
      login_Registration_Ad_Sasomange.clickTheButtonDodajOglas();
      cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
      cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
      cy.contains('Izbor kategorije').should('be.visible');
      login_Registration_Ad_Sasomange.clickIconClose();
      login_Registration_Ad_Sasomange.insertSearchBox(
        this.data.text1
      );
      login_Registration_Ad_Sasomange.clickRandomBackground();
      login_Registration_Ad_Sasomange.clickTheButtonVozila();
      login_Registration_Ad_Sasomange.clickTheButtonAutomobili();
      login_Registration_Ad_Sasomange.clickTheButtonPolovniAutomobili();
      login_Registration_Ad_Sasomange.clickTheButtonNastavi();
      cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
      cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
      cy.contains('O oglasu').should('be.visible');

      login_Registration_Ad_Sasomange.uploadPhotos()
      login_Registration_Ad_Sasomange.deleteButtonBin();
      login_Registration_Ad_Sasomange.uploadPhotos1();
      login_Registration_Ad_Sasomange.insertYoutubeVideo(
        this.data.text2

      );
      login_Registration_Ad_Sasomange.clickUcitajVideo();
      login_Registration_Ad_Sasomange.clickPlayVideo();
      login_Registration_Ad_Sasomange.selectCitroen();
      login_Registration_Ad_Sasomange.selectC3();
      login_Registration_Ad_Sasomange.selectBenzin();
      login_Registration_Ad_Sasomange.selectHecbek();
      login_Registration_Ad_Sasomange.select45();
      login_Registration_Ad_Sasomange.select2020();
      login_Registration_Ad_Sasomange.selectTip5();
      login_Registration_Ad_Sasomange.clickKliznaVrata();
      login_Registration_Ad_Sasomange.insertInputKapacitetPogonskeBaterije(
        this.data.text3
      );
      login_Registration_Ad_Sasomange.predjeniKilometri(
        this.data.kilometri1
      );
      login_Registration_Ad_Sasomange.selectTBelaBoja();
      login_Registration_Ad_Sasomange.selectMetalik();
      login_Registration_Ad_Sasomange.selectMat();
      login_Registration_Ad_Sasomange.select32025();
      login_Registration_Ad_Sasomange.clickCheckbox();
      login_Registration_Ad_Sasomange.insertBrojSasije(
        this.data.text4
      )
      login_Registration_Ad_Sasomange.brojRegistracijeVozila(
        this.data.text5
      )
      login_Registration_Ad_Sasomange.selectEuro2();
      login_Registration_Ad_Sasomange.select22025();
      login_Registration_Ad_Sasomange.insertText1(
        this.data.text
      );
      login_Registration_Ad_Sasomange.insertCena1(
        this.data.cena1
      );
      login_Registration_Ad_Sasomange.clickUmestoCene();
      login_Registration_Ad_Sasomange.insertSifraArtikla(
        this.data.text7
      )
      login_Registration_Ad_Sasomange.chooseLocation1(
        this.data.location1
      );
      login_Registration_Ad_Sasomange.clickButtonNastavi();
      cy.contains('O oglašivaču').should('be.visible');
      login_Registration_Ad_Sasomange.lickButtonSacuvajInformacije();
      cy.contains("Čestitamo, tvoj oglas je uspešno objavljen!").should('be.visible');
      cy.log('Test completed');
})
it('Verify negative boundary values for the image upload function', function () {
  cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
      cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
      login_Registration_Ad_Sasomange.insertinputEmail(
          this.data.email5
      );
      login_Registration_Ad_Sasomange.insertPassword(
      this.data.password8
      );
      login_Registration_Ad_Sasomange.clickTheButtonPrijaviSe();
      cy.url().should('include', 'https://sasomange.rs/')
      cy.title().should('include', 'Oglasi | Nekretnine, Market, Auto-moto');
      cy.contains('Uspešna prijava').should('be.visible');
      login_Registration_Ad_Sasomange.clickTheButtonDodajOglas();
      cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
      cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
      cy.contains('Izbor kategorije').should('be.visible');
      login_Registration_Ad_Sasomange.clickIconClose();
      login_Registration_Ad_Sasomange.insertSearchBox(
        this.data.text1
      );
      login_Registration_Ad_Sasomange.clickRandomBackground();
      login_Registration_Ad_Sasomange.clickTheButtonVozila();
      login_Registration_Ad_Sasomange.clickTheButtonAutomobili();
      login_Registration_Ad_Sasomange.clickTheButtonPolovniAutomobili();
      login_Registration_Ad_Sasomange.clickTheButtonNastavi();
      cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
      cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
      cy.contains('O oglasu').should('be.visible');
      cy.contains('Ukoliko ne dodaš fotografije oglasa u naredna 3 dana, bićemo primorani da oglas sklonimo sa sajta.').should('be.visible');
      login_Registration_Ad_Sasomange.uploadPhotos2();
      //cy.get(errorMessageSelector).should('be.visible').and('have.text', 'The file size is too large. Please upload a smaller file.');
      cy.contains('Maksimalan broj fotografija je 30').should('be.visible');
      cy.log('Test completed');
})
it('Inspect the button Nazad', function () {
  cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
  cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
  login_Registration_Ad_Sasomange.insertinputEmail(
      this.data.email5
  );
  login_Registration_Ad_Sasomange.insertPassword(
  this.data.password8
  );
  login_Registration_Ad_Sasomange.clickTheButtonPrijaviSe();
  cy.url().should('include', 'https://sasomange.rs/')
  cy.title().should('include', 'Oglasi | Nekretnine, Market, Auto-moto');
  cy.contains('Uspešna prijava').should('be.visible');
  login_Registration_Ad_Sasomange.clickTheButtonDodajOglas();
  cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
  cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
  cy.contains('Izbor kategorije').should('be.visible');
  login_Registration_Ad_Sasomange.clickIconClose();
  login_Registration_Ad_Sasomange.insertSearchBox(
    this.data.text1
  );
  login_Registration_Ad_Sasomange.clickRandomBackground();
  login_Registration_Ad_Sasomange.clickTheButtonVozila();
  login_Registration_Ad_Sasomange.clickTheButtonAutomobili();
  login_Registration_Ad_Sasomange.clickTheButtonPolovniAutomobili();
  login_Registration_Ad_Sasomange.clickTheButtonNastavi();
  cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
  cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
  cy.contains('O oglasu').should('be.visible');
login_Registration_Ad_Sasomange.clickOnTheButtonNazad();
cy.url().should('include', 'https://sasomange.rs/moj-sasomange/dodaj-oglas')
cy.title().should('include', 'Dodaj oglas | Sasomange.rs oglasnik');
cy.contains('Izbor kategorije').should('be.visible');
})
})