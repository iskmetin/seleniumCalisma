package com.cydeo.tests.day01.sabahDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTemeller {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();


        WebDriver driver=new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        driver.manage().window().maximize();

        System.out.println("sitenin basligi "+driver.getTitle());


        System.out.println("suanki sitenin url: "+driver.getCurrentUrl());


       Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);


        driver.close();
        driver.quit();




    }
}
