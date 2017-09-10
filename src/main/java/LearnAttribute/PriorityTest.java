package LearnAttribute;

import org.testng.annotations.Test;

public class PriorityTest {
  
	@Test(priority = 2)
  public void f1() {
	  System.out.println("I am in f1");
  }
  
  @Test(priority = 4)
  public void c2() {
	  System.out.println("I am in c2");
  }
  
  @Test(priority =-3)
  public void f3() {
	  System.out.println("I am in f3");
  }
  
  @Test(priority = -3)
  public void f4() {
	  System.out.println("I am in f4");
  }  
}
