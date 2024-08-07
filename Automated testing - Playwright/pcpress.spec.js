const {test, expect} = require('@playwright/test')
const LoginPage=require("../pages/loginpage")
const HomePage = require('../pages/homepage');

const { log } = require('console')
test("Order a magazine by using negative inputs in “Kolicina” field 101", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournal101()
    const url = await page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeFalsy()

})
test("Order a magazine by using negative inputs in “Kolicina” field 0", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournal0()
    const url = await page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeFalsy()

})
test("Order a magazine by using negative inputs in “Kolicina” field 102", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournal102()
    const url = await page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeFalsy()

})
test("Order a magazine by using negative inputs in “Kolicina” field 99", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournal99()
    const url = await page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeTruthy()

})
test("Order a magazine by using negative inputs in “Kolicina” field (Leave the field Empty)", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalEmpty()
    page.on('dialog', async (dialog) => {
    const message = dialog.message();
    expect(message).toContain('Greška! U izabranom artiklu Godišnja pretplata na časopis PC (11 brojeva) niste upisali količinu.');
    expect(message).toContain('Greška! U izabranom artiklu Godišnja pretplata na časopis PC (11 brojeva) upisana količina mora biti broj.');
    await dialog.accept();
})

})
test("Order a magazine by using negative inputs in “Kolicina” field minus 1", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalMinus1()
    page.on('dialog', async (dialog) => {
    const message = dialog.message();
    expect(message).toContain('Greška! U izabranom artiklu Godišnja pretplata na časopis PC (11 brojeva) upisana količina mora biti broj.');
    await dialog.accept();
})

})
test("Order more than one magazine from drop down menu", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalMoreThanTwoOptionsDropdown()
    const pageContent = await page.content()
    expect(pageContent).includes("Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:").toBeFalsy()

})   
test("Order a magazine by clicking directly on the button Kupujem", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheButtonKupujemDirectly()
    const pageContent = await page.content()
    page.on('dialog', async (dialog) => {
    const message = dialog.message();
    expect(message).toContain('Greška! Molimo izaberite jedan od ponuđenih artikala klikom na checkbox polje.');
    await dialog.accept();
})
})
test("Order a magazine by using negative inputs in Ime i Prezime field (input = Daki)", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalImeIPrezimeDaki()
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")
    const pageContent = await page.content();
    await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')
    await page.waitForTimeout(7000)

   
})
test("Order a magazine by using negative inputs in Ime i Prezime field (input = Markovic)", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalImeIPrezimeMarkovic()
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")
    await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')
    await page.waitForTimeout(7000)

   
})
test("Order a magazine by using negative inputs in Ime i Prezime field (Leave the field empty)", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalLeaveTheFieldEmptyImeIPrezime()
    await page.waitForTimeout(7000)

    await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")

   
})
test("Order a magazine by using negative inputs in Ime i Prezime field (special characters)", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalImeIPrezimeMarkovicSpecialCharacters()
    await page.waitForTimeout(7000)

    await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")

   
})
test("Order a magazine by using negative inputs in Ulica i Broj field (Obrenoviceva)", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalUlicaIBrojObrenoviceva()
    await page.waitForTimeout(3000)
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")
    await page.waitForTimeout(7000)
    await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')
    

   
})
test("Order a magazine by using negative inputs in Ulica i Broj field (21)", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalUlicaIBroj21()
    await page.waitForTimeout(7000)
    await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")

   
})
test("Order a magazine by using negative inputs in Ulica i Broj field (Leave the field empty)", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalUlicaIBrojLeaveTheFieldEmpty()
    await page.waitForTimeout(7000)

    await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")

   
})
test("Order a magazine by using negative inputs in Ulica i Broj field (special characters)", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalUlicaIBrojSpecialCharacters()
    await page.waitForTimeout(7000)
    await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")

   
})
test("Order a magazine by using mismatched data in Postanski broj and Grad field", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalSynchronization()
    await page.waitForTimeout(7000)
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeFalsy()   
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")

   
})
test("Order a magazine by using invalid data in Telefon field", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalTelefon23819292()
    await page.waitForTimeout(7000)
    
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeFalsy()   
   
})
test("Order a magazine by using invalid data in Telefon field 24591903723", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalTelefon24591903723()
    await page.waitForTimeout(7000)
    
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeFalsy()   

   
})
test("Order a magazine by using invalid data in Telefon field Leave the field empty", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalTelefonLeavethefieldempty()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")
    await page.waitForTimeout(7000)
    await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')

   
})
test("Order a magazine by using invalid data in Telefon field Special characters", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalTelefonSpecialCharacters()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
     await page.waitForTimeout(7000)
    await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')   
    

   
})
test("Order a magazine by using invalid email form in Email field Without Domain", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalEmailWithoutDomain()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
     await page.waitForTimeout(7000)
     const pageContent = await page.content();
     expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeFalsy()   
 
    

   
})
test("Order a magazine by using invalid email form in Email field Without Net", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalEmailWithoutNet()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
     await page.waitForTimeout(7000)
     await page.waitForTimeout(7000)
     await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')   
 
    

   
})
test("Order a magazine by using invalid email form in Email field Without Username", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalWithoutUsername()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
     await page.waitForTimeout(7000)
     await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')   
 
    

   
})
test("Order a magazine by using invalid email form in Email field Without Email Space", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalEmailSpace()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
     await page.waitForTimeout(7000)
     await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')   
 
    

   
})
test("Order a magazine by leaving the “Narudzenica” form empty", async function({page}){
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalNarudzbenicaEmpty()
    const url = page.url()

    
     await page.waitForTimeout(7000)
     await expect(page.locator('#doubleprovera > span:nth-child(1)')).toContainText('Greška!')   
 
    

   
})
test("Order 1 of 'Godisnja pretplata na časopis PS(11 brojeva) via Plaćam uplatnicom option by using valid data in mandatoryfields", async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalGodisnja11Brojeva()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
    await page.waitForTimeout(7000)
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeTruthy()       

   
})
test("Order 100 of Polugodisnja pretplata na casopis PC (6 brojeva) via Plaćam uplatnicomoption by using valid data in all fields", async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalGodisnja2Broja()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
    await page.waitForTimeout(7000)
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeTruthy()       

   
})
test('Order 2 of Pretplata na digitalno izdanje časopisa PCPolugodišnja via Plaćam uplatnicom option by using valid data in mandatory fields', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalGodisnja2Broja()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
    await page.waitForTimeout(7000)
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeTruthy()       

   
})
test('Order 99 of "Knjiga 50 godina računarstva u Srbiji" via "Plaćamuplatnicom"option by using valid data in mandatory fields', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalGodisnja99Broja()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
    await page.waitForTimeout(7000)
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeTruthy()       

   
})
test('Order magazine with dropdown menu via "Plaćam uplatnicom"option by using valid data in mandatory fields', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalDropdown()
    const url = page.url()

    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
    await page.waitForTimeout(7000)
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeTruthy()      
})
test('Order a magazine with dropdown menu and with “Kolicina “field via "Plaćam uplatnicom" option by using valid data in mandatory fields', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalDropdownAndFieldKolicina()
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php")   
    await page.waitForTimeout(7000)
    const pageContent = await page.content();
    expect(pageContent.includes('Hvala na narudžbini. Ispod možete naći sve podatke potrebne za plaćanje ako niste dobili mail sa detaljima:')).toBeTruthy()      
})
test('Inspect the “PC press” logo located in header of the page', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheLinkLogoPCPRessHeader()
    const url = page.url()
    console.log("Url is " + url)
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC Press - Business & ICT News")
    await expect(page).toHaveURL("https://pcpress.rs/")   
    await page.waitForTimeout(7000)
})
test('Inspect the link under the Feed icon', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheLinkFeed()
    const url = page.url()
    console.log("Url is " + url)
    await expect(page).toHaveURL("https://pcpress.rs/feed/")   
    await page.waitForTimeout(7000)

})
test('Inspect the link under the Newsletter icon', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheLinkNewstter()
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("403 Forbidden")
    const url = page.url()
    console.log("Url is " + url)
    await expect(page).toHaveURL("https://pcpress.rs/newsletter/") 

})
test('Inspect the link under the Facebook icon', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheLinkFacebook()
    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC Press | Belgrade | Facebook")
    const url = page.url()
    console.log("Url is " + url)
    await expect(page).toHaveURL("https://www.facebook.com/PCPress.rs/") 

})
test('Inspect the link under the Twiter icon', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheLinkTwitter()
    await page.waitForTimeout(7000)

    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Log in to X / X")
    const url = page.url()
    console.log("Url is " + url)
    await expect(page).toHaveURL("https://x.com/i/flow/login?redirect_after_login=%2FPCPressRS") 

})
test('Inspect the link Pravila Koriscenja', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheLinkPravilaKoriscenja()
    await page.waitForTimeout(7000)

    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("Pravila korišćenja sajta | PC Press")
    const url = page.url()
    console.log("Url is " + url)
    await expect(page).toHaveURL("https://pcpress.rs/pravila-koriscenja-sajta/") 

})
test('On Predracun inspect the link prodavnica.pcpress.rs', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheLinkProdavnice()
    await page.waitForTimeout(7000)

    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    const url = page.url()
    console.log("Url is " + url)
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php") 
    await page.waitForTimeout(7000)

    await loginPage.bookJournalClickOnTheLinkProdavnice1()
    await page.waitForTimeout(7000)

    const title1 = await page.title()
    console.log("Title is " + title1)
    await expect(page).toHaveTitle("PC Press")
    const url1 = page.url()
    console.log("Url is " + url1)
    await expect(page).toHaveURL("https://prodavnica.pcpress.rs/") 

})
test('On Predracun inspect the link prodaja@pcpress.rs', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheLinkProdaja()
    await page.waitForTimeout(3000)

    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    const url = page.url()
    console.log("Url is " + url)
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php") 
    

})
test('On Predracun inspect the link PC Prodavnice', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheLinkPCProdavnica()
    await page.waitForTimeout(3000)

    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    const url = page.url()
    console.log("Url is " + url)
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php") 
    await loginPage.bookJournalClickOnTheLinkPCProdavnica1()
    const title1 = await page.title()
    console.log("Title is " + title1)
    await expect(page).toHaveTitle("PC prodavnica")
    const url1 = page.url()
    console.log("Url is " + url1)
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/index.php") 


})
test('Inspect the link “Povratak na vasu narudzbenicu”', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheLinkPovratakNaNarudzbenicu()
    await page.waitForTimeout(3000)

    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    const url = page.url()
    console.log("Url is " + url)
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/naruceno.php") 
    await loginPage.bookJournalClickOnTheLinkNarudzbenicu()
    const title1 = await page.title()
    console.log("Title is " + title1)
    await expect(page).toHaveTitle("PC prodavnica")
    const url1 = page.url()
    console.log("Url is " + url1)
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/index.php") 


})
test('Inspect the button “Odustajem”', async function({page}){
    
    const homePage = new HomePage(page)
    await homePage.navigate()
    const loginPage=new LoginPage(page)
    await loginPage.bookJournalClickOnTheOdustajem()
    await page.waitForTimeout(3000)

    const title = await page.title()
    console.log("Title is " + title)
    await expect(page).toHaveTitle("PC prodavnica")
    const url = page.url()
    console.log("Url is " + url)
    await expect(page).toHaveURL("https://pcpress.rs/prodavnica/index.php") 
    

})

