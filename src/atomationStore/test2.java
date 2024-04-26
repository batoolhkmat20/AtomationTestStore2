package atomationStore;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void sutup() {
		driver.get("https://automationteststore.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	@Test(priority = 1)
	public void login() {
	
		driver.get("https://automationteststore.com/index.php?rt=account/login");
		driver.findElement(By.cssSelector(".contentpanel"));
		WebElement usern =driver.findElement(By.cssSelector("#loginFrm_loginname"));
		usern.sendKeys("batool205");
		WebElement pasword =driver.findElement(By.cssSelector("#loginFrm_password"));
		pasword.sendKeys("batool@205");
		WebElement login1 =driver.findElement(By.cssSelector("button[title='Login']"));
		login1.click();
//		WebElement aa =driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]"));
//String aual=aa.getText();
//String apeted="MY ACCOUNT";
//Assert.assertEquals(aual, apeted);
}
	@Test(priority = 2)
	public void changPassword() throws InterruptedException {
		WebElement All=driver.findElement(By.cssSelector(".nav-dash"));

		WebElement chang=driver.findElement(By.cssSelector("a[data-toggle=\"tooltip\"][href=\"https://automationteststore.com/index.php?rt=account/password\"]"));
chang.click();
		WebElement curruntpasswprd=driver.findElement(By.cssSelector("#PasswordFrm_current_password"))	;
curruntpasswprd.sendKeys("batool@205");
Thread.sleep(3000);
WebElement newpassword=driver.findElement(By.cssSelector("#PasswordFrm_password"))	;
newpassword.sendKeys("batool@2005");
WebElement passwordcongirm=driver.findElement(By.cssSelector("#PasswordFrm_confirm"))	;
passwordcongirm.sendKeys("batool@2005");
WebElement Continue=driver.findElement(By.cssSelector("button[title=\"Continue\"]"));
Continue.click();
	
	
	}
	
	
	@AfterTest
	public void enftest() {
	}}

