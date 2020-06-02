import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3 {
public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
		
		WebDriverWait d = new WebDriverWait(driver, 8);
		d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#results")));
		System.out.println(driver.findElement(By.cssSelector("#results")).getText());
		//driver.findElement(By.cssSelector("#results")).getText();
		
		
	}
}

//     //a[@href='javascript: void(0);loadAjax();']
//     #results