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



/*	ANSWER
 * driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

        Select s=new Select(dropdown);

        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);

        driver.findElement(By.id("alertbtn")).click();

     String text=  driver.switchTo().alert().getText();

     if(text.contains(opt))

     {

    System.out.println("Alert message success");

     }

     else

    System.out.println("Something wrong with execution");

}

       

       

     //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   

       */
