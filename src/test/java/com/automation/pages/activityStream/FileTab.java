package com.automation.pages.activityStream;

import com.automation.pages.AbstractPageBase;
import com.automation.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FileTab extends AbstractPageBase {

    @FindBy(xpath = "//div[@id='diskuf-selectdialog-E0GAJCq']//span[@class='wd-fa-add-file-light-title-text'][contains(text(),'Upload files and images')]")
    private WebElement uploadFilesAndImages;

    public WebElement uploadedFileXpath (String fileName){
        return driver.findElement(By.xpath("//span[contains(text(),'"+fileName+"')]"));
    }

    /**
     * this WebElement links to a previously uploaded file
     *
     * It's very possible that this WebElement could be unreliable. If it breaks, contact Jordan Hankison
     */
    @FindBy(xpath = "//div[@data-id='n1845']")
    private WebElement uploadedFile;

    public void uploadTestFilesAndImages(String fileName){
        String path = System.getProperty("user.dir"+"/testFiles/"+fileName);
        wait.until(ExpectedConditions.visibilityOf(uploadFilesAndImages)).sendKeys(path);
        BrowserUtils.wait(1);
    }

    public void clickUploadedFile(){
        wait.until(ExpectedConditions.visibilityOf(uploadedFile)).click();
        BrowserUtils.wait(1);
    }

}
