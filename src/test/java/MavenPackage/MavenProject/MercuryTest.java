package MavenPackage.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MercuryTest {
	WebDriver driver;

	@BeforeSuite
	public void openbrowser() {

		System.out.println("Hellow we are test gitHub");

		System.setProperty("webdriver.chrome.driver", "D://Advance Selenium Softwares1 (2)//chromedriver.exe");
		driver = new ChromeDriver();

	}

	@BeforeClass
	public void OpenUrl() {

		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void validLogin() {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("deepalithorat23@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Deepali");

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}

	
	@AfterSuite
	public void ClosweBrowser()
	{
		driver.close();
	}
}
