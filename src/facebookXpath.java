import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookXpath {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://facebook.com/login");
		
		//Syntax of xpath = "//tagname[@attribute='value']"
		//Xpath regular expression= //tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shelomi");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		//Synatax of cssSelector = "tagname[attribute='value']"   or   "tagname#id"   or "tagname.classname"
		//CssSelector regular expression= tagname[attribute*='value']
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abcd");
	}

}
//Notes

/*
	Relative Xpath=  Does not depend on parent nodes.. This way is good cuz it directly jumps
	Absolute Xpath=  ex:  //section/div/div/ul/li[2]
						  //div[@class='list-c']/div/div[2]/input 
						   
	Identify ur sibling = //*[@id='tablist1-tab1']/following-sibling::li[1]
	
	Go back to parent from child = //*[@id='tablist1-tab1']/parent::ul   This is only in Xpath. Cant in cssSelector
	
	Xpath using text = //*[@text()=' Selenium ']
	
*/