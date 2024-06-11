package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.google.cloud.storage.Acl;
import io.cucumber.java.en.When;
import lippia.web.constants.Constants;
import org.testng.Assert;

public class AddWorkTimeService extends ActionManager {
    public static void clickTimeTracker(){
        click(Constants.TIMETRACKER_BUTTON);
    }

    public static void clickTimer(){
        click(Constants.TIMER_BUTTON);
    }

    public static void setDescription(String name) {
        setInput(Constants.TIME_ENTRY_DESCRIPTION_INPUT, name);
    }

    public static void clickStartButton(){
        click(Constants.START_STOP_DIV);
    }

    public static void clickStopButton(){
        WebActionManager.waitClickable(Constants.STOP_BUTTON);
        click(Constants.START_STOP_DIV);
    }

    public static void checkTimeEntry(String name){
        WebActionManager.waitVisibility(Constants.TIME_ENTRY_CREATED, name);
        Assert.assertTrue(WebActionManager.isPresent(Constants.TIME_ENTRY_CREATED, name));
    }

    public static void clickManual(){
        click(Constants.MANUAL_BUTTON);
    }

  /*  public static void setWorkedTime(String num) {
        setInput(Constants.DURATION_INPUT, num);
    } */

    public static void clickAdd(){
        click(Constants.ADD_BUTTON);
    }

    public static void setStartTime(String time){
        Utilities.deletePlaceholder(Constants.START_TIME_INPUT, time.length());
        setInput(Constants.START_TIME_INPUT, time);
    }

    public static void setEndTime(String time){
        Utilities.deletePlaceholder(Constants.END_TIME_INPUT, time.length());
        setInput(Constants.END_TIME_INPUT, time);
    }


    public static void setDate(String date){
        Utilities.deletePlaceholder(Constants.DATE_INPUT, date.length());
        setInput(Constants.DATE_INPUT, date);
    }

    public static void clikOptions(){
        click(Constants.TIMER_OPTIONS_BUTTON);
    }

    public static void clickDiscard(){
        click(Constants.DISCARD_BUTTON);
    }

    public static void confirmDiscard(){
        click(Constants.DISCARD_CONFIRMATION_BUTTON);
    }

    public static void changeDescription(){
        setInput(Constants.FIRST_DESCRIPTION_INPUT, "edit\n");
    }

    public static void clickBillable(){
        click(Constants.SECOND_BILLABLE_BUTTON);
    }

    public static void clickProject(){
        click(Constants.WORKTIME_PROJECT_BUTTON);
    }

    public static void clickCreateNewProject(){
        click(Constants.WORKTIME_CREATE_NEW_PROJECT_BUTTON);
    }

    public static void setProjectName(String name){
        setInput(Constants.PROJECT_NAME_INPUT, name + "\n");
    }

}
