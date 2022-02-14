package Uzytkownik.waits;

import driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForElement {
    //klasa odpowiedzialna za obsługe waitów
    public static WebDriverWait getWebDriverWait(){
        return new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(30));

    }
    //czeka aż element będzie widoczny w DOM-ie
    public static void waitUntilElementIsVisible(WebElement element){
        WebDriverWait webDriverWait=getWebDriverWait();
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }
    //czeka aż element będzie klikalny
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
