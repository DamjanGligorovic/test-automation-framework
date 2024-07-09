package projectSasomangeCreateAd;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	@FindBy(xpath = "(//p[@class='selected-options'])[1]")
	WebElement menuMarkaAutomobilaElement;
	@FindBy(css = "body > div:nth-child(2) > main:nth-child(4) > astro-island:nth-child(5) > section:nth-child(1) > div:nth-child(3) > section:nth-child(1) > form:nth-child(1) > section:nth-child(2) > section:nth-child(3) > section:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > section:nth-child(2) > section:nth-child(3) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > label:nth-child(2) > span:nth-child(2)")
	WebElement optionAudiElement;
	@FindBy (css = ".youtube-video-container input")
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
	@FindBy(css = "ql-editor ql-blank")
	WebElement tekstOglasaElement;
	@FindBy(xpath = "//*[@id=\"info-about-product\"]/section[2]/section[4]/div[2]/section[3]/section[1]/label/input")
	WebElement cenaFieldElement;
	@FindBy(id = "searchLocations_wrapper")
	WebElement locationInputMenuElement;
	@FindBy(css = "#info-about-product > div > button.btn.btn--type-primary.step-next")
	WebElement buttonNastaviElement2;
	public LoginPageCreateAnAd (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.js = (JavascriptExecutor) driver;
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
		wait.until(ExpectedConditions.elementToBeClickable(menuMarkaAutomobilaElement)).click();
	}
	public void clickOnTheOptionAudi() {
			wait.until(ExpectedConditions.elementToBeClickable(optionAudiElement)).click();
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
   public void uploadPhoto2(String photoPath2) {
		  possibleElement1.sendKeys(photoPath2);
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
            
           
       public void selectA3() {
    	      // wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
    	       
    	       for (WebElement option : dropdownOptions) {
    	           if (option.getText().contains("A3")) {
    	               option.click();
    	               break;
    	           }
       }
   }
       public void selectDizel() {
 	      // wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
 	       
 	       for (WebElement option : dropdownOptions) {
 	           if (option.getText().contains("Dizel")) {
 	               option.click();
 	               break;
 	           }
    }
}
       public void selectLimuzina() {
  	      // wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
  	       
  	       for (WebElement option : dropdownOptions) {
  	           if (option.getText().contains("Dizel")) {
  	               option.click();
  	               break;
  	           }
     }
 }
       public void select45() {
   	      // wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
   	       
   	       for (WebElement option : dropdownOptions) {
   	           if (option.getText().contains("4/5")) {
   	               option.click();
   	               break;
   	           }
      }
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
       public void selectTIP() {
 	      // wait.until(ExpectedConditions.visibilityOfAllElements(dropdownOptions));
 	       
 	       for (WebElement option : dropdownOptions) {
 	           if (option.getText().contains("2.0 30 TDI S TRONIC S LINE, 85kW/116KS, Automatski/Poluautomatski, (2022 - 2023)")) {
 	               option.click();
 	               break;
 	           }
    }
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
       public void typeInputFieldKm(String text) {
    	   wait.until(ExpectedConditions.visibilityOf(inputField_KmElement)).sendKeys(text);
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
       public void clickNastavi2() {
    	   wait.until(ExpectedConditions.visibilityOf(buttonNastaviElement2)).click();

	}
       }

	
	

