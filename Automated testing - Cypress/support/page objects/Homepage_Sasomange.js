class HomePage_Sasomange {
    visitRegistrationpage() {
        cy.visit(Cypress.env("sasomange_registrationpage"), {timeout:6000});
    }
    visitLoginPage() {
        cy.visit(Cypress.env("sasomange_loginpage"), {timeout:6000});
    }
}
export default HomePage_Sasomange;
