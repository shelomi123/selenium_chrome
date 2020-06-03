import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Window {
public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath("//footer/ul/li[1]")).click();
		System.out.println(driver.getTitle());
		
		//getting title of the child window
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		
		driver.switchTo().window(childid);
		
		System.out.println(driver.getTitle());
		
		//getting title of the parent window
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
	}
}
