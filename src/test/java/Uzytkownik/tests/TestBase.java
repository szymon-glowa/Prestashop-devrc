package Uzytkownik.tests;

import Uzytkownik.configuration.ConfigurationProperties;
import Uzytkownik.configuration.PropertiesLoader;
import driver.manager.BrowserType;
import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static Uzytkownik.navigation.ApplicationURLs.APPLICATION_URL;
import static Uzytkownik.navigation.ApplicationURLs.APPLICATION_URL;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    @Step("Ładowanie konfiguracji z configuration.properties")
    @BeforeClass
    public void beforeClass() {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties propertiesFromFile = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(propertiesFromFile);

    }

    @Parameters("browser")
    @Step("Konfigurowanie przeglądarki oraz przejśćie do strony głównej")
    @BeforeMethod
    public void beforeTest(@Optional BrowserType browserType) {
        DriverManager.setWebDriver(browserType);
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateTo(APPLICATION_URL);
        DriverManager.getWebDriver().navigate().to(DriverManager.getWebDriver().getCurrentUrl());
    }

    @Step("Utylizacja przeglądarki")
    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();

    }

}
