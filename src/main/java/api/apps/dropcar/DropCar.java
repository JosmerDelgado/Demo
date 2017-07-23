package api.apps.dropcar;

import api.android.Android;

import api.apps.dropcar.map.Map;
import api.apps.dropcar.menu.Menu;
import api.interfaces.Application;

import java.beans.AppletInitializer;

/**
 * Created by josmer on 7/21/17.
 */
public class DropCar implements Application {
    public Menu menu = new Menu();
    public Map map = new Map();

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
        return "com.dropcar.owner";
    }

    @Override
    public String activityID() {
        return "com.dropcar.owner.initialFlow.StartActivity";
    }

    @Override
    public Integer version() {
        return Android.adb.getAndroidVersion();
    }
}
