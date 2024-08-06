import Homepage_Sasomange from '../../support/pageObjects/webdriver-uni/Homepage_Sasomange';
import Login_Registration_Ad_Sasomange from '../../support/pageObjects/webdriver-uni/Login_Registration_Ad_Sasomange';
/// <reference types="cypress" />

describe('Login into account', () => {
    const homepage_Sasomange = new Homepage_Sasomange();
    const login_Registration_Ad_Sasomange = new Login_Registration_Ad_Sasomange();
  
    beforeEach(function () {
        homepage_Sasomange.visitRegistrationpage();
      
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
  
    it('Create an account by using valid data in all fields and minimal requirements for password', function () {
        cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
        cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
        const email = login_Registration_Ad_Sasomange.generateEmailAddress();  
        cy.get('.gigya-composite-control-active #resident-email').type(email);
        login_Registration_Ad_Sasomange.insertPassword(
        this.data.password
        );
        login_Registration_Ad_Sasomange.tickTheCheckbox();
        login_Registration_Ad_Sasomange.clickTheButtonRegister();
        cy.contains("Pogledaj poštu! Stigla ti je poruka u kojoj se nalazi link za potvrdu registracije. Klikni na njega, potvrdi svoju registraciju i počni da kupuješ, prodaješ, razgledaš i čuvaš sve što ti se svidi, do mile volje - iskoristi sve prednosti koje nudi Sasomange.rs").should('be.visible')
        
    })
    it('Create an account by using various characters in password field and valid inputs in all fields', function () {
        cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
        cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
        const email = login_Registration_Ad_Sasomange.generateEmailAddress();  
        cy.get('.gigya-composite-control-active #resident-email').type(email);
        login_Registration_Ad_Sasomange.insertPassword(
        this.data.password1
        );
        login_Registration_Ad_Sasomange.tickTheCheckbox();
        login_Registration_Ad_Sasomange.clickTheButtonRegister();
        cy.contains("Pogledaj poštu! Stigla ti je poruka u kojoj se nalazi link za potvrdu registracije. Klikni na njega, potvrdi svoju registraciju i počni da kupuješ, prodaješ, razgledaš i čuvaš sve što ti se svidi, do mile volje - iskoristi sve prednosti koje nudi Sasomange.rs").should('be.visible')
});
it('Inspect link under Pravila I uslove koriscenja', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
        login_Registration_Ad_Sasomange.clickPravilaKoriscenja();
        cy.url().should('include', 'https://static.sasomange.rs/Binary/1/Sasomange-Uslovi-koriscenja.pdf');

});
it('Inspect link under Politiku privatnosti', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
    login_Registration_Ad_Sasomange.clickPolitikaPrivatnosti();
    cy.url().should('include', 'https://static.sasomange.rs/Binary/2/Sasomange-Politika-privatnosti.pdf');
});
it('Inspect link under Prijavi se', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');

    login_Registration_Ad_Sasomange.linkPrijaviSe();
    cy.url().should('include', 'https://sasomange.rs/uloguj-se');
    cy.title().should('include', 'Prijava na nalog | Sasomange.rs oglasnik')
});
it('Create an account by using invalid email form in Imejl field', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
    login_Registration_Ad_Sasomange.invalidEmail(
        this.data.email1,
        this.data.password2
    );
    login_Registration_Ad_Sasomange.tickTheCheckbox();
        login_Registration_Ad_Sasomange.clickTheButtonRegister();
    homepage_Sasomange.visitRegistrationpage();
    login_Registration_Ad_Sasomange.invalidEmail(
        this.data.email2,
        this.data.password2
    );
    login_Registration_Ad_Sasomange.tickTheCheckbox();
        login_Registration_Ad_Sasomange.clickTheButtonRegister();
    homepage_Sasomange.visitRegistrationpage();
    login_Registration_Ad_Sasomange.invalidEmail(
        this.data.email3,
        this.data.password2
    );
    login_Registration_Ad_Sasomange.tickTheCheckbox();
        login_Registration_Ad_Sasomange.clickTheButtonRegister();

    homepage_Sasomange.visitRegistrationpage();
    login_Registration_Ad_Sasomange.invalidEmail(
        this.data.email4,
        this.data.password2
    );
    login_Registration_Ad_Sasomange.tickTheCheckbox();
    login_Registration_Ad_Sasomange.clickTheButtonRegister();
    cy.contains("Uneta je pogrešna imejl adresa").should('be.visible');
});
it('Create an account by using invalid email form in Imejl field', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');

    login_Registration_Ad_Sasomange.insertPassword(
        this.data.password2
    );
    login_Registration_Ad_Sasomange.tickTheCheckbox();
    login_Registration_Ad_Sasomange.clickTheButtonRegister();
    cy.contains("Ovo polje je obavezno").should('be.visible');

});
it('Create an account by using invalid inputs in the “Lozinka” field', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');

    const email = login_Registration_Ad_Sasomange.generateEmailAddress();  
    cy.get('.gigya-composite-control-active #resident-email').type(email);
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');

    login_Registration_Ad_Sasomange.insertPassword(
        this.data.password3,
    );
    login_Registration_Ad_Sasomange.tickTheCheckbox();

    login_Registration_Ad_Sasomange.clickTheButtonRegister();
    cy.contains("Lozinka treba da sadrži najmanje: 8 karaktera.").should('be.visible');
});
    it('Create an account by using invalid inputs in the “Lozinka” field', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');


    const email = login_Registration_Ad_Sasomange.generateEmailAddress();  
    cy.get('.gigya-composite-control-active #resident-email').type(email);
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');

    login_Registration_Ad_Sasomange.insertPassword(
        this.data.password4,
    );
    login_Registration_Ad_Sasomange.tickTheCheckbox();
    login_Registration_Ad_Sasomange.clickTheButtonRegister();
    cy.contains("Pogledaj poštu! Stigla ti je poruka u kojoj se nalazi link za potvrdu registracije. Klikni na njega, potvrdi svoju registraciju i počni da kupuješ, prodaješ, razgledaš i čuvaš sve što ti se svidi, do mile volje - iskoristi sve prednosti koje nudi Sasomange.rs").should('not.exist');

});
it('Create an account by using invalid inputs in the “Lozinka” field', function () {

    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');

    const email = login_Registration_Ad_Sasomange.generateEmailAddress();  
    cy.get('.gigya-composite-control-active #resident-email').type(email);
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');

    login_Registration_Ad_Sasomange.insertPassword(
        this.data.password5,
    );
    login_Registration_Ad_Sasomange.tickTheCheckbox();
    login_Registration_Ad_Sasomange.clickTheButtonRegister();
    cy.contains('Lozinka treba da sadrži najmanje: 1 veliko slovo, 1 broj.').should('be.visible');
});
it('Create an account by using invalid inputs in the “Lozinka” field', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');


    const email = login_Registration_Ad_Sasomange.generateEmailAddress();  
    cy.get('.gigya-composite-control-active #resident-email').type(email);
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');

    login_Registration_Ad_Sasomange.insertPassword(
        this.data.password6,
    );
    login_Registration_Ad_Sasomange.tickTheCheckbox();
    login_Registration_Ad_Sasomange.clickTheButtonRegister();
    cy.contains("Lozinka treba da sadrži najmanje: 1 veliko slovo, 1 malo slovo.").should('be.visible');
});
it('Create an account by using invalid inputs in the “Lozinka” field', function () {

    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');

    const email = login_Registration_Ad_Sasomange.generateEmailAddress();  
    cy.get('.gigya-composite-control-active #resident-email').type(email);
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');

    login_Registration_Ad_Sasomange.insertPassword(
        this.data.password7,
    );
    login_Registration_Ad_Sasomange.tickTheCheckbox();
    login_Registration_Ad_Sasomange.clickTheButtonRegister();
    cy.contains("Lozinka treba da sadrži najmanje: 1 malo slovo.").should('be.visible');
});
it('Create an account by using invalid inputs in the “Lozinka” field', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
    const email = login_Registration_Ad_Sasomange.generateEmailAddress();  

    cy.get('.gigya-composite-control-active #resident-email').type(email);
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');

    login_Registration_Ad_Sasomange.tickTheCheckbox();
    login_Registration_Ad_Sasomange.clickTheButtonRegister();
    cy.contains("Lozinka treba da sadrži najmanje: 8 karaktera, 1 veliko slovo, 1 malo slovo, 1 broj.").should('be.visible');
});
it('Create an account by leaving the button Prihvatam Pravila I Uslovi koriscenja unticked', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');

    const email = login_Registration_Ad_Sasomange.generateEmailAddress();  
    cy.get('.gigya-composite-control-active #resident-email').type(email);
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');

    login_Registration_Ad_Sasomange.insertPassword(
        this.data.password4,
    );
    login_Registration_Ad_Sasomange.clickTheButtonRegister();
    cy.contains("Ovo polje je obavezno").should('be.visible');
    cy.log("Test completed.");

});
});

