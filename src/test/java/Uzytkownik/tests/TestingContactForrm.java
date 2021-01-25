package Uzytkownik.tests;

import Uzytkownik.page.objects.TestCase6;
import Uzytkownik.page.objects.TestCase8;
import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static Uzytkownik.navigation.ApplicationURLs.APPLICATION_URL;

public class TestingContactForrm extends TestBase {
    @Test
    @Description("Test funkcjonalny sklepu internetowego" +
            "Sprawdzenie formularza kontaktowego")
    public void Test3() throws InterruptedException {
        DriverUtils.navigateTo(APPLICATION_URL);
        TestCase8 testCase8 = new TestCase8();
        testCase8
                .ContactForm();

    }
}
