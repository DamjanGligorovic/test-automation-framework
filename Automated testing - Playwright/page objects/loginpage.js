class LoginPage
{
    constructor(page)
    {
        this.page = page
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.checkbox6 = "[value='6']"


        this.dropdownMenuAktuelni = "#disabled_selectPCnovi"
        this.value311 = "[value='ar_6_311']"
        this.value310 = "[value='ar_6_310']"
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.checkbox1="#arselektor1"
        this.input_Field_Kolicina1 = "#kolselektor1"
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.checkbox0= "#arselektor0"
        this.input_Field_Kolicina0 = "#kolselektor0"
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.checkbox14 = "#arselektor14"
        this.input_Field_Kolicina14 = "#kolselektor14"
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.checkbox15 = "#arselektor15"
        this.input_Field_Kolicina15 = "#kolselektor15"
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.checkbox4 = "#arselektor4"
        this.input_Field_Kolicina4 = "#kolselektor4"
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.checkbox7 = "[value='7']"
        this.dropdownMenuArhiva = "#disabled_selectPCstari"
        this.value309 = "[value='ar_7_309']"
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.dropdownMenuConnect = "#artikal8 > select"
        this.value37 = "[value='ar_9_37']"
        this.checkbox9="[value='9']"
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.checkboxKnjigaOffice = "#arselektor9"
        this.input_Field_Kolicina9 = "#kolselektor9"
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.checkboxIPC10 = "#arselektor10"
        this.input_Field_Kolicina10= "#kolselektor10"
        //checkboxes and input_fields_Kolicina and dropdown menus
        this.checkboxPCVodic = "#arselektor12"
        this.input_Field_Kolicina12 = "#kolselektor12"

        //Narudzbenica 
        this.xCloseButton = "img[onclick='skloniPorudzbenicu()']"
        this.imeIPrezime = "[name='ime']"
        this.ulicaIBroj = "[name='adresa']"
        this.postanskiBroj = "[name='postbroj']"
        this.grad = "[name='grad']"
        this.telefon = "[name='telefon']"
        this.email = "[name='email']"
        this.napomena = "[name='napomena']"
        this.buttonNarucujem = "tbody tr:nth-child(7) td:nth-child(1) input:nth-child(2)"
        this.buttonOdustajem = "#korisnik > tbody > tr:nth-child(7) > td > input[type=reset]:nth-child(3)"
        //main button kupujem
        this.mainbuttonKupujem = "#porudzbenica > div:nth-child(12) > input[type=image]:nth-child(2)"
        //greska
        this.greska = "#doubleprovera > span:nth-child(1)"
        //Povratak ka narudzbenici link
        this.linkPovrataNarudzbenici = "#doubleprovera > a"
        //link prodavnica.pcpress
        this.linkprodavnicaPCPress= "#doubleprovera > div > table:nth-child(23) > tbody > tr > td:nth-child(1) > a"
        //@prodaja link
        this.prodajaLink = "#doubleprovera > div > table:nth-child(23) > tbody > tr > td:nth-child(2) > a"
        //link Prodavnica
        this.linkProdavnica = "#doubleprovera > a"
        //logoPCPressHeader
        this.logoPCPressHeader = "#logo"
        //logoPCPressFooter
        this.logoPCPressFooter = "#noge > a > img"
        //linkNewsletter 
        this.linkNewsletter = "[href='http://pcpress.rs/newsletter/']"
        //linkFeed
        this.linkFeed = "a[href='http://pcpress.rs/feed/']";
        //linkFacebook
        this.linkFacebook = "[href='http://facebook.com/pcpress.rs']"
        //linkTwitter
        this.linkTwitter = "[href='http://twitter.com/PCPressRS']"
        //Pravila koriscenja
        this.linkPravilaKoriscenja = "#copyright > p > a"
    }
    async bookJournal101() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.input_Field_Kolicina1).fill(""); 
        await this.page.locator(this.input_Field_Kolicina1).type("101");
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Predrag Stojakovic")
        await this.page.locator(this.ulicaIBroj).type("Krunska 99")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("065324567")
        await this.page.locator(this.email).type("talinret543@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournal0() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.input_Field_Kolicina1).fill(""); 
        await this.page.locator(this.input_Field_Kolicina1).type("0");
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Milan Jankovic")
        await this.page.locator(this.ulicaIBroj).type("Milicina 32")
        await this.page.locator(this.postanskiBroj).type("18000")
        await this.page.locator(this.grad).type("Nis")
        await this.page.locator(this.telefon).type("0636563567")
        await this.page.locator(this.email).type("fdslajllwt543@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournal102() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.input_Field_Kolicina1).fill(""); 
        await this.page.locator(this.input_Field_Kolicina1).type("102");
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Branka Katic")
        await this.page.locator(this.ulicaIBroj).type("Knez Mihajlova 95")
        await this.page.locator(this.postanskiBroj).type("21000")
        await this.page.locator(this.grad).type("Novi Sad")
        await this.page.locator(this.telefon).type("068345324")
        await this.page.locator(this.email).type("dslljjfdgdrldgl@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournal99() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.input_Field_Kolicina1).fill(""); 
        await this.page.locator(this.input_Field_Kolicina1).type("99");
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Milica Tijanic")
        await this.page.locator(this.ulicaIBroj).type("Lakic 324")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("064356435")
        await this.page.locator(this.email).type("dgrd343tdfgd@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalEmpty() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.input_Field_Kolicina1).fill(""); 
        await this.page.locator(this.mainbuttonKupujem).click()
      
    }
    async bookJournalMinus1() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.input_Field_Kolicina1).fill(""); 
        await this.page.locator(this.input_Field_Kolicina1).type("-1");
        await this.page.locator(this.mainbuttonKupujem).click()
      
    }
    async bookJournalSpecialCharacters() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.input_Field_Kolicina1).fill(""); 
        await this.page.locator(this.input_Field_Kolicina1).type("aA$)");
        await this.page.locator(this.mainbuttonKupujem).click()
      
    }
    async bookJournalMoreThanTwoOptionsDropdown() {
        await this.page.locator(this.checkbox6).click()
        await this.page.locator(this.value310).click()

        await this.page.keyboard.down('Control');
        await this.page.locator(this.value311).click()
        await this.page.keyboard.up('Control');
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Novak Djokovic")
        await this.page.locator(this.ulicaIBroj).type("Lamda 3234")
        await this.page.locator(this.postanskiBroj).type("18000")
        await this.page.locator(this.grad).type("Nis")
        await this.page.locator(this.telefon).type("0657343584")
        await this.page.locator(this.email).type("rdgdrlgjl@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
      
    }
    async bookJournalClickOnTheButtonKupujemDirectly() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.mainbuttonKupujem).click()
      
    }   async bookJournalImeIPrezimeDaki() {
        await this.page.locator(this.checkbox0).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Daki ")
        await this.page.locator(this.ulicaIBroj).type("Kuna 43")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("06743652")
        await this.page.locator(this.email).type("kdgkd3k43k4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalImeIPrezimeMarkovic() {
        await this.page.locator(this.checkbox0).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type(" Markovic")
        await this.page.locator(this.ulicaIBroj).type("Tatjana 12")
        await this.page.locator(this.postanskiBroj).type("18000")
        await this.page.locator(this.grad).type("Nis")
        await this.page.locator(this.telefon).type("0654243594")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalLeaveTheFieldEmptyImeIPrezime() {
        await this.page.locator(this.checkbox0).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).fill("")
        await this.page.locator(this.ulicaIBroj).type("Lakic 324")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("064356435")
        await this.page.locator(this.email).type("dgrd343tdfgd@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalImeIPrezimeMarkovicSpecialCharacters() {
        await this.page.locator(this.checkbox0).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("+!?23%/@#>.435sdsd)")
        await this.page.locator(this.ulicaIBroj).type("Tatjana 12")
        await this.page.locator(this.postanskiBroj).type("18000")
        await this.page.locator(this.grad).type("Nis")
        await this.page.locator(this.telefon).type("0654243594")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalUlicaIBrojObrenoviceva() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Radomir Markovic")
        await this.page.locator(this.ulicaIBroj).type("Obrenoviceva ")
        await this.page.locator(this.postanskiBroj).type("18000")
        await this.page.locator(this.grad).type("Nis")
        await this.page.locator(this.telefon).type("0654243594")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalUlicaIBroj21() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Radomir Markovic")
        await this.page.locator(this.ulicaIBroj).type(" 21")
        await this.page.locator(this.postanskiBroj).type("18000")
        await this.page.locator(this.grad).type("Nis")
        await this.page.locator(this.telefon).type("0654243594")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalUlicaIBrojLeaveTheFieldEmpty() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Radomir Markovic")
        await this.page.locator(this.postanskiBroj).type("18000")
        await this.page.locator(this.grad).type("Nis")
        await this.page.locator(this.telefon).type("0654243594")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalUlicaIBrojSpecialCharacters() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Radomir Markovic")
        await this.page.locator(this.ulicaIBroj).type("+%>/@#>.5sdsd")
        await this.page.locator(this.postanskiBroj).type("18000")
        await this.page.locator(this.grad).type("Nis")
        await this.page.locator(this.telefon).type("0654243594")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalSynchronization() {
        await this.page.locator(this.checkbox14).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Rasto Nemanjic")
        await this.page.locator(this.ulicaIBroj).type("Milanka Savic 45")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Kragujevac")
        await this.page.locator(this.telefon).type("0654243594")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalTelefon23819292() {
        await this.page.locator(this.checkbox4).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Aleksandar Kovac")
        await this.page.locator(this.ulicaIBroj).type("Britanika Mikic 32")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("23819292")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalTelefon24591903723() {
        await this.page.locator(this.checkbox4).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Aleksandar Kovac")
        await this.page.locator(this.ulicaIBroj).type("Britanika Mikic 32")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("24591903723")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalTelefonLeavethefieldempty() {
        await this.page.locator(this.checkbox4).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Aleksandar Kovac")
        await this.page.locator(this.ulicaIBroj).type("Britanika Mikic 32")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalTelefonSpecialCharacters() {
        await this.page.locator(this.checkbox4).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Aleksandar Kovac")
        await this.page.locator(this.ulicaIBroj).type("Britanika Mikic 32")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("+!?$%^@#> .5sdsd)")
        await this.page.locator(this.email).type("ddlfjldjg4@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalEmailWithoutDomain() {
        await this.page.locator(this.checkboxIPC10).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Aleksandar Kovac")
        await this.page.locator(this.ulicaIBroj).type("Britanika Mikic 32")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("6565343436")
        await this.page.locator(this.email).type("damjangligorovic@.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalEmailWithoutNet() {
        await this.page.locator(this.checkboxIPC10).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Aleksandar Kovac")
        await this.page.locator(this.ulicaIBroj).type("Britanika Mikic 32")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("2345465")
        await this.page.locator(this.email).type("damjangligorovichotmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalWithoutUsername() {
        await this.page.locator(this.checkboxIPC10).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Aleksandar Kovac")
        await this.page.locator(this.ulicaIBroj).type("Britanika Mikic 32")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("546573434354")
        await this.page.locator(this.email).type("@hotmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalEmailSpace() {
        await this.page.locator(this.checkboxIPC10).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Aleksandar Kovac")
        await this.page.locator(this.ulicaIBroj).type("Britanika Mikic 32")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("454653434")
        await this.page.locator(this.email).type("damjangligorovic @,")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalNarudzbenicaEmpty() {
        await this.page.locator(this.checkboxIPC10).click()
        await this.page.locator(this.mainbuttonKupujem).click()
    
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalGodisnja11Brojeva() {
        await this.page.locator(this.checkbox1).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("D g")
        await this.page.locator(this.ulicaIBroj).type("K 10")
        await this.page.locator(this.postanskiBroj).type("18000")
        await this.page.locator(this.grad).type("Nis")
        await this.page.locator(this.telefon).type("060168335")
        await this.page.locator(this.email).type("damjangligorovic@hotmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
   
    async bookJournalGodisnja100Brojeva() {
        await this.page.locator(this.checkbox0).click()
        await this.page.locator(this.input_Field_Kolicina0).fill(""); 
        await this.page.locator(this.input_Field_Kolicina0).type("100");
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Nikola Markovic timotijevic Jovanovic Rankovic")
        await this.page.locator(this.ulicaIBroj).type("Djordja Andrejevica Kuna 22 sprat 18 3! kuca gornji")
        await this.page.locator(this.postanskiBroj).type("11000")
        await this.page.locator(this.grad).type("Beograd")
        await this.page.locator(this.telefon).type("0635867412")
        await this.page.locator(this.email).type("Tt10bbahoo@gmail.com")
        await this.page.locator(this.napomena).type("Notice for purchasing Purchases will not be taken from your account until you confirm your order. $$$$ requires a ready cash deposit. View details. Valid for 36 hours, all sales are final! Q-Cup Air Vaporizer $175.00 Add to cart. Disclosure: Alpha Organics was generous enough to provide me with product for an honest review. All opinions are 100% my own. And this product also qualifies for the blogger discount :D In the few hours I had it, I was able to give it a very brief test drive. It seemed fairly easy to accept")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalGodisnja2Broja() {
        await this.page.locator(this.checkbox15).click()
        await this.page.locator(this.input_Field_Kolicina15).fill(""); 
        await this.page.locator(this.input_Field_Kolicina15).type("2");
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Milica Timotijevic Rankovic")
        await this.page.locator(this.ulicaIBroj).type("12. Aprila Savica Marka")
        await this.page.locator(this.postanskiBroj).type("21000")
        await this.page.locator(this.grad).type("Novi Sad")
        await this.page.locator(this.telefon).type("3256985479")
        await this.page.locator(this.email).type("vj507aws3c@hotmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalGodisnja99Broja() {
        await this.page.locator(this.checkbox15).click()
        await this.page.locator(this.input_Field_Kolicina15).fill(""); 
        await this.page.locator(this.input_Field_Kolicina15).type("99");
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Lavra Kovac Timic")
        await this.page.locator(this.ulicaIBroj).type("Obrenoviceva 19a sedmi sprat")
        await this.page.locator(this.postanskiBroj).type("34000")
        await this.page.locator(this.grad).type("Kragujevac")
        await this.page.locator(this.telefon).type("9854748714")
        await this.page.locator(this.email).type("gqd0$#$#$#$usn3hb@secretmail.net")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalDropdown() {
        await this.page.locator(this.checkbox9).click()
        await this.page.locator(this.value37).click()
        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Nikola Stojicic Avramovic Nedic")
        await this.page.locator(this.ulicaIBroj).type("Lazar Savkovic 230aa")
        await this.page.locator(this.postanskiBroj).type("24000")
        await this.page.locator(this.grad).type("Subotica")
        await this.page.locator(this.telefon).type("8574145425")
        await this.page.locator(this.email).type("lovrenkrsmanovic@yahoo.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalDropdownAndFieldKolicina() {
        await this.page.locator(this.checkbox6).click()
        await this.page.locator(this.value310).click()
        await this.page.locator(this.checkbox1).click()

        await this.page.locator(this.mainbuttonKupujem).click()
        await this.page.locator(this.imeIPrezime).type("Tatjana Stancic Lazarovic")
        await this.page.locator(this.ulicaIBroj).type("Grcko Prijateljstvo 212bb treci sprat")
        await this.page.locator(this.postanskiBroj).type("26300")
        await this.page.locator(this.grad).type("Vrsac")
        await this.page.locator(this.telefon).type("6567471282")
        await this.page.locator(this.email).type("printcompany22@gmail.com")
        await this.page.locator(this.buttonNarucujem).click()
    }
    async bookJournalClickOnTheLinkLogoPCPRessHeader() {
        await this.page.locator(this.logoPCPressHeader).click()
        
    }
    async bookJournalClickOnTheLinkFeed() {
        // Wait for the element to be visible and interactable

        // Remove the 'target' attribute and then click the element
        await this.page.locator(this.linkFeed).evaluate((el) => el.removeAttribute('target'));

        await this.page.locator(this.linkFeed).click();
        
    
    
    // When calling the function, pass the page object
  }  
  async bookJournalClickOnTheLinkPCPressFooter() {
    // Wait for the element to be visible and interactable

    // Remove the 'target' attribute and then click the element
    await this.page.locator(this.logoPCPressFooter).evaluate((el) => el.removeAttribute('target'));

    await this.page.locator(this.linkFeed).click();
    
}
async bookJournalClickOnTheLinkNewstter() {
    // Wait for the element to be visible and interactable

    // Remove the 'target' attribute and then click the element
    await this.page.locator(this.linkNewsletter).evaluate((el) => el.removeAttribute('target'));

    await this.page.locator(this.linkNewsletter).click();
    
}
async bookJournalClickOnTheLinkFacebook() {
   
    await this.page.locator(this.linkFacebook).evaluate((el) => el.removeAttribute('target'));

    await this.page.locator(this.linkFacebook).click();
    
}
async bookJournalClickOnTheLinkTwitter() {
   
    await this.page.locator(this.linkTwitter).evaluate((el) => el.removeAttribute('target'));

    await this.page.locator(this.linkTwitter).click();
    
}
async bookJournalClickOnTheLinkPravilaKoriscenja() {
   
    await this.page.locator(this.linkPravilaKoriscenja).evaluate((el) => el.removeAttribute('target'));

    await this.page.locator(this.linkPravilaKoriscenja).click();
    
}
async bookJournalClickOnTheLinkProdavnice() {
   
    await this.page.locator(this.checkboxKnjigaOffice).click();

    await this.page.locator(this.mainbuttonKupujem).click();
    await this.page.locator(this.imeIPrezime).type("Stojan Nikolic Andrejic");
    await this.page.locator(this.ulicaIBroj).type("Niska 22");
    await this.page.locator(this.postanskiBroj).type("24300");
    await this.page.locator(this.grad).type("Backa Topola");
    await this.page.locator(this.telefon).type("433903430");
    await this.page.locator(this.email).type("tatjanah21ero@gmail.com");
    await this.page.locator(this.buttonNarucujem).click();



}
async bookJournalClickOnTheLinkProdavnice1() {
    await this.page.locator(this.linkprodavnicaPCPress).click();

} 
async bookJournalClickOnTheLinkProdaja() {
   
    await this.page.locator(this.checkboxIPC10).click();

    await this.page.locator(this.mainbuttonKupujem).click();
    await this.page.locator(this.imeIPrezime).type("Milenko Hranic Panic");
    await this.page.locator(this.ulicaIBroj).type("Backa 32");
    await this.page.locator(this.postanskiBroj).type("11431");
    await this.page.locator(this.grad).type("Bac");
    await this.page.locator(this.telefon).type("9454594023");
    await this.page.locator(this.email).type("lanahranislavicskdfhsk@yahoo.com");
    await this.page.locator(this.buttonNarucujem).click();



}
async bookJournalClickOnTheLinkProdaja1() {
    await this.page.locator(this.prodajaLink).click();

} 
async bookJournalClickOnTheLinkPCProdavnica() {
   
    await this.page.locator(this.checkboxIPC10).click();

    await this.page.locator(this.mainbuttonKupujem).click();
    await this.page.locator(this.imeIPrezime).type("Andjelka Lankovic Svetislavic");
    await this.page.locator(this.ulicaIBroj).type("Backa 32");
    await this.page.locator(this.postanskiBroj).type("11431");
    await this.page.locator(this.grad).type("Bac");
    await this.page.locator(this.telefon).type("9454594023");
    await this.page.locator(this.email).type("lanahranislavicskdfhsk@yahoo.com");
    await this.page.locator(this.buttonNarucujem).click();



}
async bookJournalClickOnTheLinkPCProdavnica1() {
    await this.page.locator(this.linkProdavnica).click();

} 
async bookJournalClickOnTheLinkPovratakNaNarudzbenicu() {
   
    await this.page.locator(this.checkbox1).click();

    await this.page.locator(this.mainbuttonKupujem).click();
    await this.page.locator(this.imeIPrezime).type("Svetlana Krivokapic Aleksic");
    await this.page.locator(this.postanskiBroj).type("11512");
    await this.page.locator(this.grad).type("Backi Petrovac in");
    await this.page.locator(this.telefon).type("493043493");
    await this.page.locator(this.email).type("monakovics2323@yahoo.com");
    await this.page.locator(this.buttonNarucujem).click();



}
async bookJournalClickOnTheLinkNarudzbenicu() {
    await this.page.locator(this.linkPovrataNarudzbenici).click();

} 
async bookJournalClickOnTheOdustajem() {
    await this.page.locator(this.checkbox1).click();
    await this.page.locator(this.mainbuttonKupujem).click();
    await this.page.locator(this.buttonOdustajem).click();

} 
} 
    

module.exports=LoginPage;
