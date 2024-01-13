package Tests;

import Pages.AlertFrameWindowPage.AlertFrameWindowPage;
import Pages.AlertFrameWindowPage.FramePage;
import Pages.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class FrameTest extends Hooks{
    @Test

    public void test_method() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertWindow();


        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickFrames();


        FramePage framePage = new FramePage(getDriver());
        framePage.interractFirstFrame();
        framePage.interractsecondframe();



    }
}
