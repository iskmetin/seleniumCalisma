package com.cydeo.tests.day01.sabahDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumCSSselector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");


        WebElement loginKutusu = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        loginKutusu.sendKeys("metin@met.com");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        loginButton.click();


        driver.quit();

    }
}
