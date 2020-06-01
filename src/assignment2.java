import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignment2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		// calender
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		// dropbox
		// driver.findElement(By.id("Adults")).
		Select adult = new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("3");
		Select child = new Select(driver.findElement(By.id("Childrens")));
		child.selectByValue("2");
		Select infant = new Select(driver.findElement(By.id("Infants")));
		infant.selectByValue("3");

		// link
		driver.findElement(By.id("MoreOptionsLink")).click();

		driver.findElement(By.id("Class")).click();
		Select s = new Select(driver.findElement(By.id("Class")));
		s.selectByValue("Business");

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("abcd");

		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

		/*
		 * ANSWER //calender
		 * 
		 * driver.findElement(By.id("DepartDate")).click();
		 * 
		 * driver.findElement(By.
		 * cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click()
		 * ;
		 * 
		 * //dropbox
		 * 
		 * //driver.findElement(By.id("Adults")).
		 * 
		 * Select adult = new Select(driver.findElement(By.id("Adults")));
		 * 
		 * adult.selectByValue("3");
		 * 
		 * Select child = new Select(driver.findElement(By.id("Childrens")));
		 * 
		 * child.selectByValue("2");
		 * 
		 * Select infant = new Select(driver.findElement(By.id("Infants")));
		 * 
		 * infant.selectByValue("3"); g //link
		 * 
		 * driver.findElement(By.id("MoreOptionsLink")).click();
		 * 
		 * driver.findElement(By.id("Class")).click();
		 * 
		 * Select s = new Select(driver.findElement(By.id("Class")));
		 * 
		 * s.selectByValue("Business");
		 * 
		 * driver.findElement(By.id("AirlineAutocomplete")).sendKeys("abcd");
		 * 
		 * driver.findElement(By.id("SearchBtn")).click();
		 * 
		 * System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		 */
	}
}
