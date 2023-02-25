package com.cydeo.tests.day01.sabahDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumAtt {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");


        WebElement resimKutusu=driver.findElement(By.tagName("img"));


        System.out.println(resimKutusu.getAttribute("alt"));
        System.out.println(resimKutusu.getAttribute("width"));
        System.out.println(resimKutusu.getAttribute("height"));


    }
}
