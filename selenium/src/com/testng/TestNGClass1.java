package com.testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class TestNGClass1 {	
	@BeforeSuite
	public void beforeSuite1(){
		 System.out.println ("beforeSuite1 It will run before the group it belongs to is called. ");
	}
	@AfterSuite
	public void afterSuite1(){
		 System.out.println (" will be launched after the child group is launched. ") ;
	}
	
	@BeforeTest
	public void BeforeTest1(){
		 System.out.println (" will run before the current test belongs to. ");
	}
	
	@AfterTest
	public void afterTest1(){
		 System.out.println (" will be run after the current test belongs to. ") ;
	}
	@BeforeClass
	public void beforeClass1(){
		 System.out.println (" will run before the class1 it currently belongs to") ;
	}
	
	@AfterClass
	public void afterClass1(){
		 System.out.println ("") ;
	}
	 // * This means that the commented method will be run first before all collection methods with id . are run groupsxxx * /
	@BeforeGroups(groups="groupxxx")
	public void beforeGroupsXXX(){
		 System.out.println ("beforeGroupsXXX You will work before the group to which the test belongs") ;
	}
	 // * This means that the commented method will run after all methods of the collection with the id have finished running groupxxx * /
	@AfterGroups(groups="groupxxx")
	public void afterGroupsXXX(){
		 System.out.println ("afterGroupsXXX You will work after the group to which this test belongs") ;
	}
	
	@BeforeMethod
	public void beforeMethod1(){
		 System.out.println ("beforeMethod1 It will run before each test method of the current class called") ;
	}
	
	@AfterMethod
	public void afterMethod1(){
		 System.out.println ("afterMethod1 It will run after each test method for the current class") ;
	}
	
	@Test(groups="groupxxx")
	public void test1001GroupXXX(){
		System.out.println("test1001-XXX Test Method");
	}
	
	@Test(groups="groupyyy")
	public void test1002GroupYYY(){
		System.out.println("test1002-YYY Test Method");
	}
}