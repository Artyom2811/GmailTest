package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver webDriver;

    MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By accountInfoButton = By.className("gb_8a");
    private By writeLetterButton = By.cssSelector("div.T-I.J-J5-Ji.T-I-KE.L3");
    private By adressToSendLetterField = By.id(":o6");
    private By bodyToSendLetterField = By.id(":ot");
    private By SendLetterButton = By.id(":l8");
    private By firstRowCheckbox = By.cssSelector("div[role=checkbox]");
    private By deleteLeterButton = By.className("nX");

    public MainPage clickAccountInfoButton() {
        webDriver.findElement(accountInfoButton).click();
        return this;
    }

    public MainPage clickWriteLetterButton() {
        webDriver.findElement(writeLetterButton).click();
        return this;
    }

    public MainPage setAdressToSendLetterField(String value) {
        webDriver.findElement(adressToSendLetterField).sendKeys(value);
        return this;
    }

    public MainPage setBodyToSendLetterField(String value) {
        webDriver.findElement(bodyToSendLetterField).sendKeys(value);
        return this;
    }

    public MainPage clickSendLetterButton() {
        webDriver.findElement(SendLetterButton).click();
        return this;
    }

    public MainPage clickFirstRowCheckbox() {
        webDriver.findElement(firstRowCheckbox).click();
        return this;
    }

    public MainPage clickDeleteLeterButton() {
        webDriver.findElement(deleteLeterButton).click();
        return this;
    }
}
