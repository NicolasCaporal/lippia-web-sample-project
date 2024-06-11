package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;

public class EditWorkspaceService {

    public static void clickSettings(){
        click(WorkspaceConstants.WS_SETTINGS_BUTTON);
    }

    public static void  changeName(String name){
        setInput(WorkspaceConstants.WORKSPACE_NAME_INPUT, name, false, true);
    }

    public static void clickGeneral(){
        ActionManager.waitClickable(WorkspaceConstants.GENERAL_BUTTON);
        click(WorkspaceConstants.GENERAL_BUTTON);
    }

    public static void checkName(String name){
        WebActionManager.waitVisibility(WorkspaceConstants.ACTIVE_WORKSPACE_NAME, name);
        Assert.assertTrue(WebActionManager.isPresent(WorkspaceConstants.ACTIVE_WORKSPACE_NAME, name));
    }

}
