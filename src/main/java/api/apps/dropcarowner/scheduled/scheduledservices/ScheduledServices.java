package api.apps.dropcarowner.scheduled.scheduledservices;

import core.MyLogger;
import core.UiObject;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by josmer on 7/24/17.
 */
public class ScheduledServices {
    ScheduledServicesUiObjects uiObject =new ScheduledServicesUiObjects();




    public void waitNoScheduled(){
        try{
            MyLogger.log.info("Waiting to the load the No Scheduled Services Label");
            uiObject.noScheduled().waitToAppear(10);

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant find the No Scheduled Service Label activity failed to load/open");
        }
    }

    public void waitScheduled(){
        try{
            MyLogger.log.info("Waiting to the load the Scheduled Services Label");
            uiObject.container().waitToAppear(10);

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant find the Scheduled Service Label activity failed to load/open");
        }
    }
}
