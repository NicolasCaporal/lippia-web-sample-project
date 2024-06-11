package lippia.web.steps;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.CreateWorkspaceService;
import lippia.web.services.EditWorkspaceService;
import lippia.web.services.Utilities;

import javax.swing.*;

import static com.crowdar.core.actions.ActionManager.waitClickable;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class EditWorkspaceSteps {
    private String newName;

    @Given("^estoy en la seccion Workspace Setings")
    public void workspaceLoginPage(){
        CreateWorkspaceService.clickMenu();
        EditWorkspaceService.clickSettings();
    }

    @When("^modifico el nombre del Workspace")
    public void changeWorkspaceName(){
        this.newName = Utilities.timeStampName("WorkspaceEdit");
        EditWorkspaceService.changeName(this.newName);
    }

    @When("^presiono en cualquier lugar")
    public void clickAnyelse(){
        EditWorkspaceService.clickGeneral();
    }

    @Then("^el sistema actualiza el nombre del Workspace")
    public void checkName(){
        EditWorkspaceService.checkName(this.newName);
    }

}
