package api.apps.dropcar.map;

import core.UiObject;
import core.UiSelector;

/**
 * Created by josmer on 7/21/17.
 */
public class MapUiObjects {
    private static UiObject
        mainButton,
        manuButton,
        nextScheduledJob,
        multiScheduleButton,
        searchLocationTextBox,
        addFavoriteLocation,
        removeFavoriteLocation,
        myLocationButton,
        currentCar;

    public UiObject mainButton(){
        if(mainButton == null) mainButton = new UiSelector().resourceId("com.dropcar.owner:id/centerActionsContainer").makeUiObject();
        return mainButton;
    }

    public UiObject menuButton(){
        if(manuButton == null) manuButton = new UiSelector().className("android.widget.ImageButton").makeUiObject();
        return manuButton;
    }

    public UiObject multiScheduleButton(){
        if(multiScheduleButton == null) multiScheduleButton = new UiSelector().resourceId("com.dropcar.owner:id/action_new_schedule").makeUiObject();
        return multiScheduleButton;
    }

    public UiObject searchLocationTextBox(){
        if(searchLocationTextBox == null) searchLocationTextBox = new UiSelector().resourceId("com.dropcar.owner:id/searchAddress").makeUiObject();
        return searchLocationTextBox;
    }

    public UiObject addFavoriteLocation(){
        if(addFavoriteLocation == null) addFavoriteLocation = new UiSelector().resourceId("com.dropcar.owner:id/notFavouriteStar").makeUiObject();
        return addFavoriteLocation;
    }

    public UiObject removeFavoriteLocation(){
        if(removeFavoriteLocation == null) removeFavoriteLocation = new UiSelector().resourceId("com.dropcar.owner:id/favouriteStar").makeUiObject();
        return removeFavoriteLocation;
    }

    public UiObject myLocationButton(){
        if(myLocationButton == null) myLocationButton = new UiSelector().resourceId("com.dropcar.owner:id/btnLocalizarme").makeUiObject();
        return myLocationButton;
    }

    public UiObject currentCar(){
        if(currentCar == null) currentCar = new UiSelector().resourceId("com.dropcar.owner:id/car_data").makeUiObject();
        return currentCar;
    }

    public UiObject nextScheduledJob(){
        if(nextScheduledJob == null) nextScheduledJob = new UiSelector().resourceId("com.dropcar.owner:id/details").makeUiObject();
        return nextScheduledJob;
    }

}
