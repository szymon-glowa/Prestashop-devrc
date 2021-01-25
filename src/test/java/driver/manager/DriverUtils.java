package driver.manager;

import java.util.concurrent.TimeUnit;

public class DriverUtils {

    public static void setInitialConfiguration(){

        driver.manager.DriverManager.getWebDriver().manage().window().maximize();

    }

    public static void navigateTo(String pageUrl){

        driver.manager.DriverManager.getWebDriver().navigate().to(pageUrl);
    }
}
