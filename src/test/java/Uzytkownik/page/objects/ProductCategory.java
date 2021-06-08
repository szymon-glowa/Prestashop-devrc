package Uzytkownik.page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductCategory extends BasePage {
    @FindBy(xpath = "//*[@id=\"category-6\"]/a")
    private WebElement product;

    @Step("Wyświetlanie kategorii 'PRODUKTY POWIĄZANE'")
    public ArtCategory ClickOnTheProduct() {

        product.click();
        log().info("Kliknięcie w zakładke 'PRODUKTY POWIĄZANE'");

        return new ArtCategory();
    }
}
