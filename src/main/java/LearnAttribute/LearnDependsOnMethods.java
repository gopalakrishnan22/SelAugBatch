package LearnAttribute;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {

	@Test(expectedExceptions = RuntimeException.class)
	public void createLead() {
		throw new RuntimeException();
		//System.out.println("I am in Create lead");
	}
	
	@Test(dependsOnMethods={"createLead"})
	public void editLead() {
		System.out.println("I am in Edit lead");
	}
	
	@Test(successPercentage = 70)
	public void deleteLead() {
		System.out.println("I am in Delete lead");
	}
	
	@Test(enabled = false)
	public void mergeLead() {
		System.out.println("I am in Merge lead");
	}







}
