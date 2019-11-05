package demo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class NativeTest {
	
	WebDriver driver;
	
	@Test
	public void test1() throws MalformedURLException, InterruptedException {
		File app=new File(System.getProperty("user.dir")+"\\apks\\com.whatsapp_v2.18.129-452265_Android-4.0.3.apk");
				
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
//		cap.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);

		cap.setCapability("platformName", "Android");
			
		cap.setCapability("deviceName", "Ige-nexus_5x-00f00e029573bb95");
		
		cap.setCapability("platformVersion", "6.0.1");
		
		cap.setCapability("app", app.getAbsolutePath());
		
		cap.setCapability("appPackage", "com.whatsapp");
		cap.setCapability("appActivity", "com.whatsapp.Main");
		
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		
		 driver = new AndroidDriver(url, cap);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		


		}

	@After
	public void quit() throws InterruptedException {
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
