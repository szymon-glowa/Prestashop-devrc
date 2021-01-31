package Uzytkownik.tests;

import Uzytkownik.page.objects.*;
import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Uzytkownik.navigation.ApplicationURLs.APPLICATION_URL;

public class AllTests extends TestBase {

    @Parameters({"email", "email1", "email2", "password"})
    @Test
    @Description("Test funkcjonalny sklepu internetowego" +
            "Sprawdzenie formularza kontaktowego")
    public void Test(@Optional String email,@Optional String email1,@Optional String email2,@Optional String password) throws InterruptedException {
        DriverUtils.navigateTo(APPLICATION_URL);
        TestCase1 testCase1 = new TestCase1();
        TestCase6 testCase6 = new TestCase6();
        TestCase8 testCase8 = new TestCase8();
        TestCase9 testCase9 = new TestCase9();
        TestCase10 testCase10 = new TestCase10();
        TestCase11 testCase11 = new TestCase11();
        TestCase12 testCase12 = new TestCase12();
        testCase1
                .ClickOnTheHomePage()
                .ClickOnTheClothes()
                .ClickOnTheProduct()
                .ClickOnTheArt()
                .SearchTshirt();
        testCase6
                .UserRegistration(email, password)
                .UserLogin(email, password);
        testCase8
                .ContactForm(email);
        testCase9
                .ProductPurchaseWithLogin(email, password);
        testCase10
                .ProductPurchaseAsGuest(email1);
        testCase11
                .ProductPurchaseAsLoggedUser(email, password);
        testCase12
                .ProductPurchaseAsGuestWithRegistration(email2, password);
    }
}
