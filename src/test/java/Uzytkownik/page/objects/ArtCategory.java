package Uzytkownik.page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ArtCategory extends BasePage  {
    @FindBy(xpath = "//*[@id=\"category-9\"]/a")
    private WebElement ART;

    @Step("Wyświetlanie kategorii 'ART'")
    public ProductSearch ClickOnTheArt() {

        ART.click();
        log().info("Kliknięcie w zakładke 'ART'");

        return new ProductSearch();
    }
}
