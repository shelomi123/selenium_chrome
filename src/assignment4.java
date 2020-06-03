import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment4 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//div[@id='content']/div/a")).click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parent = it.next();
		String child = it.next();

		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//body/div/h3")).getText());

		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

		/*
		 * ANSWER BY INSTRUCTOR
		 * 
		 * Set<String> abc=driver.getWindowHandles();
		 * 
		 * Iterator<String> it=abc.iterator();
		 * 
		 * String parentWindow=it.next();
		 * 
		 * driver.switchTo().window(it.next());
		 * 
		 * System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		 * 
		 * driver.switchTo().window(parentWindow);
		 * 
		 * System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")
		 * ).getText());
		 */

	}
}
