package lippia.web.steps;

import io.cucumber.java.en.*;
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
