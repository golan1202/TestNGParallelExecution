package suiteOne;

import org.testng.annotations.Test;

import Base.BaseTest;

public class TestC extends BaseTest{
	@Test
	public void testC() throws InterruptedException {
		
		System.out.println("Starting C");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending C");
	
	}
}
