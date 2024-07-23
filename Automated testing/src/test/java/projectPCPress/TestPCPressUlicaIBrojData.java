package projectPCPress;

import org.testng.annotations.DataProvider;

public class TestPCPressUlicaIBrojData {
	@DataProvider(name = "incorrectUlicaIBroj")
	public Object[][] incorrectUlicaIBroj() {
	    return new Object[][] {
	    	
	        {"Obrenoviceva "},
	        {" 21"},
	        {""},
	        {"+%>/@#> .5sdsd"}
	      

	    };
	}
}