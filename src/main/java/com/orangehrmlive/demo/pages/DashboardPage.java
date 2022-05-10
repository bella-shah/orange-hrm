package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {
    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
   @FindBy(xpath = "//h1[normalize-space()='Dashboard']")
    WebElement dashboardText;

    public void dashboardText(){
        verifyThatElementIsDisplayed(dashboardText);
        CustomListeners.test.log(Status.PASS,"Verify Dasboard Text is displayed");
    }
}

