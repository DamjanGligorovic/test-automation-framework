package projectMagento;

import org.testng.annotations.DataProvider;

public class TestDataFirstNameClass {
	@DataProvider(name = "firstName")
	public Object[][] correctFirstName() {
	    return new Object[][] {
	    	
	        {"Damjan"},
	        {"A b"},
	        {"John Smith Doe Johnson"}
	       
	      

	    };
	}
}
