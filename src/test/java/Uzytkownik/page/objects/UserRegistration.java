package Uzytkownik.page.objects;

import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UserRegistration extends BasePage {

    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a/span")
    private WebElement SignIn;

    @FindBy(xpath = "//a[contains(text(),'Nie masz konta? Załóż je tutaj')]")
    private WebElement CreateAnAccount;

    @FindBy(xpath = "//body/main[1]/section[1]/div[1]/div[1]/section[1]/section[1]/section[1]/form[1]/section[1]/div[1]/div[1]/label[1]")
    private WebElement SpanChooseMan;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[2]/div[1]/input")
    private WebElement InputFirstName;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[3]/div[1]/input")
    private WebElement InputLastName;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[4]/div[1]/input")
    private WebElement InputEmail;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/input")
    private WebElement InputPassword;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[6]/div[1]/input")
    private WebElement InputDateOfBirth;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[7]/div[1]/span/label/input")
    private WebElement CheckTheOptions1;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[8]/div[1]/span/label/input")
    private WebElement CheckTheOptions2;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[9]/div[1]/span/label/input")
    private WebElement CheckTheOptions3;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[10]/div[1]/span/label/input")
    private WebElement CheckTheOptions4;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/footer/button")
    private WebElement ButtonSend;


    @Step("Rejestracja użytkownika")
    public UserLogin UserRegistration(String email, String password) throws InterruptedException {
        Uspij();
        SignIn.click();
        log().info("Przejśćie do logowania");
        Uspij();
        CreateAnAccount.click();
        log().info("Przejśćie do rejestracji");
        Uspij();
        SpanChooseMan.click();
        log().info("Wybór pola 'Nazwa kontaktu' -> 'Pan'");

        InputFirstName.clear();
        InputFirstName.sendKeys("Jan");
        log().info("Wpisujemy w pole 'Imię'");

        InputLastName.clear();
        InputLastName.sendKeys("Kowalski");
        log().info("Wpisujemy w pole 'Nazwisko'");

        InputEmail.clear();
        InputEmail.sendKeys(email);
        log().info("Wpisujemy w pole 'E-mail'");

        InputPassword.clear();
        InputPassword.sendKeys(password);
        log().info("Wpisujemy w pole 'Hasło'");

        InputDateOfBirth.clear();
        InputDateOfBirth.sendKeys("1970-05-31");
        log().info("Wpisujemy w pole 'Data urodzenia' -> '1970-05-31'");

        CheckTheOptions1.click();
        log().info("Zaznaczenie opcji 'Otrzymuj oferty..' ");

        CheckTheOptions2.click();
        log().info("Zaznaczenie opcji 'Wiadomość o przetwarzaniu..' ");

        CheckTheOptions3.click();
        log().info("Zaznaczenie opcji 'Zapisz się do..' ");

        CheckTheOptions4.click();
        log().info("Zaznaczenie opcji 'Akceptuje ogólne..' ");


        ButtonSend.click();
        log().info("Zaznaczenie przycisku 'Zapisz' ");
        return new UserLogin();

    }
}
