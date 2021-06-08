package Uzytkownik.page.objects;

import Uzytkownik.waits.WaitForElement;
import io.qameta.allure.Step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class ValidationContactForm extends BasePage  {
    @FindBy(xpath = "/html/body/main/header/nav/div/div/div[1]/div[1]/div/div/a")
    private WebElement Contact;
    @FindBy(xpath = "//body/main[1]/section[1]/div[1]/div[2]/section[1]/section[1]/section[1]/form[1]/section[1]/div[2]/div[1]/select[1]")
    private WebElement TopicSelector;
    @FindBy(xpath = "//*[@id=\"content\"]/section/form/section/div[3]/div/input")
    private WebElement InputAdresEmail;
    @FindBy(xpath = "//*[@id=\"content\"]/section/form/section/div[5]/div/textarea")
    private WebElement TextArea;
    @FindBy(xpath = "//*[@id=\"content\"]/section/form/footer/input[3]")
    private WebElement ButtonSend;

    @Step("Walidacja formularza kontaktowego")
    public PurchaseAndLogin ContactForm(String email) throws InterruptedException {
        Contact.click();
        log().info("Przejście do formularza kontaktowego");
        Select selectOptions = new Select(TopicSelector);
        WaitForElement.waitUntilElementIsVisible(TopicSelector);
        selectOptions.selectByValue("1");
        log().info("Wybieram Opcje 'Webmaster'");
        InputAdresEmail.clear();
        InputAdresEmail.sendKeys(email);
        log().info("Wpisujemy w pole  'E-mail'");
        TextArea.clear();
        TextArea.sendKeys("Wiadomość tekstowa");
        log().info("Wpisujemy w pole 'Wiadomość' -> 'Wiadomość tekstowa'");
        ButtonSend.click();
        log().info("Wysłanie formularza kontaktowego");
        return new PurchaseAndLogin();

    }
}
