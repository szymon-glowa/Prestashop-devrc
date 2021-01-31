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


public class TestCase8 extends BasePage  {
    @FindBy(xpath = "/html/body/main/header/nav/div/div/div[1]/div[1]/div/div/a")
    private WebElement Contact;
    @FindBy(xpath = "//*[@id=\"content\"]/section/form/section/div[2]/div/select")
    private WebElement TopicSelector;
    @FindBy(xpath = "//*[@id=\"content\"]/section/form/section/div[3]/div/input")
    private WebElement InputAdresEmail;
    @FindBy(xpath = "//*[@id=\"content\"]/section/form/section/div[5]/div/textarea")
    private WebElement TextArea;
    @FindBy(xpath = "//*[@id=\"content\"]/section/form/footer/input[3]")
    private WebElement ButtonSend;

    @Step("Walidacja formularza kontaktowego")
    public TestCase8 ContactForm(String email) throws InterruptedException {
        WaitForElement waitForElement = new WaitForElement();
        Contact.click();
        log().info("Przejście do formularza kontaktowego");
        Select selectOptions = new Select(TopicSelector);
        WaitForElement.waitUntilElementIsVisible(TopicSelector);
        selectOptions.selectByValue("1");
        log().info("Wybieram Opcje 'Webmaster'");
        Uspij();
        InputAdresEmail.clear();
        InputAdresEmail.sendKeys(email);
        log().info("Wpisujemy w pole  'E-mail'");
        TextArea.clear();
        TextArea.sendKeys("Wiadomość tekstowa");
        log().info("Wpisujemy w pole 'Wiadomość' -> 'Wiadomość tekstowa'");
        ButtonSend.click();
        log().info("Wysłanie formularza kontaktowego");
        return this;

    }
}
