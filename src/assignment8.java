import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment8 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(4000L);
		
		//Javascript 
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		

		int i = 0;
		
		while (!text.equalsIgnoreCase("India")) {
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			i++;
			script = "return document.getElementById(\"autocomplete\").value;";
			text = (String) js.executeScript(script);
			//System.out.println(text);
			if (i > 10) {
				break;
			}

		}

		if (i > 10) {
			System.out.println("Element "+text+" not found");
		} else {
			System.out.println("Element " +text+"  found");
		}

	}
}
