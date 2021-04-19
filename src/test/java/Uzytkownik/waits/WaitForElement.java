package Uzytkownik.waits;

import driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElement {

    public static WebDriverWait getWebDriverWait(){
        return new WebDriverWait(DriverManager.getWebDriver(),30);

    }

    public static void waitUntilElementIsVisible(WebElement element){
        WebDriverWait webDriverWait=getWebDriverWait();
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementIsClickable(WebElement element){
        WebDriverWait webDriverWait=getWebDriverWait();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void ActionMoveToElement(WebElement element){
        Actions actions = new Actions(DriverManager.getWebDriver());
        actions.moveToElement(element);
        actions.perform();
    }


}
