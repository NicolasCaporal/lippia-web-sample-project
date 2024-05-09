package lippia.web.services;

import io.cucumber.java.en.*;
import java.time.Instant;

public class Utilities {

    @Given("^tengo la sesion iniciada")
    public void login(){
        LoginService.loginPage();
        LoginService.clickLoginManuallyButton();
        LoginService.setEmail("cuydufalma@gufum.com");
        LoginService.setPassword("tortugamaritima");
        LoginService.clickLoginButton();
    }

    public static String timeStampName(){
        long unixTimestamp = Instant.now().getEpochSecond();
        return "test" + unixTimestamp;
    }
}