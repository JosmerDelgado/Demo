package core.managers;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by josmer on 5/25/17.
 */
public class ServerManager {
    private static String OS;
    private static String ANDROID_HOME;

    public static String getAndroidHome() {
        if (ANDROID_HOME==null) {
            ANDROID_HOME = System.getenv("ANDROID_HOME");
            if(ANDROID_HOME==null)
                throw new RuntimeException("Failed to find ANDROID_HOME, make sure the environment varialbe is set");
        }
        return ANDROID_HOME;
    }
    public static String getOS(){
        if(OS==null) OS = System.getenv("os.name");
        return OS;
    }

    public static Boolean isWindows(){
        return getOS().contains("Windows");
    }

    public static Boolean isMac(){
        return getOS().contains("Mac");
    }

    public static String runCommand(String command){
        String output=null;
        try{
            Scanner scanner = new Scanner(Runtime.getRuntime().exec(command).getInputStream()).useDelimiter("\\A");
            if(scanner.hasNext()) output=scanner.next();
        }catch (IOException e){
            throw new RuntimeException(e.getMessage());

        }
        return output;
    }
}
