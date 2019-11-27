package Lesson10.DriversSet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

    private WebDriverFactory() {
    }

    public static WebDriver getDriver(DriversType type) {

        switch (type) {
            case CHROME:

                WebDriverManager.chromedriver().setup();
                WebDriver chromeDriver = new ChromeDriver();
//                ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
                return chromeDriver;

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                WebDriver firefoxDriver = new FirefoxDriver();
                return firefoxDriver;

            case IE:
                WebDriverManager.iedriver().setup();
                WebDriver ieDriver = new InternetExplorerDriver();
                return ieDriver;

            default:
                throw new IllegalArgumentException("No valid driver type");
        }
    }

}
