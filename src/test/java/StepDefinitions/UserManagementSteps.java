package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;


public class UserManagementSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Navigate to Admin Page")
    public void navigateToAdminPage() {
        ln.clickFunc(ln.adminpage);
    }

    @When("Click on the element in Dialog Content")
    public void clickOnTheElementInDialogContent(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strButton : strButtons) {
            WebElement element = dc.getWebElement(strButton);
            dc.clickFunc(element);
        }

    }

    @Then("Notification message should be displayed")
    public void notificationMessageShouldBeDisplayed(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            List<WebElement> elementList = dc.getElementList(items.get(i).get(0));
            String text = items.get(i).get(1);
            for (WebElement element : elementList
            ) {
                dc.verifyContainsTextFunction(element, text);
                System.out.println("element = " + element.getText());
                System.out.println("text = " + text);
            }
        }
    }

    @Then("Text should be displayed")
    public void TextShouldBeDisplayed(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            String text = items.get(i).get(1);
            dc.verifyContainsTextFunction(element, text);

            System.out.println("element = " + element.getText());
            System.out.println("text = " + text);
        }
    }

    @Then("Add button should be displayed")
    public void addButtonShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.addButton, "Add");
    }

    @Then("Elements should be displayed")
    public void elementsShouldBeDisplayed(DataTable dt) {
        List<String> strList = dt.asList(String.class);
        for (String str : strList) {
            WebElement element = dc.getWebElement(str);
            dc.verifyElement(element);
            System.out.println(str);
        }
    }

    @Then("User send keys in Dialog Content")
    public void userSendKeysInDialogContent(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendkeysFunc(element, items.get(i).get(1));

        }
    }


    @Then("Scroll Down {string} times")
    public void scrollDown(String moveNumber) throws AWTException {

        int number = Integer.parseInt(moveNumber);
        Robot rbt = new Robot();
        for (int i = 1; i <= number; i++) {
            rbt.keyPress(KeyEvent.VK_DOWN);
            rbt.keyRelease(KeyEvent.VK_DOWN);
        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
    }

    @And("Wait until element visible")
    public void waitUntilElementVisible(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strButton : strButtons) {
            WebElement element = dc.getWebElement(strButton);
            dc.waitUntilVisible(element);
        }
    }

    @Then("Successfully containing message should be displayed")
    public void successfullyContainingMessageShouldBeDisplayed() {
        dc.verifyElement(dc.successfullMessage);
    }

    @And("Clear Input with Keys")
    public void clearInputWithKeys(DataTable dt) {
        List<String> strButtons = dt.asList(String.class);
        for (String strButton : strButtons) {
            WebElement element = dc.getWebElement(strButton);
            dc.clearInput(element);
        }
    }
}
