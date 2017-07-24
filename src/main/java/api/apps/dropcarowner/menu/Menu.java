package api.apps.dropcarowner.menu;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by josmer on 7/21/17.
 */
public class Menu implements Activity {
    MenuUiObjects uiObject = new MenuUiObjects();
    @Override
    public Menu waitToLoad() {
        try{
            MyLogger.log.info("Waiting for main activity appear the main view");
            uiObject.map().waitToAppear(10);
            return Android.app.dropcar.menu;
        }catch(AssertionError e){
            throw new AssertionError("Main activity failed to load/open");
        }
    }

    public void tapMap(){
        try{
            MyLogger.log.info("Tapping on the Map Button");
            uiObject.map().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Map Button, element absent or blocked");
        }
    }

    public void tapScheduledServices(){
        try{
            MyLogger.log.info("Tapping on the Scheduled Services Button");
            uiObject.scheduledServices().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Scheduled Services  Button, element absent or blocked");
        }
    }

    public void tapAccount(){
        try{
            MyLogger.log.info("Tapping on the Account Button");
            uiObject.account().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Account Button, element absent or blocked");
        }
    }

    public void tapMonthlySubscription(){
        try{
            MyLogger.log.info("Tapping on the Monthly Subscription Button");
            uiObject.monthlySubscription().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Monthly Subscription Button, element absent or blocked");
        }
    }

    public void tapBillingHistory(){
        try{
            MyLogger.log.info("Tapping on the Billing History Button");
            uiObject.billingHistory().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Billing History Button, element absent or blocked");
        }
    }

    public void tapPromotions(){
        try{
            MyLogger.log.info("Tapping on the Promotions Button");
            uiObject.promotions().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Promotions Button, element absent or blocked");
        }
    }

    public void tapFreeParking(){
        try{
            MyLogger.log.info("Tapping on the Free Parking Button");
            uiObject.freeParking().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Free Parking Button, element absent or blocked");
        }
    }

    public void tapHelp(){
        try{
            MyLogger.log.info("Tapping on the Help Button");
            uiObject.help().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Help Button, element absent or blocked");
        }
    }

    public void tapSignOut(){
        try{
            MyLogger.log.info("Tapping on the Sign Out Button");
            uiObject.signOut().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Sign Out Button, element absent or blocked");
        }
    }

    public void tapBack(){
        try{
            MyLogger.log.info("Tapping on the Back Button");
            uiObject.back().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Back Button, element absent or blocked");
        }
    }
}
