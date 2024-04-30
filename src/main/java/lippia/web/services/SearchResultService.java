package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import lippia.web.constants.Constants;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchResultService extends ActionManager {

    private static WebElement stats() {
        return getElement(Constants.STATS_ID);
    }

    public static String getStats() {
        return stats().getText();
    }

    public static void verifyResults(){
        Assert.assertFalse(getStats().isEmpty());
    }
}
