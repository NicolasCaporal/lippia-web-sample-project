package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import java.time.Instant;

public class Utilities {
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