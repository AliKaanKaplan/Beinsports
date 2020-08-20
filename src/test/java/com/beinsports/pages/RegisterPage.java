package com.beinsports.pages;

import org.openqa.selenium.By;

public class RegisterPage {

    private BasePage page = new BasePage();

    private static By firstNameTextLocator = By.name("FirstName");
    private static By lastNameTextLocator = By.name("LastName");
    private static By emailTextLocator = By.name("EmailOrPhone");
    private static By passwordTextLocator = By.name("Password");
    private static By createAccountLocator = By.xpath("//input[@class='border-none bc-subscribe']");

    public void fillTheAccountInfo(String firstName, String lastName, String emailAddress, String password){
        page.clearAndType(firstNameTextLocator,firstName);
        page.clearAndType(lastNameTextLocator,lastName);
        page.clearAndType(emailTextLocator,emailAddress);
        page.clearAndType(passwordTextLocator,password);
    }

    public void swipePage(){
        page.swipeToDown();
    }

    public void clickCreateAccountButton(){

        page.click(createAccountLocator);

    }

}
