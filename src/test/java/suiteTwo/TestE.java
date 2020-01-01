package suiteTwo;

import org.testng.annotations.Test;

import Base.BaseTest;

public class TestE extends BaseTest{
	@Test
	public void testE() throws InterruptedException {
		
		System.out.println("Starting E");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending E");
	
	}
}
