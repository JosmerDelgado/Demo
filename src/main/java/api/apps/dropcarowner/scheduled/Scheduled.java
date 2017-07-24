package api.apps.dropcarowner.scheduled;

import api.android.Android;
import api.apps.dropcarowner.scheduled.history.History;
import api.interfaces.Activity;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;


/**
 * Created by josmer on 7/24/17.
 */
public class Scheduled implements Activity{
    ScheduledUiObjects uiObject = new ScheduledUiObjects();
    public History history = new History();
    @Override
    public Scheduled waitToLoad() {
        try{
            MyLogger.log.info("Waiting for No Schedule Label appear the main view");
            uiObject.scheduleNew().waitToAppear(10);
            return Android.app.dropcar.schedule;

        }catch(AssertionError e){
            throw new AssertionError("No Schedule Label activity failed to load/open");
        }
    }

    public void tapMenu(){
        try{
            MyLogger.log.info("Tapping on the Menu Button");
            uiObject.menu().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Menu Button, element absent or blocked");
        }
    }

    public void tapHistory(){
        try{
            MyLogger.log.info("Tapping on the History Button");
            uiObject.history().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap History Button, element absent or blocked");
        }
    }

    public void tapScheduledServices(){
        try{
            MyLogger.log.info("Tapping on the Schedule Service Button");
            uiObject.scheduledServices().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Schedule Service Button, element absent or blocked");
        }
    }

    public void tapAddScheduleService(){
        try{
            MyLogger.log.info("Tapping on the Schedule Service Button");
            uiObject.scheduleNew().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Schedule Service Button, element absent or blocked");
        }
    }



}
