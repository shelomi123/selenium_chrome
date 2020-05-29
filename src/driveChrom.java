import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driveChrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://facebook.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("email")).sendKeys("Hi Shelomi");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		//System.out.println(driver.getPageSource());
		
		//driver.navigate().to("http://yahoo.com");
		//driver.navigate().forward();
		//driver.navigate().back();
		
		//driver.close();
		//driver.quit();
		
		
	}

}
