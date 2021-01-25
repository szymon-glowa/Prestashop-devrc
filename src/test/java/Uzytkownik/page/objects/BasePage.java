package Uzytkownik.page.objects;

import com.github.javafaker.Faker;
import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    private Logger logger = LogManager.getLogger(this.getClass().getName());

    public Faker faker = new Faker(new Locale("pl"));
    public Random random=new Random();
    public int rand=random.nextInt(50);

    public String getFakerFirstName() {
        String firstname=faker.name().firstName();
        return firstname;
    }

    public String getFakerLastName() {
        String lastname=faker.name().lastName();
        return lastname;
    }

    public String getFakerEmail() {
        String email=faker.name().firstName()+rand+"@gamil.com";
        return email;
    }

    public BasePage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    protected Logger log() {
        return logger;
    }

    public void Uspij() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }



}
