package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {

    private WebDriver webDriver;

    public StartPage(WebDriver driver) {
        this.webDriver = driver;
    }

    private By searchField = By.className("gmail-nav__nav-link__sign-in");

    public AuthenticationLoginPage clickLoginButton() {
        webDriver.findElement(searchField).click();
        return new AuthenticationLoginPage(webDriver);
    }
}
