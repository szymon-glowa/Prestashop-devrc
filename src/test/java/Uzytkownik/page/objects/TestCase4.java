package Uzytkownik.page.objects;

import Uzytkownik.tests.TestBase;
import Uzytkownik.waits.WaitForElement;
import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TestCase4 extends BasePage  {
    @FindBy(xpath = "//*[@id=\"category-9\"]/a")
    private WebElement ART;

    @Step("Wyświetlanie kategorii 'ART'")
    public TestCase5 ClickOnTheArt() {

        ART.click();
        log().info("Kliknięcie w zakładke 'ART'");

        return new TestCase5();
    }
}
