package api.apps.dropcarowner.menu;

import core.UiObject;
import core.UiSelector;

/**
 * Created by josmer on 7/24/17.
 */
public class MenuUiObjects {
    private static UiObject
            map,
            scheduledServices,
            account,
            monthlySubscription,
            billingHistory,
            promotions,
            freeParking,
            help,
            signOut,
            back;

    public UiObject map(){
        if(map == null) map = new UiSelector().text("MAP").makeUiObject();
        return map;
    }

    public UiObject scheduledServices(){
        if(scheduledServices == null) scheduledServices = new UiSelector().text("SCHEDULED SERVICES").makeUiObject();
        return scheduledServices;
    }

    public UiObject account(){
        if(account == null) account = new UiSelector().text("ACCOUNT").makeUiObject();
        return account;
    }

    public UiObject monthlySubscription(){
        if(monthlySubscription == null) monthlySubscription = new UiSelector().text("MONTHLY SUBSCRIPTION").makeUiObject();
        return monthlySubscription;
    }

    public UiObject billingHistory(){
        if(billingHistory == null) billingHistory = new UiSelector().text("BILLING HISTORY").makeUiObject();
        return billingHistory;
    }

    public UiObject promotions(){
        if(promotions == null) promotions = new UiSelector().text("PROMOTIONS").makeUiObject();
        return promotions;
    }

    public UiObject freeParking(){
        if(freeParking == null) freeParking = new UiSelector().text("FREE PARKING").makeUiObject();
        return freeParking;
    }

    public UiObject help(){
        if(help == null) help = new UiSelector().text("HELP").makeUiObject();
        return help;
    }

    public UiObject signOut(){
        if(signOut == null) signOut = new UiSelector().text("SIGN OUT").makeUiObject();
        return signOut;
    }
    public UiObject back(){
        if(back == null) back = new UiSelector().className("android.widget.ImageButton").makeUiObject();
        return back;
    }
}
