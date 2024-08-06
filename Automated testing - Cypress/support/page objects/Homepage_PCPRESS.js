class HomePage_PCPRESS {
    visitHomepage() {
        cy.visit(Cypress.env("pcpress_homepage"), {timeout:6000});
    }
    clickOnTheCheckbox(){
        cy.get("#arselektor1").click({force:true});
    }
    clickOnTheCheckbox0(){
        cy.get("#arselektor0").click({force:true});
    }
    clickOnTheCheckbox15(){
        cy.get("#arselektor15").click({force:true});
    }
    clickOnTheCheckbox4(){
        cy.get("#arselektor4").click({force:true});
    }
    clickOnTheCheckbox9(){
        cy.get("input[value='9']").click({force:true});
    }
    clickOnTheCheckbox6(){
        cy.get("input[value='6']").click({force:true});
    }
    clickOnTheCheckbox9(){
        cy.get("#arselektor9").click({force:true});
    }
    clickOnTheCheckboxArhiva(){
        cy.get("input[value='9']").click({force:true});
    }
    clickOnTheCheckbox10(){
        cy.get("#arselektor10").click({force:true});
    }
    clickOnTheCheckbox12(){
        cy.get("#arselektor12").click({force:true});
    }
    clickOnProdavnicaLinkProinvoice() {
        cy.get('[href="http://prodavnica.pcpress.rs"]').click({ force: true });
    }
    clickOnProdavnicaLinkProdavnice() {
        cy.get('#doubleprovera > a').click({ force: true });
    }
    clickOnLinkPovratakNarudzbenici() {
        cy.get('[href="javascript:history.go(-1)"]').click({ force: true });
    }
    clickOnButtonOdustajem() {
        cy.get('#korisnik > tbody > tr:nth-child(7) > td > input[type=reset]:nth-child(3)').click({ force: true });
    }
    clickOnButtonX() {
        cy.get('#ispisclose > img').click({ force: true });
    }
    clickOnProdajaPCPres() {
        cy.get('[href="mailto: prodaja@pcpress.rs"]').debug()
       // Logs the element to the console

    }
    clickOnTheRandomBackground() {
        cy.get('#doubleprovera > div').click({ force: true });
    }
    closeEmailForm() {
        cy.window().then((win) => {
            win.closeEmailForm(); // Replace with actual function call
        });
    }
    
    clickOnTheLogoPCPressHomePageHeader(){
        cy.get("#logo").click({force:true});
    }
    clickOnTheFeedLogo() {
        cy.get('[href="http://pcpress.rs/feed/"]').invoke('removeAttr', 'target').click({ force: true });
    }
    clickOnThePCPressFooterLogo() {
        cy.get('[src="images/pcpresslogomali.png"]').invoke('removeAttr', 'target').click({ force: true });
    }
    clickOnThePCPressNewsletter() {
        cy.get('[href="http://pcpress.rs/newsletter/"]').invoke('removeAttr', 'target').click({ force: true });
    }
    clickOnThePCPressFacebook() {
        cy.get('[href="http://facebook.com/pcpress.rs"]').invoke('removeAttr', 'target').click({ force: true });
    }
    clickOnThePCPressTwitter() {
        cy.get('[href="http://twitter.com/PCPressRS"]').invoke('removeAttr', 'target').click({ force: true });
    }
    clickOnThePCPressPravilaKoriscenja() {
        cy.get('[href="https://pcpress.rs/pravila-koriscenja-sajta/"]').invoke('removeAttr', 'target').click({ force: true });
    }
    
    
    
    clickOnTheDropdownOption37() {
        cy.get('#artikal8 > select').select("Broj 37");
    }
    clickOnTheDropdownOption310() {
        cy.get('#artikal5 > select').select("Broj 310");
    }
    clickOnTheDropdownOptionBroj310() {
// Make sure the dropdown allows multiple selections
cy.get('#artikal5 > select').should('have.attr', 'multiple');

// Select both "Broj 310" and "Broj 311" using .select() with an array of values
cy.get('#artikal5 > select').select(['Broj 310', 'Broj 311'], { force: true });

// Verify that both options are selected

// Now, we need to deselect "Broj 311" and reselect it while holding Ctrl
cy.get('#artikal5 > select').select(['Broj 310'], { force: true }); // Deselects "Broj 311" and keeps "Broj 310" selected

// Verify that "Broj 310" is selected and "Broj 311" is not

// Finally, select "Broj 311" again while keeping "Broj 310" selected
cy.get('#artikal5 > select').select(['Broj 310', 'Broj 311'], { force: true });

// Verify that both options are selected again
    }
    
    clickOnTheButtonKupujem(){
        cy.get('#artikal1bg > table > tbody > tr:nth-child(2) > td.naslovnacheck > img').click({force:true})

    }
    clickOnTheMainButtonKupujem(){
        cy.get('[alt="Submit"]').click({force:true})

    }

    typeAmountTheKolicina(amount){
        cy.get("#kolselektor0").type(amount);

    }
    typeAmountTheKolicina15(amount1){
        cy.get("#kolselektor15").type(amount1);

    }
    typeAmountTheKolicina4(amount2){
        cy.get("#kolselektor4").type(amount2);

    }
    typeAmountTheKolicina1(amount3){
        cy.get("#kolselektor1").type(amount3);

    }
    typeLargeAmontOfInformation(){
        cy.get('[name="napomena"]').type('Notice for purchasing Purchases will not be taken from your account until you confirm your order. $$$$ requires a ready cash deposit. View details. Valid for 36 hours, all sales are final! Q-Cup Air Vaporizer $175.00 Add to cart. Disclosure: Alpha Organics was generous enough to provide me with product for an honest review. All opinions are 100% my own. And this product also qualifies for the blogger discount :D In the few hours I had it, I was able to give it a very brief test drive. It seemed fairly easy to accept in the field Napomena');

    }
    
    clickOnTheButtonNarucujem(){
        cy.get('tbody tr:nth-child(7) td:nth-child(1) input:nth-child(2)').click({force:true})
    }
    }
    export default HomePage_PCPRESS;
