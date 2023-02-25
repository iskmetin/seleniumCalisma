package com.cydeo.tests.day01.sabahDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumFindElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");


        WebElement abLinki=driver.findElement(By.linkText("A/B Testing"));

        abLinki.click();


        String beklenenBaslik="No A/B Test";
        String gercekBaslik= driver.getTitle();


        if(gercekBaslik.equals(beklenenBaslik)){
            System.out.println("Baslik testi gecildi");
        }
        else{
            System.out.println("Baslik testi basarisiz");
        }


        driver.navigate().back();
        beklenenBaslik="Practice";
        gercekBaslik= driver.getTitle();

        if(gercekBaslik.equals(beklenenBaslik)){
            System.out.println("Baslik testi gecildi");
        }
        else{
            System.out.println("Baslik testi basarisiz");
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
