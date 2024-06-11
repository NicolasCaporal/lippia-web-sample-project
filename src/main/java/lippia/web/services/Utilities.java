package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.Given;
import java.time.Instant;

public class Utilities {

    @Given("^tengo la sesion iniciada con mail (.*) y contraseña (.*)")
    public void login(String mail, String pswd){
        LoginService.loginPage();
        LoginService.clickLoginManuallyButton();
        LoginService.setEmail(mail);
        LoginService.setPassword(pswd);
        LoginService.clickLoginButton();
        LoginService.verifyLogin();
    }

    public static String timeStampName(String text){
        long unixTimestamp = Instant.now().getEpochSecond();
        return text + unixTimestamp;
    }

    // No me anda el .clear()
    public static void deletePlaceholder(String xpath, int length) {
        for (int i = 0; i<length; i++) {
            WebActionManager.setInput(xpath, "\b");
        }
    }

}