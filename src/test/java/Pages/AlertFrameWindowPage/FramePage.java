package Pages.AlertFrameWindowPage;

import Logger.LoggerUtility;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Base64;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "sampleHeading")
    private WebElement frametext;



    public void interractFirstFrame(){
        driver.switchTo().frame("frame1");
        LoggerUtility.info("The user switched on specofic frame");

        System.out.println(frametext.getText());
        LoggerUtility.info("The user prints the frametext value ");

        driver.switchTo().defaultContent();
        LoggerUtility.info("The user switches back on primary frame");
    }

    public void interractsecondframe(){
        driver.switchTo().frame("frame2");
        LoggerUtility.info("The user switches on the second frame");

        System.out.println(frametext.getText());
        LoggerUtility.info("The user prints the frametext value");

    }
}
