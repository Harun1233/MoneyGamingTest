package com.MoneyGaming.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    Select select;

    @FindBy(css = "#title")
    public WebElement title;
    @FindBy(css = "#forename")
    public WebElement firstName;
    @FindBy(xpath = "//input[@name='map(lastName)']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@name='map(terms)']")
    public WebElement termsCondition;
    @FindBy(css = "#form")
    public WebElement regButton;
    @FindBy(xpath = "//label[@for='dob']")
    public WebElement warningMessage;

    public void fillTheForm(){

        select=new Select(title);
        select.selectByVisibleText("Mr");

        firstName.sendKeys("Harun");
        lastName.sendKeys("Onat");
        termsCondition.click();
        regButton.click();


    }

    public String getWarningMessage(){
        return warningMessage.getText();
    }






}
