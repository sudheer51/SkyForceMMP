package patient.mmp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	
	@FindBy(how= How.ID,using="username")
	WebElement uname;
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String login(String u1,String p1)
	{
		//driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		//driver.findElement(By.id("username")).sendKeys(u1);
		uname.sendKeys(u1);
		
		driver.findElement(By.id("password")).sendKeys(p1);
		driver.findElement(By.name("submit")).click();
		String actual = driver.findElement(By.tagName("h3")).getText();
		
		
		return actual;
		
		//String expected =u1;
		//return actual.contains(expected);
	
	}
}
