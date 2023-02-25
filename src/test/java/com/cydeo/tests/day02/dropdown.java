package com.cydeo.tests.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/dropdown");
        Thread.sleep(2000);


        ////select[@id='dropdown']


        Select simpleDD = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));




        List<WebElement> selectListe = simpleDD.getOptions();
        for (int i = 0; i < selectListe.size(); i++) {
            simpleDD.selectByIndex(i);
            System.out.println(simpleDD.getFirstSelectedOption().getText());
        }


    }
}
