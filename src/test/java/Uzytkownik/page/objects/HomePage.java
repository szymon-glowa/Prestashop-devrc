package Uzytkownik.page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"_desktop_logo\"]/h1/a/img")
    private WebElement home;

    @Step("Wyświetlanie strony głównej")
    public ClothesCategory ClickOnTheHomePage() {
        home.click();
        log().info("Kliknięcie w zakładke 'my store'");

        return new ClothesCategory();
    }


}