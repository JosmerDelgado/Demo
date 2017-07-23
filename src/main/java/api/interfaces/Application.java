package api.interfaces;

/**
 * Created by josmer on 7/5/17.
 */
public interface Application {
    void forceStop();
    void clearData();
    Object open();
    String packageID();
    String activityID();
    Integer version();
}
