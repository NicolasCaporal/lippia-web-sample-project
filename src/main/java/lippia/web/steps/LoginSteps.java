package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @Given("^me encuentro en la ventana de \"Log in\"")
    public void loginPage() {
        LoginService.loginPage();
    }

    @When("^presiono \"Log in manually\"")
    public void clickManually() {
        LoginService.clickLoginManuallyButton();
    }

    @When("^ingreso email (.*) y contraseña (.*)$")
    public void enterCredentials(String mail, String pswd) {
        LoginService.setEmail(mail);
        LoginService.setPassword(pswd);
    }

    @When("^presiono \"Log in\"")
    public void clickLogin() {
        LoginService.clickLoginButton();
    }

    @When("^presiono en cualquier lado")
    public void clickAnyelse(){
        LoginService.pressEye();
    }

    @Then("^el sistema inicia sesión y redirige a la pantalla principal")
    public void verificaInicio() {
       LoginService.verifyLogin();
    }

    @Then("^el sistema informa (.*)")
    public void verificaError(String msj){
        LoginService.checkMessage(msj);
    }
}
