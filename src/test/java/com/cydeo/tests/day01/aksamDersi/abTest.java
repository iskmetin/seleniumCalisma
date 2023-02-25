package com.cydeo.tests.day01.aksamDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/abtest");
        Thread.sleep(2000);

        WebElement cydeoLink = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));

        System.out.println("Cydeo linki gozukuyor mu:  "+cydeoLink.isDisplayed());


        Thread.sleep(2000);

        driver.navigate().refresh();


        cydeoLink = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        System.out.println("Cydeo linki gozukuyor mu:  "+cydeoLink.isDisplayed());






    }
}
