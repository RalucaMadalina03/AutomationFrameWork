package HelpMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ElementMethods {

    private WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    private void waitVisibleElement (WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickElement (WebElement element){
        waitVisibleElement(element);
        element.click();
    }

    public void fillElement (WebElement element, String value){
        waitVisibleElement(element);
        element.sendKeys(value);
    }
    public void fillElement (WebElement element, String value, Keys keyboardPress){
        waitVisibleElement(element);
        element.sendKeys(value);
        element.sendKeys(keyboardPress);
    }
    public void fillElement (WebElement element,Keys keyboardPress){
        waitVisibleElement(element);
        element.sendKeys(keyboardPress);
    }
    public void scrollByPixels (Integer x, Integer y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
    }

    public void clickJsElement (WebElement element){

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", element);
    }
    public void validateElementMessage (WebElement element, String value){
        waitVisibleElement(element);
        String actualMessage = element.getText();
        Assert.assertEquals(actualMessage, value);
    }


}
