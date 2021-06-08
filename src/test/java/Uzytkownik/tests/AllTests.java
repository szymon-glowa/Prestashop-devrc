package Uzytkownik.tests;

import Uzytkownik.page.objects.*;
import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Uzytkownik.navigation.ApplicationURLs.APPLICATION_URL;

public class AllTests extends TestBase {
    @Parameters({"email", "email1", "email2", "password","browser"})
    @Test
    @Description("Test funkcjonalny sklepu internetowego" +
            "Sprawdzenie formularza kontaktowego")
    public void Test(@Optional String email,@Optional String email1,@Optional String email2,@Optional String password, @Optional String browser) throws InterruptedException {
        DriverUtils.navigateTo(APPLICATION_URL);

        final boolean b = email.equals("test") && email1.equals("test") && email2.equals("test");
        if(browser.equals("CHROME")){
            if(b){
                email=BasePage.getFakerEmail();
                email1=BasePage.getFakerEmail();
                email2=BasePage.getFakerEmail();
            }
        }else if(browser.equals("FIREFOX")){
            if(b){
                email=BasePage.getFakerEmail();
                email1=BasePage.getFakerEmail();
                email2=BasePage.getFakerEmail();
            }
        }else if(browser.equals("EDGE")){
            if(b){
                email=BasePage.getFakerEmail();
                email1=BasePage.getFakerEmail();
                email2=BasePage.getFakerEmail();
            }
        }
        HomePage homePage = new HomePage();
        UserRegistration userRegistration = new UserRegistration();
        ValidationContactForm validationContactForm = new ValidationContactForm();
        PurchaseAndLogin purchaseAndLogin = new PurchaseAndLogin();
        PurchaseAsAGuest purchaseAsAGuest = new PurchaseAsAGuest();
        PurchaseAsLogged purchaseAsLogged = new PurchaseAsLogged();
        PurchaseAndRegistrationDuringPurchase purchaseAndRegistrationDuringPurchase = new PurchaseAndRegistrationDuringPurchase();
        homePage
                .ClickOnTheHomePage()
                .ClickOnTheClothes()
                .ClickOnTheProduct()
                .ClickOnTheArt()
                .SearchTshirt()
                .UserRegistration(email, password)
                .UserLogin(email, password)
                .ContactForm(email)
                .ProductPurchaseWithLogin(email, password)
                .ProductPurchaseAsGuest(email1)
                .ProductPurchaseAsLoggedUser(email, password)
                .ProductPurchaseAsGuestWithRegistration(email2, password);
    }
}
