package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class StartChrome {

@Test
public void test1() throws MalformedURLException, InterruptedException {
	System.out.println("hello");
	DesiredCapabilities cap = DesiredCapabilities.android();
	
	cap.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);

	cap.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Ige-nexus_5x-00f00e029573bb95");
	
	cap.setCapability(MobileCapabilityType.VERSION, "6.0.1");
	
	URL url = new URL("http://0.0.0.0:4723/wd/hub");
	
	WebDriver driver = new AndroidDriver(url,cap);
	
//	AppiumDriver<MobileElement> driver = new AppiumDriver<>(url,cap);
         

	driver.get("http://www.facebook.com");
	
	System.out.println("Title " + driver.getTitle());
	
	driver.findElement(By.name("email")).sendKeys("testName");
	
	driver.findElement(By.name("pass")).sendKeys("testPassword");
	
	driver.findElement(By.id("u_o_5")).click();
	
	Thread.sleep(5000);
	
	driver.quit();
	
	}
	
	

}
