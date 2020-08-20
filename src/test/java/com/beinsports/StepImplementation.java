package com.beinsports;

import com.beinsports.pages.*;
import com.thoughtworks.gauge.Step;

public class StepImplementation {

    CardPage cardPage=new CardPage();
    HomePage homePage = new HomePage();
    PaymentPage paymentPage = new PaymentPage();
    RegisterPage registerPage = new RegisterPage();
    SubscribePage subscribePage = new SubscribePage();


    @Step("Click the subscribe button")
    public void clickTheSubscribeButton() { homePage.clickSubscribeButton(); }

    @Step("Register to One Month package")
    public void registerTheOneMonthPackage() {
        subscribePage.clickSubscribeForOneMothButton();
    }

    @Step("Fill Create Account form with <email>")
    public void createAccount(String email) {
        registerPage.fillTheAccountInfo("John", "Doe", email, "doejohn12345");
        registerPage.swipePage();
        registerPage.clickCreateAccountButton();
    }

    @Step("Validate package price")
    public void validatePackagePrice() { subscribePage.validatePricess(); }

    @Step("Make Payment with Credit Card")
    public void clickThePaymentButton() throws InterruptedException { paymentPage.clickPaymentButton(); }

    @Step("Expect for a total charge of 1.00 since this is a free trial package")
    public void validateToCharge() {
        cardPage.validateChargeCount();
    }

    @Step("Provide a test card data and confirm payment(Do not enter a real card data)")
    public void fiilCreditCardInfo() {

        cardPage.fiilTheCreditCardPage();
    }

    @Step("Expect for a error text and finish test with success")
    public void validateError() {

        cardPage.validateErrorText();
    }
}
