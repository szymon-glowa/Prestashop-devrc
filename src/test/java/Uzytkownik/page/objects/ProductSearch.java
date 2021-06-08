package Uzytkownik.page.objects;

import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductSearch extends BasePage  {
    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/input[2]")
    private WebElement InputSearch;

    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/button/i")
    private WebElement Search;

    @Step("Wyszukanie produktu 'T-shirt'")
    public UserRegistration SearchTshirt() throws InterruptedException {

        InputSearch.clear();
        InputSearch.sendKeys("T-shirt");
        log().info("Wpisujemy w pole wyszukiwania 'T-shirt'");

        Search.click();
        log().info("Kliknięcie w przycisk wyszukaj ");


        return new UserRegistration();
    }
}
