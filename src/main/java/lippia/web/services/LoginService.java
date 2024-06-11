package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void loginPage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickLoginManuallyButton() {
        click(LoginConstants.LOGIN_MANUALLY_BUTTON);
    }

    public static void setEmail(String text) {
        setInput(LoginConstants.INPUT_EMAIL, text);
    }

    public static void setPassword(String text) {
        setInput(LoginConstants.INPUT_PSWD, text);
    }

    public static void clickLoginButton() {
        click(LoginConstants.LOGIN_BUTTON);
    }

    public static void pressEye(){
        click(LoginConstants.VISIBILITY_TOGGLE);
    }

    public static void verifyLogin(){
        WebActionManager.waitPresence(LoginConstants.AVATAR);
        Assert.assertTrue(WebActionManager.isPresent(LoginConstants.AVATAR));
    }

    public static void checkMessage(String msj){
        try {
            WebActionManager.waitVisibility(LoginConstants.MSJ, msj);
            Assert.assertTrue(WebActionManager.isPresent(LoginConstants.MSJ, msj));
        } catch (Exception e){
            WebActionManager.waitVisibility(LoginConstants.MSJ2, msj);
            Assert.assertTrue(WebActionManager.isPresent(LoginConstants.MSJ2, msj));
        };
    }
}

