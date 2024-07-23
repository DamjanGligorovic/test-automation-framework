package projectMagento;

import org.testng.annotations.DataProvider;

public class TestDataPasswordClass {
	@DataProvider(name = "passwordIncorrectInputs")
	public Object[][] incorrectPassword() {
	    return new Object[][] {
	    	
	     
	        {"Example"},
	        {" Exampler1"},
	        {"Exampler1 "},
	        {"Exampler"},
	        {"example@r"},
	        {"EXAMPLE@"}
	        
	       
	      

	    };
	}
}