package api.apps.dropcarowner.scheduled.history;

import core.UiObject;
import core.UiSelector;

/**
 * Created by josmer on 7/24/17.
 */
public class HistoryUiObjects {
    private static UiObject
            noJobs,
            container;

    public UiObject container(){
        if(container == null) container = new UiSelector().resourceId("com.dropcar.owner:id/container").makeUiObject();
        return container;
    }

    public UiObject noScheduledJobs(){
        if(noJobs == null) noJobs = new UiSelector().resourceId("com.dropcar.owner:id/noJobsLabel").makeUiObject();
        return noJobs;
    }

}
