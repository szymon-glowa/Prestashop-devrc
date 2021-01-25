package Uzytkownik.utils.testng.listeners;

import Uzytkownik.utils.ScreenShotMaker;
import Uzytkownik.utils.getAdressUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {
    getAdressUrl ga=new getAdressUrl();
    //Instancja Logger - do logowania wiadomości
    private Logger logger = LogManager.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Starting test: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test {} passed successfully", result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.info("Test {} failed!", result.getName());
        ScreenShotMaker.makeScreenShot();
        ga.saveLastPageUrl();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info("Test {} skipped!", result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        logger.info("Test {} failed!", result.getName());
        ScreenShotMaker.makeScreenShot();
        ga.saveLastPageUrl();
    }

    //Metoda onStart nie otrzymała żadnej implementacji, aby nie zaśmiecać logu zbyt dużą ilością informacji
    @Override
    public void onStart(ITestContext context) {
    }

    //Metoda onFinish nie otrzymała żadnej implementacji, aby nie zaśmiecać logu zbyt dużą ilością informacji
    @Override
    public void onFinish(ITestContext context) {
    }
}