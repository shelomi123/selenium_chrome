import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sortTable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Initially not sorted. Click once sorted descending. Click again sorted ascending
		driver.findElement(By.xpath("//thead/tr/th[2]")).click();
		//driver.findElement(By.xpath("//thead/tr/th[2]")).click();
		
		
		List<WebElement> items = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		// CssSelector = tr td:nth-child(2)
		
		//first
		ArrayList<String> original = new ArrayList<String>();
		for(int i=0; i<items.size();i++) {
			original.add(items.get(i).getText());
		}
		
		//second
		ArrayList<String> copied = new ArrayList<String>();
		for(int j=0;j<original.size();j++) {
			copied.add(original.get(j));
		}
		//////////////////////////////////////////////////////ASCENDING
		Collections.sort(copied);
		///////////////////////////////////////////////////////DESCENDING
		Collections.reverse(copied);
		
		////////////////////////////////////////////////////////////////////
		for(String s:copied) {
			System.out.println(s);
		}
		System.out.println("*****************************");
		
		for(String s:original) {
			System.out.println(s);
		}
		
		//////////////////////////////////////////////////////////////////////////
		Assert.assertTrue(copied.equals(original));
		if(copied.equals(original)) {
			System.out.println("Initially sorted");
		}
		else {
			System.out.println("Initially not sorted");
		}
	}
}
