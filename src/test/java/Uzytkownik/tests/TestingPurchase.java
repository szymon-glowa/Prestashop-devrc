package Uzytkownik.tests;

import Uzytkownik.page.objects.*;
import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static Uzytkownik.navigation.ApplicationURLs.APPLICATION_URL;

public class TestingPurchase extends TestBase {
    @Test
    @Description("Test funkcjonalny sklepu internetowego" +
            "Sprawdzenie zakupu produktu w czterech wariantach")
    public void Test4() throws InterruptedException {
        DriverUtils.navigateTo(APPLICATION_URL);
        TestCase9 testCase9=new TestCase9();
        TestCase10 testCase10=new TestCase10();
        TestCase11 testCase11=new TestCase11();
        TestCase12 testCase12=new TestCase12();

//        testCase9
//                .ProductPurchaseWithLogin();
//        testCase10
//                .ProductPurchaseAsGuest();
//        testCase11
//                .ProductPurchaseAsLoggedUser();

        testCase12
                .ProductPurchaseAsGuestWithRegistration();

    }
}
