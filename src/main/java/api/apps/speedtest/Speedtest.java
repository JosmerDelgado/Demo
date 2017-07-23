package api.apps.speedtest;

import api.android.Android;
import api.apps.speedtest.menu.Menu;
import api.interfaces.Application;

/**
 * Created by josmer on 7/5/17.
 */
public class Speedtest implements Application {

    public Menu menu = new Menu();

    @Override
    public void forceStop() {
        Android.adb.forceStopApp(packageID());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    @Override
    public Object open() {
        Android.adb.openAppsActivity(packageID(), activityID());
        return null;
    }

    @Override
    public String packageID() {
        return "org.zwanoo.android.speedtest";
    }

    @Override
    public String activityID() {
        return "com.ookla.speedtest.softfacade.MainActivity";
    }

    @Override
    public Integer version() {
        return Android.adb.getAndroidVersion();
    }
}
