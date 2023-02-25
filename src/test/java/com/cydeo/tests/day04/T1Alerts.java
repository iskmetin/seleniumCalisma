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

public class T1Alerts {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @Test
    public void alertGit() throws InterruptedException {
        driver.get("https://practice.cydeo.com/javascript_alerts");
        Thread.sleep(2000);

        WebElement jsAlertBtn= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

        jsAlertBtn.click();

        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();


        WebElement sonucYAZISI= driver.findElement(By.id("result"));

        Assert.assertTrue(sonucYAZISI.getText().equals("You successfully clicked an alert"));



    }

    @AfterMethod
    public void kapat(){
        //driver.quit();
    }
}




