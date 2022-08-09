package W10;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class W10 {
	@Test
	public void simpleTest1(){
		System.out.println("simpleTest1");
	}
	
	@Test
	public void simpleTest2(){
		System.out.println("simpleTest2");
	}
	
	@BeforeSuite
	public void beforeSuiteExample(){
		System.out.println("beforeSuite");
	}
	
	@BeforeTest
	public void beforeTestExample(){
		System.out.println("beforeTest");
	}
}