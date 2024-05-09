package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Constants;
import org.testng.Assert;

public class CreateProjectService extends ActionManager {

    public static void clickProject(){
        click(Constants.PROJECT_BUTTON);
    }

    public static void clickNewProject(){
        click(Constants.NEW_PROJECT_BUTTON);
    }

    public static void setName(String name) {
        setInput(Constants.PROJECT_NAME_INPUT, name);
    }

    public static void clickCreateButton(){
        click(Constants.CREATE_PROJECT_BUTTON);
    }

    public static void checkProject(String name){
        WebActionManager.waitVisibility(Constants.PROJECT_CREATED, name);
        Assert.assertTrue(WebActionManager.isPresent(Constants.PROJECT_CREATED, name));
    }
}

