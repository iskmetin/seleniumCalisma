package com.cydeo.tests.day05;

import com.cydeo.tests.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class hectorDeneme {
    public WebDriver driver;

    @BeforeClass
    public void driverSetup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void hectorGiris() {
        driver.get("https://qa.hectorware.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @Test(priority = 2)
    public void loginDeneme() {
        WebElement loginKutusu = driver.findElement(By.xpath("//input[@id='user']"));
        loginKutusu.sendKeys("Employee1");
        WebElement sifreKutusu = driver.findElement(By.xpath("//input[@id='password']"));
        sifreKutusu.sendKeys("Employee123");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement submitBtn = driver.findElement(By.xpath("//input[@id='submit-form']"));
        submitBtn.click();

    }
}
