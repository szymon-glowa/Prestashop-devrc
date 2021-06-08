package Uzytkownik.page.objects;

import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseAsLogged extends BasePage {
    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a/span")
    private WebElement SignIn;
    @FindBy(xpath = "//*[@id=\"login-form\"]/section/div[1]/div[1]/input")
    private WebElement InputLoginEmail;
    @FindBy(xpath = "//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input")
    private WebElement InputLoginPassword;
    @FindBy(xpath = "//*[@id=\"submit-login\"]")
    private WebElement ButtonSignIn;
    @FindBy(xpath = "//*[@id=\"category-3\"]/a")
    private WebElement clothes;
    @FindBy(xpath = "//*[@id=\"js-product-list\"]/div[1]/div[1]/article/div/a/img")
    private WebElement HummingbirdPrintedTShirt;
    @FindBy(xpath = "//*[@id=\"group_2\"]/li[2]/label/input")
    private WebElement ChooseVariant;
    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    private WebElement AddToCart;
    @FindBy(xpath = "//body/div[@id='blockcart-modal']/div[1]/div[1]/div[2]/div[1]")
    private WebElement DivRow;
    @FindBy(xpath = "//body/div[@id='blockcart-modal']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")
    private WebElement GoToOrder;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    private WebElement GoToOrderAgain;
    @FindBy(xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")
    private WebElement ButtonNext2;
    @FindBy(xpath = "//*[@id=\"delivery_option_2\"]")
    private WebElement ChooseMyCarrier;
    @FindBy(xpath = "//textarea[@id='delivery_message']")
    private WebElement TextAreaComment;
    @FindBy(xpath = "//*[@id=\"js-delivery\"]/button")
    private WebElement ButtonNext3;
    @FindBy(xpath = "//input[@id='payment-option-2']")
    private WebElement PaymentTransfer;
    @FindBy(xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")
    private WebElement ButtonAgree;
    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement ButtonSubmitYourOrder;
    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[1]")
    private WebElement LogOut;

    @Step("Próba zakup produktu prostego [Zakup jako zalogowany]")
    public PurchaseAndRegistrationDuringPurchase ProductPurchaseAsLoggedUser(String email, String password) throws InterruptedException {
        LogOut.click();
        log().info("Wylogowanie się");
        SignIn.click();

        InputLoginEmail.clear();
        InputLoginEmail.sendKeys(email);
        log().info("Wpisujemy w pole logowania 'E-mail'");
        InputLoginPassword.clear();
        InputLoginPassword.sendKeys(password);
        log().info("Wpisujemy w pole logowania 'Hasło' ->");
        ButtonSignIn.click();
        log().info("Kliknięcie przycisku 'ZALOGUJ SIĘ'");
        clothes.click();
        log().info("Kliknięcie w zakładke 'clothes'");
        HummingbirdPrintedTShirt.click();
        log().info("Kliknięcie w koszulke 'Hummingbird Printed T-Shirt'");
        ChooseVariant.click();
        log().info("Wybranie wariantu : kolor -> Czarny");
        AddToCart.click();
        log().info("Dodanie koszulki do koszyka");
        Uspij();
        GoToOrder.click();
        log().info("Kliknięcie w przycisk 'Przejdź do realizacji zamówienia'");
        Uspij();
        GoToOrderAgain.click();
        log().info("Ponowne kliknięcie w przycisk 'Przejdź do realizacji zamówienia'");
        ButtonNext2.click();
        log().info("Klikamy w przycisk 'Dalej'");
        ChooseMyCarrier.click();
        log().info("Wybranie opcji 'My Carrier'");
        TextAreaComment.clear();
        TextAreaComment.sendKeys("Komentarz do zamówienia");
        log().info("Wpisujemy komentarz pod sposobem dostawy");
        ButtonNext3.click();
        log().info("Klikamy w przycisk 'Dalej'");
        Uspij();
        PaymentTransfer.click();
        log().info("Klikamy 'Zapłać przelewem'");
        ButtonAgree.click();
        log().info("Klikamy w przycisk 'Zgadzam się z ..'");

        ButtonSubmitYourOrder.click();
        log().info("Klikamy w przycisk 'Złóż zamówienie'");

        return new PurchaseAndRegistrationDuringPurchase();
    }
}