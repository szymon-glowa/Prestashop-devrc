package Uzytkownik.page.objects;

import Uzytkownik.waits.WaitForElement;
import com.github.javafaker.Faker;
import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    //pole log4j
    private Logger logger = LogManager.getLogger(this.getClass().getName());

    public static Faker faker = new Faker(new Locale("pl"));
    public static Random random=new Random();
    public static int rand=random.nextInt(500);
    JavascriptExecutor js = (JavascriptExecutor)DriverManager.getWebDriver();

    public static String getFakerFirstName() {
        String firstname=faker.name().firstName();
        return firstname;
    }

    public static String getFakerLastName() {
        String lastname=faker.name().lastName();
        return lastname;
    }

    public static String getFakerEmail() {
        String email=faker.name().firstName()+rand+"@gamil.com";
        return email;
    }

    //musimy użyć implementacji metody initElements(), która jako argumenty przyjmuje WebDriver oraz obiekt strony
    //jest to potrzebne ponieważ używamy PageFactory czyli  @FindBy
    public BasePage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    protected Logger log() {
        return logger;
    }

    public void Uspij() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
    }



}
