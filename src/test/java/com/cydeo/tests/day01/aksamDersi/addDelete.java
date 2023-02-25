package com.cydeo.tests.day01.aksamDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addDelete {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/add_remove_elements/");
        WebElement ekleButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        Thread.sleep(2000);
        ekleButonu.click();

        WebElement silButonu = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        try {
            System.out.println("buton goruntulendi: "+silButonu.isDisplayed());
        }catch (Exception e) {
            System.out.println("sil butonu yok");
        }






    }
}
