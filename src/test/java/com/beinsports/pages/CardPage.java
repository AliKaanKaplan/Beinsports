package com.beinsports.pages;

import com.beinsports.utils.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CardPage {
    private BasePage page = new BasePage();
    private WebDriver driver = DriverFactory.getChromeDriver();
    private SubscribePage subscribePage = new SubscribePage();

    private static By cardNameLocator = By.name("Ecom_Payment_Card_Name");
    private static By cardNumberLocator = By.name("Ecom_Payment_Card_Number");
    private static By expiryDateMonthLocator = By.name("Ecom_Payment_Card_ExpDate_Month");
    private static By expiryDateYearLocator = By.name("Ecom_Payment_Card_ExpDate_Year");
    private static By cardVerificationLocator = By.name("Ecom_Payment_Card_Verification");
    private static By cardButtonLocator = By.id("submit3");
    private static By errorTextLocator = By.className("ncoltxtc");
    private static By chargeCountLocator = By.xpath("//table[@id='ncol_ref']//tr[2]//td[2]");

    public void fiilTheCreditCardPage() {
        page.clearAndType(cardNameLocator, "ALI KAAN KAPLAN");
        page.clearAndType(cardNumberLocator, "12121212121212121212");
        selectToDropDown();
        page.clearAndType(cardVerificationLocator, "2132131231");
        page.click(cardButtonLocator);
    }

    public void validateErrorText() {
        Assert.assertTrue("Sayfadaki error mesajı görünmemektedir.",
                subscribePage.compareToText(errorTextLocator, "Card number incorrect or incompatible"));
    }

    public void validateChargeCount() {
        Assert.assertTrue("Sayfadaki ücret mesajı öngörülen ücret ile eşleşmemektedir. .",
                subscribePage.compareToText(chargeCountLocator, "1.00"));
    }


    public void selectToDropDown() {
        Select selectionMonth;
        selectionMonth = new Select(driver.findElement(expiryDateMonthLocator));
        selectionMonth.selectByIndex(1);
        Select selectionYear;
        selectionYear = new Select(driver.findElement(expiryDateYearLocator));
        selectionYear.selectByIndex(5);
    }


}
