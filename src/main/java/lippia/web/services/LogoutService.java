package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.Constants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;

public class LogoutService {

    public static void clickAvatarPicture(){
        click(Constants.AVATAR);
    }

    public static void clickLogout(){
        click(Constants.LOGOUT_BUTTON);
    }

    public static void checkLogout(){
        WebActionManager.waitInvisibility(Constants.AVATAR);
        Assert.assertFalse(WebActionManager.isPresent(Constants.AVATAR));
    }

}
