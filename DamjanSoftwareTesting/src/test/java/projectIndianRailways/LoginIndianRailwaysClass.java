package projectIndianRailways;

import java.io.IOException;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginIndianRailwaysClass {
	WebDriver driver;
	Actions actions;
	WebDriverWait wait;
	//Selectors for Booking Tickets Page-------------------------------------------------------------------------------------------------------------
	@FindBy(css=".ng-tns-c57-8.ui-inputtext.ui-widget.ui-state-default.ui-corner-all.ui-autocomplete-input.ng-star-inserted")
	WebElement inputField_FromMenu;
	@FindBy(css=".ng-tns-c57-9.ui-inputtext.ui-widget.ui-state-default.ui-corner-all.ui-autocomplete-input.ng-star-inserted")
	WebElement inputField_ToMenu;
	@FindBy(css=".ng-tns-c58-10.ui-inputtext.ui-widget.ui-state-default.ui-corner-all.ng-star-inserted")
	WebElement ddMMYY;
	@FindBy(css=".ng-tns-c65-11.ui-dropdown.ui-widget.ui-state-default.ui-corner-all")
	WebElement classesList;
	@FindBy(css=".ng-tns-c65-12.ui-dropdown.ui-widget.ui-state-default.ui-corner-all")
	WebElement levelList;
	@FindBy(css="label[for='concessionBooking']")
	WebElement checkbox_PersonWithDisabilityConcession;
	@FindBy(css="label[for='dateSpecific']")
	WebElement checkbox_FlexibleWithDate;
	@FindBy(css="label[for='availableBerth']")
	WebElement checkbox_TrainWithAvailableBerth;
	@FindBy(css="label[for='passBooking']")
	WebElement checkbox_RailWayPassConcession;
	@FindBy(css="button[type='submit']")
	WebElement button_Search;
	@FindBy(css="input.form-control.ng-untouched.ng-pristine.ng-invalid")
	WebElement invisibleElement1;
	//Selectors for Registration Page------------- B A S I C   D E T A I L S----------------------------------------------------------------------------------------------------------------
	@FindBy(css="a[aria-label='Click here to register your account with I.R.C.T.C.']")
	WebElement link_REGISTER;
	@FindBy(css=".col-md-7.col-sm-12.col-xs-12.remove-pad.userReg2.firstPage")
	WebElement firstPage_UserReg1;
	@FindBy(css="[role=\"tablist\"] li")
	List<WebElement> categories_list;
	@FindBy(css="a[aria-label='Click here to Login in application'] u strong")
	WebElement link_SignIn;
	@FindBy(css="#userName")
	WebElement inputField_UserName;
	@FindBy(css="#usrPwd")
	WebElement inputField_Password;
	@FindBy(css="#cnfUsrPwd")
	WebElement inputField_ConfirmPassword;
	@FindBy(css =".ng-tns-c65-7.ui-dropdown.ui-widget.ui-state-default.ui-corner-all input")
	WebElement menu_PreferredLanguage;
	@FindBy(css ="li[aria-label='English']")
	WebElement option_English;
	@FindBy(css=".ng-tns-c65-8.ui-dropdown.ui-widget.ui-state-default.ui-corner-all")
	WebElement menu_SecurityQuestions;
	@FindBy(css="li[aria-label='What was the name of your first school?'] span[class='ng-star-inserted']")
	WebElement option_QuestionWhatWasTheNameOfYourFirstSchool;
	@FindBy(css="input[placeholder='Security Answer']")
	WebElement inputField_SecurityAnswer;
	@FindBy(css = ".btn.btn-default.ng-star-inserted")
	WebElement button_Close;
	@FindBy(css=".search_btn.train_Search.ng-star-inserted") 
	WebElement buttonContinue;
	@FindBy(css="div.col-xs-12.inputBoxPad")
	List<WebElement> list_MenusLangSecQAnse;
	@FindBy(css=".ng-tns-c58-17.ng-star-inserted a")
	List<WebElement>list_Days;
	//Selectors for Registration Page-------------P E R S O N A L   D E T A I L S----------------------------------------------------------------------------------------------------------------
	@FindBy(css="#firstName")
	WebElement inputField_FirstName;
	@FindBy(css="#middleName")
	WebElement inputField_MiddleName;
	@FindBy(css="#lastname")
	WebElement inputField_LastName;
	@FindBy(css=".ng-tns-c65-51.ui-dropdown-label.ui-inputtext.ui-corner-all.ui-placeholder.ng-star-inserted")
	WebElement menu_SelectOcupation;
	@FindBy(css="li[aria-label='PROFESSIONAL'] span[class='ng-star-inserted']")
	WebElement option_Professional;
	@FindBy(css="input[placeholder='Date Of Birth']")
	WebElement menu_DateOfBirth;
	@FindBy(css=".ui-datepicker-year.ng-tns-c58-10.ng-star-inserted")
	WebElement menu_Year;
	@FindBy(css="option[value='1993']")
	WebElement option_1993;
	@FindBy(css="body > app-root:nth-child(2) > app-home:nth-child(2) > div:nth-child(3) > div:nth-child(1) > app-user-registration:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > p-tabview:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p-tabpanel:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > p-calendar:nth-child(1) > span:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > a:nth-child(1)")
	WebElement option_FirstDay;
	@FindBy(css="select[class='form-control ng-pristine ng-valid ng-touched'] option[value='184']")
	WebElement option1_Serbia;
	@FindBy(css="select[class='form-control ng-pristine ng-invalid ng-touched'] option[value='184']")
	WebElement option2_Serbia;
	@FindBy(css=".ui-datepicker-month.ng-tns-c58-10.ng-star-inserted")
	WebElement option_Month;
	@FindBy(css="select[class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted'] option[value='3']")
	WebElement option_April;
	@FindBy(css="p-radiobutton[id='unmarried'] div[role='radio']")
	WebElement radioButton_Unmarried;
	@FindBy(css="select[class='form-control ng-untouched ng-pristine ng-valid']")
	WebElement menu_Countries;
	@FindBy(css="div[aria-label='Male']")
	WebElement selectingOption_Male;
	@FindBy(css="#email")
	WebElement inputField_Email;
	@FindBy(css="#mobile")
	WebElement inputField_Mobile;
	@FindBy(css="select[formcontrolname='nationality']")
	WebElement menu_Nationality;
	@FindBy(css=".btn.btn-default.ng-star-inserted")
	WebElement button_Back;
	@FindBy(css=".col-md-6.col-xs-6.tabPad")
	List<WebElement>listMenusOccupationNationalities;
	@FindBy(css=".ui-datepicker-month.ng-tns-c58-17.ng-star-inserted option")
	List<WebElement> list_Months;
	@FindBy(css=".ui-datepicker-year.ng-tns-c58-17.ng-star-inserted option")
	List<WebElement>list_Years;
	@FindBy(css=".col-md-6.col-xs-6.tabPad span")
	List<WebElement> list_RadioButtons;
	@FindBy(css="[formcontrolname=\"resCountry\"] [value=\"184\"]")
	WebElement option_Serbia;
	@FindBy(css="[formcontrolname=\"nationality\"] [value=\"184\"]")
	WebElement option_Serbia1;
	@FindBy(css="[role=\"group\"] div")
	List<WebElement> list_Genders;
	@FindBy(css="#ui-tabpanel-4 > div > div:nth-child(6) > p-calendar > span > div > div > div.ui-datepicker-calendar-container.ng-tns-c58-22.ng-star-inserted > table > tbody > tr:nth-child(1) > td.ng-tns-c58-22.ui-datepicker-current-day.ng-star-inserted > a")
	WebElement option_FirstDayApril;
	@FindBy(css=".col-md-7.col-sm-12.col-xs-12.remove-pad.userReg2.secondPage")
	WebElement secondPage_UserReg2;
	//Selectors for Registration Page-------------A D D R E S S----------------------------------------------------------------------------------------------------------------
	@FindBy(css="#resAddress1")
	WebElement inputField_FlatDoorBlockNo;
	@FindBy(css="#resAddress2")
	WebElement inputField_StreetLane;
	@FindBy(css="#resAddress3")
	WebElement inputField_AreaLocality;
	@FindBy(css="input[placeholder='Pin code']")
	WebElement inputField_PinCode;
	@FindBy(css="select[formcontrolname='resCity']")
	WebElement menu_SelectCity;
	@FindBy(css="#resState")
	WebElement inputField_State;
	@FindBy(css="select[formcontrolname='resPostOff']")
	WebElement menu_SelectAPostOffice;
	@FindBy(css="#resPhone")
	WebElement inputField_Phone;
	@FindBy(css="p-radiobutton[id='no'] span[class='ui-radiobutton-icon ui-clickable']")
	WebElement radioButton_No;
	@FindBy(css  ="input[class='ng-untouched ng-pristine ng-invalid']")
	WebElement checkbox_TermsAndConditions;//--------------------------------------------------------------
	@FindBy(css="#divMain > div > app-user-registration > div > div > form > div > div.col-md-7.col-sm-12.col-xs-12.remove-pad.userReg2.thirdPage > div.col-xs-12.ng-star-inserted > div.pull-right.btn-marginR > button")
	WebElement button_Register;
	@FindBy(css="#resCity")
	WebElement inputField_City;
	@FindBy(css="#resState")
	WebElement inputField_ResState;
	@FindBy(css="#resPostOff")
	WebElement inputField_PostOffice;
	@FindBy(css="#resPhone")
	WebElement inputField_ResPhone;
	@FindBy(css=".col-md-6.col-xs-12")
	List<WebElement>list_Recaptcha;
	@FindBy(css=".form-group.ng-valid.ng-pristine.ng-touched")
	WebElement listRadioButtons_YesNo;
	@FindBy(css="#isd")
	WebElement inputField_ISD;
	@FindBy(css="div.col-md-7.col-sm-12.col-xs-12.remove-pad.userReg2.thirdPage")
	WebElement element_ShouldBeInsivisle;
	@FindBy(css=".col-md-7.col-sm-12.col-xs-12.remove-pad.userReg2.thirdPage")
	WebElement thirdPage_UserReg3;
	@FindBy(css="#captcha")
	WebElement reCaptcha;
	@FindBy(css="#div-gpt-ad-1658134283872-0")
	WebElement captchaQuestion;
	@FindBy(css="[href=\"http://contents.irctc.co.in/en/Terms%20and%20conditions.pdf\"]")
	WebElement link_TermsAndConditionsElement;
	@FindBy(css="[type=\"submit\"]")
	List<WebElement>list_SubmitButtonElements;
	@FindBy(css="#yes > div > div.ui-radiobutton-box.ui-widget.ui-state-default.ui-state-active")
	WebElement radio_ButtonYes;
	@FindBy(css="[formcontrolname=\"officeSameAsRes\"]")
	List<WebElement>list_ButtonRadioElementsYesNo;
	@FindBy(css="button.col-xs-offset-3.col-xs-3.search_btn.train_Search.regCnfBtn")
	WebElement alert_optionOk;
	@FindBy(css="#divMain > div > app-user-registration > div > div > form > div > div.col-md-7.col-sm-12.col-xs-12.remove-pad.userReg2.thirdPage > div > div.ng-star-inserted > div:nth-child(1)")
	WebElement confirmation_Message;
	public LoginIndianRailwaysClass (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	actions = new Actions(driver);
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));	

	}
	//Inserting Methods----------------------------------------------------------------------------------------------------------------------------
	public void typeInputFieldFlat(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_FlatDoorBlockNo));
		inputField_FlatDoorBlockNo.clear();
		inputField_FlatDoorBlockNo.sendKeys(input);
	}
	public void typeInputFieldResPhone(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_ResPhone));
		inputField_ResPhone.clear();
		inputField_ResPhone.sendKeys(input);
	}
	public void typeInputFieldCity(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_City));
		inputField_City.clear();
		inputField_City.sendKeys(input);
	}
	public void typeInputFieldState1(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_ResState));
		inputField_ResState.clear();
		inputField_ResState.sendKeys(input);
	}
	public void typeInputFieldPostOffice(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_PostOffice));
		inputField_PostOffice.clear();
		inputField_PostOffice.sendKeys(input);
	}
	public void typeInputFieldPinCode(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_PinCode));
		inputField_PinCode.clear();
		inputField_PinCode.sendKeys(input);
	}
	
	public void typeInputFieldFromMenu(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_FromMenu));
		inputField_FromMenu.clear();
		inputField_FromMenu.sendKeys(input);
	}
	 public void typeInputFieldToMenu(String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_ToMenu));
		 inputField_ToMenu.clear();
		 inputField_ToMenu.sendKeys(input);
	}
	 public void typeInputFieldUserName(String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_UserName));
		 inputField_UserName.clear();
		 inputField_UserName.sendKeys(input);
	}
	 public void typeInputFieldPassword(String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_Password));
		 inputField_Password.clear();
		 inputField_Password.sendKeys(input);
	}
	 public void typeInputFieldConfirmPassword(String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_ConfirmPassword));
		 inputField_ConfirmPassword.clear();
		 inputField_ConfirmPassword.sendKeys(input);
	}
	 public void typeInputFieldSecurityAnswer(String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_SecurityAnswer));
		 inputField_SecurityAnswer.clear();
		 inputField_SecurityAnswer.sendKeys(input);
	}
	 public void typeInputFieldFirstName(String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_FirstName));
		 inputField_FirstName.clear();
		 inputField_FirstName.sendKeys(input);
	}
	 public void typeInputFieldMiddleName(String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_MiddleName));
		 inputField_MiddleName.clear();
		 inputField_MiddleName.sendKeys(input);
	}
	 public void typeInputFieldLastName(String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_LastName));
		 inputField_LastName.clear();
		 inputField_LastName.sendKeys(input);
	}
	 public void typeInputFieldSecurityAnswer1 (String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_SecurityAnswer));
		 inputField_SecurityAnswer.clear();
		 inputField_SecurityAnswer.sendKeys(input);
	}
	 public void typeInputFieldMobile (String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_Mobile));
		 inputField_Mobile.clear();
		 inputField_Mobile.sendKeys(input);
	}
	 public void typeInputFieldISD (String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_ISD));
		 inputField_ISD.clear();
		 inputField_ISD.sendKeys(input);
	}
	 //Clicking Methods-----------------------------------------------------------------------------------------------------------------------------------------
	 public void clickOnTheButtonSearch() {
	 wait.until(ExpectedConditions.elementToBeClickable(button_Search)).click();
	}
	 public void clickOnTheButtonAlertOk() {
		 wait.until(ExpectedConditions.elementToBeClickable(alert_optionOk)).click();
		}
	 public void clickOnTheLinkTerms() {
		 wait.until(ExpectedConditions.elementToBeClickable(link_TermsAndConditionsElement)).click();
		}
	 public void clickOnTheButtonRegister() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_Register)).click();
		}
	 public void clickOnTheLastNameField() {
		 wait.until(ExpectedConditions.elementToBeClickable(secondPage_UserReg2)).click();
		}
	 public void clickOnTheFirstApril() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_FirstDayApril)).click();
		}
	 public void clickOnTheLinkRegister() {
	 wait.until(ExpectedConditions.elementToBeClickable(link_REGISTER)).click();
	}
	 public void clickOnTheContinue() {
		 wait.until(ExpectedConditions.elementToBeClickable(buttonContinue)).click();
		}
	 public void clickOnTheDate() {
		 wait.until(ExpectedConditions.elementToBeClickable(menu_DateOfBirth)).click();
		}
	 
	 public void clickOnTheTermsAndCondition() {
		//Select select = new Select(checkbox_TermsAndConditions);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='ng-untouched ng-pristine ng-invalid']")));
		    for (int attempt = 0; attempt < 3; attempt++) {
		        try {
		            if (checkbox_TermsAndConditions.isDisplayed() && checkbox_TermsAndConditions.isEnabled()) {
		            	checkbox_TermsAndConditions.click();
		                return; // Exit the method if the click is successful
		            }
		        } catch (WebDriverException e) {
		            // Handle the exception, possibly with a wait before retrying
		            wait.withTimeout(Duration.ofSeconds(1)).ignoring(WebDriverException.class).until(webDriver -> true);
		        }
		    }
		    // Use JavaScript as a last resort
		    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		    jsExecutor.executeScript("arguments[0].click();", checkbox_TermsAndConditions);
		}
	// public void clickOnTheRadioButtonsYes() {
		//Select select = new Select(checkbox_TermsAndConditions);
	//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#yes")));
		    // Retry clicking if the element is not clickable
		//    for (int attempt = 0; attempt < 3; attempt++) {
		//        try {
		  //          if (radio_ButtonYes.isDisplayed() && radio_ButtonYes.isEnabled()) {
		  //          	radio_ButtonYes.click();
		      //          return; // Exit the method if the click is successful
		    //        }
		     //   } catch (WebDriverException e) {
		            // Handle the exception, possibly with a wait before retrying
		    //        wait.withTimeout(Duration.ofSeconds(1)).ignoring(WebDriverException.class).until(webDriver -> true);
		     //   }
		    //}
		    // Use JavaScript as a last resort
		  //  JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		   // jsExecutor.executeScript("arguments[0].click();", checkbox_TermsAndConditions);
		//}
	 
	 
	 public void clickOnTheRegister() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_Register)).click();
		}
	 //Complex Methods
	 public void clickOnListMenus(String input) {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.col-xs-12.inputBoxPad"), 6));
		 list_MenusLangSecQAnse.get(3).click();
		 wait.until(ExpectedConditions.elementToBeClickable(option_English)).click();
		 list_MenusLangSecQAnse.get(4).click();
		 wait.until(ExpectedConditions.elementToBeClickable(option_QuestionWhatWasTheNameOfYourFirstSchool)).click();
		 inputField_SecurityAnswer.clear();
		 inputField_SecurityAnswer.sendKeys(input);
	 }
	 public void verifyListOccupation1() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".col-md-6.col-xs-6.tabPad"), 14));
		listMenusOccupationNationalities.get(0).click();
		 wait.until(ExpectedConditions.elementToBeClickable(option_Professional)).click();
	 }
	 public void verifyListNationality1() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".col-md-6.col-xs-6.tabPad"), 14));
		listMenusOccupationNationalities.get(5).click();
		 wait.until(ExpectedConditions.elementToBeClickable(option_Serbia1)).click();
	 }
	 public void verifyListGenders() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[role=\"group\"] div"), 3));
		list_Genders.get(0).click();
	 }
	 public void verifyListYes() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[formcontrolname=\"officeSameAsRes\"]"), 2));
		 list_ButtonRadioElementsYesNo.get(0).click();
	 }
	// public void verifyListYesNo() {
	//	 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".form-group.ng-valid.ng-pristine.ng-touched"), 2));
	///	 listRadioButtons_YesNo.get(0).click();
	//}
	 public static class EmailGenerator {
		    public static String generateRandomEmail() {
		        return "user" + UUID.randomUUID().toString() + "@example.com";
		    }
		}
	 public void typeIntoTheFieldEmail(String input) {
		 if (input != null && !input.isEmpty()) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Email));
		inputField_Email.sendKeys(input);
	}
	 }
	 public void verifyListCountries1() {
	 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".col-md-6.col-xs-6.tabPad"), 14));
	 listMenusOccupationNationalities.get(3).click();
	 wait.until(ExpectedConditions.elementToBeClickable(option_Serbia)).click();
	 }
	 public void verifyListRadioButtons() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".col-md-6.col-xs-6.tabPad span"), 7));
		 list_RadioButtons.get(6).click();
	 }
	 public void verifyListRadioButtonsNo() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".col-md-6.col-xs-6.tabPad span"), 2));
		 list_RadioButtons.get(1).click();
	 }
	 
	 public void verifyButtonRegister() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[type=\"submit\"]"), 2));
		 list_SubmitButtonElements.get(1).click();
	 }public void verifyListDateOfBirt1(String input) {
		 wait.until(ExpectedConditions.visibilityOf(menu_DateOfBirth));
		 wait.until(ExpectedConditions.visibilityOf(menu_DateOfBirth)).clear();
		 wait.until(ExpectedConditions.visibilityOf(menu_DateOfBirth)).sendKeys(input);
		 wait.until(ExpectedConditions.elementToBeClickable(inputField_LastName)).click();
	 }
	 public void verifyListMonths() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ui-datepicker-month.ng-tns-c58-10.ng-star-inserted option"), 12));
		 list_Months.get(3).click();
	
		}
	 public void verifyListYears() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ui-datepicker-year.ng-tns-c58-17.ng-star-inserted option"), 108));
		 list_Years.get(94).click();
		}
	 public void verifyListDays() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ng-tns-c58-17.ng-star-inserted a"), 32));
		 list_Days.get(2).click();
		}
	 //Selecting Methods
	 public void selectTheLanguage() {
		 wait.until(ExpectedConditions.elementToBeClickable(menu_PreferredLanguage)).click();
	 	option_English.click();
	        //Select dropdown = new Select(menu_PreferredLanguage);
	       // dropdown.selectByVisibleText(visibleText);
	    }
	 public void selectSecurityQuestion() {
	  wait.until(ExpectedConditions.elementToBeClickable(menu_SecurityQuestions)).click();
      wait.until(ExpectedConditions.elementToBeClickable(option_QuestionWhatWasTheNameOfYourFirstSchool)).click();
	 }
	 
	 //Alert Methods
	 public void verifyAlertMessage() {
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	 //Verifying List Methods
	 public boolean verifyListOfCategories1() {
	 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[role=\"tablist\"] li"), 3));
	 	 return categories_list.get(0).isEnabled();
	}
	 public boolean verifyWholeFirstPage() {
		 wait.until(ExpectedConditions.visibilityOf(firstPage_UserReg1));
		 	 return firstPage_UserReg1.isEnabled();
		}
	 public boolean verifyListOfCategories2() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[role=\"tablist\"] li"), 3));
		 	 return categories_list.get(1).isEnabled();
		}
	 public boolean verifyWholeSecondPage() {
		 wait.until(ExpectedConditions.visibilityOf(secondPage_UserReg2));
		 	 return secondPage_UserReg2.isEnabled();
		}
	 public boolean verifyConfirmationMessage() {
		 wait.until(ExpectedConditions.visibilityOf(confirmation_Message));
		 	 return confirmation_Message.isDisplayed();
		}
	 public boolean verifyListOfCategories3() {
	 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[role=\"tablist\"] li"), 3));
	 return categories_list.get(2).isEnabled();
		}
	 public void fillCaptcha(String captchaText) {
		 reCaptcha.sendKeys(captchaText);
	    }
	 public void pressEnter() {
	actions.moveToElement(reCaptcha).sendKeys(Keys.ENTER);
	}
	 public void solveRecaptchaManually() {
		    WebElement reCaptchaFrame = driver.findElement(By.cssSelector("iframe[src^='https://www.google.com/recaptcha/api2/anchor']"));
		    driver.switchTo().frame(reCaptchaFrame);

		    driver.findElement(By.cssSelector("#recaptcha-anchor")).click();

		    System.out.println("Please solve the reCAPTCHA manually and press Enter to continue...");
		    Scanner scanner = new Scanner(System.in);
		    
		    scanner.nextLine(); // Wait for the user to press Enter

		    driver.switchTo().defaultContent();
		}
	    public String getCaptchaQuestion() {
	        return captchaQuestion.getText();
	    }
	 public void verifyWholeThirdPage() {
		 wait.until(ExpectedConditions.invisibilityOf(thirdPage_UserReg3));
		 	// return thirdPage_UserReg3.isEnabled();
		}
	 public void verifyInvisibleMethods() {
		wait.until(ExpectedConditions.invisibilityOf(element_ShouldBeInsivisle));
	}
	 public void verifyInvisibleMethod1() {
	 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".col-md-6.col-xs-12"), 3));
		wait.until(ExpectedConditions.invisibilityOfAllElements(list_Recaptcha));

		}
	 public void waitForElementToBeInvisible() {
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("ul.ui-tabview-nav.ui-helper-reset.ui-helper-clearfix.ui-widget-header.ui-corner-all.ng-star-inserted")));
	    }
	 	public void verifyInvisibleMethodThirdPage() {
			wait.until(ExpectedConditions.invisibilityOf(thirdPage_UserReg3));
		}
	    public void clickCheckboxUsingJS() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", checkbox_TermsAndConditions);
	    }

	    public void scrollToElementAndClick() {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox_TermsAndConditions);
	        checkbox_TermsAndConditions.click();
	    }
	    public String generateNineDigitMobileNumber() {
	    	SecureRandom random = new SecureRandom();
	        int eightDigitNumber = random.nextInt()  ;
	        return "6" + String.valueOf(eightDigitNumber);
	    }

	    /**
	     * Inserts the generated nine-digit number into the mobile phone field.
	     */
	    public void insertMobileNumber() {
	        String mobileNumber = generateNineDigitMobileNumber();
	        inputField_Mobile.sendKeys(mobileNumber);
	    }
	    public String generateUsername() {
	        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        SecureRandom random = new SecureRandom();
	        int usernameLength = 8; 
	        char[] usernameBuffer = new char[usernameLength];
	        for (int i = 0; i < usernameLength; i++) {
	            usernameBuffer[i] = characters.charAt(random.nextInt(characters.length()));
	        }
	        return new String(usernameBuffer);
	    }
	    public void solveCaptchaManually1() {
	        System.out.println("Please solve the CAPTCHA manually and press Enter to continue...");
	        try {
	            System.in.read(); // Wait for the user to press Enter
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	      
	    }
	}

	    
	

