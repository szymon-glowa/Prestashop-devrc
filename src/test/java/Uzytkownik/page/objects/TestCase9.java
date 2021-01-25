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


public class TestCase9 extends BasePage  {
    @FindBy(xpath = "//*[@id=\"category-3\"]/a")
    private WebElement clothes;
    @FindBy(xpath = "//*[@id=\"js-product-list\"]/div[1]/div[1]/article/div/a/img")
    private WebElement HummingbirdPrintedTShirt;
    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    private WebElement AddToCart;
    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement GoToOrder;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    private WebElement GoToOrderAgain;
    @FindBy(xpath = "//*[@id=\"checkout-personal-information-step\"]/div/ul/li[3]/a")
    private WebElement SignIn;
    @FindBy(xpath = "//*[@id=\"login-form\"]/section/div[1]/div[1]/input")
    private WebElement InputTypeEmail;
    @FindBy(xpath = "//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input")
    private WebElement InputTypePassword;
    @FindBy(xpath = "//*[@id=\"login-form\"]/footer/button")
    private WebElement ButtonNext;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[1]/div[1]/input")
    private WebElement InputAlias;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[2]/div[1]/input")
    private WebElement InputFirstName;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[3]/div[1]/input")
    private WebElement InputLastName;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[4]/div[1]/input")
    private WebElement InputCompany;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[5]/div[1]/input")
    private WebElement InputNip;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[6]/div[1]/input")
    private WebElement InputAdress;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[7]/div[1]/input")
    private WebElement InputFullAdress;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[8]/div[1]/input")
    private WebElement InputPostcode;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[9]/div[1]/input")
    private WebElement InputCity;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[10]/div[1]/select")
    private WebElement SelectCounty;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/section/div[11]/div[1]/input")
    private WebElement InputPhone;
    @FindBy(xpath = "//*[@id=\"delivery-address\"]/div/footer/button")
    private WebElement ButtonNext2;
    @FindBy(xpath = "//*[@id=\"delivery_message\"]")
    private WebElement TextAreaComment;
    @FindBy(xpath = "//*[@id=\"js-delivery\"]/button")
    private WebElement ButtonNext3;
    @FindBy(xpath = "//*[@id=\"payment-option-1\"]")
    private WebElement PaymentCheck;
    @FindBy(xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")
    private WebElement ButtonAgree;
    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement ButtonSubmitYourOrder;


    @Step("Próba zakup produktu prostego [Zakup i zalogowanie przy kupowaniu]")
    public TestCase9 ProductPurchaseWithLogin() {

        clothes.click();
        log().info("Kliknięcie w zakładke 'clothes'");
        HummingbirdPrintedTShirt.click();
        log().info("Kliknięcie w koszulke 'Hummingbird Printed T-Shirt'");
        AddToCart.click();
        log().info("Dodanie koszulki do koszyka");
        WaitForElement.waitUntilElementIsVisible(GoToOrder);
        GoToOrder.click();
        log().info("Kliknięcie w przycisk 'Przejdź do realizacji zamówienia'");
        GoToOrderAgain.click();
        log().info("Ponowne kliknięcie w przycisk 'Przejdź do realizacji zamówienia'");
        SignIn.click();
        log().info("kliknięcie w zakładke 'Zaloguj się'");
        InputTypeEmail.clear();
        InputTypeEmail.sendKeys(TestCase6.email);
        log().info("Wpisujemy email");
        InputTypePassword.clear();
        InputTypePassword.sendKeys("haslo1234");
        log().info("Wpisujemy hasło");
        ButtonNext.click();
        log().info("Klikamy w przycisk 'Dalej'");
        InputAlias.clear();
        InputAlias.sendKeys("poczta.email@poczta.pl");
        log().info("Wpisujemy Alias");
        InputFirstName.clear();
        InputFirstName.sendKeys(TestCase6.firstname);
        log().info("Wpisujemy Imię");
        InputLastName.clear();
        InputLastName.sendKeys(TestCase6.lastname);
        log().info("Wpisujemy Nazwisko");
        InputCompany.clear();
        InputCompany.sendKeys("Rc-cloud");
        log().info("Wpisujemy nazwe firmy");
        InputNip.clear();
        InputNip.sendKeys("123456789");
        log().info("Wpisujemy NIP");
        InputAdress.clear();
        InputAdress.sendKeys("Kalisz");
        log().info("Wpisujemy Adres");
        InputFullAdress.clear();
        InputFullAdress.sendKeys("ul.Sienkiweicza 3/4a");
        log().info("Wpisujemy uzupełnienie adresu");
        InputPostcode.clear();
        InputPostcode.sendKeys("62-800");
        log().info("Wpisujemy kod pocztowy");
        InputCity.clear();
        InputCity.sendKeys("Kalisz");
        log().info("Wpisujemy miasto");
        Select selectOptions = new Select(SelectCounty);
        WaitForElement.waitUntilElementIsVisible(SelectCounty);
        selectOptions.selectByValue("14");
        log().info("Wybieramy kraj 'Polska'");
        InputPhone.clear();
        InputPhone.sendKeys("503412012");
        log().info("Wpisujemy numer telefonu");
        ButtonNext2.click();
        log().info("Klikamy w przycisk 'Dalej'");
        TextAreaComment.clear();
        TextAreaComment.sendKeys("Komentarz do zamówienia");
        log().info("Wpisujemy komentarz pod sposobem dostawy");
        ButtonNext3.click();
        log().info("Klikamy w przycisk 'Dalej'");
        PaymentCheck.click();
        log().info("Klikamy 'Zapłać czekiem'");
        ButtonAgree.click();
        log().info("Klikamy w przycisk 'Zgadzam się z ..'");
        ButtonSubmitYourOrder.click();
        log().info("Klikamy w przycisk 'Złóż zamówienie'");

        return this;
    }
}