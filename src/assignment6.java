import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignment6 {
	public static void main(String []args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//checkbox
		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
		String var = driver.findElement(By.xpath("//body/div[1]/div[4]/fieldset/label[2]")).getText();
		
		//System.out.println(var);
		
		//dropbox
		Select s = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
		s.selectByVisibleText(var);
		
		
		
		//enter option2
		driver.findElement(By.cssSelector("#name")).sendKeys(var);
		
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		
		
		if(driver.switchTo().alert().getText().contains(var)) {
			System.out.println("yes");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
		
		driver.switchTo().alert().accept();
		
	}
}
