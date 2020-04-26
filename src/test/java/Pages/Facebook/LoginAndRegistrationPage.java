package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LoginAndRegistrationPage extends BasePage {

    //Locators
    private By firstnameLocator = By.name("firstname");
    private By lastnameLocator = By.name("lastname");
    private By signUpButtonLocator = By.xpath("//button[@name='websubmit']");
    private By emailMobile = By.xpath("//input[starts-with(@name, 'reg_email__')]");
    private By password = By.xpath("//div[text()='New password']//following-sibling::input[@type='password']");
    private By month = By.id("month");
    private By day = By.id("day");
    private By year = By.id("year");
    private By gender = By.xpath("//label[text()= 'Male']//preceding::input[@value='2']");
    private By signUpButton = By.xpath("//button[text()='Sign Up'and@name='websubmit']");
    private By errorMsg = By.xpath("//div[starts-with(text(), 'Please enter a valid')]");

    private By usernameLocator = By.id("email");
    private By passwordLocator = By.id("pass");
    private By loginButtonLocator = By.id("loginbutton");



    //methods
    public void enterFirstname(String fname) {
        type(firstnameLocator, fname);
    }

    public void enterLastname (String lname) {
        type(lastnameLocator, lname);
    }

    public void clickSignupButton() {
        clickOn(signUpButtonLocator);
    }

    public void selectMonth(String monthValue) {
        selectFromDropdownUsingVisibleText(month, monthValue);
    }

    public void enterUsername(String username) {
        type(usernameLocator, username);
    }

    public void enterPassword(String password) {
        type(passwordLocator, password);
    }

    public void clickLoginButton() {
        clickOn(loginButtonLocator);
    }


}
