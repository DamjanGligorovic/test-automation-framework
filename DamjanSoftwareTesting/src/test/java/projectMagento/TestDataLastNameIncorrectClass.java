package projectMagento;

import org.testng.annotations.DataProvider;

public class TestDataLastNameIncorrectClass {
	@DataProvider(name = "lastNameIncorrectInputs")
	public Object[][] incorrectLastName() {
	    return new Object[][] {
	    	
	        {""},
	        {"markovic"},
	        {"STEFANOVIC"},
	        {"@Jovanovic"},
	        {"12345678"},
	        {"#$%^&((!markovicS"},
	        
	       
	      

	    };
	}
}
