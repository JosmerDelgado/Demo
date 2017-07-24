package api.apps.dropcarowner.scheduled.container;

import api.android.Android;
import api.apps.dropcarowner.scheduled.Scheduled;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by josmer on 7/24/17.
 */
public class Container implements Activity {
    ContainerUiObjects uiObject = new ContainerUiObjects();

    public void tapEdit(){
        try{
            MyLogger.log.info("Tapping on the Edit Button");
            uiObject.edit().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Edit Button, element absent or blocked");
        }
    }

    public void tapCancel(){
        try{
            MyLogger.log.info("Tapping on the Cancel Button");
            uiObject.cancel().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Cancel Button, element absent or blocked");
        }
    }

    public String getTextServiceType(){
        try{
            MyLogger.log.info("Get Text from Service Type Field");
            return uiObject.serviceType().getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Text from Service Type Field, element absent or blocked");
        }
    }

    public String getTextServiceSubType(){
        try{
            MyLogger.log.info("Get Text from Service SubType Field");
            return uiObject.serviceSubType().getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Text from Service SubType Field, element absent or blocked");
        }
    }

    public String getTime(){
        try{
            MyLogger.log.info("Get Text from Time Field");
            return uiObject.time().getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Text from Time Field, element absent or blocked");
        }
    }

    public String getLocation(){
        try{
            MyLogger.log.info("Get Text from Location Field");
            return uiObject.location().getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Text from Time Field, element absent or blocked");
        }
    }
    public void tapCopy(){
        try{
            MyLogger.log.info("Tapping on the Copy Button");
            uiObject.copy().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Copy Button, element absent or blocked");
        }
    }

    @Override
    public Scheduled waitToLoad() {
        try{
            MyLogger.log.info("Waiting for No Schedule Label appear the main view");
            uiObject.time().waitToAppear(10);
            return Android.app.dropcar.schedule;

        }catch(AssertionError e){
            throw new AssertionError("No Schedule Label activity failed to load/open");
        }
    }
}
