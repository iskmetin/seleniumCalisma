package com.cydeo.tests.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2iframe {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @Test
    public void alertGit() throws InterruptedException {
        driver.get("https://practice.cydeo.com/iframe");
        Thread.sleep(2000);


        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));


        WebElement iframePar = driver.findElement(By.xpath("//body[@id='tinymce']/p"));


        Assert.assertTrue(iframePar.getText().equals("Your content goes here."));


        driver.switchTo().parentFrame();

        WebElement homeYazi = driver.findElement(By.xpath("//a[@class='nav-link']"));
        Assert.assertTrue(homeYazi.getText().equals("Home"));


    }

    @AfterMethod
    public void kapat() {
        //driver.quit();
    }
}


