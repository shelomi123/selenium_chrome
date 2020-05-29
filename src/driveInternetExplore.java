import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driveInternetExplore {
	 public static void main(String []args) {
		 
		 
		 System.setProperty("webdriver.ie.driver", "C:\\selenium\\IEDriverServer.exe");
		 WebDriver driver = new InternetExplorerDriver();
		 
		 driver.get("https://www.google.com/#spf=1590063546009");
		 System.out.println(driver.getTitle());
	 }
}
