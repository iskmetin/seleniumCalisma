package com.cydeo.tests.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cydeoDeneme {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    @Test
    public void practiceSitesineGit() throws InterruptedException {
        driver.get("https://my.cydeo.com/apps");
        Thread.sleep(1000);
        //input
        WebElement email= driver.findElement(By.xpath("//input"));


        email.sendKeys("isk.metin.isk@gmail.com");

        Thread.sleep(1000);
        WebElement login= driver.findElement(By.xpath("//button"));
        login.click();
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));


        password.sendKeys("Ardahan.41");
        login= driver.findElement(By.xpath("//button"));
        login.click();
        Thread.sleep(3000);


        WebElement canvas= driver.findElement(By.xpath("//img[@alt='Canvas logo']"));
        canvas.click();


    }

    @AfterMethod
    public void kapat(){
        driver.quit();
    }
}


