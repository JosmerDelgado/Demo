package api.apps.dropcarowner.scheduled.container;

import core.UiObject;
import core.UiSelector;

/**
 * Created by josmer on 7/24/17.
 */
public class ContainerUiObjects {
    private static UiObject
    edit,cancel,time,location,copy,serviceType,serviceSubType;

    public UiObject edit(){
        if(edit == null) edit = new UiSelector().resourceId("com.dropcar.owner:id/edit").makeUiObject();
        return edit;
    }

    public UiObject cancel(){
        if(cancel == null) cancel = new UiSelector().resourceId("com.dropcar.owner:id/cancel").makeUiObject();
        return cancel;
    }

    public UiObject time(){
        if(time == null) time = new UiSelector().resourceId("com.dropcar.owner:id/time").makeUiObject();
        return time;
    }

    public UiObject location(){
        if(location == null) location = new UiSelector().resourceId("com.dropcar.owner:id/location").makeUiObject();
        return location;
    }

    public UiObject copy(){
        if(copy == null) copy = new UiSelector().resourceId("com.dropcar.owner:id/location").makeUiObject();
        return copy;
    }
    public UiObject serviceType(){
        if(serviceType == null) serviceType = new UiSelector().resourceId("com.dropcar.owner:id/teamLabel").makeUiObject();
        return serviceType;
    }

    public UiObject serviceSubType(){
        if(serviceSubType == null) serviceSubType = new UiSelector().resourceId("com.dropcar.owner:id/subtype").makeUiObject();
        return serviceSubType;
    }
}
