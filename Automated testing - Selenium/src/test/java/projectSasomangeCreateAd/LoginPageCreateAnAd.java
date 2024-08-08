package projectSasomangeCreateAd;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageCreateAnAd {
	private WebDriver driver;
	Actions actions;
	private WebDriverWait wait;
	Select select;
	JavascriptExecutor js;
	
	@FindBy (css = "#gigya-textbox-loginID")
	WebElement inputField_UsernamElement;
	@FindBy (css = "#gigya-textbox-password")
	WebElement inputField_PasswordElement;
	@FindBy(css = "div[id='login-screen'] button[type='submit']")
	WebElement buttonField_SubmitElement;
	@FindBy(css = "a[class='add-btn ui-btn ui-btn-primary hidden sm:flex']")
	WebElement inputFieldButtonCreateAnAdElement;
	@FindBy(xpath = "(//p[@class='name'][normalize-space()='Vozila'])[2]")
	WebElement optionVozilaElement;
	@FindBy(xpath = "//p[normalize-space()='Automobili']")
	WebElement automobiliElement;
	@FindBy(xpath = "//p[normalize-space()='Polovni automobili']")
	WebElement polovniAutomobiliElement;
	@FindBy(xpath = "//button[normalize-space()='Nastavi']")
	WebElement buttonNastaviElement;
	@FindBy(css = ".narrow > .single-dropdown > :nth-child(1) > .selected-options")
	WebElement menuMarkaAutomobilaElement;
	@FindBy(css = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign")
	WebElement optionAudiElement;
	@FindBy (css = ".youtube-video-container > :nth-child(1) > .main-input")
	WebElement youtubeElement;
	@FindBy(css  = "button.btn.load-video")
	WebElement buttonYoutubeElement;
	@FindBy(css  = "label.input-photo-label")
	By uploadFunctionElement;
	@FindBy(css = ".main-info p:nth-child(1)")
	WebElement messagElement;
	@FindBy(css  =".input-photo-field.big")
	WebElement iconUploadElement;
	@FindBy(css =  "div.steps-wrapper button.btn")
	List<WebElement> subtitlesElements;
	@FindBy(css = "button[class='btn']")
	WebElement firstElement;
	@FindBy(xpath  = "//*[@id=\"info-about-product\"]/section[2]/section[1]/section/section/section/div[2]/section[1]")
	WebElement draggableFunctionElement;
	@FindBy(xpath = "(//section[@class='draggable-content-wrapper'])[1]")
	WebElement draggableFunctionElement1;
	@FindBy(css = "button.btn.disabled")
	WebElement element3;
	@FindBy(css=".input-photo-label")
	WebElement possibleElement0;
	@FindBy(css = "input.photo-input.photo-added[type='file'][name='pic'][accept='image/*']")
	WebElement possibleElement;
	@FindBy(css = "#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div > div.input-photo-field > label > input")
	WebElement possibleElement1;
	@FindBy(css = "input[name='pic']")
	WebElement possibleElement2;
	@FindBy(css  = "#notification_1 > div > div > p > h3")
	WebElement errorMessagElement;
	@FindBy(css = "el-icon el-notification__closeBtn")
	WebElement xButtonerrorMessagElement;
	@FindBy(css = ".dropdown-content.with-search li.checkbox-wrapper .checkbox-label.round-checkbox .name")
	List<WebElement> dropdownOptions;
	@FindBy(css = "#page-wrap > astro-island:nth-child(1) > section > span")
	WebElement xCloseAdElement;
	@FindBy(css = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > label > input")
	WebElement inputField_KmElement;
	@FindBy(css = ".ql-editor.ql-blank")
	WebElement tekstOglasaElement;
	@FindBy(css = "input[placeholder='Unesi cenu (EUR)']")
	WebElement cenaFieldElement;
	@FindBy(id = "searchLocations_wrapper")
	WebElement locationInputMenuElement;
	@FindBy(css = "#info-about-product > div > button.btn.btn--type-primary.step-next")
	WebElement buttonNastaviElement2;
	@FindBy(css = ".ps.dropdown-scroll-content.theme-scrollbar.ps--active-y >ul>li")
	List<WebElement> listaMarkaAutomobila;
	@FindBy(css ="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > section > label > input")
	WebElement predjeniKilometriElement;
	@FindBy(css = "#rich-text-editor > div.ql-editor.ql-blank")
	WebElement tekstOglasaElement1;
	@FindBy(css = "#info-about-product > section:nth-child(2) > section:nth-child(4) > div.section-content-wrapper > section.price-section > section:nth-child(1) > label > input")
	WebElement inputField_CenaElement;
	@FindBy(css = "#info-about-product > div > button.btn.btn--type-primary.step-next")
	WebElement buttonNastaviElement3;
	@FindBy(css = "#searchLocations")
	WebElement lokacijaFieldElement;
	@FindBy(css= "#page-wrap > astro-island:nth-child(5) > section > div.add-product-wrapper.js-scroll-element > section.product-seller-info > form > div > button.btn.btn--type-primary.step-next")
	WebElement sacuvajButtonElement;
	@FindBy(css="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign")
	WebElement audiElement;
	@FindBy(css="#info-about-product > div > button.btn.button--type-bordered-tertiary.step-back")
	WebElement buttonNazadElement;
	@FindBy(xpath  ="//body[1]/div[1]/main[1]/astro-island[2]/section[1]/div[3]/section[1]/form[1]/section[2]/section[3]/section[1]/section[1]/div[2]/div[2]/section[1]/section[1]/div[1]/ul[1]/li[7]/label[1]/span[1]")
	WebElement a3OptionElement;
	@FindBy(css ="div[data-attribute-type='dropDownSingleSelectOrFreeText'] section[class='single-dropdown'] div p[class='selected-options']")
	WebElement menuModElement;
	@FindBy(css="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section")
	WebElement gorivoMenuElement;
	@FindBy(css  =".step-btns-wrapper.js-step-btns-element")
	WebElement invisibleElementModelMenuElement;
	@FindBy(css="btn btn--type-primary step-next")
	WebElement buttonNastaviElement5;
	@FindBy(css="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > label > input[type=text]")
	WebElement inputElementModelSearchElement;
	@FindBy(css=".product-seller-info > form > .step-btns-wrapper > .btn--type-primary")
	WebElement buttonSacuvajInformacije;
	@FindBy(css=".qr-app-banner > .icon-close")
	WebElement closeIconButton;
	@FindBy(css=".input-photo-label")
	WebElement uploadButtonSecond;
	@FindBy(css="#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > div.input-photo-field.big > label")
	WebElement uploadButtonSecond1;
	@FindBy(css="#info-about-product > section:nth-child(2) > section:nth-child(1) > section > section > section > div.image-edit-wrapper > section.draggable-content-wrapper > div > div:nth-child(27) > div > div.edit-photo-options > button.edit-button.red.icon-delete")
	WebElement deleteButton;
	@FindBy(css="#notification_5 > div > div > p > h3")
	WebElement errorMessage30;
	@FindBy(css=".youtube-video-container > :nth-child(1) > .btn")
	WebElement ucitajVideo;
	@FindBy(css="#movie_player > div.ytp-cued-thumbnail-overlay > button")
	WebElement playVideo;
	@FindBy(css ="button.ytp-large-play-button[title=\"Play\"]")
	WebElement playVideo1;
	@FindBy(css="body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > section:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > button:nth-child(1)")
	WebElement kliznaVrata;
	@FindBy(css="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > section > label > input")
	WebElement kubikazaCM;
	@FindBy(css="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > label > input")
	WebElement kapacitetPogonskeBaterije;
	@FindBy(css="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(13) > section > ul > li:nth-child(1) > button")
	WebElement daMAT;
	@FindBy(css="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(12) > section > ul > li:nth-child(1) > button")
	WebElement daMetalik;
	@FindBy(css="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div.full-column.inline-checkbox > section > div:nth-child(5) > label > span.checkbox-sign.squared-checkbox-sign")
	WebElement garancijaOption;
	@FindBy(css="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(3) > section > div.section-content-wrapper > div:nth-child(5) > section > label > input")
	WebElement brojSasije;
	@FindBy(css="#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(3) > section > div.section-content-wrapper > div:nth-child(6) > section > label > input")
	WebElement brojRegistracijeVozila;
	@FindBy(css="#info-about-product > div > button.btn.button--type-bordered-tertiary.step-back")
	WebElement buttonNazad;
	@FindBy(css="body > div.modal.small-confirmation-modal.pick-category-step-back-modal.vfm.vfm--fixed.vfm--inset > div.vfm__content.vfm--outline-none.modal-dialog > div > div.modal-body > div > button.btn.btn--type-primary")
	WebElement daVracamSe;
	public LoginPageCreateAnAd (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		this.js = (JavascriptExecutor) driver;
	}
	public void clickOnTheButtonNastavi1() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonNastaviElement3)).click();
	}
	//public void typeSearchModel(String input) {
		//wait.until(ExpectedConditions.elementToBeClickable(inputElementModelSearchElement));
		//inputElementModelSearchElement.clear();
		//inputElementModelSearchElement.sendKeys(input);
	//}
	public void clickOnTheSacuvaj1() {
		wait.until(ExpectedConditions.elementToBeClickable(sacuvajButtonElement)).click();
	}
	public void clickOnTheDeleteButton() {
		wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	}
	public void typeLocation(String input) {
		wait.until(ExpectedConditions.visibilityOf(lokacijaFieldElement));
		lokacijaFieldElement.sendKeys(input);
	}
	
	public void typePredjeniKilometri(String input) {
		wait.until(ExpectedConditions.visibilityOf(predjeniKilometriElement));
		predjeniKilometriElement.sendKeys(input);
	}
	public void typeCena1(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_CenaElement));
		inputField_CenaElement.sendKeys(input);
	}
	public void typeTekstoglasa(String input) {
		wait.until(ExpectedConditions.visibilityOf(tekstOglasaElement));
		tekstOglasaElement.sendKeys(input);
	}
	public void clickOnAudiOption() {
		wait.until(ExpectedConditions.invisibilityOf(buttonField_SubmitElement));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".single-dropdown"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(audiElement));
		audiElement.click();

		//return menuModElement.isEnabled();

	}

		public void clickOnTheModelOption(String input) {
	       
		
		wait.until(ExpectedConditions.visibilityOf(menuModElement)).click();
		//wait.until(ExpectedConditions.invisibilityOf(invisibleElementModelMenuElement));
		wait.until(ExpectedConditions.elementToBeClickable(inputElementModelSearchElement));

		inputElementModelSearchElement.clear();
		inputElementModelSearchElement.sendKeys(input);
		wait.until(ExpectedConditions.elementToBeClickable(a3OptionElement));
		a3OptionElement.click();
		//return gorivoMenuElement.isEnabled();
////section[@class='single-dropdown open']//section[@class='dropdown-content with-search']
//#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > div > p
		}	
	
	public boolean verifyModelMenu() {
	
		return menuModElement.isEnabled();
	}
	public boolean verifyModelGorivo() {
		
		return gorivoMenuElement.isSelected();
	}
	public void clickOnRegistrovanDoOption() {
		  for (WebElement automobil : listaMarkaAutomobila) {
	            if (automobil.getText().equals("02/2025")) {
	            	automobil.click();
	                break;
	            }
	        }
		
	}
	public void clickOnModelOption() {
		  for (WebElement automobil : listaMarkaAutomobila) {
	            if (automobil.getText().equals("A3")) {
	            	automobil.click();
	                break;
	            }
	        }
		
	}
	public void clickOnGorivoOption() {
		  for (WebElement automobil : listaMarkaAutomobila) {
	            if (automobil.getText().equals("Dizel")) {
	            	automobil.click();
	                break;
	            }
	        }
		
	}
	public void clickOnOblikKaroserijeOption() {
		  for (WebElement automobil : listaMarkaAutomobila) {
	            if (automobil.getText().equals("Limuzina")) {
	            	automobil.click();
	                break;
	            }
	        }
		
	}
	public void clickOnBrojVrataOption() {
		  for (WebElement automobil : listaMarkaAutomobila) {
	            if (automobil.getText().equals("4/5")) {
	            	automobil.click();
	                break;
	            }
	        }
		
	}
	public void clickOnGodinaProizvodnjeOption() {
		  for (WebElement automobil : listaMarkaAutomobila) {
	            if (automobil.getText().equals("2022")) {
	            	automobil.click();
	                break;
	            }
	        }
		
	}
	public void clickOnTipOption() {
		  for (WebElement automobil : listaMarkaAutomobila) {
	            if (automobil.getText().equals("2.0 30 TDI S TRONIC S LINE, 85kW/116KS, Automatski/Poluautomatski, (2022 - 2023)")) {
	            	automobil.click();
	                break;
	            }
	        }
		
	}
	public void clickXButton() {
		wait.until(ExpectedConditions.elementToBeClickable(xButtonerrorMessagElement)).click();
	}public void clickXClose() {
		wait.until(ExpectedConditions.elementToBeClickable(xCloseAdElement)).click();
	}
	public void setUpLoginPasswordUsername(String username, String password) {
		wait.until(ExpectedConditions.visibilityOf(inputField_UsernamElement)).clear();
		inputField_UsernamElement.sendKeys(username);
		wait.until(ExpectedConditions.visibilityOf(inputField_PasswordElement)).clear();
		inputField_PasswordElement.sendKeys(password);
		wait.until(ExpectedConditions.elementToBeClickable(buttonField_SubmitElement)).click();

	}
	public boolean getElementsList2() {
        return subtitlesElements.get(2).isSelected();
    }
	public void dragPhoto(WebElement pathFile) {
		
		actions.dragAndDrop(draggableFunctionElement, pathFile);
	}
	public void clickOnTheButtons() {
		wait.until(ExpectedConditions.elementToBeClickable(inputFieldButtonCreateAnAdElement)).click();
	}
	public boolean getElementsList() {
	        return subtitlesElements.get(0).isEnabled();
	    }
	public boolean getElementsList1() {
        return subtitlesElements.get(1).isEnabled();
    }
	public boolean areElementsDisabled(List<Integer> indices) {
        for (Integer index : indices) {
            if (index < 0 || index >= subtitlesElements.size()) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for the elements list.");
            }
            if (subtitlesElements.get(index).isEnabled()) {
                return false; 
            }
        }
        return true; 
    }

	
	public void clickOnTheButtonVozila() {
		wait.until(ExpectedConditions.elementToBeClickable(optionVozilaElement)).click();
	}
	public void clickOnTheButtonAutomobili() {
		wait.until(ExpectedConditions.elementToBeClickable(automobiliElement)).click();
	}
	public void clickOnTheButtonPolovniAutomobili() {
		wait.until(ExpectedConditions.elementToBeClickable(polovniAutomobiliElement)).click();
	}
	public void clickOnTheButtonNastavi() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonNastaviElement)).click();
	}
	public void clickOnTheMenuMarkaAutomobila() {
		try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String cssSelector = "div[class='narrow half-column'] section[class='single-dropdown'] div p[class='selected-options']";
            js.executeScript("document.querySelector('" + cssSelector + "').click();");
        } catch (Exception e) {
            System.out.println("An error occurred while force clicking the element: " + e.getMessage());
        }
    }
		////p[@class='selected-options'])[1]
		//wait.until(ExpectedConditions.elementToBeClickable(menuMarkaAutomobilaElement)).click();
	
	public void clickOnTheOptionAudi() {
		try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign";
            js.executeScript("document.querySelector('" + cssSelector + "').click();");
        } catch (Exception e) {
            System.out.println("An error occurred while force clicking the element: " + e.getMessage());
        }
    }	
	public void clickOnTheOptionCitroen() {
		try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.narrow.half-column > section > section > div > ul > li:nth-child(21) > label > span.checkbox-sign.round-checkbox-sign";
            js.executeScript("document.querySelector('" + cssSelector + "').click();");
        } catch (Exception e) {
            System.out.println("An error occurred while force clicking the element: " + e.getMessage());
        }
    }	
	public void testYoutubeFunction(String youtube) {
		wait.until(ExpectedConditions.visibilityOf(youtubeElement)).sendKeys(youtube);
	}
	public void buttonYoutubeElement() {
		wait.until(ExpectedConditions.visibilityOf(buttonYoutubeElement)).click();
	}
	
		
   public void uploadPhoto(String photoPath) {

       possibleElement.sendKeys(photoPath);
			    }
   
  public void uploadPhoto1(String photoPath1) {
	  possibleElement.sendKeys(photoPath1);
  }
   public boolean verifyMessage() {
       return wait.until(ExpectedConditions.visibilityOf(messagElement)).isDisplayed();
}
   public void uploadPhoto0(String photoPath2) {
		  possibleElement0.sendKeys(photoPath2);
	  }
   public void uploadPhoto2(String photoPath2) {
		  possibleElement1.sendKeys(photoPath2);
	  }
   public void uploadPhoto23(String photoPath2) {
		  possibleElement1.sendKeys(photoPath2);
	  }
   public void uploadPhoto234(String photoPath2) {
		  possibleElement1.sendKeys(photoPath2);
	  }
   public void uploadPhoto2345(String photoPath2) {
		  possibleElement1.sendKeys(photoPath2);
	  }
   public void uploadPhoto23456(String photoPath2) {
		  possibleElement1.sendKeys(photoPath2);
	  }
   public void uploadPhoto234567(String photoPath2) {
		  possibleElement1.sendKeys(photoPath2);
	  }
   public void uploadPhoto2345678(String photoPath2) {
		  possibleElement1.sendKeys(photoPath2);
	  }
   public void uploadPhotoClickOnTheButton1() {
		   wait.until(ExpectedConditions.elementToBeClickable(uploadButtonSecond1)).click();
	   }
   public void uploadPhotoClickOnTheButton() {
	   wait.until(ExpectedConditions.elementToBeClickable(uploadButtonSecond)).click();
   }
   public void uploadPhoto3(String[] filePaths) {
	   wait.until(ExpectedConditions.elementToBeClickable(possibleElement));

       // Upload each file path
       for (String filePath : filePaths) {
           possibleElement.sendKeys(filePath);
       }
   }
   public void uploadPhoto4(String photoPath4) {
		  possibleElement2.sendKeys(photoPath4);

}
   public boolean verifyErrorMessages() {
	  return errorMessagElement.isDisplayed();
}
   public void selectAudi() {
      // wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
       
       for (WebElement option : dropdownOptions) {
           if (option.getText().contains("Audi")) {
               option.click();
               break;
           }
       }
   }
            
           
       public void clickModelMenu() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "div[data-attribute-type='dropDownSingleSelectOrFreeText'] section[class='single-dropdown'] div p[class='selected-options']";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void clickA3() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > section > div > ul > li:nth-child(7) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void clickC3() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(2) > section > section > div > ul > li:nth-child(12) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectGorivo() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(3)";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectDizel() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectBenzin() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(3) > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectOblikKaroserije() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(4) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectLimuzina() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectHecbek() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(4) > section > section > div > ul > li > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectBrojVrata() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(5) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void select45() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(5) > section > section > div > ul > li > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectGodinaProizvodnje() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(6) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectOption2022() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(3) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectOption2020() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(5) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectTip() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "div[class='full-column'] section[class='single-dropdown'] div p[class='selected-options']";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void select2022And2023() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > section > div > ul > li:nth-child(5) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
     
       public void select2025() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(1) > section > div.section-content-wrapper.two-columns > div.full-column > section > section > div > ul > li:nth-child(7) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
     
       public void selectMenuEuro2() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(6) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectEuro2() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(2) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectEuro3() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(6) > section > section > div > ul > li:nth-child(3) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectMenuRegistrovan() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(14) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectRegistrovan2022() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > section > div > ul > li:nth-child(3) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectRegistrovan2025() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(14) > section > section > div > ul > li:nth-child(3) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectBelaBoja() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "body > div:nth-child(3) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(11) > section:nth-child(2) > div:nth-child(1) > p:nth-child(1)";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void selectBelaBojaOption() {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = "#info-about-product > section:nth-child(2) > section.dynamic-configuration > section:nth-child(2) > section > div.section-content-wrapper.two-columns > div:nth-child(11) > section > section > div > ul > li:nth-child(1) > label > span.checkbox-sign.round-checkbox-sign";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
       }
       public void clickOnTheButtonDodajFotografije(String photoPath2) throws InterruptedException {
    	   try {
               JavascriptExecutor js = (JavascriptExecutor) driver;
               String cssSelector = ".input-photo-label";
               js.executeScript("document.querySelector('" + cssSelector + "').click();");
           } catch (Exception e) {
               System.out.println("An error occurred while force clicking the element: " + e.getMessage());
           }
    	   Thread.sleep(500);
    	   possibleElement1.sendKeys(photoPath2);
       }
       public void insertInputTextOglas(String text) {
   	       wait.until(ExpectedConditions.visibilityOf(tekstOglasaElement));
   	    tekstOglasaElement.sendKeys(text);
       }
       public void verifyErrorMessage() {
    	   wait.until(ExpectedConditions.alertIsPresent());
          Alert alert = driver.switchTo().alert();
		  String errorMessage2 = alert.getText();
		  String expectedMessage = "Maksimalan broj fotografija je 30";
		  if (errorMessage2.equals(expectedMessage)) {
	            System.out.println("Alert message is correct.");
	        } else {
	            System.out.println("Alert message is incorrect. Found: " + errorMessage2);
	        }
    	//  String expectedMessage = "Maksimalan broj fotografija je 30";
    	//  return errorMessage2.equals(expectedMessage);
}
   	  
       public void select2022() {
    	      // wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
    	       
    	       for (WebElement option : dropdownOptions) {
    	           if (option.getText().contains("2022")) {
    	               option.click();
    	               break;
    	           }
       }
   }
       public void chooseLocation( String location) {
    	    // Find the search locations wrapper element and click it
    	   wait.until(ExpectedConditions.visibilityOf(locationInputMenuElement));
    	   

    	    // Create an instance of the WebElement for the search input

    	    // Clear the input if it's not already empty
    	   locationInputMenuElement.clear();

    	    // Type the location into the search input
    	   locationInputMenuElement.sendKeys(location);

    	    // Send the Enter key to submit the search
    	   locationInputMenuElement.sendKeys(Keys.ENTER);
    	}

       public void selectEkoloskaKategirija() {
  	      // wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
  	       
  	       for (WebElement option : dropdownOptions) {
  	           if (option.getText().contains("EURO2")) {
  	               option.click();
  	               break;
  	           }
     }
 }
       public void selectRegistrovanDo() {
   	      // wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
   	       
   	       for (WebElement option : dropdownOptions) {
   	           if (option.getText().contains("02/2025")) {
   	               option.click();
   	               break;
   	           }
      }
  }
       public void insertInputPredjeniKilometri(String text) {
   	       wait.until(ExpectedConditions.visibilityOf(predjeniKilometriElement));
   	    predjeniKilometriElement.sendKeys(text);
   	       
       }
       public void insertInputKapacitetPogonskeBaterije(String text) {
   	       wait.until(ExpectedConditions.visibilityOf(kapacitetPogonskeBaterije));
   	    kapacitetPogonskeBaterije.sendKeys(text);
   	       
       }
       public void typeInputFieldKm(String text) {
    	   wait.until(ExpectedConditions.visibilityOf(inputField_KmElement)).sendKeys(text);
	}
       public void typeYoutubeLink(String text) {
    	   wait.until(ExpectedConditions.visibilityOf(youtubeElement)).sendKeys(text);
	}
       public void typeTekstOglasa(String text) {
    	   wait.until(ExpectedConditions.visibilityOf(tekstOglasaElement)).sendKeys(text);
	}
       public void typeCena(String text) {
    	   wait.until(ExpectedConditions.visibilityOf(cenaFieldElement)).sendKeys(text);
	}
       public void clickInputMenu(String text) {
    	   wait.until(ExpectedConditions.visibilityOf(locationInputMenuElement)).sendKeys(text);
	}
       public void insertBrojSasije(String text) {
    	   wait.until(ExpectedConditions.visibilityOf(brojSasije)).sendKeys(text);
	}
       public void insertBrojRegistracijeVozila(String text) {
    	   wait.until(ExpectedConditions.visibilityOf(brojRegistracijeVozila)).sendKeys(text);
	}
       public void clickNastavi2() {
    	   wait.until(ExpectedConditions.elementToBeClickable(buttonNastaviElement2)).click();

	}
       public void clickNastavi3() {
    	   wait.until(ExpectedConditions.elementToBeClickable(buttonSacuvajInformacije)).click();

	}
       public void clickCloseXAd() {
    	   wait.until(ExpectedConditions.elementToBeClickable(closeIconButton)).click();

	}
       public void clickNastavi5() {
    	   wait.until(ExpectedConditions.elementToBeClickable(buttonNastaviElement5)).click();

	}
       public void clickUcitajVideo() {
    	   wait.until(ExpectedConditions.elementToBeClickable(ucitajVideo)).click();

	}
       public void clickPlayVideo() {
    	   wait.until(ExpectedConditions.elementToBeClickable(playVideo)).click();
    	  // actions.moveToElement(playVideo).sendKeys(Keys.ENTER).build().perform();

       }
       public void clickKliznaVrata() {
    	   wait.until(ExpectedConditions.elementToBeClickable(kliznaVrata)).click();

	}
       public void clickMAT() {
    	   wait.until(ExpectedConditions.elementToBeClickable(daMAT)).click();

	}
       public void clickMETALIK() {
    	   wait.until(ExpectedConditions.elementToBeClickable(daMetalik)).click();

	}
       public void clickGarancija() {
    	   wait.until(ExpectedConditions.elementToBeClickable(garancijaOption)).click();

	}
       public void clickButtonNazad() {
    	   wait.until(ExpectedConditions.elementToBeClickable(buttonNazad)).click();

	}
       public void clickDaVracamSe() {
    	   wait.until(ExpectedConditions.elementToBeClickable(daVracamSe)).click();

	}
       public void typeKubikaza(String text) {
    	   wait.until(ExpectedConditions.visibilityOf(kubikazaCM)).sendKeys(text);
	}
}

	
	

