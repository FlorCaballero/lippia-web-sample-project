package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import io.cucumber.java.en.*;
import lippia.web.constants.WebPracticeConstants;
import lippia.web.services.WebPracticeHomeService;
import lippia.web.services.WebPracticeResultService;
import lippia.web.services.WebPracticeSignInService;
import lippia.web.services.WebPracticeSortService;

public class WebPracticeSteps extends PageSteps {
//para todos

    @Given("The client is in automation practice page")
    public void theClientIsInAutomationPracticePage() {
        WebPracticeHomeService.navegarWeb();
    }

 //exercise 1
    @When("^The client search for word (.*)$")
    public void search(String criteria) {
        WebPracticeHomeService.enterSearchCriteria(criteria);
        WebPracticeHomeService.clickSearchButton();

    }

    @Then("The client verify that results are shown properly")
    public void statsVerification1() {
        WebPracticeResultService.verifyResults(WebPracticeConstants.STATS1_XPATH);

    }
//--------------------
//exercise 2


    @Given("The client go to sign In page")
    public void ClickSignInButton() {
        WebPracticeHomeService.navegarWeb();
        WebPracticeSignInService.GotoSignIn();
    }

    @And("^Set credencials the (.*) and (.*)$")
    public void setEmailAndPassword(String email,String password) {
        WebPracticeSignInService.enterEmail(email) ;
        WebPracticeSignInService.enterPassword(password);

    }

    @When("Press button login")
    public void pressButtonLogin() {
        WebPracticeSignInService.clickSignInchButton();
    }

    @Then("the client verify that navigate to sign in page")
    public void statsVerification2() {
        WebPracticeResultService.verifyResults(WebPracticeConstants.STATS2_XPATH);
    }
    //--------------------

//exercise 3
    @And("The client order by lower first the results")
    public void OrderByLowerFirst() {

        WebPracticeSortService.clickSelectProductSort();

        WebPracticeSortService.clickOptionLowerFirst();

         }

    @Then("The client verify that results are sort properly")
    public void statsVerification3() {

        WebPracticeResultService.verifySortResults();
    }
}
