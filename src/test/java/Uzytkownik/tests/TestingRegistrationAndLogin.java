package Uzytkownik.tests;

import Uzytkownik.page.objects.TestCase1;
import Uzytkownik.page.objects.TestCase6;
import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static Uzytkownik.navigation.ApplicationURLs.APPLICATION_URL;

public class TestingRegistrationAndLogin extends TestBase {
    @Test
    @Description("Test funkcjonalny sklepu internetowego" +
            "Sprawdzenie rejestracji oraz logowania")
    public void Test2() throws InterruptedException {
        DriverUtils.navigateTo(APPLICATION_URL);
        TestCase6 testCase6 = new TestCase6();
        testCase6
                .UserRegistration()
                .UserLogin();

    }

}
