package driver.manager;

public enum BrowserType {

    FIREFOX("firefox"),
    CHROME("chrome"),
    EDGE("edge"),
    OPERA("opera"),
    SAFARI("safari");

    private final String browser;

    BrowserType(String browser) {
        this.browser = browser;
    }

}
