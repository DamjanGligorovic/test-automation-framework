package projectPCPress;

import org.testng.annotations.DataProvider;

public class TestPCPressTelefonData {
	
	@DataProvider(name = "incorrectTelefon")
	public Object[][] incorrectTelefonData() {
	    return new Object[][] {
	    	
	        {"23819292"},
	        {"24591903723"},
	        {""},
	        {"+!?$%^@#> .5sdsd"}
	      

	    };
	}
}