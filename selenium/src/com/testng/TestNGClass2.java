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
 
public class TestNGClass2 {
	
	@BeforeSuite
	public void beforeSuite2(){
		 System.out.println ("beforeSuite2 ستعمل قبل أن يتم استدعاء المجموعة التي تنتمي إليها. نحن ننتمي إلى نفس المجموعة وننفذ بترتيب xml");
	}
	@AfterSuite
	public void afterSuite2(){
		 System.out.println ("سوف يتم تشغيل afterSuite2 بعد تشغيل مجموعة الانتماء. نحن ننتمي إلى نفس الجناح ونُنفذ بترتيب xml");
	}
	
	@BeforeTest
	public void BeforeTest2(){
		 System.out.println ("beforeTest2 ستعمل قبل أن ينتمي الاختبار الحالي إلى. نحن ننتمي إلى نفس الاختبار سيتم تنفيذه بترتيب xml");
	}
	
	@AfterTest
	public void afterTest2(){
		 System.out.println ("سوف يتم تشغيل afterTest2 بعد أن ينتمي الاختبار الحالي إلى. وننتمي إلى نفس الاختبار الذي سيتم تنفيذه بترتيب xml");
	}
	
	@BeforeClass
	public void beforeClass2(){
		 System.out.println ("beforeClass2 ستعمل قبل class2 التي تنتمي إليها حاليًا") ;
	}
	
	@AfterClass
	public void afterClass2(){
		 System.out.println ("سيتم تشغيل afterClass2 بعد الفئة 2 التي ينتمي إليها حاليًا");
	}
	
	@BeforeGroups(groups="groupyyy")
	public void beforeGroupsYYY(){
		 System.out.println ("beforeGroupsYYY ستعمل قبل أن تسمى المجموعة المنتسبة");
	}
	
	@AfterGroups(groups="groupyyy")
	public void afterGroupsYYY(){
		 System.out.println ("afterGroupsYYY ستعمل بعد المجموعة التي تنتمي إليها");
	}
	
	@BeforeMethod
	public void beforeMethod2(){
		 System.out.println ("beforeMethod2 ستعمل قبل أن تسمى كل طريقة اختبار");
	}
	
	@AfterMethod
	public void afterMethod2(){
		 System.out.println ("afterMethod2 ستعمل بعد كل طريقة اختبار");
	}
	
	
	@Test(groups="groupxxx")
	public void test2001GroupXXX(){
		System.out.println("test2001-XXX Test Method");
	}
	
	@Test(groups="groupyyy")
	public void test2002GroupYYY(){
		System.out.println("test2002-YYY Test Method");
	}
}