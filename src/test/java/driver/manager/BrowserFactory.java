package driver.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BrowserFactory {

    private static final String MESSAGE_UNKNOWN_BROWSER = "Unknown browser type! Please check your configuration";

    //Pole określające typ przeglądarki
    private BrowserType browserType;



    //Konstruktor dla klasy, który ustawia wartości pól browserType or isRemoteRun
    public BrowserFactory(BrowserType browserType ){

        this.browserType = browserType;
    }

    //Metoda dostarcza obiekt WebDrivera
    public WebDriver getBrowser() {
            //Wybór przeglądarki zdalnej w zależności od wartości pola browserType. Analogicznie jak wyżej
            switch (browserType) {
                case CHROME:
                    //System.setProperty("webdriver.chrome.driver", LocalWebDriverProperties.getChromeWebDriverLocation());
                    WebDriverManager.chromedriver().setup();
                    return new ChromeDriver();
                case FIREFOX:
                    //System.setProperty("webdriver.gecko.driver", LocalWebDriverProperties.getFirefoxWebDriverLocation());
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver();
                case EDGE:
                  //  System.setProperty("webdriver.ie.driver", LocalWebDriverProperties.getInternetExplorerWebDriverLocation());
                    WebDriverManager.edgedriver().setup();
                    return new EdgeDriver();
                case OPERA:
                   // System.setProperty("webdriver.opera.driver", LocalWebDriverProperties.getOperaWebDriverLocation());
                    WebDriverManager.chromiumdriver().setup();
                    return new OperaDriver();
                default:
                    throw new IllegalStateException(MESSAGE_UNKNOWN_BROWSER);
            }


    }


}