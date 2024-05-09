package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CreateWorkspaceService;
import lippia.web.services.Utilities;

public class CreateWorkspaceSteps extends PageSteps {
    private String workspaceName;

    @Given("^estoy en la sección Create New Workspace")
    public void createWorkspacePage() {
        CreateWorkspaceService.clickMenu();
        CreateWorkspaceService.clickManageWorkspace();
        CreateWorkspaceService.clickNewWorkspace();
    }

    @When ("^ingreso un nombre de workspace unico")
    public void setName() {
        this.workspaceName = Utilities.timeStampName();
        CreateWorkspaceService.setName(this.workspaceName);
    }

    @When("presiono el boton Create Workspace")
    public void clickCreate() {
        CreateWorkspaceService.clickCreate();
    }


    @Then("^el sistema crea el nuevo workspace correctamente")
    public void checkWorkspace(){
        CreateWorkspaceService.checkWorkspace(this.workspaceName);
    }
}
