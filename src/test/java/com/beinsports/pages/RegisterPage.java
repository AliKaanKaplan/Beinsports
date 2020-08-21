package com.beinsports.pages;

import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPage {

    private BasePage page = new BasePage();

    private static By firstNameTextLocator = By.name("FirstName");
    private static By lastNameTextLocator = By.name("LastName");
    private static By emailTextLocator = By.name("EmailOrPhone");
    private static By passwordTextLocator = By.name("Password");
    private static By createAccountLocator = By.xpath("//input[@class='border-none bc-subscribe']");

    public void fillTheAccountInfo(String firstName, String lastName, String password) {
        String emailAddress = randomMail() + "@gmail.com";
        page.clearAndType(firstNameTextLocator, firstName);
        page.clearAndType(lastNameTextLocator, lastName);
        page.clearAndType(emailTextLocator, emailAddress);
        page.clearAndType(passwordTextLocator, password);
    }

    public void swipePage() {
        page.swipeToDown();
    }

    public void clickCreateAccountButton() {

        page.click(createAccountLocator);

    }

    protected String randomMail() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

}
