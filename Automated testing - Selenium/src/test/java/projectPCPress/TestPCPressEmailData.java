package projectPCPress;

import org.testng.annotations.DataProvider;

public class TestPCPressEmailData {
	@DataProvider(name = "incorrectEmail")
	public Object[][] incorrectEmail() {
	    return new Object[][] {
	    	
	        {"damjangligorovic@.com"},
	        {"damjangligorovichotmail.com"},
	        {"@hotmail.com"},
	        {"damjangligorovic @"},
	        {"damjangligorovic@testing.hotmail.com"}
	        
	      

	    };
	}
}