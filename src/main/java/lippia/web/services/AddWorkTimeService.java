package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;
import lippia.web.constants.WorkTimeConstants;
import org.testng.Assert;

public class AddWorkTimeService extends ActionManager {
    public static void clickTimeTracker(){
        click(WorkTimeConstants.TIMETRACKER_BUTTON);
    }

    public static void clickTimer(){
        click(WorkTimeConstants.TIMER_BUTTON);
    }

    public static void setDescription(String name) {
        setInput(WorkTimeConstants.TIME_ENTRY_DESCRIPTION_INPUT, name);
    }

    public static void clickStartButton(){
        click(WorkTimeConstants.START_STOP_DIV);
    }

    public static void clickStopButton(){
        WebActionManager.waitClickable(WorkTimeConstants.STOP_BUTTON);
        click(WorkTimeConstants.START_STOP_DIV);
    }

    public static void checkTimeEntry(String name){
        WebActionManager.waitVisibility(WorkTimeConstants.TIME_ENTRY_CREATED, name);
        Assert.assertTrue(WebActionManager.isPresent(WorkTimeConstants.TIME_ENTRY_CREATED, name));
    }

    public static void clickManual(){
        click(WorkTimeConstants.MANUAL_BUTTON);
    }


    public static void clickAdd(){
        click(WorkTimeConstants.ADD_BUTTON);
    }

    public static void setStartTime(String time){
        Utilities.deletePlaceholder(WorkTimeConstants.START_TIME_INPUT, time.length());
        setInput(WorkTimeConstants.START_TIME_INPUT, time);
    }

    public static void setEndTime(String time){
        Utilities.deletePlaceholder(WorkTimeConstants.END_TIME_INPUT, time.length());
        setInput(WorkTimeConstants.END_TIME_INPUT, time);
    }


    public static void setDate(String date){
        Utilities.deletePlaceholder(WorkTimeConstants.DATE_INPUT, date.length());
        setInput(WorkTimeConstants.DATE_INPUT, date);
    }

    public static void clikOptions(){
        click(WorkTimeConstants.TIMER_OPTIONS_BUTTON);
    }

    public static void clickDiscard(){
        click(WorkTimeConstants.DISCARD_BUTTON);
    }

    public static void confirmDiscard(){
        click(WorkTimeConstants.DISCARD_CONFIRMATION_BUTTON);
    }

    public static void changeDescription(){
        setInput(WorkTimeConstants.FIRST_DESCRIPTION_INPUT, "edit\n");
    }

    public static void clickBillable(){
        click(WorkTimeConstants.SECOND_BILLABLE_BUTTON);
    }

    public static void clickProject(){
        click(WorkTimeConstants.WORKTIME_PROJECT_BUTTON);
    }

    public static void clickCreateNewProject(){
        click(WorkTimeConstants.WORKTIME_CREATE_NEW_PROJECT_BUTTON);
    }

    public static void setProjectName(String name){
        setInput(ProjectConstants.PROJECT_NAME_INPUT, name + "\n");
    }

}
