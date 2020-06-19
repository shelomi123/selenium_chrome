import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calender {
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//driver.findElementByXPath(".//*[@id='travel_date']").click();
		//driver.findElement(".//*[@id='travel_date']").click();

		driver.get("https://www.path2usa.com/travel-companions");
		
		//driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		//driver.findElement(By.cssSelector("#travel_date")).click();
		
		List<WebElement> a = driver.findElements(By.cssSelector(".day"));
		
		for(int i=0; i<=a.size();i++) {
			if(i==23) {
				a.get(i).click();
			}
		}
	}
}
