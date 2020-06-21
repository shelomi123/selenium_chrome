package mobileTestAutomation;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class appium {

	public static void main(String[] args) {

		DesiredCapabilities cap = new DesiredCapabilities(); 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DEMO");
		cap.setCapability(MobileCapabilityType.APP, "");

	}

}
