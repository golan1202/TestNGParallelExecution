package suiteTwo;

import org.testng.annotations.Test;

import Base.BaseTest;

public class TestD extends BaseTest{
	@Test
	public void testD() throws InterruptedException {
		
		System.out.println("Starting D");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending D");
	
	}
}
