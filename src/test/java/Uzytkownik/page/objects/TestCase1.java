package Uzytkownik.page.objects;

import Uzytkownik.tests.TestBase;
import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase1 extends BasePage {

    @FindBy(xpath = "//*[@id=\"_desktop_logo\"]/h1/a/img")
    private WebElement home;

    @Step("Wyświetlanie strony głównej")
    public TestCase2 ClickOnTheHomePage() {
        home.click();
        log().info("Kliknięcie w zakładke 'my store'");

        return new TestCase2();
    }


}