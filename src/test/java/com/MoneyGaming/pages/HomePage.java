package com.MoneyGaming.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//a[text()='Join Now!']")
    public WebElement firstJoinNow;

    public void clickFirsJoin(){
        firstJoinNow.click();
    }

}
