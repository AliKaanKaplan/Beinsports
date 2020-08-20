package com.beinsports.pages;

import org.openqa.selenium.By;

public class PaymentPage {
    private BasePage page = new BasePage();

    private static By paymentCheckBoxLocator = By.xpath("//div[@class='custom-checkbox']//label");
    private static By paymentButton = By.name("pay-now");

    public void clickPaymentButton() throws InterruptedException {
        page.click(paymentCheckBoxLocator);
        Thread.sleep(5000);
        page.click(paymentButton);
    }
}
