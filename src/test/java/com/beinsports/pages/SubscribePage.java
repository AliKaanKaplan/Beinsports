package com.beinsports.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class SubscribePage {

    private BasePage page = new BasePage();

    private static By subscribeForOneMonthLocator = By.xpath("//body/div/div/div/div[1]/div[2]/div[2]/a[1]");
    private static By priceLocator = By.xpath("//*[@class=\"title fz-18\"]");

    public void clickSubscribeForOneMothButton() {
        page.click(subscribeForOneMonthLocator);
    }

    public void validatePricess() {
        Assert.assertTrue("Sayfadaki tutar doğru değil.",compareToText(priceLocator,"19.99"));
    }


    public boolean compareToText(By element, String expected) {
        if (page.getText(element).contains(expected)) {
            return true;
        }
        return false;

    }


}
