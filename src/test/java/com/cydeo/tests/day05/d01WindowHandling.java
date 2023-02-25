package com.cydeo.tests.day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class d01WindowHandling {
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void window_handle() throws InterruptedException {
        driver.get("https://practice.cydeo.com");
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://amazon.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://ebay.com','_blank');");

        Set<String> pencereler = driver.getWindowHandles();

        for (String pencere : pencereler) {
            driver.switchTo().window(pencere);
            Thread.sleep(1000);
        }


    }


}
