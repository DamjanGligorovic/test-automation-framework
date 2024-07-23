package projectPCPress;

import org.testng.annotations.DataProvider;

public class TestPCPressSubData {
		@DataProvider(name = "incorrectName")
		public Object[][] incorrectName() {
		    return new Object[][] {
		    	
		        {"Daki "},
		        {" Markovic"},
		        {""},
		        {"+!?23%/@#> .435sdsd"}
		      

		    };
		}
}