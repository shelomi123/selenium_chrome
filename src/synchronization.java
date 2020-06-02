import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Explicit wait
		WebDriverWait d = new WebDriverWait(driver,5);
		
		String vegesNeeded[] = { "Cucumber", "Beetroot" };
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		addItems(driver, vegesNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		//Explicit wait
		d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoCode")));
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		//Explicit Wait
		d.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("..promoInfo")));
		
		//driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
	}
	
	
	
	public static void addItems(WebDriver driver, String vegesNeeded[]) {
		
		int j=0;
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// should convert array into List cuz contains support for List
			// Initially we did not implement arraylist to save memory
			List vegeList = Arrays.asList(vegesNeeded);

			
			if (vegeList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == vegesNeeded.length)
					break;
			}
		}
	}
	
}
