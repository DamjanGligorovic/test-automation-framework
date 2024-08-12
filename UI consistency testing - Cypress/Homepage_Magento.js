class HomePage_PCPRESS {
    visitHomepage() {
        cy.visit(Cypress.env("magento_homepage"), {timeout:6000});
    }
}
export default HomePage_PCPRESS;