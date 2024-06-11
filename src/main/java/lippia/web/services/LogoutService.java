package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.LogoutConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;

public class LogoutService {

    public static void clickAvatarPicture(){
        click(LoginConstants.AVATAR);
    }

    public static void clickLogout(){
        click(LogoutConstants.LOGOUT_BUTTON);
    }

    public static void checkLogout(){
        WebActionManager.waitInvisibility(LoginConstants.AVATAR);
        Assert.assertFalse(WebActionManager.isPresent(LoginConstants.AVATAR));
    }

}
