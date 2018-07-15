package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationLoginPage {

    private WebDriver webDriver;

    AuthenticationLoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By loginField = By.className("whsOnd");
    private By nextButton = By.id("identifierNext");

    public AuthenticationLoginPage setLoginField(String value) {
        webDriver.findElement(loginField).sendKeys(value);
        return this;
    }

    public AuthenticationPasswordPage clickNextButton() {
        webDriver.findElement(nextButton).click();
        return new AuthenticationPasswordPage(webDriver);
    }
}

