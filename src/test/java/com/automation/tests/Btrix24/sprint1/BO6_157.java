
package com.automation.tests.Btrix24.sprint1;
import com.automation.pages.activityStream.*;
import com.automation.tests.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class BO6_157 extends AbstractTestBase {

    @DataProvider
    public Object[][] credentials() {
        return new Object[][]{
                {"helpdesk12@cybertekschool.com", "UserUser"},
                {"marketing12@cybertekschool.com", "UserUser"},
                {"hr12@cybertekschool.com", "UserUser"}
        };
    }

    @Test(dataProvider = "credentials")
    public void verifyHighPriorityCheckBox(String username, String password) {
        extentTest = extentReports.createTest("Click On High Priority CheckBox ");
        TaskTab task = new TaskTab();
        task.login(username, password);
        task.createTask();
        assertTrue(task.checkBoxIsClicked());
        extentTest.pass("Clicked On High Priority CheckBox Successfully!");
    }
}

