import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignment1 {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement a = driver.findElement(By.id("checkBoxOption1"));
		a.click();
		Assert.assertTrue(a.isSelected());
		a.click();
		Assert.assertFalse(a.isSelected());
		
		//driver.findElement(By.xpath("//input[@type='checkbox']")).getSize();
		//
		//Assert.assertEquals(driver.findElement(By.cssSelector("[type='checkbox']")).getSize(),3);
		System.out.println(driver.findElement(By.cssSelector("[type='checkbox']")).getSize());
		
	}
}
