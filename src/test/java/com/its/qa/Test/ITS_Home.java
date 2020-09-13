package com.its.qa.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ITS_Home {


//--------------------------------------------------------------------------------
		@BeforeTest
		public void EnvironmentSetUp(){
			
//			createHTMLReport("Principal_Login_Verification.html", "Principal Login Page - Verification");
			}	
//-------------------------------------------------------------------------------		
		@BeforeMethod
		public void SetUp() throws InterruptedException{

		}
	
//=========================================================================
		@Test (priority = 1, enabled = true, invocationCount = 1)
		public void validate_ITS_Home_Test1(){
			System.out.println("--------------------------------------");
			System.out.println("validate_ITS_Home_Test1 - validate_ITS_Home_Test1");
			System.out.println("ITS_Home - This is Runninbg from GIT Hub");
			
			long id = Thread.currentThread().getId();
	        System.out.println("validate_ITS_Home_Test1->>Thread id is: " + id);
		}

		@Test (priority = 11, enabled = true, invocationCount = 1)
		public void validate_ITS_Home_Test2(){
			System.out.println("--------------------------------------");
			System.out.println("validate_ITS_Home_Test2 - validate_ITS_Home_Test2");
			System.out.println("ITS_Home - This is Runninbg from GIT Hub");
			
			long id = Thread.currentThread().getId();
	        System.out.println("validate_ITS_Home_Test2->>Thread id is: " + id);
		}

		@Test (priority = 21, enabled = true, invocationCount = 1)
		public void validate_ITS_Home_Test3(){
			System.out.println("--------------------------------------");
			System.out.println("validate_ITS_Home_Test3 - validate_ITS_Home_Test3");
			System.out.println("ITS_Home - This is Runninbg from GIT Hub");
			
			long id = Thread.currentThread().getId();
	        System.out.println("validate_ITS_Home_Test3->>Thread id is: " + id);
		}
		
		
		
//==================================================================	
	@AfterMethod
	public void ClosetheBroser(){
//		driver.quit();
		System.out.println("Test Case RAN and Browser has been Closed");	
	}
//------------------------------------------------------------------------	
	@AfterTest
	public void TestCompleted(){
//	testCompletedAndCloseReport();
	System.out.println("Done");	
	}	
	
	
}
