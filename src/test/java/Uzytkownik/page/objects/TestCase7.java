package Uzytkownik.page.objects;

import Uzytkownik.tests.TestBase;
import Uzytkownik.waits.WaitForElement;
import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TestCase7 extends BasePage  {
    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[1]")
    private WebElement LogOut;

    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a/span")
    private WebElement SignIn;

    @FindBy(xpath = "//*[@id=\"login-form\"]/section/div[1]/div[1]/input")
    private WebElement InputLoginEmail;

    @FindBy(xpath = "//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input")
    private WebElement InputLoginPassword;

    @FindBy(xpath = "//*[@id=\"submit-login\"]")
    private WebElement ButtonSignIn;

    @Step("Logowanie użytkownika")
    public TestCase7 UserLogin() throws InterruptedException {
        LogOut.click();
        log().info("Wylogowanie się");

        SignIn.click();
        log().info("Przejśćie do logowania");

        InputLoginEmail.clear();
        InputLoginEmail.sendKeys(TestCase6.email);
        log().info("Wpisujemy w pole logowania 'E-mail'");

        InputLoginPassword.clear();
        InputLoginPassword.sendKeys("haslo1234");
        log().info("Wpisujemy w pole logowania 'Hasło' -> 'haslo1234'");

        Uspij();
        ButtonSignIn.click();
        log().info("Kliknięcie przycisku 'ZALOGUJ SIĘ'");

        return this;
    }
}