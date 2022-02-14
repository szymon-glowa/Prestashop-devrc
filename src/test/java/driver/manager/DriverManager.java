package driver.manager;

import Uzytkownik.configuration.TestRunProperties;
import driver.manager.BrowserFactory;
import driver.manager.BrowserType;
import driver.manager.listeners.WebDriverEventListenerRegistrar;
import org.openqa.selenium.WebDriver;

import static Uzytkownik.configuration.TestRunProperties.getBrowserToRun;
import static Uzytkownik.configuration.TestRunProperties.getIsRemoteRun;
import static driver.manager.BrowserType.FIREFOX;


public class DriverManager {

    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    private static ThreadLocal<BrowserType> browserTypeThreadLocal = new ThreadLocal<>();
    private DriverManager() {
    }

    //Metoda służy od ustawiania typu przeglądarki dla danego wątku
    public static void setWebDriver(BrowserType browserType) {
        WebDriver browser = null;
        if (browserType == null) {
            browserType = getBrowserToRun();
            browser = new BrowserFactory(browserType, getIsRemoteRun()).getBrowser();
        } else {
            browser = new BrowserFactory(browserType, getIsRemoteRun()).getBrowser();
        }

        browserTypeThreadLocal.set(browserType);
        webDriverThreadLocal.set(browser);
        browser = WebDriverEventListenerRegistrar.registerWebDriverEventListener(browser);
        browserTypeThreadLocal.set(browserType);
        webDriverThreadLocal.set(browser);
    }

    //tworzy instancje WebDrivera i dostarcza ją do testow
    public static WebDriver getWebDriver() {

        if (webDriverThreadLocal.get() == null) {
            throw new IllegalStateException("WebDriver Instance was null! Please create instance of WebDriver using setWebDriver!");
        }
        return webDriverThreadLocal.get();
    }

    public static void disposeDriver() {
        webDriverThreadLocal.get().close();
        if (!browserTypeThreadLocal.get().equals(FIREFOX)) {
            webDriverThreadLocal.get().quit();
        }

        //Usunięcie zmiennych typu BrowserType oraz WebDriver dla danego wątku
        webDriverThreadLocal.remove();
        browserTypeThreadLocal.remove();
    }
}