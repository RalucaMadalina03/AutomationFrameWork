package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    public WebElement AlertFrameWindowPage;

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement forms;

    @FindBy(xpath = "//h5[text()='Elements']")
    public WebElement elements;


    public void clickelements(){
        elements.click();
        LoggerUtility.info("The user clicks on element button");
    }


    public void clickAlertWindow() {
        AlertFrameWindowPage.click();
        LoggerUtility.info("The user clicks on alertFrameWindow button");

    }

    public void clickForms() {
        forms.click();
        LoggerUtility.info("The user clicks on forms button");
    }
}
