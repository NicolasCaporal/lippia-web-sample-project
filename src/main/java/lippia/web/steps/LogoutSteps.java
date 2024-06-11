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
import lippia.web.services.LogoutService;

public class LogoutSteps {

    @When("^abro el menu de mi foto de perfil")
    public void clickProfilePicture(){
        LogoutService.clickAvatarPicture();
    }

    @When("^presiono el boton Logout")
    public void clickLogout(){
        LogoutService.clickLogout();
    }

    @Then("^el sistema cierra la sesion")
    public void checkName(){
        LogoutService.checkLogout();
    }

}
