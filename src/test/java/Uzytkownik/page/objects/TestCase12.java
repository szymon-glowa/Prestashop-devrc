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

public class TestCase12 extends BasePage {
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
    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]")
    private WebElement ChooseSex;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[2]/div[1]/input")
    private WebElement InputFirstName1;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[3]/div[1]/input")
    private WebElement InputLastName1;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[4]/div[1]/input")
    private WebElement InputEmial;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/input")
    private WebElement InputPassword;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[6]/div[1]/input")
    private WebElement InputDateOfBirth;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[8]/div[1]/span/label/input")
    private WebElement ClickMessages;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[10]/div[1]/span/label/input")
    private WebElement ClickAccept;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/footer/button")
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
    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[1]")
    private WebElement LogOut;

    @Step("Próba zakup produktu prostego [Zakup i rejestracja podczas zakupu]")
    public TestCase12 ProductPurchaseAsGuestWithRegistration(String email2,String password) throws InterruptedException {
        LogOut.click();
        log().info("Wylogowanie się");
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

        ChooseSex.click();
        log().info("Wybranie nazwy kontatku 'Pan'");
        InputFirstName1.clear();
        InputFirstName1.sendKeys("Jan");
        log().info("Wpisujemy Imię");
        InputLastName1.clear();
        InputLastName1.sendKeys("Kowalski");
        log().info("Wpisujemy Nazwisko");
        InputEmial.clear();
        InputEmial.sendKeys(email2);
        log().info("Wpisujemy adres");
        InputPassword.clear();
        InputPassword.sendKeys(password);
        log().info("Wpisujemy hasło");
        InputDateOfBirth.clear();
        InputDateOfBirth.sendKeys("1971-04-14");
        log().info("Wpisujemy date urodzenia");
        ClickMessages.click();
        log().info("Zaznaczenie opcji 'Wiadomość o przetwarzaniu danych..'");
        ClickAccept.click();
        log().info("Zaznaczenie opcji 'Akcpetuje ogólne warunki'");
        ButtonNext.click();
        log().info("Kliknięcie w przycisk 'Dalej'");

        InputAlias.clear();
        InputAlias.sendKeys("poczta.email@poczta.pl");
        log().info("Wpisujemy Alias");
        InputFirstName.clear();
        InputFirstName.sendKeys("Jan");
        log().info("Wpisujemy Imię");
        InputLastName.clear();
        InputLastName.sendKeys("Kowalski");
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