package week1.day1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {	
	
	
	
	@Parameters({"jgn","Gopi"})
	@Test
	public void sample(int name, String test){
		
		System.out.println(name);
		System.out.println(test);
		
	}

}
