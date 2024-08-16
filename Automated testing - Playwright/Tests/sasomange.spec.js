const {test, expect} = require('@playwright/test')
const LoginPageSasomange=require("../pages/loginpagesasomange")
const HomePageSasomange = require('../pages/homepagesasomange');
const { log } = require('console')

test("Sign in by using valid data and “Email” as option", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await loginPage.login()
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se")

})
test("Inspect password recovery function through the link under the Ne secas se Sasomange.rs lozinke? Nije problem, samo klikni!", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se")
    const loginPage=new LoginPageSasomange(page)
    await loginPage.clickPasswordRecovery();
    await loginPage.imejlPasswordRecovery();
    await loginPage.submitPasswordRecovery();
    const url1 = page.url()
    console.log("Url is " + url1)
    const title1 = await page.title()
    console.log("Title is " + title1)
    await expect(page).toHaveTitle("Zaboravljena lozinka | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/zaboravljena-lozinka")
});
test("Inspect link under Registruj se", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await loginPage.linkRegistrujSe()
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")

})
test("Sign in by using invalid input in Lozinka field TC 001", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await loginPage.invalidInputsPassword1()
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se");

})
test("Sign in by using invalid input in Lozinka field TC 002", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await loginPage.invalidInputsPassword2()
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se");

})
test("Sign in by using invalid input in Lozinka field TC 003", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se");
    const loginPage=new LoginPageSasomange(page)
    await loginPage.invalidInputsPassword3()
    const url1 = page.url();
    console.log("Url is " + url1)
    const title1 = await page.title()
    console.log("Title is " + title1)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se");
   

})

test("Inspect password recovery with unregistered email through the link Ne sećaš se Sasomange.rs lozinke? Nije problem, samo klikni!", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se");
    const loginPage=new LoginPageSasomange(page)
    await loginPage.clickPasswordRecovery1()
    await loginPage.imejlPasswordRecovery1()
    await loginPage.submitPasswordRecovery1()
    const url1 = page.url();
    console.log("Url is " + url1)
    const title1 = await page.title()
    console.log("Title is " + title1)
    await expect(page).toHaveTitle("Zaboravljena lozinka | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/zaboravljena-lozinka");
})
test("Create an account by using valid data in all fields and minimal requirements for password", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija");
    await loginPage.registration()
    

})
test("Create an account by using various characters in password field and valid inputs in all fields", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija");
    await loginPage.registration1()
    

})
test("Inspect link under Pravila I uslove koriscenja", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija");
    await loginPage.registration2()
})
test("Inspect link under Politiku privatnosti", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija");
    await loginPage.registration3()
})
test("Inspect link under Prijavi se", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija");
    await loginPage.registration4()
    const url1 = page.url();
    console.log("Url is " + url1)
    const title1 = await page.title()
    console.log("Title is " + title1)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se")
})
test("Create an account by using invalid email form in Imejl field TC001", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration5()
})
test("Create an account by using invalid email form in Imejl field TC002", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration6()
})
test("Create an account by using invalid email form in Imejl field TC003", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration7()
   
})
test("Create an account by using invalid email form in Imejl field TC004", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration8()
    const errorMessageSelector1 = "#register-resident-user-screen-default > form > div.form-group.gigya-composite-control.gigya-composite-control-textbox.gigya-composite-control-active > span";
    await page.waitForSelector(errorMessageSelector1, { state: 'visible' });
    const errorMessage1 = await page.locator(errorMessageSelector1).innerText();
    expect(errorMessage1).toBe('Uneta je pogrešna imejl adresa'); 
})
test("Create an account by using invalid inputs in the “Lozinka” field TC001", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration9()
})
test("Create an account by using invalid inputs in the “Lozinka” field TC002", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration10()
})
test("Create an account by using invalid inputs in the “Lozinka” field TC003", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration11()
})
test("Create an account by using invalid inputs in the “Lozinka” field TC004", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration12()
})
test("Create an account by using invalid inputs in the “Lozinka” field TC005", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url();
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration13()
    
})
test("Create an account by using invalid inputs in the “Lozinka” field TC006", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration14()
})
test("Create an account by leaving the button Prihvatam Pravila I Uslovi koriscenja unticked", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija");
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration15()
    const errorMessageSelector1 = "#register-resident-user-screen-default > form > div.form-group.consent-group > span";
    await page.waitForSelector(errorMessageSelector1, { state: 'visible' });
    const errorMessage1 = await page.locator(errorMessageSelector1).innerText();
    expect(errorMessage1).toBe('Ovo polje je obavezno'); 
})
test("Create an account by leaving all mandatory fields empty", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    await page.goto("https://sasomange.rs/registracija", { timeout: 60000 });
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Registracija | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/registracija")
    await loginPage.registration16()
    const errorMessageSelector = "#register-resident-user-screen-default > form > div.form-group.gigya-composite-control.gigya-composite-control-textbox.gigya-composite-control-active > span";
    await page.waitForSelector(errorMessageSelector, { state: 'visible' });
    const errorMessage = await page.locator(errorMessageSelector).innerText();
    expect(errorMessage).toBe('Ovo polje je obavezno'); 
    const errorMessageSelector1 = "#register-resident-user-screen-default > form > div.form-group.consent-group > span";
    await page.waitForSelector(errorMessageSelector1, { state: 'visible' });
    const errorMessage1 = await page.locator(errorMessageSelector1).innerText();
    expect(errorMessage1).toBe('Ovo polje je obavezno'); 
})
test("Create an ad without uploading images and fill all mandatory fields with valid inputs", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se")
    await loginPage.login1()
    await loginPage.login2()
    await loginPage.login3()

})
test("Create an ad with maximum amount of images/inspecting all variables and populate all fields with valid data", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se")
    await loginPage.login4()
    await loginPage.login5()
    await loginPage.login6()

})
test("Verify negative thread values of the upload function", async function({page}){
    const homePage = new HomePageSasomange(page)
    await homePage.navigate();
    const loginPage=new LoginPageSasomange(page)
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Prijava na nalog | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/uloguj-se")
    await loginPage.login8()
    const url1 = page.url()
    console.log("Url is " + url1)
    const title1 = await page.title()
    console.log("Title is " + title1)
    await expect(page).toHaveTitle("Dodaj oglas | Sasomange.rs oglasnik")
    await expect(page).toHaveURL("https://sasomange.rs/moj-sasomange/dodaj-oglas")

})