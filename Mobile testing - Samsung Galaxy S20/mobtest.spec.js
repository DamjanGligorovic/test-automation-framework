const { test, expect } = require('@playwright/test');

const HomePageMob = require('../pages/homepagemob');
const LoginPageMob = require('../pages/loginpagemob');

async function setup({ page }) {
    const isMob = true; 
    const homePageMob = new HomePageMob(page, isMob);
    await homePageMob.navigate();

    return new LoginPageMob(page, isMob);
}

test('Register with valid user credentials TC 001', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.signUp();
    page.on('dialog', async (dialog) => {
        const message = dialog.message();
        expect(message).not.toBe('A non-temporary email is required.');
        await dialog.accept();
      });
      const url = page.url();
      expect(url).toContain("https://saucelabs.com/sign-up/register");
    
});

test('Register account with already registered user credentials. TC 002', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.signUp1();

    page.on('dialog', async (dialog) => {
        const message = dialog.message();
        expect(message).not.toBe('A non-temporary email is required.');
        await dialog.accept();
    });
});
    test('Register account with invalid email user credentials. TC 003', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData();
    
        const errorMessageElement = page.locator('#email-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('Not a valid email format');
    });
    test('Register account with invalid email user credentials TC 004.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData1();
    
        const errorMessageElement = page.locator('#email-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('Not a valid email format');
    });

    test('Register account with invalid email user credentials TC 005.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData2();
        const errorMessageElement = page.locator('#email-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('Not a valid email format');
    });
    test('Register account with invalid email user credentials TC 006.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData3();
    
        const errorMessageElement = page.locator('#email-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('Not a valid email format');
    });
    test('Register account with invalid email user credentials TC 007.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData4();
        page.on('dialog', async dialog => {
            expect(dialog.message()).toBe('Captcha validation failed. This may be a problem with your VPN. Please try again.');
            await dialog.accept();
        });
    });
    test('Register account with invalid email user credentials TC 008.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData5();
    
        const errorMessageElement = page.locator('#email-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('Email is required');
    });
    test('Register account with invalid password user credentials TC 009.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData6();
    
        const errorMessageElement = page.locator('#password-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('1 lowercase letter1 uppercase letter1 digit1 special character8 characters minimum');
    });
    test('Verify the maximal and minimal thread values of the Password field TC 010.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData7();
        
        const errorMessageElement = page.locator('#password-error-message > ul > li:nth-child(5)');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('8 characters minimum');
        
    });
    
    test('Verify the maximal and minimal thread values of the Password field TC 011.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData8();
    
        const errorMessageElement = page.locator('#password-error-message > ul > li:nth-child(4)');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('1 special character');
        
    });
    test('Verify the maximal and minimal thread values of the Password field TC 012.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData9();
    
        const errorMessageElement = page.locator('#password-error-message > ul > li:nth-child(3)');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('1 digit');
        
    });
    test('Verify the maximal and minimal thread values of the Password field TC 013.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData10();
    
        const errorMessageElement = page.locator('#password-error-message > ul > li:nth-child(2)');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('1 uppercase letter');
        
    });
    test('Verify the maximal and minimal thread values of the Password field TC 014.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData11();
    
        const errorMessageElement = page.locator('#password-error-message > ul > li:nth-child(1)');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('1 lowercase letter');
        
    });
    test('Verify the maximal and minimal thread values of the Password field TC 015.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData12();
    
        const errorMessageElement = page.locator('#password-error-message > ul > li:nth-child(1)');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('1 lowercase letter');
        const errorMessageElement2 = page.locator('#password-error-message > ul > li:nth-child(2)');
        const errorMessage2 = await errorMessageElement2.textContent();
        expect(errorMessage2.trim()).toBe('1 uppercase letter');
        const errorMessageElement3 = page.locator('#password-error-message > ul > li:nth-child(3)');
        const errorMessage3 = await errorMessageElement3.textContent();
        expect(errorMessage3.trim()).toBe('1 digit');        
    });
    test('Verify the maximal and minimal thread values of the Username field TC 016.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData13();
    
        const errorMessageElement = page.locator('#username-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('Username must be between 2 and 70 characters');
             
    });
    test('Verify the maximal and minimal thread values of the Username field TC 017.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData14();
    
        const errorMessageElement = page.locator('#username-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('Username must be between 2 and 70 characters');
             
    });
    test('Verify the maximal and minimal thread values of the Username field TC 018.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData15();
    
        const errorMessageElement = page.locator('#username-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('Username is required');
             
    });
    test('Verify the maximal and minimal thread values of the Username field TC 019.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData16();
    
        const errorMessageElement = page.locator('#username-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('Username must be between 2 and 70 characters');
             
    });
    test('Verify the maximal and minimal thread values of the Username field TC 020.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData17();
    
        const errorMessageElement = page.locator('#username-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).toBe('Username must only contain letters, numbers, or characters (_-.)');
             
    });
    test('Verify the valid characters of the Username field TC 021.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData18();
    
       
             
    });
    test('Verify the valid characters of the Username field TC 022.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData19();
    
       
             
    });
    test('Verify the valid characters of the Username field TC 023.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData20();
    
       
             
    });
    test('Verify the valid characters of the Username field TC 024.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData21();
    
       
             
    });
    test('Verify the invalid characters of the Username field TC 025.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData22();
    
        const errorMessageElement = page.locator('#username-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).not.toBe('Username must be between 2 and 70 characters');
             
    });
    test('Verify the invalid characters of the Username field TC 026.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData23();
    
        const errorMessageElement = page.locator('#username-error-message');
        const errorMessage1 = await errorMessageElement.textContent();
        expect(errorMessage1.trim()).not.toBe('Username must be between 2 and 70 characters');
             
    });
    test('Verify the invalid characters of the Email field TC 027.', async function({ page }) {
        const loginPageMob = await setup({ page });
        await loginPageMob.signUpInvalidData24();
    
       
             

    const url = page.url();
      expect(url).toContain("https://saucelabs.com/sign-up/register");
});
test('Inspect the link Privacy Notice TC 028.', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.inspectTheLinkPrivacyNotice();

    
         

    const errors = [];

    const url = page.url();
    try {
        expect(url).toContain("https://saucelabs.com/doc/privacy-notice");
    } catch (err) {
        errors.push(`URL Verification Failed: ${err.message}`);
    }

    const title = await page.title();
    try {
        expect(title).toContain("Privacy Notice");
    } catch (err) {
        errors.push(`Title Verification Failed: ${err.message}`);
    }

    if (errors.length > 0) {
        throw new Error(errors.join('\n'));
    }
});

test('Inspect the link Terms and Conditions TC 029.', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.inspectTheLinkTermsConditions();

    
         

    const errors = [];

    const url = page.url();
    try {
        expect(url).toContain("https://saucelabs.com/doc/terms-of-service");
    } catch (err) {
        errors.push(`URL Verification Failed: ${err.message}`);
    }

    const title = await page.title();
    try {
        expect(title).toContain("Terms of Service");
    } catch (err) {
        errors.push(`Title Verification Failed: ${err.message}`);
    }

    if (errors.length > 0) {
        throw new Error(errors.join('\n'));
    }
});
test('Inspect the link Privacy Policy TC 030.', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.inspectTheLinkPrivacyPolicy();

    
         

    const errors = [];

    const url = page.url();
    try {
        expect(url).toContain("https://saucelabs.com/doc/privacy-policy");
    } catch (err) {
        errors.push(`URL Verification Failed: ${err.message}`);
    }

    const title = await page.title();
    try {
        expect(title).toContain("Privacy Policy");
    } catch (err) {
        errors.push(`Title Verification Failed: ${err.message}`);
    }

    if (errors.length > 0) {
        throw new Error(errors.join('\n'));
    }
});
test('Inspect the button Sign in TC 031.', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.inspectTheLinkButtonSignIn();

    
         

    const errors = [];

    const url = page.url();
    try {
        expect(url).toContain("https://accounts.saucelabs.com/am/XUI/#login/");
    } catch (err) {
        errors.push(`URL Verification Failed: ${err.message}`);
    }

    const title = await page.title();
    try {
        expect(title).toContain("Sauce Labs | Accounts");
    } catch (err) {
        errors.push(`Title Verification Failed: ${err.message}`);
    }

   
});
test('Sign in with valid user credentials TC 0032', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.signIn();
});

test('Verify the password recovery process successfully resets the user password TC 033', async function({ page }) {
    const loginPageMob = await setup({ page});
    await loginPageMob.forgotPassword();
})

test('Sign in with invalid user credentials TC 034', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.signiInInvalidInputs(); 
   

   
});
test('Sign in with empty username field TC 035', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.signiInInvalidInputs(); 
});
 
test('Sign in with empty password field TC 036', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.signiInInvalidInputs1(); 

});
test('Sign in by clicking on the Log in button directly TC 037', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.signiInInvalidInputs2(); 

});
test('Sign in with invalid input in the field Username TC 038', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.signiInInvalidInputs3(); 

});
test('Sign in with invalid input in the field password TC 039', async function({ page }) {
    const loginPageMob = await setup({ page });
    await loginPageMob.signiInInvalidInputs4(); 

});
test('Verify the password recovery process successfully by submiting the inputs only in the field Username TC 040', async function({ page }) {
    const loginPageMob = await setup({ page});
    await loginPageMob.forgotPassword1();
})
test('Verify the password recovery process successfully by submiting the inputs only in the field Email address TC 041', async function({ page }) {
    const loginPageMob = await setup({ page});
    await loginPageMob.forgotPassword2();
})
test('Verify the password recovery process successfully by submiting the invalid inputs in the field User Name TC 042', async function({ page }) {
    const loginPageMob = await setup({ page});
    await loginPageMob.forgotPassword3();
})
test('Verify the password recovery process successfully by submiting the unregistered email in the field Email address TC 043', async function({ page }) {
    const loginPageMob = await setup({ page});
    await loginPageMob.forgotPassword4();
})

//https://accounts.saucelabs.com/am/XUI/#login/