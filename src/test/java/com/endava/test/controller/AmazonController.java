package com.endava.test.controller;

import com.endava.test.user_interfaces.AmazonPage;
import org.testng.Assert;

public class AmazonController {

    String url = "https://www.amazon.com/";
    String productSearch = "Software Test Design";
    String productName ="A Practitioner's Guide to Software Test Design";

    AmazonPage amazonPage = new AmazonPage();

    public void startAmazonPage(){
        amazonPage.startPage(url);
    }

    public void seachProduct(){
        amazonPage.searchProduct(productSearch);
    }

    public void clickOnSearch(){
        amazonPage.clickOnSearchButton();
    }

    public void isProductNamePresent(){
        Assert.assertEquals(amazonPage.getProductName(), productName, "Name product is not present");
    }

    public void clickOnProduct(){
        amazonPage.clickOnProduct();
    }

    public void isProductTitlePresent(){
        Assert.assertEquals(amazonPage.getProductTtitle(), productName, "Title of product is not present");
    }

    public void isPaperbackPresent(){
        Assert.assertTrue(amazonPage.getTextPaperback(), "The paperback is not present");
    }

    public void isAddToCartButtonPresent(){
        Assert.assertTrue(amazonPage.getAddToCartButton(), "Add to cart button is not present");
    }

    public void isBuyNowButtonPresent(){
        Assert.assertTrue(amazonPage.getBuyButton(), "Buy now button is not present");
    }

    public void isBuyNewRadioButtonSelected(){
        Assert.assertTrue(Boolean.parseBoolean(amazonPage.getRadioButtonValue()), "Buy new radio button is selected");
    }

    public void closeDriver(){
        amazonPage.closeDriver();
    }
}
