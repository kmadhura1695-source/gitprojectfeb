package day1;

import org.testng.annotations.Test;

public class group {

	@Test(groups= {"smoke"})
	public void test1()
	{
		System.out.println("Test1 {\"smoke\"}");
	
	}
	
	@Test(groups= {"smoke","sanity"})
	public void test2()
	{
		System.out.println("Test 2 {\"smoke\",\"sanity\"}");
	}
	
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("test 3 {\"sanity\"");
	}
	
	@Test(groups= {"smoke", "regression"})
	public void test4()
	{
		System.out.println("test 4 {\"smoke\", \"regression\"}");
	}
	
	@Test(groups={"sanity", "regression"})
	public void test5()
	{
		System.out.println("test 5 {\"sanity\", \"regression\"}");
	}
	
	@Test(groups={"smoke", "regression"})
	public void test6()
	{
		System.out.println("test 6 {\"smoke\", \"regression\"}");
	}
	
	@Test(groups={"smoke", "regression","sanity"})
	public void test7()
	{
		System.out.println("test 7  {\"smoke\", \"regression\",\"sanity\"}");
	}
	
	
}
