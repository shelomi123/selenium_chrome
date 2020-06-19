import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment7 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.cssSelector("#product"));
		int rows = table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		int cols = table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();

		System.out.println(rows);
		System.out.println(cols);
		System.out.println(table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());
	}
}

/* ANSWER

driver.get("http://qaclickacademy.com/practice.php");

WebElement table=driver.findElement(By.id("product"));

System.out.println(table.findElements(By.tagName("tr")).size());

System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

System.out.println(secondrow.get(0).getText());

System.out.println(secondrow.get(1).getText());
System.out.println(secondrow.get(2).getText());
*/