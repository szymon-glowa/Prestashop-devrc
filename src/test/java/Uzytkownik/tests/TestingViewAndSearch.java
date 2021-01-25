package Uzytkownik.tests;

import Uzytkownik.page.objects.*;
import driver.manager.DriverUtils;

import io.qameta.allure.Description;

import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;

import static Uzytkownik.navigation.ApplicationURLs.APPLICATION_URL;
import static org.testng.Assert.*;


public class TestingViewAndSearch extends TestBase {

    @Test
    @Description("Test funkcjonalny sklepu internetowego" +
            "Sprawdzenie widoku stron")
    public void Test1() throws InterruptedException {
        DriverUtils.navigateTo(APPLICATION_URL);
        TestCase1 testCase1 = new TestCase1();
        testCase1
                .ClickOnTheHomePage()
                .ClickOnTheClothes()
                .ClickOnTheProduct()
                .ClickOnTheArt()
                .SearchTshirt();
    }

}
