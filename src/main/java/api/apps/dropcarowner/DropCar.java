package api.apps.dropcarowner;

import api.android.Android;

import api.apps.dropcarowner.map.Map;
import api.apps.dropcarowner.menu.Menu;
import api.apps.dropcarowner.scheduled.Scheduled;
import api.interfaces.Application;

/**
 * Created by josmer on 7/21/17.
 */
public class DropCar implements Application {
    public Menu menu = new Menu();
    public Map map = new Map();
    public Scheduled schedule = new Scheduled();

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
        return "com.dropcarowner.owner";
    }

    @Override
    public String activityID() {
        return "com.dropcarowner.owner.initialFlow.StartActivity";//"com.dropcarowner.owner.mainFlow.MainActivity";//
    }

    @Override
    public Integer version() {
        return Android.adb.getAndroidVersion();
    }
}
