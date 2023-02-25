package com.cydeo.tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioIsSelected {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");
        Thread.sleep(2000);


        List<WebElement> renkler = driver.findElements(By.xpath("//div/input[@name='color']"));

        for (WebElement renk : renkler) {
            renk.click();
            System.out.println(renk.getAttribute("id")+" is selected: "+renk.isSelected());

        }
        List<WebElement> sporlar = driver.findElements(By.xpath("//div/input[@name='sport']"));

        for (WebElement spor : sporlar) {
            spor.click();
            System.out.println(spor.getAttribute("id")+" is selected: "+spor.isSelected());

        }

    }
}
