const {test, expect} = require('@playwright/test')

class LoginPageSasomange
{
    constructor(page)
    {
        this.page = page
        //login page
        this.imejlKorisnicko = "#gigya-textbox-loginID";
        this.passwordField = "#gigya-textbox-password";
        this.eyeHiddenButton = "#login-screen > form > div.form-group.gigya-composite-control.gigya-composite-control-textbox.password-wrapper > div > button";
        this.linkPasswordForgotten = "#login-screen > form > div.form-group.action-link > a";
        this.buttonPrijaviSe = "#login-screen > form > div.form-group.submit > button";
        this.imejlForgottenEmail = "#gigya-textbox-email-loginID";
        this.prijaviSeButton = "#forgot-password-screen > form > div.form-group.submit > button";
        this.linkPrijaviSe = "#app > section > div > div.registration-content > div > ul > li > a";
        this.linkRegistrujSe1="#login-screen > form > footer > p > a";
        //registration page
        this.email = "body > div:nth-child(2) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > astro-island:nth-child(4) > section:nth-child(1) > section:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > input:nth-child(2)";
        this.password= "#resident-password";
        this.password1 = "input#resident-password.gigya-error.gigya-empty"
        this.pravilaIUsloviKoriscenja = "#register-resident-user-screen-default > form > div.form-group.consent-group > div > label > span.d-none.d-sm-block > a:nth-child(1)";
        this.politikuPrivatnosti = "#register-resident-user-screen-default > form > div.form-group.consent-group > div > label > span.d-none.d-sm-block > a:nth-child(2)";
        this.checkbox = "#register-resident-user-screen-default > form > div.form-group.consent-group > div > label";
        this.submit="#register-resident-user-screen-default > form > div.form-group.submit > button";
        this.linkPrijaviSe ="#register-resident-user-screen-default > form > footer > p > a";
        //create an ad
        this.optionVozila = "#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element > section > div.category-list-wrapper > ul:nth-child(1) > li:nth-child(27)";
        this.optionAutomobili = "#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element > section > div.category-list-wrapper > ul:nth-child(2) > li:nth-child(1)";
        this.polovniAutomobili = "#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element > section > div.category-list-wrapper > ul:nth-child(3) > li:nth-child(1)"
        this.buttonNastavi = "#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element > section > div.step-btns-wrapper.fixed.js-step-btns-element > button";
        this.buttonDodajOglas="a[class='add-btn ui-btn ui-btn-primary hidden sm:flex']";
        this.menuMarkaAutomobila = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > div > p";
        this.optionAudi = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign";
        this.menuModel = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
        this.optionA3 = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > section > div > ul > li:nth-child(7) > label > span.checkbox-sign.round-checkbox-sign";
        this.menuGorivo = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(3) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
        this.optionDizel = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign";
        this.menuOblikKaroserija = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(4) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
        this.optionLimuzina = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign";
        this.menuBrojVrata= "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(5) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
        this.option45 = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > section > div > ul > li > label > span.checkbox-sign.round-checkbox-sign";
        this.menuGodinaProizvodnje = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(6) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
        this.option2022 = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(3) > label > span.checkbox-sign.round-checkbox-sign";
        this.menuTip = "div[class='full-column'] section[class='single-dropdown'] div p[class='selected-options']";
        this.tipAutomatski = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > section > div > ul > li:nth-child(4) > label > span.checkbox-sign.round-checkbox-sign";
        this.inputPredjeniKilometri = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > section > label > input";
        this.menuEkoloskaKategorija= "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(6) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
        this.euro2= "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign";
        this.menuRegistrovan = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(14) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
        this.option2025 = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign";
        this.tekstOglasa = "#rich-text-editor > div.ql-editor.ql-blank";
        this.inputCena = "#info-about-product > section:nth-child(2) > section:nth-child(4) > div.section-content-wrapper > section.price-section > section:nth-child(1) > label > input";
        this.buttonNastavi1 = "button[class='btn btn--type-primary step-next']";
        this.sacuvajInformacije = "#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element > section.product-seller-info > form > div > button.btn.btn--type-primary.step-next";
        this.buttonUploadPhoto = "#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div.input-photo-field.big > label";
        this.youtubeField = "#info-about-product > section:nth-child(2) > section:nth-child(2) > div > section > div > div:nth-child(1) > input";
        this.buttonYOutube= "#info-about-product > section:nth-child(2) > section:nth-child(2) > div > section > div > div:nth-child(1) > button";
        this.optionCitroen = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > section > div > ul > li:nth-child(21) > label > span.checkbox-sign.round-checkbox-sign";
        this.editPhoto = "button[class='edit-button green icon-edit']";
        this.optionRotiraj = "#productImageModal > div.vfm__content.vfm--outline-none.modal-dialog > div > div.modal-body > div > div.image-edit-buttons-wrapper > button:nth-child(1)"
        this.optionOkreni = "#productImageModal > div.vfm__content.vfm--outline-none.modal-dialog > div > div.modal-body > div > div.image-edit-buttons-wrapper > button:nth-child(2)";
        this.optionResetuj = "#productImageModal > div.vfm__content.vfm--outline-none.modal-dialog > div > div.modal-body > div > div.image-edit-buttons-wrapper > button:nth-child(3)";
        this.optionDelete= "div.photo-placeholder-wrapper:nth-child(3) > .edit-photo-options > button.edit-button.green.icon-edit";
        this.buttonSacuvaj = "#productImageModal > div.vfm__content.vfm--outline-none.modal-dialog > div > div.modal-body > div > button";
        this.optionC3= "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > section > div > ul > li:nth-child(12) > label > span.checkbox-sign.round-checkbox-sign";
        this.optionBenzin = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign";
        this.optionHecbek = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > section > div > ul > li > label > span.checkbox-sign.round-checkbox-sign";
        this.option2020 = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(5) > label > span.checkbox-sign.round-checkbox-sign";
        this.option2019 = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > section > div > ul > li:nth-child(12) > label > span.checkbox-sign.round-checkbox-sign";
        this.optionDa="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(1) > section > ul > li:nth-child(1) > button";
        this.input_FieldKapacitet = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > label > input";
        this.menuBelaBoja = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(11) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
        this.optionBela = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(11) > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign"
        this.fieldBrojSasije= "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(3) > section > div.section-content-wrapper > div:nth-child(5) > section > label > input";
        this.fieldBrojRegistracije = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(3) > section > div.section-content-wrapper > div:nth-child(6) > section > label > input";
        this.optionEuro3 = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(3) > label > span.checkbox-sign.round-checkbox-sign";
        this.buttonNazad = "#info-about-product > div > button.btn.button--type-bordered-tertiary.step-back"
        this.optionDaVracamSe = "body > div.modal.small-confirmation-modal.pick-category-step-back-modal.vfm.vfm--fixed.vfm--inset > div.vfm__content.vfm--outline-none.modal-dialog > div > div.modal-body > div > button.btn.btn--type-primary";

    }   
    async login1() {
        await this.page.locator(this.imejlKorisnicko).fill("");
        await this.page.locator(this.imejlKorisnicko).type("damjanserbia123@gmail.com"); 
        await this.page.locator(this.passwordField).fill("");
        await this.page.locator(this.passwordField).type("Felina10@");
        await this.page.locator(this.buttonPrijaviSe).click();
        
        await this.page.locator(this.buttonDodajOglas).click();
        await this.page.locator(this.optionVozila).click();
        await this.page.locator(this.optionAutomobili).click();
        await this.page.locator(this.polovniAutomobili).click();
        await this.page.locator(this.buttonNastavi).click();
        await this.page.locator(this.menuMarkaAutomobila).click();
        await this.page.locator(this.optionCitroen).click();
        await this.page.locator(this.menuModel).click();
        await this.page.locator(this.optionA3).click();
        await this.page.locator(this.menuGorivo).click();
        await this.page.locator(this.optionDizel).click();
        await this.page.locator(this.menuOblikKaroserija).click();
        await this.page.locator(this.optionLimuzina).click();
        await this.page.locator(this.menuBrojVrata).click();
        await this.page.locator(this.option45).click();
        await this.page.locator(this.menuGodinaProizvodnje).click();
        await this.page.locator(this.option2022).click();
        await this.page.locator(this.menuTip).click();
        await this.page.locator(this.tipAutomatski).click();
             
       
    }
    
    async login2(){

        await this.page.locator(this.inputPredjeniKilometri).fill("");       
        await this.page.locator(this.inputPredjeniKilometri).type("231");      
    }
    async login3(){
        await this.page.locator(this.menuEkoloskaKategorija).click();
        await this.page.locator(this.euro2).click();
        await this.page.locator(this.menuRegistrovan).click();
        await this.page.locator(this.option2025).click();
        await this.page.locator(this.tekstOglasa).type("Prodajem polovni automobil marke Audi A3 po povoljnoj ceni. Automobil je u odlicnom stanju i kvalitetu. Mozete me kontaktirati putem telefona ili Vibera. Cena je vrlo prihvatljiva i realisticna");
        await this.page.locator(this.inputCena).type("2400");
        await this.page.locator(this.inputPredjeniKilometri).fill("");       
        await this.page.locator(this.inputPredjeniKilometri).type("231"); 
        await this.page.locator(this.buttonNastavi1).click({ timeout: 60000 });

        await this.page.waitForSelector(this.sacuvajInformacije, { state: 'visible', timeout: 60000 });
        
        await this.page.locator(this.sacuvajInformacije).click();
    }

    async login4() {
        await this.page.locator(this.imejlKorisnicko).fill("");
        await this.page.locator(this.imejlKorisnicko).type("damjanserbia123@gmail.com"); 
        await this.page.locator(this.passwordField).fill("");
        await this.page.locator(this.passwordField).type("Felina10@");
        await this.page.locator(this.buttonPrijaviSe).click();
        
        await this.page.locator(this.buttonDodajOglas).click();
        await this.page.locator(this.optionVozila).click();
        await this.page.locator(this.optionAutomobili).click();
        await this.page.locator(this.polovniAutomobili).click();
        await this.page.locator(this.buttonNastavi).click();
        const fileInput = await this.page.waitForSelector('.input-photo-label');
        await fileInput.setInputFiles('C:/Users/Damja/Downloads/1.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/2.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/3.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/4.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/5.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/6.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/7.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/8.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/9.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/10.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/11.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/12.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/13.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/14.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/15.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/16.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/17.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/18.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/19.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/20.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/21.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/22.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/23.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/24.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/25.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/26.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/27.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/28.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/29.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/30.jpg'); 

//await this.page.locator(this.optionDelete).click();
//await this.page.locator(this.optionRotiraj).click();
//await this.page.locator(this.optionOkreni).click();
//await this.page.locator(this.optionResetuj).click();
//await this.page.locator(this.buttonSacuvaj).click();

        await this.page.locator(this.youtubeField).type("https://www.youtube.com/watch?v=t28WHfFlC2g");      
        await this.page.locator(this.buttonYOutube).click();

        await this.page.locator(this.menuMarkaAutomobila).click();
        await this.page.locator(this.optionCitroen).click();
        await this.page.locator(this.menuModel).click();
        await this.page.locator(this.optionC3).click();
        await this.page.locator(this.menuGorivo).click();
        await this.page.locator(this.optionBenzin).click();
        await this.page.locator(this.menuOblikKaroserija).click();
        await this.page.locator(this.optionHecbek).click();
        await this.page.locator(this.menuBrojVrata).click();
        await this.page.locator(this.option45).click();
        await this.page.locator(this.menuGodinaProizvodnje).click();
        await this.page.locator(this.option2020).click();
        await this.page.locator(this.menuTip).click();
        await this.page.locator(this.option2019).click();
        await this.page.locator(this.optionDa).click();
        await this.page.locator(this.input_FieldKapacitet).fill("");       
        await this.page.locator(this.input_FieldKapacitet).type("212");
       
    }
    
    async login5(){

        await this.page.locator(this.inputPredjeniKilometri).fill("");       
        await this.page.locator(this.inputPredjeniKilometri).type("676");      
    }
    async login6(){
        await this.page.locator(this.menuBelaBoja).click();
        await this.page.locator(this.optionBela).click();
        await this.page.locator(this.fieldBrojSasije).type("WAUZZZ4BZWN049194");      
        await this.page.locator(this.fieldBrojRegistracije).type("@#$%^*(32ds");      

        await this.page.locator(this.menuEkoloskaKategorija).click();
        await this.page.locator(this.optionEuro3).click();
        await this.page.locator(this.menuRegistrovan).click();
        await this.page.locator(this.option2025).click();
        await this.page.locator(this.tekstOglasa).type("1. Ovaj automobil je jedan od najboljih predstavnika bmv kompanije. 2. Auto sadrzi neverovatne sposobnosti manipulacije 3. Ima manuelni savremeni menjac");
        await this.page.locator(this.inputCena).type("3212");
        await this.page.locator(this.inputPredjeniKilometri).fill("");       
        await this.page.locator(this.inputPredjeniKilometri).type("676"); 
        await this.page.locator(this.buttonNastavi1).click({ timeout: 60000 });

        await this.page.waitForSelector(this.sacuvajInformacije, { state: 'visible', timeout: 60000 });
        
        await this.page.locator(this.sacuvajInformacije).click();
    }
    async login7() {
        await this.page.locator(this.imejlKorisnicko).fill("");
        await this.page.locator(this.imejlKorisnicko).type("damjanserbia123@gmail.com"); 
        await this.page.locator(this.passwordField).fill("");
        await this.page.locator(this.passwordField).type("Felina10@");
        await this.page.locator(this.buttonPrijaviSe).click();
        
        await this.page.locator(this.buttonDodajOglas).click();
        await this.page.locator(this.optionVozila).click();
        await this.page.locator(this.optionAutomobili).click();
        await this.page.locator(this.polovniAutomobili).click();
        await this.page.locator(this.buttonNastavi).click();
        const fileInput = await this.page.waitForSelector('.input-photo-label');
        await fileInput.setInputFiles('C:/Users/Damja/Downloads/1.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/2.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/3.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/4.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/5.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/6.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/7.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/8.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/9.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/10.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/11.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/12.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/13.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/14.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/15.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/16.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/17.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/18.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/19.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/20.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/21.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/22.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/23.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/24.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/25.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/26.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/27.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/28.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/29.jpg'); 
await fileInput.setInputFiles('C:/Users/Damja/Downloads/31.jpg'); 


       
    }
    async login8() {
        await this.page.locator(this.imejlKorisnicko).fill("");
        await this.page.locator(this.imejlKorisnicko).type("damjanserbia123@gmail.com"); 
        await this.page.locator(this.passwordField).fill("");
        await this.page.locator(this.passwordField).type("Felina10@");
        await this.page.locator(this.buttonPrijaviSe).click();
        
        await this.page.locator(this.buttonDodajOglas).click();
        await this.page.locator(this.optionVozila).click();
        await this.page.locator(this.optionAutomobili).click();
        await this.page.locator(this.polovniAutomobili).click();
        await this.page.locator(this.buttonNastavi).click();
        await this.page.locator(this.buttonNazad).click();
        await this.page.locator(this.optionDaVracamSe).click();


    }
      async assertion1(){
        
       
        await this.page.locator(this.linkPerrorMessage1rijaviSe).click();
        
    }

    async registration (){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("dotanil508@comsb.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("Abrakad1");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
    }
    
    async registration1(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("pekalo2893@bizatop.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("Ab @#$%^2");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
    }
    async registration2(){
        
       
        await this.page.locator(this.pravilaIUsloviKoriscenja).click();
        
    }
    async registration3(){
        
       
        await this.page.locator(this.politikuPrivatnosti).click();
        
    }

    async registration4(){
        
       
        await this.page.locator(this.linkPrijaviSe).click();
        
    }
    async registration5(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("damjan@@hotmail.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("Felina10");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
        const MessageSelector = '#register-resident-user-screen-default > form > div.form-group.gigya-composite-control.gigya-composite-control-textbox.gigya-composite-control-active > span'; 
        const Message = await this.page.locator(MessageSelector).innerText();
        expect(Message).toBe('Uneta je pogrešna imejl adresa');
    }
    async registration6(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("damjan@.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("Felina10");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
        const MessageSelector = '#register-resident-user-screen-default > form > div.form-group.gigya-composite-control.gigya-composite-control-textbox.gigya-composite-control-active > span'; 
        const Message = await this.page.locator(MessageSelector).innerText();
        expect(Message).toBe('Uneta je pogrešna imejl adresa');
    }
    async registration7(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("damjan.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("Felina10");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
        const MessageSelector = '#register-resident-user-screen-default > form > div.form-group.gigya-composite-control.gigya-composite-control-textbox.gigya-composite-control-active > span'; 
        const Message = await this.page.locator(MessageSelector).innerText();
        expect(Message).toBe('Uneta je pogrešna imejl adresa');
    }
    async registration8(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("@gmail.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("Felina10");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
    }
    async registration9(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("pekalo2893@bizatop.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("Abraka1");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
        const MessageSelector = '#register-resident-user-screen-default > form > div:nth-child(2) > span.field-info.js-password-info'; 
        const Message = await this.page.locator(MessageSelector).innerText();
        expect(Message).toBe('Lozinka treba da sadrži najmanje: 8 karaktera.');
    }
    async registration10(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("pekalo2893@bizatop.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("Abrakad12");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
        const MessageSelector = '#register-resident-user-screen-default > form > div:nth-child(2) > span.field-info.js-password-info'; 
        const Message = await this.page.locator(MessageSelector).innerText();
        expect(Message).toBe('Lozinka je sigurna');
    }
    async registration11(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("pekalo2893@bizatop.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("larikanab");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
        const errorMessageSelector = '#register-resident-user-screen-default > form > div:nth-child(2) > span.field-info.js-password-info'; 
        const errorMessage = await this.page.locator(errorMessageSelector).innerText();
        expect(errorMessage).toBe('Lozinka treba da sadrži najmanje: 1 veliko slovo, 1 broj.');
    }
    async registration12(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("pekalo2893@bizatop.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("21493079649302");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
        const errorMessageSelector = '#register-resident-user-screen-default > form > div:nth-child(2) > span.field-info.js-password-info'; 
        const errorMessage = await this.page.locator(errorMessageSelector).innerText();
        expect(errorMessage).toBe('Lozinka treba da sadrži najmanje: 1 veliko slovo, 1 malo slovo.');
    }
    async registration13(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("pekalo2893@bizatop.com"); 
        await this.page.locator(this.password).fill("");
        await this.page.locator(this.password).type("STIGMAN1");
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
        const errorMessageSelector = '#register-resident-user-screen-default > form > div:nth-child(2) > span.field-info.js-password-info'; 
        const errorMessage = await this.page.locator(errorMessageSelector).innerText();
        expect(errorMessage).toBe('Lozinka treba da sadrži najmanje: 1 malo slovo.');
    }
    async registration14(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("pekalo2893@bizatop.com"); 
        await this.page.locator(this.checkbox).click();
        await this.page.locator(this.submit).click();
        const emailFieldColor21 = await this.page.locator(this.password).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        expect(emailFieldColor21).toBe('oklch(0.243406 0.063896 260.503)');
        
    }
    async registration15(){
        
        await this.page.locator(this.email).fill("");
        await this.page.locator(this.email).type("pepadek918@comsb.com");
        await this.page.locator(this.password).type("Katjusa1");
        await this.page.locator(this.submit).click();
    }
    async registration16(){
        
        
        await this.page.locator(this.submit).click();
        const emailFieldColor21 = await this.page.locator(this.password).evaluate((element) => {
        return window.getComputedStyle(element).color;
    });
    expect(emailFieldColor21).toBe('oklch(0.243406 0.063896 260.503)');
    }
    async login (){
        await this.page.locator(this.imejlKorisnicko).fill("");
        await this.page.locator(this.imejlKorisnicko).type("damjanserbia123@gmail.com"); 
        await this.page.locator(this.passwordField).fill("");
        await this.page.locator(this.passwordField).type("Felina10@");
        await this.page.locator(this.eyeHiddenButton).click();
        await this.page.locator(this.buttonPrijaviSe).click();
      
    }
    async clickPasswordRecovery() {
        await this.page.waitForSelector(this.linkPasswordForgotten, { state: 'visible' });
        await this.page.locator(this.linkPasswordForgotten).scrollIntoViewIfNeeded();
        await this.page.locator(this.linkPasswordForgotten).click();
    }

    async imejlPasswordRecovery() {
        await this.page.waitForSelector(this.imejlForgottenEmail);
        await this.page.locator(this.imejlForgottenEmail).type("damjanserbia123@gmail.com");
    }

    async submitPasswordRecovery() {
        await this.page.waitForSelector(this.prijaviSeButton);
        await this.page.locator(this.prijaviSeButton).click();
    }
    
    async linkRegistrujSe() {
        await this.page.waitForSelector(this.linkRegistrujSe1);
        await this.page.locator(this.linkRegistrujSe1).click();
    }
       
    async invalidInputsPassword1() {
       

        await this.page.waitForSelector(this.imejlKorisnicko);
        await this.page.locator(this.imejlKorisnicko).type("damjanserbia123@gmail.com");

        await this.page.waitForSelector(this.passwordField);
        await this.page.locator(this.passwordField).type("Felin10");
        await this.page.locator(this.buttonPrijaviSe).click();

    }
    async invalidInputsPassword2() {
        await this.page.waitForSelector(this.imejlKorisnicko)
        await this.page.locator(this.imejlKorisnicko).type("damjanserbia123@gmail.com");
        await this.page.locator(this.buttonPrijaviSe).click();
        const emailFieldColor21 = await this.page.locator(this.password).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        expect(emailFieldColor21).toBe('oklch(0.243406 0.063896 260.503)');
    }
    async invalidInputsPassword3() {
        await this.page.waitForSelector(this.imejlKorisnicko, { state: 'visible' });
        await this.page.locator(this.imejlKorisnicko).type("damjanserbia123@gmail.com");
        await this.page.waitForSelector(this.passwordField, { state: 'visible' });
        await this.page.locator(this.passwordField).type("Tsllasjd12");
        await this.page.locator(this.buttonPrijaviSe).click();
    }
    async clickPasswordRecovery1() {
        await this.page.waitForSelector(this.linkPasswordForgotten, { state: 'visible' });
        await this.page.locator(this.linkPasswordForgotten).scrollIntoViewIfNeeded();
        await this.page.locator(this.linkPasswordForgotten).click();
    }

    async imejlPasswordRecovery1() {
        await this.page.waitForSelector(this.imejlForgottenEmail);
        await this.page.locator(this.imejlForgottenEmail).type("xawim32532@aersm.com");
    }

    async submitPasswordRecovery1() {
        await this.page.waitForSelector(this.prijaviSeButton);
        await this.page.locator(this.prijaviSeButton).click();
    }
}
    

module.exports=LoginPageSasomange;