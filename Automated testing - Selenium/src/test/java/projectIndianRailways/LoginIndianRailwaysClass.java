package projectIndianRailways;

import java.io.IOException;
import java.security.PublicKey;
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
	@FindBy(css="#jDate")
	WebElement ddMMYY;
	@FindBy(css=".ng-tns-c58-10.ui-inputtext.ui-widget.ui-state-default.ui-corner-all.ng-star-inserted")
	WebElement input_ddMMYYElement;
	@FindBy(css="#divMain > div > app-main-page > div > div > div.level_2.slanted-div > div.col-xs-12.remove-padding.tbis-box.tbis-box-pad > div:nth-child(1) > app-jp-input > div > form > div:nth-child(2) > div.col-md-5.col-xs-12.remove-padding > div.form-group.ui-float-label")
	WebElement ddMMYYActionExperimentElement;
	@FindBy(xpath ="//a[normalize-space()='28']")
	WebElement theChosenDataElement;
	@FindBy(xpath ="//a[normalize-space()='29']")
	WebElement theChosenDataElement1;
	@FindBy(xpath ="//a[normalize-space()='30']")
	WebElement theChosenDataElement2;
	@FindBy(xpath ="//a[normalize-space()='31']")
	WebElement theChosenDataElement3;
	@FindBy(css="#journeyClass > div")
	WebElement allClassesMenu;
	@FindBy(css=".ng-tns-c65-12.ng-star-inserted")
	WebElement generalMenuElement;
	@FindBy(css="#journeyQuota > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c65-30.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul > p-dropdownitem:nth-child(3) > li > span")
	WebElement lowerCitizen;
	@FindBy(css="#journeyClass > div > div.ng-trigger.ng-trigger-overlayAnimation.ng-tns-c65-29.ui-dropdown-panel.ui-widget.ui-widget-content.ui-corner-all.ui-shadow.ng-star-inserted > div > ul > p-dropdownitem:nth-child(3) > li > span")
	WebElement levelAC1;
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
	@FindBy(css="#divMain > div > app-main-page > div > div > div.level_2.slanted-div > div.col-xs-12.remove-padding.tbis-box > div:nth-child(1) > app-jp-input > div > div")
	WebElement random_ClickElement;
	@FindBy(css=".ng-tns-c58-58.ng-star-inserted td")
	List<WebElement> list_CalendarDaysElements;
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
	//Login Page------------------------------------------------------------------------------------------
	@FindBy(css="[formcontrolname=\"userid\"]")
	WebElement inputField_UserNameElement;
	@FindBy(css="[formcontrolname=\"password\"]")
	WebElement inputField_PasswordElement;
	@FindBy(css="button[class='search_btn train_Search']")
	WebElement ButtonSignInO;
	@FindBy(xpath="//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[1]/div[1]/span[2]/a/u/strong")
	WebElement link_SignIn1;
	@FindBy(css ="div[class='alert alert-info'] p")
	WebElement confirmation_MessageInfo;
	@FindBy(css=".ng-tns-c65-11.ng-star-inserted")
	List<WebElement> list_AllClasses;
	@FindBy(css=".ng-tns-c65-12.ng-star-inserted")
	List<WebElement> list_GeneralClasses; 
	@FindBy(css="ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10")
	WebElement dartElement;
	@FindBy(css="body > app-root > app-home > div.header-fix > app-header > p-toast > div > p-toastitem > div > div")
	WebElement errorMessageElement;
	@FindBy(css="#divMain > div > app-train-list > p-toast > div")
	WebElement invalidMessageElement;
	//Ticket page---------------------------------------------------------------------------------------
	@FindBy(css="#divMain > div > app-train-list > div.col-sm-9.col-xs-12 > div > div.ng-star-inserted > div:nth-child(2) > div.form-group.no-pad.col-xs-12.bull-back.border-all > app-train-avl-enq > div.ng-star-inserted > div:nth-child(5) > div.white-back.col-xs-12.ng-star-inserted > table > tr > td:nth-child(3) > div")
	WebElement option_A1;
	@FindBy(css="#divMain > div > app-train-list > div.col-sm-9.col-xs-12 > div > div.ng-star-inserted > div.ng-star-inserted > div.form-group.no-pad.col-xs-12.bull-back.border-all > app-train-avl-enq > div.ng-star-inserted > div:nth-child(5) > div.white-back.col-xs-12.ng-star-inserted > table > tr > td:nth-child(1) > div > div:nth-child(1) > strong")
	WebElement option_SL;
	@FindBy(css="#divMain > div > app-train-list > div.col-sm-9.col-xs-12 > div > div.ng-star-inserted > div.ng-star-inserted > div.form-group.no-pad.col-xs-12.bull-back.border-all > app-train-avl-enq > div.ng-star-inserted > div:nth-child(7) > div:nth-child(1) > div.ng-star-inserted > table > tr > td:nth-child(5) > div > div:nth-child(1) > strong")
	WebElement option_MonElement;
	@FindBy(css="#divMain > div > app-train-list > div.col-sm-9.col-xs-12 > div > div.ng-star-inserted > div:nth-child(2) > div.form-group.no-pad.col-xs-12.bull-back.border-all > app-train-avl-enq > div.ng-star-inserted > div:nth-child(7) > div:nth-child(1) > div.ng-star-inserted > table > tr > td:nth-child(4) > div")
	WebElement option_ThursdayAvailable;
	@FindBy(css="#divMain > div > app-train-list > div.col-sm-9.col-xs-12 > div > div.ng-star-inserted > div:nth-child(2) > div.form-group.no-pad.col-xs-12.bull-back.border-all > app-train-avl-enq > div.col-xs-12 > div > span > span:nth-child(1) > button.btnDefault.train_Search.ng-star-inserted")
	WebElement button_BookTicket;
	@FindBy(css="#divMain > div > app-train-list > p-confirmdialog.ng-tns-c56-15 > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c56-15.ng-star-inserted > button.ng-tns-c56-15.ui-confirmdialog-acceptbutton.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-text-icon-left.ng-star-inserted > span.ui-button-text.ui-clickable")
	WebElement option_Yes;
	@FindBy(css="#divMain > div > app-main-page > div > div > div.level_2.slanted-div > div.col-xs-12.remove-padding.tbis-box.tbis-box-pad > div:nth-child(1) > app-jp-input > p-confirmdialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c56-7.ng-star-inserted > button > span.ui-button-text.ui-clickable")
	WebElement option_OK;
	@FindBy(css="#divMain > div > app-train-list > div.col-sm-9.col-xs-12 > div > div.text-center.col-xs-12.ng-star-inserted > span")
	WebElement negativeConfirmationMessagElement;
	@FindBy(css="#divMain > div > app-train-list > div.col-sm-9.col-xs-12 > div > div.text-center.col-xs-12.ng-star-inserted > span")
	WebElement negativeConfirmationMessageNoElement;
	@FindBy(css="body > app-root > app-home > div.header-fix > app-header > p-toast > div > p-toastitem > div > div")
	WebElement error_MessagElement1;
	@FindBy(css="#divMain > div > app-main-page > div > div > div.level_2.slanted-div > div.col-xs-12.remove-padding.tbis-box.tbis-box-pad > div:nth-child(1) > app-jp-input > p-confirmdialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c56-7.ng-star-inserted > button > span.ui-button-text.ui-clickable")
	WebElement option_OKElement;
	@FindBy(css="#divMain > div > app-main-page > div > div > div.level_2.slanted-div > div.col-xs-12.remove-padding.tbis-box.tbis-box-pad > div:nth-child(1) > app-jp-input > p-confirmdialog > div > div > div.ui-dialog-footer.ui-widget-content.ng-tns-c56-7.ng-star-inserted > button.ng-tns-c56-7.ui-confirmdialog-rejectbutton.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-text-icon-left.ng-star-inserted > span.ui-button-text.ui-clickable")
	WebElement option_NoElement;
	//Charts booking system
	@FindBy(css="#divMain > div > app-main-page > div > div > div.level_2.slanted-div > div.col-xs-12.remove-padding.tbis-box.tbis-box-pad > div:nth-child(1) > div.hidden-xs > div.text-center.pull-right > a")
	WebElement button_chartsElement;
	@FindBy(css ="div.css-1hwfws3 > div > div > input")
	List<WebElement> inputField_TrainName;
	@FindBy(css = "#root > div > div > div.jss2.jss41.jss53.jss65.jss77.jss181 > div > div > div > div > label.jss406.jss407 > div > div > div > div.css-1hwfws3 > div.css-xp4uvy")
	WebElement option_TrainName;
	@FindBy(name = "trainNumber")
	WebElement option12321;
	@FindBy(css="#react-select-4-input")
	WebElement inputField_TrainName1;
	@FindBy(css="#root > div > div > div.jss2.jss41.jss53.jss65.jss77.jss181 > div > div > div > div > div:nth-child(2) > div > div > input")
	WebElement inputField_Calendar;
	@FindBy(css="body > div.mui-fixed.jss204.jss380 > div.jss383.jss381 > div > div.jss655.jss479 > div.jss672.jss659 > div > div:nth-child(3) > div:nth-child(7) > button")
	WebElement options_DaysElement;
	@FindBy(css="#react-select-5-input")
	WebElement inputField_BoardingStationElement;
	@FindBy(css="#root > div > div > div.jss2.jss41.jss53.jss65.jss77.jss181 > div > div > div > div > div:nth-child(4) > button")
	WebElement inputField_GetTrainChartElement;
	@FindBy(css="div.css-1hwfws3 > div > div > input")
	List<WebElement> option_BoardingStationElements;
	@FindBy(css="[name=\"boardingStation\"]")
	WebElement inputFieldMenuBoardingStatElement;
	@FindBy(css="#react-select-5-input")
	WebElement boarding_InputField_StationElement;
	@FindBy(id="react-select-5-input")
	WebElement boardingStationInput;
	//ProbeSelectors
	@FindBy(css="#react-select-5-input")
	WebElement inputField_BoardingStation;
	@FindBy(css="#react-select-5-input")
	WebElement inputField_BoardingStation1;
	@FindBy(css="#root > div > header.jss107.jss113.jss98.jss102.jss104 > div > div.jss1.jss18 > h6")
	WebElement reservationElement;
	public LoginIndianRailwaysClass (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	actions = new Actions(driver);
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));	

	}
	///Probe methods
	 public void clickOnTheFieldBoardingStation() {
		 wait.until(ExpectedConditions.elementToBeClickable(inputField_BoardingStation)).click();
	    }
	 public boolean verifyReservation() {
		return reservationElement.isDisplayed();
	}
	 public void typeIntoTheFieldBoardingStation(String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_BoardingStation));
		 inputField_BoardingStation.clear();
		 inputField_BoardingStation.sendKeys(input);
      actions.moveToElement(inputField_BoardingStation1).sendKeys(Keys.ENTER).build().perform();
	 }
	//Inserting Methods----------------------------------------------------------------------------------------------------------------------------

	
	
	public void typeInputFieldUBoardingStationName(String input) {
		wait.until(ExpectedConditions.elementToBeClickable(inputFieldMenuBoardingStatElement));
		inputFieldMenuBoardingStatElement.click();
		inputFieldMenuBoardingStatElement.clear();
		inputFieldMenuBoardingStatElement.sendKeys(input);
	}
	
	public void typeInputFieldUserNameLoginpage(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_UserNameElement));
		inputField_UserNameElement.clear();
		inputField_UserNameElement.sendKeys(input);
	}
	public void typeInputFieldPasswordLoginpage(String input) {
		wait.until(ExpectedConditions.visibilityOf(inputField_PasswordElement));
		inputField_PasswordElement.clear();
		inputField_PasswordElement.sendKeys(input);
	}
	
	public void verifyInputTrainName1() {
		actions.moveToElement(inputField_TrainName1).sendKeys(Keys.ENTER).build().perform();
	}
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
	 public void typeInputFieldBoardingStation (String input) {
		 wait.until(ExpectedConditions.visibilityOf(inputField_BoardingStationElement));
		 inputField_BoardingStationElement.clear();
		 inputField_BoardingStationElement.sendKeys(input);
	}
	 public void typeInputFieldBoardingStation1 () {
		actions.moveToElement(inputField_BoardingStationElement).sendKeys(Keys.ENTER).build().perform();
	}
	 public void typeInputDate (String input) {
		 

		 wait.until(ExpectedConditions.visibilityOf(input_ddMMYYElement));
		 input_ddMMYYElement.clear();
		 input_ddMMYYElement.sendKeys(input);
	}
public void typeInputTrainName(String input) {
		 
		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.css-1hwfws3 > div > div > input"), 2));
		inputField_TrainName.clear();
		inputField_TrainName.get(0).sendKeys(input);
}
public void typeInputBoardingStation(String input) {
	 
	wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.css-1hwfws3 > div > div > input"), 2));
	option_BoardingStationElements.get(1).click();
	option_BoardingStationElements.clear();
	option_BoardingStationElements.get(1).sendKeys(input);
}

public void typeInputBoardingStationID() {
	 
	wait.until(ExpectedConditions.visibilityOf(boarding_InputField_StationElement));
	boarding_InputField_StationElement.click();
}
public void typeInputBoardingStation2() {
	 
	actions.moveToElement(inputField_BoardingStationElement).sendKeys(Keys.ENTER).build().perform();
}
public void typeCalendarDaysList() {
	 
	wait.until(ExpectedConditions.elementToBeClickable(options_DaysElement)).click();
}

	 //Clicking Methods-----------------------------------------------------------------------------------------------------------------------------------------
	 public void clickOnTheButtonSignInRegistrationPage() {
		 wait.until(ExpectedConditions.elementToBeClickable(link_SignIn1)).click();
		}
	 public void clickOnTheCharts(String input) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", button_chartsElement);

		 wait.until(ExpectedConditions.elementToBeClickable(button_chartsElement)).click();
		 

		}
	 public void clickOnTheOptionNo() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_NoElement)).click();
		}
	 public void clickOnTheGetTrainChart() {
		 wait.until(ExpectedConditions.elementToBeClickable(inputField_GetTrainChartElement)).click();
		}
	 public void clickOnTheCalendar() {
		 wait.until(ExpectedConditions.elementToBeClickable(inputField_Calendar)).click();
		}
	 public void clickOnTheOptionOK() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_OKElement)).click();
		}
	 public void clickOnTheButtonOK() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_OK)).click();
		}
	 public void clickOnTheInputFieldPCalendar() {
		 wait.until(ExpectedConditions.elementToBeClickable(ddMMYY)).click();
		}
	 public void clickOnTheDDMMYY(){
		 wait.until(ExpectedConditions.elementToBeClickable(ddMMYY)).click();
		}
	 public void clickOnTheDDMMYY1(){
		 wait.until(ExpectedConditions.elementToBeClickable(ddMMYY)).click();
		}
	 public void clickOnTheDart() {
		 wait.until(ExpectedConditions.elementToBeClickable(dartElement)).click();
		}
	 public void clickOnTheChosenDate() {
		 wait.until(ExpectedConditions.elementToBeClickable(theChosenDataElement)).click();
		}
	 public void clickOnTheChosenDate1() {
		 wait.until(ExpectedConditions.elementToBeClickable(theChosenDataElement1)).click();
		}
	 public void clickOnTheChosenDate2() {
		 wait.until(ExpectedConditions.elementToBeClickable(theChosenDataElement2)).click();
		}
	 public void clickOnTheChosenDate3() {
		 wait.until(ExpectedConditions.elementToBeClickable(theChosenDataElement3)).click();
		}
	 public void clickOnTheButtonBookTicket() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_BookTicket)).click();
		}
	 public void clickOnTheButtonYes() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_Yes)).click();
		}
	 public void clickOnTheOptionThursdayAvailable() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_ThursdayAvailable)).click();
		}
	 public void clickOnTheOptionMonday() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_MonElement)).click();
		}
	 public void clickOnTheOptionA1() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_A1)).click();
		}
	 public void clickOnTheOptionSL() {
		 wait.until(ExpectedConditions.elementToBeClickable(option_SL)).click();
		}
	 public void clickOnTheRandomClick() {
		 wait.until(ExpectedConditions.elementToBeClickable(random_ClickElement)).click();
		}
	 public void clickOnTheButtonSearchSubmit() {
		 wait.until(ExpectedConditions.elementToBeClickable(button_Search)).click();
		}
	 public void clickOnTheCheckboxPersonWithDisability() {
		 wait.until(ExpectedConditions.elementToBeClickable(checkbox_PersonWithDisabilityConcession)).click();
		}
	 public void clickOnTheCheckboxFlexibility() {
		 wait.until(ExpectedConditions.elementToBeClickable(checkbox_FlexibleWithDate)).click();
		}
	 public void clickOnTheCheckboxWithAvailableBerth() {
		 wait.until(ExpectedConditions.elementToBeClickable(checkbox_TrainWithAvailableBerth)).click();
		}
	 public void clickOnTheCheckboxRailWayConcession() {
		 wait.until(ExpectedConditions.elementToBeClickable(checkbox_RailWayPassConcession)).click();
		}
	 public void clickOnTheMenuAllClasses() {
		 wait.until(ExpectedConditions.elementToBeClickable(allClassesMenu)).click();
		 wait.until(ExpectedConditions.elementToBeClickable(levelAC1)).click();

		}
	 public void clickOnTheMenuGeneralClasses() {
		 wait.until(ExpectedConditions.elementToBeClickable(generalMenuElement)).click();
		 wait.until(ExpectedConditions.elementToBeClickable(lowerCitizen)).click();

		}
	 public void clickOnTheButtonSignIn() {
		 wait.until(ExpectedConditions.elementToBeClickable(ButtonSignInO)).click();
		}
	 public void clickOnTheLinkSignInLoginPage() {
		 wait.until(ExpectedConditions.elementToBeClickable(link_SignIn)).click();
		}
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
	 public void clickOnTheOptionTrainMumbai() {
		 wait.until(ExpectedConditions.elementToBeClickable(option12321)).click();
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
	 public void verifyListButtonsSign() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[type=\"submit\"]"), 3));
		 list_Months.get(2).click();
	
		}
	 public void verifyListButtonsSignIn() {
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
	 public boolean verifyNegativeConfirmationMessage() {
		
		 wait.until(ExpectedConditions.visibilityOf(negativeConfirmationMessagElement));
		 	 return negativeConfirmationMessagElement.isDisplayed();
		}
	 public boolean verifyErrorMessage() {
		 wait.until(ExpectedConditions.visibilityOf(errorMessageElement));
		 	 return errorMessageElement.isDisplayed() || negativeConfirmationMessagElement.isDisplayed() || negativeConfirmationMessageNoElement.isDisplayed();
		}
	 public boolean verifyErrorMessage1() {
		 wait.until(ExpectedConditions.visibilityOf(negativeConfirmationMessagElement));
		 	 return errorMessageElement.isDisplayed() || negativeConfirmationMessagElement.isDisplayed();
		}
	 public boolean verifyInvalidMessage() {
		 wait.until(ExpectedConditions.visibilityOf(invalidMessageElement));
		 	 return invalidMessageElement.isDisplayed() || negativeConfirmationMessagElement.isDisplayed();
		}
	 public void clickListAllClasses() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#journeyClass > div"))).click();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ng-tns-c65-11.ng-star-inserted"), 16));
		 list_AllClasses.get(1).click();
	 }
	 public void clickListAllClasses1() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#journeyClass > div"))).click();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ng-tns-c65-11.ng-star-inserted"), 16));
		 list_AllClasses.get(6).click();
	 }
	 public void clickListAllClasses2() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#journeyClass > div"))).click();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ng-tns-c65-11.ng-star-inserted"), 16));
		 list_AllClasses.get(3).click();
	 }
	 public void clickListAllClasses3() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#journeyClass > div"))).click();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ng-tns-c65-11.ng-star-inserted"), 16));
		 list_AllClasses.get(4).click();
	 }
	 public void clickListGeneralClasses() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#journeyQuota > div"))).click();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ui-dropdown-item.ui-corner-all"), 5));
		 list_GeneralClasses.get(1).click();
	 }
	 public void clickListGeneralClasses2() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#journeyQuota > div"))).click();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ui-dropdown-item.ui-corner-all"), 5));
		 list_GeneralClasses.get(0).click();
	 }
	 public void clickListGeneralClasses3() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#journeyQuota > div"))).click();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ui-dropdown-item.ui-corner-all"), 5));
		 list_GeneralClasses.get(3).click();
	 }
	 public void clickListGeneralClasses4() {
		 wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#journeyQuota > div"))).click();
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ui-dropdown-item.ui-corner-all"), 5));
		 list_GeneralClasses.get(4).click();
	 }
	 public boolean verifyListOfCategories2() {
		 wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[role=\"tablist\"] li"), 3));
		 	 return categories_list.get(1).isEnabled();
		}
	 public boolean verifyConfirmationInfoMessage() {
		 wait.until(ExpectedConditions.visibilityOf(confirmation_MessageInfo));
		 	 return confirmation_MessageInfo.isDisplayed();
		}
	 public boolean verifyConfirmationInfoMessage1() {
		 wait.until(ExpectedConditions.visibilityOf(confirmation_MessageInfo));
		 	 return confirmation_MessageInfo.isDisplayed() || errorMessageElement.isDisplayed() || invalidMessageElement.isDisplayed();
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
	    public void verifyListDaysCalendar() {
			wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".ng-tns-c58-58.ng-star-inserted td"), 35));
			list_CalendarDaysElements.get(20).click();
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

	    
	

