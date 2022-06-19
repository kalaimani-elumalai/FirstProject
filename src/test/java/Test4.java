import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test4 {

	@Test
	public void abi() {
		System.out.println("tc3");//1
	}
  
	@AfterClass
	public static void afterClassTest() {
		System.out.println("afterclassTest");
	}

	@Test
	public void sar() {
		System.out.println("tc2");//3
	}
    @Test
    public void ani() {
    	System.out.println("tc1");//2
    	
    }
	@Before
	public void beforTest() {
		System.out.println("before");
	}
	@After
	public void afterTest() {
		System.out.println("after");
	}
	
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("beforeclassTest");
	}
	
	
}
