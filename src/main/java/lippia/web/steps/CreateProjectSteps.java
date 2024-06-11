package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.CreateProjectService;
import lippia.web.services.Utilities;

public class CreateProjectSteps extends PageSteps {
    private String projectName;

    @Given("^estoy en la sección Create New Proyect")
    public void createProyectPage() {
        CreateProjectService.clickProject();
        CreateProjectService.clickNewProject();
    }

    @When ("^ingreso un nombre de proyecto unico")
    public void setName() {
        this.projectName = Utilities.timeStampName("proyect");
        CreateProjectService.setName(this.projectName);
    }

    @When("presiono el boton Create Project")
    public void clickCreate() {
        CreateProjectService.clickCreateButton();
    }


    @Then("^el sistema crea el nuevo proyecto correctamente")
    public void checkProyect(){
        CreateProjectService.checkProject(projectName);
    }
}
