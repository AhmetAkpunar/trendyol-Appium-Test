package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static AppiumDriver<MobileElement> appiumDriver;

    public static AppiumDriver getAppiumDriver() {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:0.0.0.0:4723/wd/hub");

        }catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver==null) {
            DesiredCapabilities caps = new DesiredCapabilities();
            //caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,ConfigReader.getProperty("automationName"));
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME,ConfigReader.getProperty("platformName"));
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,ConfigReader.getProperty("platformVersion"));
            //caps.setCapability(MobileCapabilityType.DEVICE_NAME,ConfigReader.getProperty("deviceName"));
            caps.setCapability("appPackage",ConfigReader.getProperty("appPackage"));
            caps.setCapability("appActivity",ConfigReader.getProperty("appActivity"));

            if (ConfigReader.getProperty("platformName").equals("Android")) {

                appiumDriver = new AndroidDriver<>(appiumServerURL,caps);
                appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }else {

                throw new UnsupportedOperationException("Invalid Platform Name " + ConfigReader.getProperty("platformName"));

            }
        }
        return appiumDriver;

    }

    public static void quitAppiumDriver(){
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }

    }


}
