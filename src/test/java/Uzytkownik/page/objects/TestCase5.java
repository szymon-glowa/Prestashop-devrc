package Uzytkownik.page.objects;

import Uzytkownik.tests.TestBase;
import Uzytkownik.waits.WaitForElement;
import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TestCase5 extends BasePage  {
    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/input[2]")
    private WebElement InputSearch;

    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/button/i")
    private WebElement Search;

    @Step("Wyszukanie produktu 'T-shirt'")
    public TestCase5 SearchTshirt() throws InterruptedException {

        InputSearch.clear();
        InputSearch.sendKeys("T-shirt");
        log().info("Wpisujemy w pole wyszukiwania 'T-shirt'");

        Search.click();
        log().info("Kliknięcie w przycisk wyszukaj ");
        Uspij();

        return this;
    }
}
