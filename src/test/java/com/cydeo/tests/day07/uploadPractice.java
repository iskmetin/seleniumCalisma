package com.cydeo.tests.day07;

import com.cydeo.tests.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class uploadPractice {
    public WebDriver driver;

    @BeforeClass
    public void setupDriver() {
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/upload");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void upload_test(){
        String path="D:\\Users\\metin\\Downloads\\Coskun Isik.txt";
        WebElement uploadBtn= driver.findElement(By.id("file-upload"));


        WebElement sbmtBtn= driver.findElement(By.id("file-submit"));

        uploadBtn.sendKeys(path);

        sbmtBtn.click();

        WebElement textMessage= driver.findElement(By.xpath("//div//h3"));

        Assert.assertTrue(textMessage.getText().contains("Uploaded!"),"doesnt match");


    }




}
