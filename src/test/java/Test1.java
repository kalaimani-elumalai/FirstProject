import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	driver.manage().window().maximize();
    	Pojo p=new Pojo(driver);
 	    WebElement txtemail=p.getTextEmail();
 	    txtemail.sendKeys("user1");
//		l.get.sendKeys("user1");
    	//p.getTextEmail(txtemail1).sendKeys("user1");
//    	p.getPass().sendKeys("pass");
//    	p.getlogin().click();
//  
		WebElement txtPass=p.getPass();
		txtPass.sendKeys("pass");
//		txtPass.sendKeys("pass");
	}
	@Test
	public void test2() {
		System.out.println("2");
		
	}

	@Test
	public void test3() {
		System.out.println("3");
		
	}


}
