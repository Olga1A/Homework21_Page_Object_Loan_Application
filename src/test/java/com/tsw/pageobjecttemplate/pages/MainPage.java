package com.tsw.pageobjecttemplate.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://loan-app.tallinn-learning.ee/loan-decision/
public class MainPage {

    public SelenideElement monthlyPaymentValue = $x("//*[@data-testid='ib-small-loan-calculator-field-monthlyPayment']");
    public SelenideElement loanCalcAmountField = $x("//*[@data-testid='id-small-loan-calculator-field-amount']");
    public SelenideElement errorMessage = $(byText("Oops, something went wrong"));

    public SelenideElement applyNowButton = $("[data-testid='id-small-loan-calculator-field-apply']");
    public SelenideElement usernameField = $("[data-testid='login-popup-username-input']");
    public SelenideElement passwordField = $("[data-testid='login-popup-password-input']");
    public SelenideElement continueButton = $("[data-testid='login-popup-continue-button']");

    public SelenideElement fullnameField = $x("//*[@data-testid='final-page-full-name']");
    public SelenideElement languageField = $x("//*[@data-testid='final-page-communication-language']");
    public SelenideElement finalPageContinueButton = $x("//*[@data-testid='final-page-continue-button']");
    public SelenideElement okSuccessButton = $x("//*[@data-testid='final-page-success-ok-button']");

    public LoanDetailsPage performLoginAndReturnLoanDetailsPage() {
        applyNowButton.click();
        usernameField.setValue("Olga");
        passwordField.setValue("11111111111");
        continueButton.click();
        return new LoanDetailsPage();
    }
}
