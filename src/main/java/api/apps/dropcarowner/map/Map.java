package api.apps.dropcarowner.map;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by josmer on 7/21/17.
 */
public class Map implements Activity {
    public MapUiObjects uiObject = new MapUiObjects();

    public void tapMenu(){
        try{
            MyLogger.log.info("Tapping on the Menu Button");
            uiObject.menuButton().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Menu Button, element absent or blocked");
        }
    }

    public void tapMultiRequest(){
        try{
            MyLogger.log.info("Tapping on the MultiRequest Button");
            uiObject.multiScheduleButton().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap MultiRequest Button, element absent or blocked");
        }
    }

    public void tapMainButton(){
        try{
            MyLogger.log.info("Tapping on the Main Button");
            uiObject.mainButton().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Main Button, element absent or blocked");
        }
    }

    public String getTextMainButton(){
        try{
            MyLogger.log.info("Getting Text on the Main Button");
            return uiObject.mainButton().getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get text on Main Button, element absent or blocked");
        }
    }

    public void typeOnSearchLocationAddress(String str){
        try{
            MyLogger.log.info("Typing on Address Search TextBox");
            uiObject.searchLocationTextBox().typeText(str);

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant type on Address Search TextBox, element absent or blocked");
        }
    }

    public String getNextScheduledJob(){
        try{
            MyLogger.log.info("Get the text on the Next Scheduled Job Field");
            return uiObject.nextScheduledJob().getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get text on Next Scheduled Job Field, element absent or blocked");
        }
    }

    public void tapMyLocationButton(){
        try{
            MyLogger.log.info("Tapping on the My Location Button");
            uiObject.myLocationButton().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap at My Location Button, element absent or blocked");
        }
    }

    public String getTextCurrentCar(){
        try{
            MyLogger.log.info("Get the text on the Current Car Field");
            return uiObject.currentCar().getText();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get text on Current Car Job Field, element absent or blocked");
        }
    }



    @Override
    public Map waitToLoad() {
        try{
            MyLogger.log.info("Waiting for main activity appear the main view");
            uiObject.mainButton().waitToAppear(10);
            return Android.app.dropcar.map;
        }catch(AssertionError e){
            throw new AssertionError("Main activity failed to load/open");
        }
    }
}
