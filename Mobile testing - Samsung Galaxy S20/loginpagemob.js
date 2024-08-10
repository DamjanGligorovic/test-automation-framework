const { expect } = require('@playwright/test');

class LoginPage {
    constructor(page, isMob) {
        this.page = page;
        this.isMob = isMob ? page : page;
        this.buttonTryItForFree = "body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-y28f86 > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-vua517 > div > div > div.MuiStack-root.css-1n1rld4 > div.MuiBox-root.css-0 > a > button";
        this.signUpButtonEmail = "#signUpWithEmail";
        this.buttonOdustajem = "#korisnik > tbody > tr:nth-child(7) > td > input[type=reset]:nth-child(3)";
        this.menuButton = "#__next > header > div > div > div.PrivateHiddenCss-root.PrivateHiddenCss-mdUp.css-rzj9po > div > div > button > div > span > img"
        this.xCloseButton = "#onetrust-close-btn-container > button"
        this.inputfieldbusinessemail = "#email"
        this.usernameField = "#username"
        this.passwordField = "#password"
        this.passwordField1 = "#__next > div > main > div:nth-child(1) > form > div.Password_input-group__fKrRa.SignupForm_field__cyBcT > label"
        this.eyeButtonHidden= "#__next > div > main > div:nth-child(1) > form > div.Password_input-group__fKrRa.SignupForm_field__cyBcT > div.Password_password-container__RviBQ > div"
        this.checkboxsubscription = "#subscription"
        this.buttonsignUp = "#__next > div > main > div:nth-child(1) > form > button"
        this.linkSignIn = "body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-y28f86 > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-vua517 > div > div > div.MuiStack-root.css-j7qwjs > div:nth-child(6) > a"
        this.usernameFieldSignIn = "#idToken1"
        this.passwordFieldSignIn = "#idToken2"
        this.buttonSignIn = "#loginButton_0"
        this.linkForgotPassword = "[href='#passwordReset/']"
        this.usernameFieldRecovery = "#input-uid"
        this.emailFieldRecovery = "#input-mail"
        this.buttonResetThePassword = "#userQuery > input.btn.btn-lg.btn-block.btn--primary"
        this.errorMessage = "#__next > div > main > div:nth-child(1) > form > div.SignupForm_error-messages__1Eb5F > div > div > span"
        this.errorMessage1 = "#email-error-message"
        this.emailFieldColor1 = "#email-error-message"
        this.emailFieldColor3 = "#email"
        this.xCloseButton1 = "#__next > div > main > div:nth-child(1) > form > div.SignupForm_error-messages__1Eb5F > div > button"
        this.usernameErrorMessage= "#username-error-message"
        this.usernameColorGreen="input#username.TextInputGroup_input___pLU9.TextInputGroup_input__is-valid__mxSEN"
        this.linkPrivacyNotice = "#__next > div > main > div:nth-child(1) > form > div:nth-child(6) > div > label > span > a"
        this.linkTermsConditions = "#__next > div > main > div:nth-child(1) > p.index_disclaimer__5nlOs > a:nth-child(1)"
        this.linkPrivacyPolicy = "#__next > div > main > div:nth-child(1) > p.index_disclaimer__5nlOs > a:nth-child(2)"
        this.buttonSignIn1 = ".A_button-basic__MktNA"
        this.confirmationMessageSelector = '#processContent > form > p'
    }

    

    async signUp() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();

        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");

        await this.isMob.locator(this.menuButton).waitFor({ state: 'visible', timeout: 60000 });
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");

        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill("");
        await this.isMob.locator(this.inputfieldbusinessemail).type("damjangligorovic@hotmail.com")
        await this.isMob.locator(this.usernameField).type("Damjanko12")
        await this.isMob.locator(this.passwordField).type("Felina10@")
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        await this.isMob.locator(this.xCloseButton1).click()


    }
    async signUp1() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");    
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill("");
        await this.isMob.locator(this.inputfieldbusinessemail).type("tatjanagligorovic@hotmail.com")
        await this.isMob.locator(this.usernameField).type("Damjanko12")
        await this.isMob.locator(this.passwordField).type("Felina10@")
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()

    }
    async signUpInvalidData() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");   
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill("");
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        await this.isMob.locator(this.inputfieldbusinessemail).type("fdsdaflsjdl@hotmail.c!m")
        await this.isMob.locator(this.usernameField).type("dffdD21")
        await this.isMob.locator(this.passwordField).type("dsfdFgs323231@$21")
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        const emailFieldColor2 = await this.page.locator(this.emailFieldColor1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        expect(emailFieldColor2).toBe('rgb(220, 53, 69)');

    }
    async signUpInvalidData1() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        await emailField.focus();
        await emailField.fill(""); // Clear the field before typing
        await emailField.type("predraghotmail.com");
        const emailFieldColor2 = await this.page.locator(this.emailFieldColor1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        expect(emailFieldColor2).toBe('rgb(220, 53, 69)');

        await this.isMob.locator(this.usernameField).type("dffdD21")
        await this.isMob.locator(this.passwordField).type("dsfdFgs323231@$21")
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()

    }
    async signUpInvalidData2() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("@hotmail.com");
        const emailFieldColor2 = await this.page.locator(this.emailFieldColor1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        expect(emailFieldColor2).toBe('rgb(220, 53, 69)');

        await this.isMob.locator(this.usernameField).type("dffdD21")
        await this.isMob.locator(this.passwordField).type("dsfdFgs323231@$21")
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()

    }
    async signUpInvalidData3() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");   
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("aleksandarkovac@hotmail");
        const emailFieldColor2 = await this.page.locator(this.emailFieldColor1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        expect(emailFieldColor2).toBe('rgb(220, 53, 69)');

        await this.isMob.locator(this.usernameField).type("dffdD21")
        await this.isMob.locator(this.passwordField).type("dsfdFgs323231@$21")
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()

    }
    async signUpInvalidData4() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");   
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); // Clear the field before typing
        await emailField.type("milanmarkovic@hotmail.c-m", { timeout: 50000 });
        const emailFieldColor2 = await this.page.locator(this.emailFieldColor3).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        expect(emailFieldColor2).not.toBe('rgb(85, 85, 85)');

        await this.isMob.locator(this.usernameField).type("dffdD21")
        await this.isMob.locator(this.passwordField).type("dsfdFgs323231@$21")
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
       
    }
    async signUpInvalidData5() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");        
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); // Clear the field before typing
        await this.isMob.locator(this.usernameField).type("dffdD21")
        await this.isMob.locator(this.passwordField).type("dsfdFgs323231@$21")
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        const emailFieldColor2 = await this.page.locator(this.emailFieldColor1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        expect(emailFieldColor2).toBe('rgb(220, 53, 69)');


    }
    async signUpInvalidData6() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");     
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        await this.isMob.locator(this.usernameField).type("dffdD21")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        const passwordFieldColor = await this.page.locator(this.passwordField1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        
        expect(passwordFieldColor).toBe('rgb(220, 53, 69)');

    }
    async signUpInvalidData7() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const emailField = this.page.locator(this.inputfieldbusinessemail)
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        await this.isMob.locator(this.usernameField).type("dffdD21")
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await this.isMob.locator(this.passwordField).type("Qa1@aer");

        
        const passwordFieldColor = await this.page.locator(this.passwordField1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        
        expect(passwordFieldColor).toBe('rgb(220, 53, 69)');
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
       
}
     async signUpInvalidData8() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");    
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        await this.isMob.locator(this.usernameField).type("dffdD21")
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("Qa1thqwe")
        const passwordFieldColor = await this.page.locator(this.passwordField1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        expect(passwordFieldColor).toBe('rgb(220, 53, 69)');
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()


    }   
    async signUpInvalidData9() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");            
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        await this.isMob.locator(this.usernameField).type("dffdD21")
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("Qalt@qwe")
        const passwordFieldColor = await this.page.locator(this.passwordField1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        
        expect(passwordFieldColor).toBe('rgb(220, 53, 69)');
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()


    }   
    async signUpInvalidData10() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");    
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        await this.isMob.locator(this.usernameField).type("dffdD21")
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("qal2t@qwe")
        const passwordFieldColor = await this.page.locator(this.passwordField1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        
        expect(passwordFieldColor).toBe('rgb(220, 53, 69)');
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()


    }   
    async signUpInvalidData11() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");       
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        await this.isMob.locator(this.usernameField).type("dffdD21")
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("QALTH@W3")
        const passwordFieldColor = await this.page.locator(this.passwordField1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        
        
        expect(passwordFieldColor).toBe('rgb(220, 53, 69)');
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()


    }  
    async signUpInvalidData12() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");            
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        await this.isMob.locator(this.usernameField).type("dffdD21")
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("12345678")
        const passwordFieldColor = await this.page.locator(this.passwordField1).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
        
        
        expect(passwordFieldColor).toBe('rgb(220, 53, 69)');
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()


    }  
    async signUpInvalidData13() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");      
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type("D")
        const usernameFieldColor = await this.page.locator(this.usernameErrorMessage).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(220, 53, 69)');
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()


    }  
    async signUpInvalidData14() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");       
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type("A2qxQhBPHNfYnjRXaXrqinRdAymRVYGZLZyGZKmGaCTgXXcxcyzFBGzJHBHmUwGwMfCchCe")
        const usernameFieldColor = await this.page.locator(this.usernameErrorMessage).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(220, 53, 69)');
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()


    }  
    async signUpInvalidData15() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");        
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        const usernameFieldColor = await this.page.locator(this.usernameErrorMessage).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(220, 53, 69)');

    }  
    async signUpInvalidData16() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");          
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type("A2qxQhBPHNfYnjRXaXrqinRdAymRVYGZLZyGZKmGaCTgXXcxcyzFBGzJHBHmUwGwMfCchCew")
        const usernameFieldColor = await this.page.locator(this.usernameErrorMessage).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(220, 53, 69)');
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()


    }  
    async signUpInvalidData17() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");      
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type("A1@")
        const usernameFieldColor = await this.page.locator(this.usernameErrorMessage).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(220, 53, 69)');
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()


    }  
    async signUpInvalidData18() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");         
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type("b-")
      
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        const usernameFieldColor = await this.page.locator(this.usernameColorGreen).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(85, 85, 85)');

    }  
    async signUpInvalidData19() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");   
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type("C1")
      
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        const usernameFieldColor = await this.page.locator(this.usernameColorGreen).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(85, 85, 85)');

    } 
    async signUpInvalidData20() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");         
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type("D_")
      
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        const usernameFieldColor = await this.page.locator(this.usernameColorGreen).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(85, 85, 85)');

    }  
    async signUpInvalidData21() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");         
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type("g.")
      
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        const usernameFieldColor = await this.page.locator(this.usernameColorGreen).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(85, 85, 85)');

    }  
    async signUpInvalidData22() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing"); 
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type(" G")
        const usernameFieldColor = await this.page.locator(this.usernameErrorMessage).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(220, 53, 69)');
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        

    }  
    async signUpInvalidData23() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");         
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.page.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type("G ")
        const usernameFieldColor = await this.page.locator(this.usernameErrorMessage).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(220, 53, 69)');
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.checkboxsubscription).click()
        await this.isMob.locator(this.buttonsignUp).click()
        

    }  
    async signUpInvalidData24() {
        
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");             
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        const emailField = this.isMob.locator(this.inputfieldbusinessemail);
        await emailField.focus();
        await emailField.fill(""); 
        await emailField.type("milanmarkovic@hotmail.com");
        const username1 = this.page.locator(this.usernameField);
        await username1.focus();
        await username1.fill(""); 
        await this.isMob.locator(this.usernameField).type("Ge1rfgdgfdg ")
        const usernameFieldColor = await this.page.locator(this.usernameErrorMessage).evaluate((element) => {
            return window.getComputedStyle(element).color;
        });
    
        
        expect(usernameFieldColor).toBe('rgb(220, 53, 69)');
        const passwordField = this.page.locator(this.passwordField);
        await passwordField.focus();
        await passwordField.fill("");
        await passwordField.type("De1@gjfldjflg")
        
        await this.isMob.locator(this.eyeButtonHidden).click()
        await this.isMob.locator(this.buttonsignUp).click()
        await this.isMob.locator(this.xCloseButton1).click()

        

    }  
    async inspectTheLinkPrivacyNotice() {
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");   
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        await this.page.locator(this.linkPrivacyNotice).evaluate((el) => el.removeAttribute('target'));
        await this.page.locator(this.linkPrivacyNotice).click();

    }
    async inspectTheLinkTermsConditions() {
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        await this.page.locator(this.linkTermsConditions).evaluate((el) => el.removeAttribute('target'));
        await this.page.locator(this.linkTermsConditions).click();

    }
    async inspectTheLinkPrivacyPolicy() {
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        const url1 = await this.page.url();
        expect(url1).toBe("https://saucelabs.com/sign-up/register")
        const title2 = await this.page.title();
        expect(title2).toBe("Sign Up for a Free Trial | Sauce Labs");
        await this.page.locator(this.linkPrivacyPolicy).evaluate((el) => el.removeAttribute('target'));
        await this.page.locator(this.linkPrivacyPolicy).click();

    }
    async inspectTheLinkButtonSignIn() {
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.buttonTryItForFree).click();
        await this.isMob.locator(this.signUpButtonEmail).click();
        await this.isMob.goto("https://accounts.saucelabs.com/am/XUI/#login/")
        const title2 = await this.page.title();
        expect(title2).toBe("Sauce Labs | Accounts");
        const url1 = await this.page.url();
        expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/#login/")
       
    }
        async signIn() {
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
        await this.isMob.locator(this.menuButton).click();    
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.linkSignIn).evaluate((el) => el.removeAttribute('target'));
        await this.isMob.locator(this.linkSignIn).click();
        const title2 = await this.page.title();
        expect(title2).toBe("Sauce Labs | Accounts");
        const url1 = await this.page.url();
        expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
        await this.isMob.locator(this.usernameFieldSignIn).type("Damjanko12")
        await this.isMob.locator(this.passwordFieldSignIn).type("Felina10@")
        await this.isMob.locator(this.buttonSignIn).click();



        
    }
    async forgotPassword() {
        await this.isMob.waitForURL("https://saucelabs.com/");
        expect(this.isMob.url()).toBe("https://saucelabs.com/");
        const title1 = await this.page.title();
        expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
        await this.isMob.locator(this.menuButton).click();
        await this.isMob.locator(this.xCloseButton).click();
        await this.isMob.locator(this.linkSignIn).evaluate((el) => el.removeAttribute('target'));
        await this.isMob.locator(this.linkSignIn).click();
        const title2 = await this.page.title();
        expect(title2).toBe("Sauce Labs | Accounts");
        const url1 = await this.page.url();
        expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
        await this.isMob.locator(this.linkForgotPassword).evaluate((el) => el.removeAttribute('target'));
        await this.isMob.locator(this.linkForgotPassword).click();
        const title3 = await this.page.title();
        expect(title3).toBe("Sauce Labs | Accounts");
        const url2 = await this.page.url();
        expect(url2).toBe("https://accounts.saucelabs.com/am/XUI/#passwordReset/")
        await this.isMob.locator(this.usernameFieldRecovery).type("Damjanko12")
        await this.isMob.locator(this.emailFieldRecovery).type("damjangligorovic@hotmail.com")
        await this.isMob.locator(this.buttonResetThePassword).click();
        const confirmationMessageLocator =  this.page.locator(this.confirmationMessageSelector);

        const confirmationMessage = await confirmationMessageLocator.textContent();

        expect(confirmationMessage.trim()).toBe("An email has been sent to the address you entered. Click the link in that email to proceed.");

    
};
async forgotPassword1() {
    await this.isMob.waitForURL("https://saucelabs.com/");
    expect(this.isMob.url()).toBe("https://saucelabs.com/");
    const title1 = await this.page.title();
    expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
    await this.isMob.locator(this.menuButton).click();
    await this.isMob.locator(this.xCloseButton).click();
    await this.isMob.locator(this.linkSignIn).evaluate((el) => el.removeAttribute('target'));
    await this.isMob.locator(this.linkSignIn).click();
    const title2 = await this.page.title();
    expect(title2).toBe("Sauce Labs | Accounts");
    const url1 = await this.page.url();
    expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
    await this.isMob.locator(this.linkForgotPassword).evaluate((el) => el.removeAttribute('target'));
    await this.isMob.locator(this.linkForgotPassword).click();
    const title3 = await this.page.title();
    expect(title3).toBe("Sauce Labs | Accounts");
    const url2 = await this.page.url();
    expect(url2).toBe("https://accounts.saucelabs.com/am/XUI/#passwordReset/")
    await this.isMob.locator(this.usernameFieldRecovery).type("Damjanko12")
   // await this.isMob.locator(this.emailFieldRecovery).type("damjangligorovic@hotmail.com")
    await this.isMob.locator(this.buttonResetThePassword).click();
    const confirmationMessageLocator =  this.page.locator(this.confirmationMessageSelector);

    const confirmationMessage = await confirmationMessageLocator.textContent();

    expect(confirmationMessage.trim()).toBe("An email has been sent to the address you entered. Click the link in that email to proceed.");


};
async forgotPassword2() {
    await this.isMob.waitForURL("https://saucelabs.com/");
    expect(this.isMob.url()).toBe("https://saucelabs.com/");
    const title1 = await this.page.title();
    expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
    await this.isMob.locator(this.menuButton).click();
    await this.isMob.locator(this.xCloseButton).click();
    await this.isMob.locator(this.linkSignIn).evaluate((el) => el.removeAttribute('target'));
    await this.isMob.locator(this.linkSignIn).click();
    const title2 = await this.page.title();
    expect(title2).toBe("Sauce Labs | Accounts");
    const url1 = await this.page.url();
    expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
    await this.isMob.locator(this.linkForgotPassword).evaluate((el) => el.removeAttribute('target'));
    await this.isMob.locator(this.linkForgotPassword).click();
    const title3 = await this.page.title();
    expect(title3).toBe("Sauce Labs | Accounts");
    const url2 = await this.page.url();
    expect(url2).toBe("https://accounts.saucelabs.com/am/XUI/#passwordReset/")
   // await this.isMob.locator(this.usernameFieldRecovery).type("Damjanko12")
    await this.isMob.locator(this.emailFieldRecovery).type("damjangligorovic@hotmail.com")
    await this.isMob.locator(this.buttonResetThePassword).click();
    const confirmationMessageLocator =  this.page.locator(this.confirmationMessageSelector);

    const confirmationMessage = await confirmationMessageLocator.textContent();

    expect(confirmationMessage.trim()).toBe("An email has been sent to the address you entered. Click the link in that email to proceed.");


};
async forgotPassword3() {
    await this.isMob.waitForURL("https://saucelabs.com/");
    expect(this.isMob.url()).toBe("https://saucelabs.com/");
    const title1 = await this.page.title();
    expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
    await this.isMob.locator(this.menuButton).click();
    await this.isMob.locator(this.xCloseButton).click();
    await this.isMob.locator(this.linkSignIn).evaluate((el) => el.removeAttribute('target'));
    await this.isMob.locator(this.linkSignIn).click();
    const title2 = await this.page.title();
    expect(title2).toBe("Sauce Labs | Accounts");
    const url1 = await this.page.url();
    expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
    await this.isMob.locator(this.linkForgotPassword).evaluate((el) => el.removeAttribute('target'));
    await this.isMob.locator(this.linkForgotPassword).click();
    const title3 = await this.page.title();
    expect(title3).toBe("Sauce Labs | Accounts");
    const url2 = await this.page.url();
    expect(url2).toBe("https://accounts.saucelabs.com/am/XUI/#passwordReset/")
    await this.isMob.locator(this.usernameFieldRecovery).type("Damjanko12fdgjfdl34032")
    //await this.isMob.locator(this.emailFieldRecovery).type("damjangligorovichotmailc-m")
    await this.isMob.locator(this.buttonResetThePassword).click();
    const confirmationMessageLocator =  this.page.locator(this.confirmationMessageSelector);

    const confirmationMessage = await confirmationMessageLocator.textContent();

    expect(confirmationMessage.trim()).toBe("An email has been sent to the address you entered. Click the link in that email to proceed.");


};
async forgotPassword4() {
    await this.isMob.waitForURL("https://saucelabs.com/");
    expect(this.isMob.url()).toBe("https://saucelabs.com/");
    const title1 = await this.page.title();
    expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
    await this.isMob.locator(this.menuButton).click();
    await this.isMob.locator(this.xCloseButton).click();
    await this.isMob.locator(this.linkSignIn).evaluate((el) => el.removeAttribute('target'));
    await this.isMob.locator(this.linkSignIn).click();
    const title2 = await this.page.title();
    expect(title2).toBe("Sauce Labs | Accounts");
    const url1 = await this.page.url();
    expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
    await this.isMob.locator(this.linkForgotPassword).evaluate((el) => el.removeAttribute('target'));
    await this.isMob.locator(this.linkForgotPassword).click();
    const title3 = await this.page.title();
    expect(title3).toBe("Sauce Labs | Accounts");
    const url2 = await this.page.url();
    expect(url2).toBe("https://accounts.saucelabs.com/am/XUI/#passwordReset/")
    //await this.isMob.locator(this.usernameFieldRecovery).type("Damjanko12fdgjfdl34032")
    await this.isMob.locator(this.emailFieldRecovery).type("interstinginfo@gmail.com")
    await this.isMob.locator(this.buttonResetThePassword).click();
    const confirmationMessageLocator =  this.page.locator(this.confirmationMessageSelector);

    const confirmationMessage = await confirmationMessageLocator.textContent();

    expect(confirmationMessage.trim()).toBe("An email has been sent to the address you entered. Click the link in that email to proceed.");


};
      
    



        
    
    async signiInInvalidInputs() {
        try {
            await this.isMob.waitForURL("https://saucelabs.com/");
            expect(this.isMob.url()).toBe("https://saucelabs.com/");
            const title1 = await this.page.title();
            expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
            await this.isMob.locator(this.menuButton).click();
            await this.isMob.locator(this.xCloseButton).click();
            await this.isMob.locator(this.linkSignIn).evaluate(el => el.removeAttribute('target'));
            await this.isMob.locator(this.linkSignIn).click();
            const title2 = await this.page.title();
            expect(title2).toBe("Sauce Labs | Accounts");
            const url1 = await this.page.url();
            expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
            // Ensure to wait for navigation or page change if necessary
            await this.page.waitForNavigation({ waitUntil: 'networkidle' });

            const url = await this.page.url(); // Ensure `url` is awaited
            expect(url).toContain("https://accounts.saucelabs.com/am/XUI/#login/");

            // Perform additional actions if necessary
            // Uncomment and update these lines based on your requirements
            // await this.isMob.locator(this.inputfieldbusinessemail).type("damjangligorovic@hotmail.com");
            // await this.isMob.locator(this.usernameField).type("Damjanko12");
            await this.isMob.locator(this.passwordFieldSignIn).type("Felina10@");
            await this.isMob.locator(this.buttonSignIn).click();

        } catch (err) {
            console.error("Error in signiInInvalidInputs:", err);
            throw err; // Rethrow to handle further up
        }
    }
    async signiInInvalidInputs1() {
        try {await this.isMob.waitForURL("https://saucelabs.com/");
            expect(this.isMob.url()).toBe("https://saucelabs.com/");
            const title1 = await this.page.title();
            expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
            await this.isMob.locator(this.menuButton).click();
            await this.isMob.locator(this.xCloseButton).click();
            await this.isMob.locator(this.linkSignIn).evaluate(el => el.removeAttribute('target'));
            await this.isMob.locator(this.linkSignIn).click();
            const title2 = await this.page.title();
            expect(title2).toBe("Sauce Labs | Accounts");
            const url1 = await this.page.url();
            expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
            const url = await this.page.url(); // Ensure `url` is awaited
            expect(url).toContain("https://accounts.saucelabs.com/am/XUI/");
            const title = await this.page.title();
            try {
                expect(title).toContain("Sauce Labs | Accounts");
            } catch (err) {
                errors.push(`Title Verification Failed: ${err.message}`);
            }
            await this.isMob.locator(this.usernameFieldSignIn).type("Damjanko12")
            await this.isMob.locator(this.passwordFieldSignIn).type("");
            await this.isMob.locator(this.buttonSignIn).click();
            const usernameFieldColor = await this.isMob.locator(this.buttonSignIn).evaluate((element) => {
                return window.getComputedStyle(element).color;
            }); 
            expect(usernameFieldColor).toBe('rgb(20, 34, 34)');
        } catch (err) {
            console.error("Error in signiInInvalidInputs:", err);
            throw err; // Rethrow to handle further up
        }
    }
    async signiInInvalidInputs2() {
        try {
            await this.isMob.waitForURL("https://saucelabs.com/");
            expect(this.isMob.url()).toBe("https://saucelabs.com/");
            const title1 = await this.page.title();
            expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
            await this.isMob.locator(this.menuButton).click();
            await this.isMob.locator(this.xCloseButton).click();
            await this.isMob.locator(this.linkSignIn).evaluate(el => el.removeAttribute('target'));
            await this.isMob.locator(this.linkSignIn).click();
            const title2 = await this.page.title();
            expect(title2).toBe("Sauce Labs | Accounts");
            const url1 = await this.page.url();
            expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
            const url = await this.page.url(); // Ensure `url` is awaited
            expect(url).toContain("https://accounts.saucelabs.com/am/XUI/");
            const title = await this.page.title();
            try {
                expect(title).toContain("Sauce Labs | Accounts");
            } catch (err) {
                errors.push(`Title Verification Failed: ${err.message}`);
            }
            await this.isMob.locator(this.usernameFieldSignIn).type("")
            await this.isMob.locator(this.passwordFieldSignIn).type("");
            await this.isMob.locator(this.buttonSignIn).click();
            const usernameFieldColor = await this.isMob.locator(this.buttonSignIn).evaluate((element) => {
                return window.getComputedStyle(element).color;
            }); 
            expect(usernameFieldColor).toBe('rgb(20, 34, 34)');
        } catch (err) {
            console.error("Error in signiInInvalidInputs:", err);
            throw err; // Rethrow to handle further up
        }
    }
    async signiInInvalidInputs3() {
        try {
            await this.isMob.waitForURL("https://saucelabs.com/");
            expect(this.isMob.url()).toBe("https://saucelabs.com/");
            const title1 = await this.page.title();
            expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
            await this.isMob.locator(this.menuButton).click();
            await this.isMob.locator(this.xCloseButton).click();
            await this.isMob.locator(this.linkSignIn).evaluate(el => el.removeAttribute('target'));
            await this.isMob.locator(this.linkSignIn).click();
            const title2 = await this.page.title();
            expect(title2).toBe("Sauce Labs | Accounts");
            const url1 = await this.page.url();
            expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
            await this.page.waitForURL("https://accounts.saucelabs.com/am/XUI/");
            const url = await this.page.url(); 
            expect(url).toContain("https://accounts.saucelabs.com/am/XUI/");

            // Verify page title
            const title = await this.page.title();
            try {
                expect(title).toContain("Sauce Labs | Accounts");
            } catch (err) {
                this.errors.push(`Title Verification Failed: ${err.message}`);
            }

            // Perform sign-in with invalid credentials
            await this.isMob.locator(this.usernameFieldSignIn).type("Damjanko348395849584");
            await this.isMob.locator(this.passwordFieldSignIn).type("Felina10@");
            await this.isMob.locator(this.buttonSignIn).click();
        } catch (err) {
            console.error("Error in signInInvalidInputs3:", err);
            this.errors.push(`SignInInvalidInputs3 Failed: ${err.message}`);
        }
    }

    async signiInInvalidInputs4() {
        try {
            await this.isMob.waitForURL("https://saucelabs.com/");
            expect(this.isMob.url()).toBe("https://saucelabs.com/");
            const title1 = await this.page.title();
            expect(title1).toBe("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
            await this.isMob.locator(this.menuButton).click();
            await this.isMob.locator(this.xCloseButton).click();
            await this.isMob.locator(this.linkSignIn).evaluate(el => el.removeAttribute('target'));
            await this.isMob.locator(this.linkSignIn).click();
            const title2 = await this.page.title();
            expect(title2).toBe("Sauce Labs | Accounts");
            const url1 = await this.page.url();
            expect(url1).toBe("https://accounts.saucelabs.com/am/XUI/")
            // Wait for the URL to update and verify
            await this.page.waitForURL("https://accounts.saucelabs.com/am/XUI/");
            const url = await this.page.url(); 
            expect(url).toContain("https://accounts.saucelabs.com/am/XUI/");

            // Verify page title
            const title = await this.page.title();
            try {
                expect(title).toContain("Sauce Labs | Accounts");
            } catch (err) {
                this.errors.push(`Title Verification Failed: ${err.message}`);
            }

            // Perform sign-in with invalid credentials
            await this.isMob.locator(this.usernameFieldSignIn).type("Damjanko12");
            await this.isMob.locator(this.passwordFieldSignIn).type("Felinadsfldj43kljl");
            await this.isMob.locator(this.buttonSignIn).click();
        } catch (err) {
            console.error("Error in signInInvalidInputs4:", err);
            this.errors.push(`SignInInvalidInputs4 Failed: ${err.message}`);
        }
    }
}




module.exports = LoginPage;
    
