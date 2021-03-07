package com.endava.test.tests;

import com.endava.test.controller.AmazonController;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class EndavaTest {

    AmazonController amazonController = new AmazonController();

    @BeforeClass
    public void setUp(){
        amazonController.startAmazonPage();
    }

    @Test
    public void searchProductTest(){
        amazonController.seachProduct();
        amazonController.clickOnSearch();
        amazonController.isProductNamePresent();
        amazonController.clickOnProduct();
        amazonController.isProductTitlePresent();
        amazonController.isPaperbackPresent();
        amazonController.isAddToCartButtonPresent();
        amazonController.isBuyNowButtonPresent();
        amazonController.isBuyNewRadioButtonSelected();
    }

    @AfterClass
    public void closeChrome(){
        amazonController.closeDriver();
    }

}
