import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo {
	
public Pojo(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}
	
@FindBy(id="email")
private WebElement txtmail;

@CacheLookup
@FindAll({
	@FindBy(id="pass"),
	@FindBy(name="passwor")
})
private WebElement txtpass;

@FindBy(id="login")
private WebElement btnlogin;

public WebElement getTextEmail() {
	return txtmail;
}

public WebElement getPass() {
	return txtpass;
}

public WebElement getlogin() {
	return btnlogin;
}



}



