package com.automation.pages;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.ConfigurationReader;
import com.automation.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(name = "USER_LOGIN")
    private WebElement username;

    @FindBy (name = "USER_PASSWORD")
    private WebElement password;

    @FindBy(className = "login-btn")
    private WebElement login;

    @FindBy(linkText = "Forgot your password?")
    private WebElement forgotPassword;

    @FindBy(xpath = "//div[contains(text(),'Incorrect login or password')]")
    private WebElement warningMessage;

    // constructor
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public String getWarningMessageText(){
        return warningMessage.getText();
    }
    /**
     * Method to login, version 1
     * login as a specific user
     * @param usernameValue
     * @param passwordValue
     */
    public void login(String usernameValue, String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

        BrowserUtils.wait(3);
    }
    /**
     * Method to login, version #2
     * login as the default user
     * Credentials will be retrieved from configuration.properties file
     */
    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("helpdesk"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);


    }

    /**
     * Method to login, version #3
     * Login as HR user
     */
    public void loginAsHr(){
        username.sendKeys(ConfigurationReader.getProperty("hr"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        login.click();
    }

    /**
     * Method to login, version #4
     * Login as Help Desk User
     */
    public void loginAsHelpDesk(){
        username.sendKeys(ConfigurationReader.getProperty("help_desk"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        login.click();
    }

    /**
     * Method to login, version #5
     * Login as Marketing User
     */
    public void loginAsMarketing(){
        username.sendKeys(ConfigurationReader.getProperty("marketing"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        login.click();
    }
}
