package api.apps.dropcarowner.scheduled.scheduledservices;

import core.UiObject;
import core.UiSelector;

/**
 * Created by josmer on 7/24/17.
 */
public class ScheduledServicesUiObjects {
    private static UiObject
            container,
            serviceType,
            serviceSubType,
            edit,
            cancel,
            time,
            location,
            noScheduled;

    public UiObject container(){
        if(container == null) container = new UiSelector().resourceId("com.dropcar.owner:id/container").makeUiObject();
        return container;
    }



    public UiObject noScheduled(){
        if(noScheduled == null) noScheduled = new UiSelector().resourceId("com.dropcar.owner:id/noJobsLabel").makeUiObject();
        return noScheduled;
    }
}
