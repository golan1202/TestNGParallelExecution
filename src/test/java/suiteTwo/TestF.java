package suiteTwo;

import org.testng.annotations.Test;

import Base.BaseTest;

public class  TestF extends BaseTest{
	@Test
	public void testF() throws InterruptedException {
		
		System.out.println("Starting F");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending F");
	
	}
}
