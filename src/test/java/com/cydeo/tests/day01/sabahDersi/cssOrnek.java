package com.cydeo.tests.day01.sabahDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssOrnek {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");
        Thread.sleep(2000);

        WebElement homeButton = driver.findElement(By.cssSelector("a[class='nav-link']"));

        homeButton.click();
        System.out.println("1. tiklama gerceklesti");
        Thread.sleep(2000);

        driver.navigate().back();
        WebElement homeButton2 = driver.findElement(By.cssSelector("a[href='/']"));
        homeButton2.click();
        System.out.println("2. tiklama gerceklesti");

        Thread.sleep(2000);
        driver.navigate().back();

        WebElement homeButton3 = driver.findElement(By.cssSelector("a.nav-link"));
        homeButton3.click();
        System.out.println("3. tiklama gerceklesti");

        Thread.sleep(2000);
        driver.navigate().back();

        WebElement homeButton4 = driver.findElement(By.cssSelector("li>a"));
        homeButton4.click();
        System.out.println("4. tiklama gerceklesti");

        driver.navigate().back();


        driver.quit();

    }
}
