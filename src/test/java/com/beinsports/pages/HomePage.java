package com.beinsports.pages;

import org.openqa.selenium.By;

public class HomePage {

    private static By subscribeButtonLocator = By.name("Subscribe");
    private BasePage page = new BasePage();

    public void clickSubscribeButton() {
        page.click(subscribeButtonLocator);
    }

}
