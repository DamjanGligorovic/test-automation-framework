package projectSrbijaVoz;

import org.testng.annotations.DataProvider;

public class TestSrbijaVozData {

	public String incorrectEmailInput = "goranfe@@@@.comcom";
	@DataProvider(name = "incorrectEmailData")
	public Object[][] incorrectEmail() {
	    return new Object[][] {
	    	
	       	{"canko@gmail.c!m"},
	        {"@hotmail.com"},
	        {"larakrivokapic @"},
	        {"nadezda@example.co."},
	        {"tatjana@example!com"},
	        {"larakrivokapic.com"},
	        {incorrectEmailInput}

	    };
	}
	public String incorrectEmailInput() {
		// TODO Auto-generated method stub
		return incorrectEmailInput;
	}
}