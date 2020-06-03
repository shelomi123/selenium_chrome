import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment5 {
public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[2]")));
		
		System.out.println(driver.findElement(By.xpath("//body/div")).getText());
		
		
		
		
	}
}
