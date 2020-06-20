import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calender {
	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(4000L);
		
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		
		WebElement month = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		
		
		//select August
		while(!month.getText().contains("August")) {
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		
		//Grab the common attribute Put it into a list Then iterate
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		//select 23
		for(int i=0; i<=dates.size();i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				//driver.findElement(By.xpath("//*[text()='23']")).click();
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}
}
