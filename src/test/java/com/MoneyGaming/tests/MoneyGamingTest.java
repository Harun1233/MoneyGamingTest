package com.MoneyGaming.tests;

import com.MoneyGaming.pages.HomePage;
import com.MoneyGaming.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoneyGamingTest extends TestBase{

    HomePage home=new HomePage();
    RegistrationPage register=new RegistrationPage();

    @Test
    public void test1(){
        //name of the test
        extentLogger=report.createTest("Money Gaming Test");

        home.clickFirsJoin();
        extentLogger.info("Click to join button on home page");

        register.fillTheForm();
        extentLogger.info("Fill the form");

        String actualWarningMessage = register.getWarningMessage();
        String expectedWarningMessage="This field is requiredd";

        extentLogger.info("Verify that the warning message has been displayed under dob dropdown");
        Assert.assertEquals(actualWarningMessage,expectedWarningMessage,"Verify that the warning message is same");

        extentLogger.pass("Money Gaming test has passed");



    }

}
