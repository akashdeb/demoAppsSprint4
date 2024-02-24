package webElement.textbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	@Test
	public void demo() {
		int a = 123;
		int b = 456;
		//Hard Assert
		Assert.assertEquals(a, b);
		System.out.println("Pass");
	}
	
	
	@Test
	public void demo1() {
		int a = 123;
		int b = 456;
		//Soft Assert
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(a, b);
		sa.assertAll();
		System.out.println("Pass");
		
	}

}
