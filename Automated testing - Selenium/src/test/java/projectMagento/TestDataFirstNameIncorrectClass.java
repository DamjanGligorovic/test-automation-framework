package projectMagento;

import org.testng.annotations.DataProvider;

public class TestDataFirstNameIncorrectClass {
	@DataProvider(name = "firstNameIncorrectInputs")
	public Object[][] incorrectFirstName() {
	    return new Object[][] {
	    	
	       
	        {"jovankan"},
	        {"ISABELLA"},
	        {"12345678"},
	       
	       
	       
	      

	    };
	}
}

