package com.cydeo.tests.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cydeoDeneme2 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @Test
    public void practiceSitesineGit() throws InterruptedException {
        driver.get("https://practice.cydeo.com/key_presses");
        Thread.sleep(1000);
        //input

        new Actions(driver).sendKeys("a").perform();
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertEquals("You entered: A",email.getText());

    }

    @AfterMethod
    public void kapat() {
        driver.quit();
    }
}


