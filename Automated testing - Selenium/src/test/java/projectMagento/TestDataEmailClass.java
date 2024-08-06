package projectMagento;

import org.testng.annotations.DataProvider;

public class TestDataEmailClass {
	@DataProvider(name = "emailIncorrectInputs")
	public Object[][] incorrectEmail() {
	    return new Object[][] {
	    	
	        
	        {"john.doeyahoo.com"},
	        {"eva.smith@gmail@.com"},
	        {"helena.raw @gmail.com"},
	        
	        
	        
	       
	      

	    };
	}
}
