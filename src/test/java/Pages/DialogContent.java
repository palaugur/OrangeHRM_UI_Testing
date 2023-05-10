package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[name='username']")
    public WebElement username;
    @FindBy(css = "[name='password']")
    public WebElement password;
    @FindBy(css = "button[type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//h6[text()='Dashboard']")
    public WebElement verifyLogin;
    @FindBy(xpath = "//div[@class='orangehrm-paper-container']//button[@type='button']")
    public WebElement addButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public List<WebElement> notificationMsg;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordAP;
    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement conPasswordAP;
    @FindBy(xpath = "(//input[contains(@class,'oxd-input oxd-input--')])[2]")
    public WebElement usernameInAP;
    @FindBy(xpath = "(//div[contains(@class, 'oxd-select-text oxd-select-text--')])[1]")
    public WebElement userRole;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement employeeName;
    @FindBy(css = "div[class='oxd-autocomplete-wrapper']>div+div>*>*")
    public WebElement employeeInside;
    @FindBy(css = "h5[class]")
    public WebElement sysUsers;
    @FindBy(xpath = "(//div[contains(@class, 'oxd-select-text--after')])[2]")
    public WebElement status;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
    public WebElement cancelBtn;
    @FindBy(xpath = "//h6[text()='Add User']")
    public WebElement addUser;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement saveBtnInAP;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement sysUserName;
    @FindBy(xpath = "(//div[@class='oxd-table-cell oxd-padding-cell'])[2]")
    public WebElement savedUsername;
    @FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
    public WebElement editButton;
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    public WebElement deleteButton;
    @FindBy(xpath = "//*[text()[contains(.,'Successfully')]]")
    public WebElement successfullMessage;
    @FindBy(xpath = "(//*[text()='No Records Found'])[2]")
    public WebElement noRecords;
    @FindBy(xpath = "(//div[@class='orangehrm-modal-footer']/button[@type='button'])[2]")
    public WebElement deleteDialog;


    public List<WebElement> getElementList(String strButton) {
        switch (strButton) {
            case "notificationMsg":
                return notificationMsg;
        }
        return null;
    }

    public WebElement getWebElement(String strButton) {
        switch (strButton) {

            case "addButton":
                return addButton;
            case "submitButton":
                return submitButton;
            case "passwordAP":
                return passwordAP;
            case "conPasswordAP":
                return conPasswordAP;
            case "usernameInAP":
                return usernameInAP;
            case "employeeName":
                return employeeName;
            case "userRole":
                return userRole;
            case "status":
                return status;
            case "sysUserName":
                return sysUserName;
            case "employeeInside":
                return employeeInside;
            case "sysUsers":
                return sysUsers;
            case "cancelBtn":
                return cancelBtn;
            case "saveBtnInAP":
                return saveBtnInAP;
            case "addUser":
                return addUser;
            case "savedUsername":
                return savedUsername;
            case "editButton":
                return editButton;
            case "deleteButton":
                return deleteButton;
            case "deleteDialog":
                return deleteDialog;
            case "noRecords":
                return noRecords;
        }
        return null;
    }
}