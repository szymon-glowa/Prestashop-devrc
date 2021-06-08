package Uzytkownik.page.objects;

import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UserLogin extends BasePage  {
    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[1]")
    private WebElement LogOut;

    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a/span")
    private WebElement SignIn;

    @FindBy(xpath = "//body/main[1]/section[1]/div[1]/div[1]/section[1]/section[1]/section[1]/form[1]/section[1]/div[1]/div[1]/input[1]")
    private WebElement InputLoginEmail;

    @FindBy(xpath = "//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input")
    private WebElement InputLoginPassword;

    @FindBy(xpath = "//*[@id=\"submit-login\"]")
    private WebElement ButtonSignIn;

    @Step("Logowanie użytkownika")
    public ValidationContactForm UserLogin(String email, String password) throws InterruptedException {
        LogOut.click();
        log().info("Wylogowanie się");

        SignIn.click();
        log().info("Przejśćie do logowania");

        InputLoginEmail.clear();
        InputLoginEmail.sendKeys(email);
        log().info("Wpisujemy w pole logowania 'E-mail'");

        InputLoginPassword.clear();
        InputLoginPassword.sendKeys(password);
        log().info("Wpisujemy w pole logowania 'Hasło' -> 'haslo1234'");

        ButtonSignIn.click();
        log().info("Kliknięcie przycisku 'ZALOGUJ SIĘ'");


        return new ValidationContactForm();
    }
}