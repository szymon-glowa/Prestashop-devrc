package Uzytkownik.utils;

import driver.manager.DriverManager;
import io.qameta.allure.Attachment;

public class getAdressUrl {

    @Attachment(value = "LastPageUrl", type = "txt")
    public static String saveLastPageUrl() {
        return DriverManager.getWebDriver().getCurrentUrl();
    }
}
