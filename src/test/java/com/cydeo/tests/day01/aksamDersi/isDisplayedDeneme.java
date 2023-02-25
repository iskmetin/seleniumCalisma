package com.cydeo.tests.day01.aksamDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class isDisplayedDeneme {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/broken_images");


        List<WebElement> birinciResim=driver.findElements(By.xpath("//div/img"));


        for (int i = 0; i < birinciResim.size(); i++) {
            System.out.println((i+1)+". resim goruntulendi: "+birinciResim.get(i).isDisplayed() );

        }



    }
}
