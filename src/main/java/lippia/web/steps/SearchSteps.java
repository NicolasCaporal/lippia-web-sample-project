package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.SearchResultService;

public class SearchSteps extends PageSteps {

    @Given("^The client is on google page$")
    public void home() {
        HomeService.navegarWeb();
    }

    @When("^The client search for word (.*)$")
    public void search(String criteria) {
        HomeService.enterSearchCriteria(criteria);
        HomeService.clickSearchButton();
    }

    @Then("The client verify that results are shown properly")
    public void statVerification() {
        SearchResultService.verifyResults();
    }
}
