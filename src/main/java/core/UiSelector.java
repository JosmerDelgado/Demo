package core;

/**
 * Created by Josmer Delgado on 25/3/2017.
 */
public class UiSelector {
    private String locator = "new UiSelector()";

    public UiSelector resourceId(String value) {
        locator += ".resourceId(\"" + value + "\")";
        return this;
    }

    public UiSelector className(String value) {
        locator += ".className(\"" + value + "\")";
       
        return this;
    }

    public UiSelector classNameMatches(String regex) {
        locator += ".classNameMatches(\"" + regex + "\")";
        return this;
    }

    public UiSelector text(String value) {
        locator += ".text(\"" + value + "\")";
        return this;
    }

    public UiSelector textConteins(String value) {
        locator += ".textConteins(\"" + value + "\")";
        return this;
    }

    public UiSelector index(int value) {
        locator += ".index(" + value + ")";
        return this;
    }

    public UiSelector clickable(Boolean value) {
        locator += ".clickable(" + value + ")";
        return this;
    }

    public UiSelector checked(Boolean value) {
        locator += ".checked(" + value + ")";
        return this;
    }

    public UiSelector enabled(Boolean value) {
        locator += ".enabled(" + value + ")";
        return this;
    }

    public UiSelector description(String value) {
        locator += ".description(\"" + value + "\")";
        return this;
    }

    public UiSelector descriptionConteins(String value) {
        locator += ".descriptionConteins(\"" + value + "\")";
        return this;
    }
    public UiSelector descriptionMatches(String regex) {
        locator += ".descriptionMatches(\"" + regex + "\")";
        return this;
    }
    public UiSelector xPath(String xPath) {
        locator =xPath;
        return this;
    }
    public UiObject makeUiObject(){
        return new UiObject(locator);
    }


}