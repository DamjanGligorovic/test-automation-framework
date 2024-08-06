class Proinvoice_Form_PCPRESS {
    pcPress_Booking_Submission(name, address, postnum, city, num, email) {
        cy.get('[name="ime"]').type(name);
        cy.get('[name="adresa"]').type(address);
        cy.get('[name="postbroj"]').type(postnum);
        cy.get('[name="grad"]').type(city);
        cy.get('[name="telefon"]').type(num);
        cy.get('[name="email"]').type(email);
    }

    napomenaField_Inserting(napomena) {
        cy.get('textarea[placeholder="Dodatne informacije..."][name="napomena"]').type(napomena);
    }
    clearInputName(address, postnum, city, num, email){
        cy.get('[name="adresa"]').type(address);
        cy.get('[name="postbroj"]').type(postnum);
        cy.get('[name="grad"]').type(city);
        cy.get('[name="telefon"]').type(num);
        cy.get('[name="email"]').type(email);
    }
    clearInputAddress(name, postnum, city, num, email)  {
        cy.get('input[name=ime]').type(name);
        cy.get('[name="postbroj"]').type(postnum);
        cy.get('[name="grad"]').type(city);
        cy.get('[name="telefon"]').type(num);
        cy.get('[name="email"]').type(email);
}
clearInputNumber (name, address, postnum, city, email)  {
    cy.get('input[name=ime]').type(name);
    cy.get('[name="adresa"]').type(address);
    cy.get('[name="postbroj"]').type(postnum);
    cy.get('[name="grad"]').type(city);
    cy.get('[name="email"]').type(email);
}
clearInputEmail ( name, address, postnum, city, num) {
    cy.get('input[name=ime]').type(name);
    cy.get('[name="adresa"]').type(address);
    cy.get('[name="postbroj"]').type(postnum);
    cy.get('[name="grad"]').type(city);
    cy.get('[name="telefon"]').type(num);

}
}
export default Proinvoice_Form_PCPRESS;
