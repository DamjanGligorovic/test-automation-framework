package projectSasomangeCreateAd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCreateAnAdSasomange extends BaseCreateAnAdSasomange {
	WebDriverWait wait;
	@BeforeMethod
	public void navigation() {
		driver.navigate().to("https://sasomange.rs/uloguj-se");
		loginPage.setUpLoginPasswordUsername("damjanserbia123@gmail.com", "Felina10@");
	    wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	}
	@AfterMethod
	public void deleteCookie() {
		driver.manage().deleteAllCookies();
	}
	

	@Test
	public void testCase3() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		loginPage.clickOnTheButtons();
		WebElement actualMessageIzborkategorije = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(1) > span.text"));
		Thread.sleep(500);
		String actualMessage3 = actualMessageIzborkategorije.getText();
		String expectedMessage3 = "Izbor kategorije";
		softAssert.assertEquals(actualMessage3, expectedMessage3);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Dodaj oglas | Sasomange.rs oglasnik";
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
		softAssert.assertEquals(actualURL, expectedURL);
		softAssert.assertEquals(actualTitle, expectedTitle);
		//softAssert.assertTrue(loginPage.getElementsList());
		//softAssert.assertTrue(loginPage.getElementsList());
		loginPage.clickCloseXAd();
		loginPage.clickOnTheButtonVozila();
		loginPage.clickOnTheButtonAutomobili();
		loginPage.clickOnTheButtonPolovniAutomobili();
		loginPage.clickOnTheButtonNastavi();
		//softAssert.assertTrue(loginPage.getElementsList1());
		//softAssert.assertFalse(loginPage.getElementsList2());
		Thread.sleep(500);
		String actualTitle1 = driver.getTitle();
		String expectedTitle1 = "Dodaj oglas | Sasomange.rs oglasnik";
		String actualURL1 = driver.getCurrentUrl();
		String expectedURL1 = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
		softAssert.assertEquals(actualURL1, expectedURL1);
		softAssert.assertEquals(actualTitle1, expectedTitle1);
		WebElement actualMessageOOglasu = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(2) > span.text"));
		Thread.sleep(500);
		String actualMessage1 = actualMessageOOglasu.getText();
		String expectedMessage1 = "O oglasu";
		softAssert.assertEquals(actualMessage1, expectedMessage1);
		Thread.sleep(500);

		loginPage.clickOnTheMenuMarkaAutomobila();
		loginPage.clickOnTheOptionAudi();
		Thread.sleep(500);
		loginPage.clickModelMenu();
		loginPage.clickA3();
		Thread.sleep(500);
		loginPage.selectGorivo();
		loginPage.selectDizel();
		Thread.sleep(500);
		loginPage.selectOblikKaroserije();
		loginPage.selectLimuzina();
		Thread.sleep(500);
		loginPage.selectBrojVrata();
		loginPage.select45();
		Thread.sleep(500);
		loginPage.selectGodinaProizvodnje();
		loginPage.select2022();
		Thread.sleep(500);
		loginPage.selectTip();
		loginPage.select2022And2023();
		Thread.sleep(500);
		loginPage.insertInputPredjeniKilometri("231");
		Thread.sleep(500);
		loginPage.selectMenuEuro2();
		loginPage.selectEuro2();
		Thread.sleep(500);
		loginPage.selectMenuRegistrovan();
		loginPage.selectRegistrovan2022();
		Thread.sleep(500);
		loginPage.insertInputTextOglas("Prodajem polovni automobil marke Audi A3 po povoljnoj ceni. Automobil je u odlicnom stanju i\n"
				+ "kvalitetu. Mozete me kontaktirati putem telefona ili Vibera. Cena je vrlo prihvatljiva i realisticna");
		Thread.sleep(500);
		loginPage.typeCena("2400");
		Thread.sleep(500);
		loginPage.clickNastavi2();
		Thread.sleep(500);
		String actualTitle2 = driver.getTitle();
		String expectedTitle2 = "Dodaj oglas | Sasomange.rs oglasnik";
		String actualURL2 = driver.getCurrentUrl();
		String expectedURL2 = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
		softAssert.assertEquals(actualURL2, expectedURL2);
		softAssert.assertEquals(actualTitle2, expectedTitle2);
		WebElement actualMessageOOglasivacu = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(3) > span.text"));
		Thread.sleep(500);
		String actualMessage5 = actualMessageOOglasivacu.getText();
		String expectedMessage5 = "O oglašivaču";
		softAssert.assertEquals(actualMessage5, expectedMessage5);
		loginPage.clickNastavi3();
		WebElement actualMessageOOglasivacu1 = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(3) > span.text"));
		Thread.sleep(500);
		String actualMessage2 = actualMessageOOglasivacu1.getText();
		String expectedMessage2 = "O oglašivaču";
		softAssert.assertEquals(actualMessage2, expectedMessage2);
		WebElement actualConfirmationMessage = driver.findElement(By.cssSelector("#page-wrap > astro-island:nth-child(5) > section > section > div.thank-you-page-wrapper > div.thank-you-page-wrapper-inner > div > div.title-and-image-wrapper > h2"));
		Thread.sleep(500);
		String actualMessage = actualConfirmationMessage.getText();
		String expectedMessage = "Čestitamo, tvoj oglas je uspešno objavljen!";
		softAssert.assertEquals(actualMessage, expectedMessage);
		Thread.sleep(500);
		softAssert.assertAll();		
		



        }
	@Test
	
	public void testCase4() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		loginPage.clickOnTheButtons();
		WebElement actualMessageIzborkategorije = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(1) > span.text"));
		Thread.sleep(500);
		String actualMessage3 = actualMessageIzborkategorije.getText();
		String expectedMessage3 = "Izbor kategorije";
		softAssert.assertEquals(actualMessage3, expectedMessage3);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Dodaj oglas | Sasomange.rs oglasnik";
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
		softAssert.assertEquals(actualURL, expectedURL);
		softAssert.assertEquals(actualTitle, expectedTitle);
		//softAssert.assertTrue(loginPage.getElementsList());
		//softAssert.assertTrue(loginPage.getElementsList());
		loginPage.clickCloseXAd();
		loginPage.clickOnTheButtonVozila();
		loginPage.clickOnTheButtonAutomobili();
		loginPage.clickOnTheButtonPolovniAutomobili();
		loginPage.clickOnTheButtonNastavi();
		String actualTitle1 = driver.getTitle();
		String expectedTitle1 = "Dodaj oglas | Sasomange.rs oglasnik";
		String actualURL1 = driver.getCurrentUrl();
		String expectedURL1 = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
		softAssert.assertEquals(actualURL1, expectedURL1);
		softAssert.assertEquals(actualTitle1, expectedTitle1);
		WebElement actualMessageOOglasu = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(2) > span.text"));
		Thread.sleep(500);
		String actualMessage1 = actualMessageOOglasu.getText();
		String expectedMessage1 = "O oglasu";
		softAssert.assertEquals(actualMessage1, expectedMessage1);
		//loginPage.uploadPhotoClickOnTheButton1();
		Thread.sleep(500);
		String filePath = "C:\\Users\\Damja\\Downloads\\photo Damjan 2.jpg";
		loginPage.uploadPhoto(filePath);
		Thread.sleep(500);
		String filePath1 = "C:\\Users\\Damja\\Downloads\\2.jpg";
		loginPage.uploadPhoto23(filePath1);
		Thread.sleep(500);
		String filePath2 = "C:\\Users\\Damja\\Downloads\\3.jpg";
		loginPage.uploadPhoto234(filePath2);
		Thread.sleep(500);
		String filePath3 = "C:\\Users\\Damja\\Downloads\\4.jpg";
		loginPage.uploadPhoto2345(filePath3);
		Thread.sleep(500);
		String filePath4 = "C:\\Users\\Damja\\Downloads\\5.jpg";
		loginPage.uploadPhoto23456(filePath4);
		Thread.sleep(500);
		String filePath5 = "C:\\Users\\Damja\\Downloads\\6.jpg";
		loginPage.uploadPhoto234567(filePath5);
		Thread.sleep(500);
		String filePath6 = "C:\\Users\\Damja\\Downloads\\7.jpg";
		loginPage.uploadPhoto2345678(filePath6);
		Thread.sleep(500);
		String filePath7 = "C:\\Users\\Damja\\Downloads\\8.jpg";
		loginPage.uploadPhoto2345678(filePath7);
		Thread.sleep(500);
		String filePath8 = "C:\\Users\\Damja\\Downloads\\9.jpg";
		loginPage.clickOnTheButtonDodajFotografije(filePath8);
		
		//softAssert.assertTrue(loginPage.verifyErrorMessage());

		//loginPage.uploadPhoto2(filePath0);
		


		softAssert.assertAll();
		
		
	}
		@Test
	
	public void testCase5() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		loginPage.clickOnTheButtons();
		String actualTitle2 = driver.getTitle();
		String expectedTitle2 = "Dodaj oglas | Sasomange.rs oglasnik";
		String actualURL2 = driver.getCurrentUrl();
		String expectedURL2 = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
		softAssert.assertEquals(actualURL2, expectedURL2);
		softAssert.assertEquals(actualTitle2, expectedTitle2);
		WebElement actualMessageIzborkategorije = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(1) > span.text"));
		Thread.sleep(500);
		String actualMessage3 = actualMessageIzborkategorije.getText();
		String expectedMessage3 = "Izbor kategorije";
		softAssert.assertEquals(actualMessage3, expectedMessage3);
	//	softAssert.assertTrue(loginPage.getElementsList());
		//softAssert.assertTrue(loginPage.getElementsList());
		loginPage.clickCloseXAd();
		loginPage.clickOnTheButtonVozila();
		loginPage.clickOnTheButtonAutomobili();
		loginPage.clickOnTheButtonPolovniAutomobili();
		loginPage.clickOnTheButtonNastavi();
		String actualTitle1 = driver.getTitle();
		String expectedTitle1 = "Dodaj oglas | Sasomange.rs oglasnik";
		String actualURL1 = driver.getCurrentUrl();
		String expectedURL1 = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
		softAssert.assertEquals(actualURL1, expectedURL1);
		softAssert.assertEquals(actualTitle1, expectedTitle1);
		WebElement actualMessageOOglasu = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(2) > span.text"));
		Thread.sleep(500);
		String actualMessage1 = actualMessageOOglasu.getText();
		String expectedMessage1 = "O oglasu";
		softAssert.assertEquals(actualMessage1, expectedMessage1);
		Thread.sleep(500);

		loginPage.typeYoutubeLink("https://www.youtube.com/watch?v=L_gRxzjuAXE&");
		Thread.sleep(500);
		loginPage.clickUcitajVideo();
		Thread.sleep(500);
		loginPage.clickOnTheMenuMarkaAutomobila();
		loginPage.clickOnTheOptionCitroen();
		Thread.sleep(500);
		loginPage.clickModelMenu();
		loginPage.clickC3();
		Thread.sleep(500);
		loginPage.selectGorivo();
		loginPage.selectBenzin();
		Thread.sleep(500);
		loginPage.selectOblikKaroserije();
		loginPage.selectHecbek();
		Thread.sleep(500);
		loginPage.selectBrojVrata();
		loginPage.select45();
		Thread.sleep(500);
		loginPage.selectGodinaProizvodnje();
		loginPage.selectOption2020();
		Thread.sleep(500);
		loginPage.selectTip();
		loginPage.select2025();
		Thread.sleep(500);
		loginPage.selectMenuEuro2();
		loginPage.selectEuro3();
		Thread.sleep(500);
		loginPage.selectMenuRegistrovan();
		loginPage.selectRegistrovan2025();
		Thread.sleep(500);
		loginPage.insertInputPredjeniKilometri("676");
		Thread.sleep(500);
		loginPage.insertInputKapacitetPogonskeBaterije("212");
		Thread.sleep(500);
		loginPage.selectBelaBoja();
		loginPage.selectBelaBojaOption();
		Thread.sleep(500);
		loginPage.insertBrojSasije("WAUZZZ4BZWN049194");
		Thread.sleep(500);
		loginPage.insertBrojRegistracijeVozila("@#$%^*(32");
		Thread.sleep(500);
		loginPage.insertInputTextOglas("Ovaj automobil je jedan od najboljih predstavnika bmv kompanije. 2. Auto sadrzi neverovatne sposobnosti manipulacije 3. Ima manuelni savremeni menjac");
		Thread.sleep(500);
		loginPage.typeCena("3212");
		Thread.sleep(500);
		loginPage.clickNastavi2();
		Thread.sleep(500);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Dodaj oglas | Sasomange.rs oglasnik";
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
		softAssert.assertEquals(actualURL, expectedURL);
		softAssert.assertEquals(actualTitle, expectedTitle);
		WebElement actualMessageOOglasivacu = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(3) > span.text"));
		Thread.sleep(500);
		String actualMessage2 = actualMessageOOglasivacu.getText();
		String expectedMessage2 = "O oglašivaču";
		softAssert.assertEquals(actualMessage2, expectedMessage2);
		loginPage.clickNastavi3();
		Thread.sleep(500);
		WebElement actualConfirmationMessage = driver.findElement(By.cssSelector("#page-wrap > astro-island:nth-child(5) > section > section > div.thank-you-page-wrapper > div.thank-you-page-wrapper-inner > div > div.title-and-image-wrapper > h2"));
		Thread.sleep(500);
		String actualMessage = actualConfirmationMessage.getText();
		String expectedMessage = "Čestitamo, tvoj oglas je uspešno objavljen!";
		softAssert.assertEquals(actualMessage, expectedMessage);
		Thread.sleep(500);
		softAssert.assertAll();
		

    }
		@Test
		
		public void testCase6() throws InterruptedException {
			SoftAssert softAssert = new SoftAssert();
			loginPage.clickOnTheButtons();
			WebElement actualMessageIzborkategorije = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(1) > span.text"));
			Thread.sleep(500);
			String actualMessage3 = actualMessageIzborkategorije.getText();
			String expectedMessage3 = "Izbor kategorije";
			softAssert.assertEquals(actualMessage3, expectedMessage3);
			String actualTitle1 = driver.getTitle();
			String expectedTitle1 = "Dodaj oglas | Sasomange.rs oglasnik";
			String actualURL1 = driver.getCurrentUrl();
			String expectedURL1 = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
			softAssert.assertEquals(actualURL1, expectedURL1);
			softAssert.assertEquals(actualTitle1, expectedTitle1);
			softAssert.assertTrue(loginPage.getElementsList());
			softAssert.assertTrue(loginPage.getElementsList());
			loginPage.clickCloseXAd();
			loginPage.clickOnTheButtonVozila();
			loginPage.clickOnTheButtonAutomobili();
			loginPage.clickOnTheButtonPolovniAutomobili();
			loginPage.clickOnTheButtonNastavi();
			WebElement actualMessageIzborkategorije4 = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(1) > span.text"));
			Thread.sleep(500);
			String actualMessage4 = actualMessageIzborkategorije4.getText();
			String expectedMessage4 = "Izbor kategorije";
			softAssert.assertEquals(actualMessage4, expectedMessage4);
			WebElement actualMessageOOglasu = driver.findElement(By.cssSelector("#add-product-state > div > button:nth-child(2) > span.text"));
			Thread.sleep(500);
			String actualMessage1 = actualMessageOOglasu.getText();
			String expectedMessage1 = "O oglasu";
			softAssert.assertEquals(actualMessage1, expectedMessage1);
			Thread.sleep(500);
			loginPage.clickButtonNazad();
			loginPage.clickDaVracamSe();
			String actualTitle = driver.getTitle();
			String expectedTitle = "Dodaj oglas | Sasomange.rs oglasnik";
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://sasomange.rs/moj-sasomange/dodaj-oglas";
			softAssert.assertEquals(actualURL, expectedURL);
			softAssert.assertEquals(actualTitle, expectedTitle);
}
}
		
		//String filePath = "C:\\Users\\Damja\\Downloads\\photo Damjan 2.jpg";
		////String filePath1 = "C:\\Users\\Damja\\Downloads\\1.jpg";
		//String filePath2 = "C:\\Users\\Damja\\Downloads\\2.png";
		//String filePath3 = "C:\\Users\\Damja\\Downloads\\photoThree.jpg";
		//String filePath4 = "C:\\Users\\Damja\\Downloads\\photoFour.jpg";
		//String filePath5 = "C:\\Users\\Damja\\Downloads\\photoFive.jpg";
		//String filePath6 = "C:\\Users\\Damja\\Downloads\\photoSix.jpg";
		//String filePath7 = "C:\\Users\\Damja\\Downloads\\photoSeven.jpg";
		//String filePath8 = "C:\\Users\\Damja\\Downloads\\photoEight.jpg";		
		//loginPage.uploadPhoto(filePath);
		//loginPage.uploadPhoto2(filePath1);
		//loginPage.uploadPhoto2(filePath2);
		//loginPage.uploadPhoto2(filePath3);
		//loginPage.uploadPhoto2(filePath4);
		//loginPage.uploadPhoto2(filePath5);
		//loginPage.uploadPhoto2(filePath6);
		//loginPage.uploadPhoto2(filePath7);
		//loginPage.uploadPhoto4(filePath8);
	

	
		//softAssert.assertTrue(loginPage.verifyModelMenu());
		//loginPage.clickOnModelOption();
		//softAssert.assertTrue(loginPage.verifyModelGorivo());
		
	

	




