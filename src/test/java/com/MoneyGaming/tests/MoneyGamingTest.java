package com.MoneyGaming.tests;

import com.MoneyGaming.pages.HomePage;
import com.MoneyGaming.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoneyGamingTest extends TestBase{

    HomePage home=new HomePage();
    RegistrationPage register=new RegistrationPage();

    @Test
    public void test(){

        home.clickFirsJoin();
        register.fillTheForm();
        String actualWarningMessage = register.getWarningMessage();
        String expectedWarningMessage="‘ This field is required’ ";

        Assert.assertEquals(actualWarningMessage,expectedWarningMessage,"Verify that the warning message is same");




    }

}
