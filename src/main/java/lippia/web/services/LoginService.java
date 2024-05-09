package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Constants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void loginPage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickLoginManuallyButton() {
        click(Constants.LOGIN_MANUALLY_BUTTON);
    }

    public static void setEmail(String text) {
        setInput(Constants.INPUT_EMAIL, text);
    }

    public static void setPassword(String text) {
        setInput(Constants.INPUT_PSWD, text);
    }

    public static void clickLoginButton() {
        click(Constants.LOGIN_BUTTON);
    }

    public static void pressEye(){
        click(Constants.VISIBILITY_TOGGLE);
    }

    public static void verifyLogin(){
        WebActionManager.waitPresence(Constants.AVATAR);
        Assert.assertTrue(WebActionManager.isPresent(Constants.AVATAR));
    }

    public static void checkMessage(String msj){
        try {
            WebActionManager.waitVisibility(Constants.MSJ, msj);
            Assert.assertTrue(WebActionManager.isPresent(Constants.MSJ, msj));
        } catch (Exception e){
            WebActionManager.waitVisibility(Constants.MSJ2, msj);
            Assert.assertTrue(WebActionManager.isPresent(Constants.MSJ2, msj));
        };
    }
}

