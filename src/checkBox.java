import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class checkBox {
public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		WebElement a = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		
		//expect false , if the condition is false code continue
		Assert.assertFalse(a.isSelected());
		
		a.click();
		
		//System.out.println(a.isSelected());
		Assert.assertEquals(driver.findElements(By.cssSelector("[type='checkbox']")).size(), 6);
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
		
		//expect true , if the condition is true code continue
		Assert.assertTrue(a.isSelected());
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByIndex(6);
		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s2.selectByIndex(2);
		Select s3 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s3.selectByIndex(1);
	}
}
