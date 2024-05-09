package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Constants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;

public class EditWorkspaceService {

    public static void clickSettings(){
        click(Constants.WS_SETTINGS_BUTTON);
    }

    public static void  changeName(String name){
        setInput(Constants.WORKSPACE_NAME_INPUT, name, false, true);
    }

    public static void clickGeneral(){
        ActionManager.waitClickable(Constants.GENERAL_BUTTON);
        click(Constants.GENERAL_BUTTON);
    }

    public static void checkName(String name){
        WebActionManager.waitVisibility(Constants.ACTIVE_WORKSPACE_NAME, name);
        Assert.assertTrue(WebActionManager.isPresent(Constants.ACTIVE_WORKSPACE_NAME, name));
    }

}
