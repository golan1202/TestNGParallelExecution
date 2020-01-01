package suiteOne;

import org.testng.annotations.Test;

import Base.BaseTest;

public class TestA extends BaseTest {
	@Test
	public void testA() throws InterruptedException {
		
		System.out.println("Starting A");
		openBrowser("chrome");
		Thread.sleep(5000);
		System.out.println("Ending A");
	
	}
}
