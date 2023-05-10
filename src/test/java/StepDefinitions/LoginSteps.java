package StepDefinitions;
import Pages.DialogContent;
import Utility.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dc=new DialogContent();

    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.sendkeysFunc(dc.username,"Admin");
        dc.sendkeysFunc(dc.password,"admin123");
        dc.clickFunc(dc.loginButton);

    }
    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsTextFunction(dc.verifyLogin,"Dashboard");
    }
}
