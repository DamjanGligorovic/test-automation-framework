package projectPCPress;

import org.testng.annotations.DataProvider;

public class TestPCPressData {
	@DataProvider(name = "incorrectKolicinaData")
	public Object[][] incorrectEmail() {
	    return new Object[][] {
	    	
	        {"0"},
	        {"102"},
	        {"99"},
	        {"101"}
	      

	    };
	}

	}