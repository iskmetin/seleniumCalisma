package com.cydeo.tests.day02.beforeAfter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeDenemeAfter {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @Test
    public void practiceSitesineGit(){
        driver.get("https://practice.cydeo.com/");
        String expectedTitle="Practice";
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }
    @Test
    public void practiceSitesineGit2(){
        driver.get("https://practice.cydeo.com/");
        String expectedTitle="Prctice";
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    @AfterMethod
    public void kapat(){
        driver.quit();
    }
}
