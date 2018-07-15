import Pages.StartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GmailTests {

    WebDriver webDriver;
    StartPage mainPage;


    @AfterMethod
    public void closeBrowser() {
        webDriver.quit();
    }

    @Test
    public void checkEnterMail() {
        webDriver = new ChromeWebDriver().webDriver;
        mainPage = new StartPage(webDriver);
        webDriver.get("https://www.google.com/intl/ru/gmail/about/");

        mainPage.clickLoginButton()
                .setLoginField("Artyom2811@gmail.com")
                .clickNextButton()
                .setPasswordField("dajeneznau10")
                .clickNextButton()
                .clickAccountInfoButton();
        assertEquals("Не подтвержден вход в почту", "artyom2811@gmail.com",
                webDriver.findElement(By.className("gb_Db")).getText());
    }

    @Test
    public void sendLetterYourselfAndConfirmSend() {
        webDriver = new ChromeWebDriver().webDriver;
        mainPage = new StartPage(webDriver);
        webDriver.get("https://www.google.com/intl/ru/gmail/about/");

        mainPage.clickLoginButton()
                .setLoginField("Artyom2811@gmail.com")
                .clickNextButton()
                .setPasswordField("dajeneznau10")
                .clickNextButton()
                .clickWriteLetterButton()
                .setAdressToSendLetterField("Artyom2811@gmail.com")
                .setBodyToSendLetterField("123")
                .clickSendLetterButton();
        WebDriverWait waitLinkSave = new WebDriverWait(webDriver, 5);
        waitLinkSave.until(ExpectedConditions.textToBePresentInElement(webDriver.findElement(By.className("vh")),
                "Письмо отправлено. Просмотреть сообщение"));
        assertEquals("Не подтверждено отправления письма", "Письмо отправлено. Просмотреть сообщение",
                webDriver.findElement(By.className("vh")).getText());
    }

    @Test
    public void deleteAndCheckResultDeliverMail() {
        webDriver = new ChromeWebDriver().webDriver;
        mainPage = new StartPage(webDriver);
        webDriver.get("https://www.google.com/intl/ru/gmail/about/");

        mainPage.clickLoginButton()
                .setLoginField("Artyom2811@gmail.com")
                .clickNextButton()
                .setPasswordField("dajeneznau10")
                .clickNextButton()
                .clickFirstRowCheckbox()
                .clickDeleteLeterButton();
        assertEquals("Не подтверждено отправления письма", "Цепочка отправлена в корзину.  Подробнее  Отменить",
                webDriver.findElement(By.className("vh")).getText());
        System.out.println();
    }
}
