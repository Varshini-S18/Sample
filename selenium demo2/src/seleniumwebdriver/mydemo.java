package seleniumwebdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mydemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Swamynathan\\Downloads\\Downloads\\Extensions\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		WebElement username = driver.findElement(By.name("userName"));
		if(username.isEnabled())
		{
			username.clear();
			username.sendKeys("sunil");
		}
		if(username.isDisplayed())
		{
			WebElement pwd = driver.findElement(By.name("password"));
			pwd.clear();
			pwd.sendKeys("sunil");
			driver.findElement(By.name("submit")).click();
			Thread.sleep(3000);
			driver.navigate().to("http://demo.guru99.com/test/newtours/reservation.php");
			driver.findElement(By.xpath("//input[@value='oneway']")).click();
	    }
		else
		{
			System.out.println("Not displayed");
		}
	}
}
