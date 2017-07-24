package api.apps.dropcarowner.scheduled;

import core.UiObject;
import core.UiSelector;

/**
 * Created by josmer on 7/24/17.
 */
public class ScheduledUiObjects {
    private static UiObject
        noScheduled,
        scheduledServices,
        history,
        menu,
        scheduleNew;


    public UiObject scheduledServices(){
        if(scheduledServices == null) scheduledServices = new UiSelector().text("SCHEDULED SERVICES").makeUiObject();
        return scheduledServices;
    }

    public UiObject history(){
        if(history == null) history = new UiSelector().text("HISTORY").makeUiObject();
        return history;
    }

    public UiObject menu(){
        if(menu == null) menu = new UiSelector().className("android.widget.ImageButton").makeUiObject();
        return menu;
    }

    public UiObject scheduleNew(){
        if(scheduleNew == null) scheduleNew = new UiSelector().resourceId("com.dropcar.owner:id/addContainer").makeUiObject();
        return scheduleNew;
    }

}
