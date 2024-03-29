package Uzytkownik.tests;

import Uzytkownik.configuration.ConfigurationProperties;
import Uzytkownik.configuration.PropertiesLoader;
import driver.manager.BrowserType;
import driver.manager.DriverManager;
import driver.manager.DriverUtils;
import io.qameta.allure.Step;
import org.testng.annotations.*;

import static Uzytkownik.navigation.ApplicationURLs.APPLICATION_URL;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    //wykona nam się kod w ramach tej metody przed wykonaniem dowolnie innej metody z adnotacją @BeforeMethod
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
    }

    @Step("Utylizacja przeglądarki")
    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();

    }

}
