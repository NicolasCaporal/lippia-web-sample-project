package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Constants;
import org.testng.Assert;

public class CreateWorkspaceService extends ActionManager {

    public static void clickMenu(){
        click(Constants.MENU_BUTTON);
    }

    public static void clickManageWorkspace(){
        click(Constants.MANAGE_WORKSPACES_BUTTON);
    }

    public static void clickNewWorkspace(){
        click(Constants.CREATE_NEW_WORKSPACE_BUTTON);
    }

    public static void setName(String name) {
        setInput(Constants.SET_WORKSPACE_NAME_INPUT, name);
    }

    public static void clickCreate(){
        click(Constants.CREATE_WORKSPACE_BUTTON);
    }

    public static void checkWorkspace(String name){
        WebActionManager.waitVisibility(Constants.WORKSPACE_CREATED, name);
        Assert.assertTrue(WebActionManager.isPresent(Constants.WORKSPACE_CREATED, name));
    }
}

