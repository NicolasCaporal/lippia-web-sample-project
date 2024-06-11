package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;
import org.testng.Assert;

public class CreateProjectService extends ActionManager {

    public static void clickProject(){
        click(ProjectConstants.PROJECT_BUTTON);
    }

    public static void clickNewProject(){
        click(ProjectConstants.NEW_PROJECT_BUTTON);
    }

    public static void setName(String name) {
        setInput(ProjectConstants.PROJECT_NAME_INPUT, name);
    }

    public static void clickCreateButton(){
        click(ProjectConstants.CREATE_PROJECT_BUTTON);
    }

    public static void checkProject(String name){
        WebActionManager.waitVisibility(ProjectConstants.PROJECT_CREATED, name);
        Assert.assertTrue(WebActionManager.isPresent(ProjectConstants.PROJECT_CREATED, name));
    }
}

