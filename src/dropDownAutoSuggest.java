import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownAutoSuggest {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BEN");
		
		Thread.sleep(4000L);
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		//selenium can not get hidden elements but javascript can
		//Javascript DOM can extract hidden elements
		//because selenium cannot identify hidden elements - (Ajax implementation)
		//investigate the properties of object if it have any hidden text

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		
		int i=0;
		while(!text.equalsIgnoreCase("BENGALUgRU AIRPORT")) {
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			i++;
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				break;
			}
			
		}
		
		if(i>10) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found");
		}
	}
}
