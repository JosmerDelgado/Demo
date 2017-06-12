import api.android.Android;
import core.ADB;
import core.MyLogger;
import core.UiObject;
import core.UiSelector;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Level;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Josmer Delgado on 25/3/2017.
 */
public class Runner {
    public static void main (String[] args) throws MalformedURLException, InterruptedException {
       ///usr/local/lib/node_modules/appium/node_modules/appium-unlock/bin
        MyLogger.log.setLevel(Level.DEBUG);
        AndroidDriver driver = null;
        try{
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","192.168.68.101:5555");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("app","/usr/local/lib/node_modules/appium" +
                    "/node_modules/appium-unlock/bin/unlock_apk-debug.apk");
            capabilities.setCapability("appPackage","io.appium.unlock");
            capabilities.setCapability("appActivity","io.appium.unlock.Unlock");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
            Android.driver =driver;

            ADB adb = new ADB("02df1251d0237fd1");
            adb.openAppsActivity("org.zwanoo.android.speedtest","com.ookla.speedtest.softfacade.MainActivity");


            UiObject testAgainButton = new UiSelector().resourceId("org.zwanoo.android.speedtest:id/o2_button_text").makeUiObject();
            UiObject ping = new UiSelector().resourceId("org.zwanoo.android.speedtest:id/pingSpeed").makeUiObject();
            UiObject download = new UiSelector().resourceId("org.zwanoo.android.speedtest:id/downloadSpeed").makeUiObject();
            UiObject upload = new UiSelector().resourceId("org.zwanoo.android.speedtest:id/uploadSpeed").makeUiObject();

            testAgainButton.waitToAppear(120);
            testAgainButton.tap();
            testAgainButton.waitToDisappear(20);
            testAgainButton.waitToAppear(200);

            MyLogger.log.info("Ping: " + ping.getText() );
            MyLogger.log.info("Download: " + download.getText() );
            MyLogger.log.info("Upload: " + upload.getText() );
        }finally {
            if(driver!=null)driver.quit();
        }



    }

}
