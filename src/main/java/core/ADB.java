package core;

import core.managers.ServerManager;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Josmer Delgado on 25/3/2017.
 */
public class ADB {
    private String ID;

    public ADB(String deviceID){
        ID = deviceID;
    }

    public static String command(String command){
        if(command.startsWith("adb")) command=command.replace("adb ", ServerManager.getAndroidHome()+"/platform-tools/adb ");
        else throw new RuntimeException("This Method is designed to ADB command only!");
        String output = ServerManager.runCommand(command);
        if(output==null) return "";
        else return output;
    }

    public static ArrayList getConnectedDevices(){
        ArrayList devices = new ArrayList();
        String output = command("adb devices");
        for(String line : output.split("\n")){
            line.trim();
            if(line.endsWith("device")) devices.add(line.replace("device","").trim());


        }
        return devices;
    }

    public String getForegroundActivity(){
        return command("adb -s "+ID+" shell dumpsys window windows | grep aCurrentFocus");
    }

    public String getAndroidVersionAsString(){
        String output= command("adb -s "+ID+" shell getprop ro.build.version.release");
        if(output.length()==3) output+=".0";
        return output;
    }

    public int getAndroidVersion(){
        return Integer.parseInt(getAndroidVersionAsString().replaceAll("\\.", ""));
    }

    public ArrayList getInstalledPackages(){
        ArrayList packages= new ArrayList();
        String[] output = command("adb -s "+ID+" shell pm list packages").split("\n");
        for(String packagesID : output) packages.add(packagesID.replace("package:","").trim());
        return packages;
    }

    public void openAppsActivity(String packageID, String activityID){
        command("adb -s "+ID+" shell am start -c api.intent.category.LAUNCHER -a api.android.intent.action.MAIN -n "+packageID+"/"+activityID);
    }

    public void clearAppsData(String packageID){
        command("adb -s "+ID+" shell pm clear "+packageID);
    }

    public void forceStopApp(String packageID){
        command("adb -s "+ID+" shell am start -c force-stop "+packageID);
    }
}
