import api.android.Android;
import api.apps.dropcar.DropCar;
import api.apps.dropcar.map.MapUiObjects;
import core.*;
import core.managers.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Level;

import java.net.MalformedURLException;

/**
 * Created by Josmer Delgado on 25/3/2017.
 */
public class Runner {
    public static void main (String[] args) throws MalformedURLException, InterruptedException {
       ///usr/local/lib/node_modules/appium/node_modules/appium-unlock/bin
        MyLogger.log.setLevel(Level.DEBUG);


        AndroidDriver driver = null;
        try{
            DriverManager.createDriver();
            DropCar dropcar = new DropCar();


            Android.adb.openAppsActivity(dropcar.packageID(),dropcar.activityID());
            MapUiObjects mapUiObjects = new MapUiObjects();
            mapUiObjects.menuButton().waitToAppear(30);
            dropcar.map.tapMenu();

            /*
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
            */

        }finally {
            if(driver!=null)DriverManager.killDriver();
        }

    }

}
