package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listen.class)
public class report {
	@Test
	void test1() {
		
		System.out.println("1");
		
	}

	@Test
	void test2() {
		
		System.out.println("2");
		
	}

@Test
void test3() {
	
	System.out.println("3");
	Assert.assertTrue(false);
	Reporter.log("test3",true);
}
}