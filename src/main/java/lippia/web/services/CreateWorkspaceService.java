package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;
import org.testng.Assert;

public class CreateWorkspaceService extends ActionManager {

    public static void clickMenu(){
        click(WorkspaceConstants.MENU_BUTTON);
    }

    public static void clickManageWorkspace(){
        click(WorkspaceConstants.MANAGE_WORKSPACES_BUTTON);
    }

    public static void clickNewWorkspace(){
        click(WorkspaceConstants.CREATE_NEW_WORKSPACE_BUTTON);
    }

    public static void setName(String name) {
        setInput(WorkspaceConstants.SET_WORKSPACE_NAME_INPUT, name);
    }

    public static void clickCreate(){
        click(WorkspaceConstants.CREATE_WORKSPACE_BUTTON);
    }

    public static void checkWorkspace(String name){
        WebActionManager.waitVisibility(WorkspaceConstants.WORKSPACE_CREATED, name);
        Assert.assertTrue(WebActionManager.isPresent(WorkspaceConstants.WORKSPACE_CREATED, name));
    }
}

