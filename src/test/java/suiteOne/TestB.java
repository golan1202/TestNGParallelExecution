package suiteOne;

import org.testng.annotations.Test;

import Base.BaseTest;

public class TestB extends BaseTest{
	@Test
	public void testB() throws InterruptedException {
		
		System.out.println("Starting B");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending B");
	
	}
}
