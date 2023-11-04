package com.lbrce.cse;

import org.testng.Assert;
import org.testng.annotations.Test;

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
			Assert.assertEquals(false,uv.check("hi", "hi@12345"));
		}
		@Test
		public void testCase3()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(false,uv.check("hello", "hello@12345"));
		}
		@Test
		public void testCase4()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(false,uv.check("what", "what@12345"));
		}
		@Test
		public void testCase5()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(true,uv.check("sushma", "sushma"));
		}


}
