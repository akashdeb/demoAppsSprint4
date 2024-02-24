package webElement.textbox;

import org.testng.annotations.Test;

public class GroupExecution {
	
	@Test(groups = "smoke")
	public void test1()
	{
		System.out.println("This is smoke testing 1");
	}
	
	@Test(groups = "regression")
	public void test2()
	{
		System.out.println("This is regression testing 1");
	}
	
	@Test(groups = "smoke")
	public void test3()
	{
		System.out.println("This is smoke testing 2");
	}
	
	@Test(groups = "smoke")
	public void test4()
	{
		System.out.println("This is smoke testing 3");
	}
	
	@Test(groups = "regression")
	public void test5()
	{
		System.out.println("This is regression testing 2");
	}

}
