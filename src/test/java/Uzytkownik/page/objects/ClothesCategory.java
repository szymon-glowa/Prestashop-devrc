package Uzytkownik.page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ClothesCategory extends BasePage {
    @FindBy(xpath = "//*[@id=\"category-3\"]/a")
    private WebElement clothes;

    @Step("Wyświetlanie kategorii 'CLOTHES'")
    public ProductCategory ClickOnTheClothes() {

        clothes.click();
        log().info("Kliknięcie w zakładke 'clothes'");

        return new ProductCategory();
    }
}
