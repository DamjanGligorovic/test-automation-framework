package projectSasomangeRegistrationPage;

import org.testng.annotations.DataProvider;

public class TestSasomangeEmailData {
	@DataProvider(name = "incorrectSasomangeEmail")
	public Object[][] incorrectPassword() {
	    return new Object[][] {
	    	
	        {"john.doeyahoo.com"},
	        {"eva.smith@gmail@.com"},
	        {"helena.raw @gmail.com"},
	        {""}
	        
	       
	       

	    };
	}
}