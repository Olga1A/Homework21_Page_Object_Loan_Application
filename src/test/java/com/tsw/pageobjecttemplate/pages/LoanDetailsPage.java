package com.tsw.pageobjecttemplate.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoanDetailsPage {

    public SelenideElement fullnameField = $x("//*[@data-testid='final-page-full-name']");

    //Homework 21

    public SelenideElement languageField = $x("//*[@data-testid='final-page-communication-language']");
    public SelenideElement finalPageContinueButton = $x("//*[@data-testid='final-page-continue-button']");
    public SelenideElement okSuccessButton = $x("//*[@data-testid='final-page-success-ok-button']");

}
