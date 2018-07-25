package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPasswordPage {
    private WebDriver webDriver;

    AuthenticationPasswordPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By passwordField = By.name("password");
    private By nextButton = By.id("passwordNext");

    public AuthenticationPasswordPage setPasswordField(String value) {
        webDriver.findElement(passwordField).sendKeys(value);
        return this;
    }

    public MainPage clickNextButton() {
        WebDriverWait waitLinkSave = new WebDriverWait(webDriver, 5);
        waitLinkSave.until(ExpectedConditions.attributeContains(webDriver.findElement(By.className("xkfVF"))
                ,"tabindex","null"));
        webDriver.findElement(nextButton).click();
        return new MainPage(webDriver);
    }
}

