package core.managers;

import api.android.Android;
import core.ADB;
import core.MyLogger;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Josmer Delgado on 25/3/2017.
 */
public class DriverManager {

    private static HashMap<String,URL> hosts;
    private static String unlockPackage= "io.appium.unlock";
    private static String unlockActivity= "io.appium.unlock.Unlock";


    private static DesiredCapabilities getCaps(String deviceID){
        MyLogger.log.info("Creating driver caps to device: "+deviceID);
        DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName",deviceID);
            caps.setCapability("udid", deviceID);
            caps.setCapability("platformName","Android");
            caps.setCapability("Apps","/usr/local/lib/node_modules/appium" +
                    "/node_modules/appium-unlock/bin/unlock_apk-debug.apk");
            caps.setCapability("appPackage",unlockPackage);
            caps.setCapability("appActivity",unlockActivity);
        return caps;
    }

    private static URL host(String deviceID) throws MalformedURLException {
        if(hosts==null){
            hosts=new HashMap<>();
            hosts.put("02df1251d0237fd1",new URL("http://127.0.0.1:4723/wd/hub"));

        }return hosts.get(deviceID);

    }

    private static ArrayList<String> getAvailableDevices(){
        MyLogger.log.info("Checking for available devices conected");
        ArrayList<String> availableDevices = new ArrayList<>();
        ArrayList connectedDevices= ADB.getConnectedDevices();
        for (Object connectedDevice : connectedDevices){
            String device = connectedDevice.toString();
            ArrayList apps= new ADB(device).getInstalledPackages();
            if(!apps.contains(unlockPackage)) availableDevices.add(device);
            else MyLogger.log.info("Device "+device+" has already testing "+unlockPackage+" has installed");

        }
        if (availableDevices.size()==0) throw new RuntimeException("Not a single device available for testing at this time");
        else return availableDevices;

    }

    public static void createDriver() throws MalformedURLException {
        ArrayList<String> devices = getAvailableDevices();
        for (String device: devices){
            try {

                MyLogger.log.info("Try to create new Driver for device "+device);
                Android.driver = new AndroidDriver(host(device),getCaps(device));
                Android.adb = new ADB(device);
                break;
            }catch (Exception e){
                e.printStackTrace();
                //Ignore and try to the next one
            }
        }
    }

    public static void killDriver(){
        if(Android.driver!=null){
            MyLogger.log.info("Killing Android Driver");
            Android.driver.quit();
            Android.adb.uninstallApp(unlockPackage);
        }else MyLogger.log.info("Driver not Initialize, nothing to kill");
    }


}
