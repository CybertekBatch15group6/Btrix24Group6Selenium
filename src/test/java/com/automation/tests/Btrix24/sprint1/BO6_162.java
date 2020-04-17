package com.automation.tests.Btrix24.sprint1;


// OLGA
// US #10: As a user, I should be able to interact with employees on the posts that I have access to.
//      AC #4: User should be able to add others' posts to favorate by clicking on the Star icon.



import com.automation.pages.LoginPage;
import com.automation.pages.activityStream.EventPage;
import com.automation.tests.AbstractTestBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class BO6_162 extends AbstractTestBase {

    @DataProvider
    public Object[][] credentials() {
        return new Object[][]{
                {"helpdesk12@cybertekschool.com", "UserUser"},
                {"marketing12@cybertekschool.com", "UserUser"},
                {"hr12@cybertekschool.com", "UserUser"}
        };
    }

    @Test(dataProvider = "credentials")
    public void clickingOnName(String username, String password) {
        extentTest = extentReports.createTest("Click On Profile ");
        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitForPageToLoad(10);
        loginPage.login(username,password);
        List<WebElement> names = driver.findElements(By.className("feed-post-user-name"));
        names.get(0).click();
        String actual  = driver.findElement(By.xpath("//*[@id=\"workarea-content\"]/div/div/div[3]/table/tbody/tr[1]/td")).getText();
        String expected = "Contact information";
        assertEquals(actual, expected);
        extentTest.pass("Successfully!");

    }


    }


