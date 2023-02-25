package com.cydeo.tests.day01.sabahDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleArama {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com/");


        WebElement kabulLinki= driver.findElement(By.className("sy4vM"));
        kabulLinki.click();

        WebElement googleKutusu= driver.findElement(By.name("q"));
        googleKutusu.sendKeys("elma"+ Keys.ENTER);


    }
}
