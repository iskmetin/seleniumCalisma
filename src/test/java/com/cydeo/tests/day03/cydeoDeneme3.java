package com.cydeo.tests.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class cydeoDeneme3 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @Test
    public void practiceSitesineGit() throws InterruptedException {
        driver.get("https://saucedemo.com");
        Thread.sleep(1000);
        //input
        WebElement email = driver.findElement(By.id("user-name"));

        email.sendKeys("standard_user");
        WebElement pass = driver.findElement(By.id("password"));

        pass.sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.id("login-button"));

        loginBtn.click();
        Thread.sleep(2000);
        Select yenislct = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
        yenislct.selectByValue("hilo");


        List<WebElement> fiyatList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));


        Assert.assertTrue(fiyatList.get(0).getText().equals("$49.99"));
    }

    @AfterMethod
    public void kapat() {
        driver.quit();
    }
}


