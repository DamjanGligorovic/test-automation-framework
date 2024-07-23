package projectDemoBlaze;

import org.testng.annotations.DataProvider;

public class TestDataNameField {
	@DataProvider(name = "incorrectName")
	public Object[][] incorrectNameObjects() {
	    return new Object[][] {
	    	
	        {"A b"},
	        {"Damjan Jovanovic Markovic Lanovic Sekulic"},
	        {"483483438043"},
	        {"@#$%^&*()+"},
	        {"In the bustling city of New Haven, an innovative company named NovaTech was born. Established by the visionary entrepreneur, Elena Harper, NovaTech quickly became a pioneer in the field of renewable energy. With a dedicated team of engineers and scientists, the company developed cutting-edge solar panels that were not only highly efficient but also affordable. Their breakthrough technology garnered attention worldwide, leading to partnerships with governments and corporations aiming to achieve sustainable energy goals. Elena's relentless drive and commitment to innovation made NovaTech a symbol of progress, inspiring countless others to pursue their dreams in the ever-evolving landscape of technology."},
	        {" Damjan"},
	        {"Damjan "},
	        {"@Damjan"},
	        
	        
	      

	    };
	}
}

	
