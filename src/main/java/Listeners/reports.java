package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.class)
public class reports {
	@Test
	void onstart() {
		System.out.println("test start");
	}
@Test
	void testskip() {
		System.out.println("skip");
	}
@Test
void failure() {
	System.out.println("Fail");
	Assert.assertTrue(false);
}
}
