package com.cydeo.tests.day01.aksamDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secilimiKontrol {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/checkboxes");
        Thread.sleep(2000);

        WebElement kutuBir = driver.findElement(By.xpath("//form/input[@name='checkbox1']"));


        WebElement kutuIki = driver.findElement(By.xpath("//form/input[@name='checkbox2']"));


        System.out.println("checkbox 1 secili mi: "+kutuBir.isSelected());
        System.out.println("checkbox 2 secili mi: "+kutuIki.isSelected());


        kutuBir.click();
        kutuIki.click();
        System.out.println("checkbox 1 secili mi: "+kutuBir.isSelected());
        System.out.println("checkbox 2 secili mi: "+kutuIki.isSelected());


    }
}
