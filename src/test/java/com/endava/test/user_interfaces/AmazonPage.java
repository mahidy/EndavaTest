package com.endava.test.user_interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage{

    By search = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");
    By nameOfProduct = By.xpath("//a//span[contains(text(),\"A Practitioner's Guide to Software Test Design\")]");
    By productTitle = By.cssSelector("span[id='productTitle']");
    By paperBackTab = By.id("mediaTab_heading_2");
    By addToCartButton = By.id("add-to-cart-button");
    By BuyNowButton =  By.id("buy-now-button");
    By radioButtonSelected = By.xpath("//*[@id=\"newAccordionRow_263333\"]/div/div[1]");

    private WebDriver driver;

    public void startPage(String url){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void searchProduct(String productName){
        driver.findElement(search).sendKeys(productName);
    }

    public void clickOnSearchButton(){
        driver.findElement(searchButton).click();
    }

    public void clickOnProduct(){
        driver.findElement(nameOfProduct).click();
    }

    public String getProductName(){
        return driver.findElement(nameOfProduct).getText();
    }

    public String getProductTtitle(){
        return driver.findElement(productTitle).getText();
    }

    public Boolean getTextPaperback(){
        return driver.findElement(paperBackTab).isDisplayed();
    }

    public Boolean getAddToCartButton(){
        return  driver.findElement(addToCartButton).isDisplayed();
    }

    public Boolean getBuyButton(){
        return  driver.findElement(BuyNowButton).isDisplayed();
    }

    public String getRadioButtonValue(){
        return driver.findElement(radioButtonSelected).getAttribute("aria-checked");
    }

    public void closeDriver(){
        driver.close();
    }
}
