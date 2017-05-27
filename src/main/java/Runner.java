import core.MyLogger;
import core.UiSelector;
import org.apache.log4j.Level;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Josmer Delgado on 25/3/2017.
 */
public class Runner {
    public static void main (String[] args){

        MyLogger.log.setLevel(Level.DEBUG);
        MyLogger.log.debug("Mensaje Debug");
    }

}
