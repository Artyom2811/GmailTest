import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

class ChromeWebDriver {

    WebDriver webDriver;

    public ChromeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\java\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
