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
  
    it('Sign in by using valid data and “Email” as option', function () {
        cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
        cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
       login_Registration_Ad_Sasomange.insertinputEmail(
        this.data.email5
       );
        login_Registration_Ad_Sasomange.insertPassword(
        this.data.password8
        );
        login_Registration_Ad_Sasomange.clickEyeButton();
        login_Registration_Ad_Sasomange.clickTheButtonPrijaviSe();
        cy.contains('Uspešna prijava').should('be.visible');
        cy.url().should('include', 'https://sasomange.rs/')
        cy.title().should('include', 'Oglasi | Nekretnine, Market, Auto-moto');        
    })
    it('Inspect password recovery function through the link under the Ne secas se Sasomange.rs lozinke? Nije problem, samo klikni!', function () {
        cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
        cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
        cy.contains('Ne sećaš se Sasomange.rs lozinke? Nije problem, samo klikni!').should('be.visible');
        login_Registration_Ad_Sasomange.passwordRecoveryLink();
        cy.contains('Unesi imejl adresu na koju ćemo ti poslati link za resetovanje.').should('be.visible');
        cy.url().should('include', 'https://sasomange.rs/zaboravljena-lozinka')
        cy.title().should('include', 'Zaboravljena lozinka | Sasomange.rs oglasnik');        
        
            login_Registration_Ad_Sasomange.insertinputEmail2(
                this.data.email5
            );
        login_Registration_Ad_Sasomange.promenaLozinkeButton();
        cy.contains('Poslali smo ti uputstva za resetovanje lozinke. Proveri svoju poštu!').should('be.visible');
})
it('Inspect link under Registruj se', function () {
    login_Registration_Ad_Sasomange.clickTheLinkRegister();
    cy.url().should('include', 'https://sasomange.rs/registracija')
    cy.title().should('include', 'Registracija | Sasomange.rs oglasnik');        

})
it('Sign in by using invalid input in Lozinka field', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
    
        login_Registration_Ad_Sasomange.insertinputEmail(
            this.data.email5
        );
        login_Registration_Ad_Sasomange.insertPassword(
            this.data.password10
        )
        login_Registration_Ad_Sasomange.clickTheButtonPrijaviSe();
    cy.contains('Pogrešan imejl ili lozinka').should('be.visible');
})
it('Sign in by using invalid input in Lozinka field', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
    
        login_Registration_Ad_Sasomange.insertinputEmail(
            this.data.email5
        );
        login_Registration_Ad_Sasomange.insertPassword(
            this.data.password11
        )
        login_Registration_Ad_Sasomange.clickTheButtonPrijaviSe();
    cy.contains('Pogrešan imejl ili lozinka').should('be.visible');
})
it('Sign in by using invalid input in Lozinka field', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
    
        login_Registration_Ad_Sasomange.insertinputEmail(
            this.data.email5
        );
       
        login_Registration_Ad_Sasomange.clickTheButtonPrijaviSe();
    cy.contains('Ovo polje je obavezno').should('be.visible');
})
it('Inspect password recovery with unregistered email through the link Ne sećaš se Sasomange.rs lozinke? Nije problem, samo klikni!', function () {
    cy.get('.gigya-composite-control-active #resident-email').should('have.attr', 'placeholder', 'Unesi imejl');
    cy.get('#resident-password').should('have.attr', 'placeholder', 'Unesi lozinku');
    cy.contains('Ne sećaš se Sasomange.rs lozinke? Nije problem, samo klikni!').should('be.visible');
    login_Registration_Ad_Sasomange.passwordRecoveryLink();
    cy.contains('Unesi imejl adresu na koju ćemo ti poslati link za resetovanje.').should('be.visible');
    cy.url().should('include', 'https://sasomange.rs/zaboravljena-lozinka')
    cy.title().should('include', 'Zaboravljena lozinka | Sasomange.rs oglasnik');        
    
        login_Registration_Ad_Sasomange.insertinputEmail2(
            this.data.email7
        );
    login_Registration_Ad_Sasomange.promenaLozinkeButton();
    cy.contains('Izgleda da ne postoji korisnik sa ovom imejl adresom').should('be.visible');
})
it('Sign in by leaving all fields empty', function () {
    login_Registration_Ad_Sasomange.clickTheButtonPrijaviSe();
    cy.contains('Ovo polje je obavezno').should('be.visible');
})
})