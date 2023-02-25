package com.cydeo.tests.day01.sabahDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumDeneme {
    public static void main(String[] args) {
//kurulum
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        String baslik="Facebook - log in or sign up";

        String suankiBaslik= driver.getTitle();

        if (suankiBaslik.equals(baslik)){
            System.out.println("bekledigimiz baslik");
        }
        else{
            System.out.println("baslikta hata var");
        }


        driver.close();
    }
}
