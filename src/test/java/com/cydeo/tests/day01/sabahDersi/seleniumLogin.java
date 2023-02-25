package com.cydeo.tests.day01.sabahDersi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

        WebElement loginKutusu=driver.findElement(By.className("form-control"));

        loginKutusu.sendKeys("abc@def.com");

        WebElement sifreKutusu=driver.findElement(By.id("inputPassword"));

        sifreKutusu.sendKeys("abcdef");
        WebElement gonderButonu=driver.findElement(By.tagName("button"));

        gonderButonu.click();

        Thread.sleep(3000);
        WebElement alertText=driver.findElement(By.className("alert"));
        System.out.println(alertText.getText());
        if(alertText.getText().contains("Sorry, Wrong Email or Password")){
            System.out.println("Giris Basarisiz. Test gecildi");
        }








    }
}
