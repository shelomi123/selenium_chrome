//import java.awt.List;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cartArray {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String vegesNeeded[]= {"Cucumber","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000L);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size();i++) {
			//dfd
			
			String[] name= products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			//should convert array into List cuz contains support for List
			//Initially  we did not implement arraylist to save memory
			List vegeList = Arrays.asList(vegesNeeded);
			
			int j=0;
			if(vegeList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==vegesNeeded.length)
					break;
			}
		}

	}
}
