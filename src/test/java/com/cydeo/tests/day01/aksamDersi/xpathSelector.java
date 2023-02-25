package com.cydeo.tests.day01.aksamDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");


        WebElement forgotPass= driver.findElement(By.xpath("//a[@href='/forgot_password']"));








        forgotPass.click();
        WebElement btn = driver.findElement(By.xpath("//button/i[text()='Retrieve password']"));
        btn.click();
    }
}
