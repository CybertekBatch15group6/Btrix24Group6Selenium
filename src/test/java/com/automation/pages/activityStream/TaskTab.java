

package com.automation.pages.activityStream;
import com.automation.pages.*;
import com.automation.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class TaskTab extends LoginPage {

    private WebDriver driver = Driver.getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, 6);

    @FindBy(xpath = "//*[text()='Task']")
    WebElement taskTab;

    @FindBy(css = "[id*='task-priority']")
    WebElement priorityCheckbox;

    public void createTask() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Task']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[id*='task-priority']"))).click();
    }

    public boolean checkBoxIsClicked() {
        return priorityCheckbox.isSelected();
    }
}