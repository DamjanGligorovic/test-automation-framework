package projectSasomangeRegistrationPage;

import org.testng.annotations.DataProvider;

public class TestSasomangeData {
	@DataProvider(name = "incorrectSasomangePassword")
	public Object[][] incorrectPassword() {
	    return new Object[][] {
	    	
	        {"Abraka1"},
	        {"Abrakad12"},
	        {"larikanab"},
	        {"21493079649302"},
	        {"STIGMAN1"},
	        {""}
	        
	       
	       

	    };
	}
}

