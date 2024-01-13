package Tests;

import Pages.AlertFrameWindowPage.AlertFrameWindowPage;
import Pages.AlertFrameWindowPage.WindowsPage;
import Pages.HomePage;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class WindowTest extends Hooks {

    @Test

    public void test_method() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertWindow();

        AlertFrameWindowPage alertFrameWindowPage = new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickwindows();

        WindowsPage windowsPage = new WindowsPage(getDriver());
        windowsPage.interrecttab();
        windowsPage.interractewindow();

    }
}
