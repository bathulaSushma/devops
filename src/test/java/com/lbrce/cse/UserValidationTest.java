package com.lbrce.cse;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
	@Test
	public void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("", ""));
	}
	@Test
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("sushma", "sushma"));
	}
	@Test
	public void testCase3()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("srinu", "srinu@12345"));
	}
	@Test
	public void testCase4()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("SRINU", "SRINU@12345"));
	}
	@Test
	public void testCase5()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("srinu", "srinu212345"));
	}

}
