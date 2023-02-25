package com.cydeo.tests.day06;

import com.cydeo.tests.utilities.BrowserFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class regFormFiller {

    public WebDriver driver;

    @BeforeClass
    public void setupDriver() {
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/registration_form");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void formDoldur() {
        Faker faker = new Faker();

        WebElement isimKutusu = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement soyisimKutusu = driver.findElement(By.xpath("//input[@name='lastname']"));
        WebElement kullaniciAdiKutusu = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement emailKutusu = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement passwordKutusu = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement phoneKutusu = driver.findElement(By.xpath("//input[@name='phone']"));
        WebElement genderKutusu = driver.findElement(By.xpath("//input[@value='male']"));
        WebElement bDKutusu = driver.findElement(By.xpath("//input[@name='birthday']"));
        Select departmanKutusu = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        Select jobTitle = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        WebElement pLanguage = driver.findElement(By.xpath("//input[@value='java']"));
        WebElement btnSignUp = driver.findElement(By.id("wooden_spoon"));


        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        String dob = sdf.format(faker.date().birthday());


        isimKutusu.sendKeys(faker.name().firstName());
        soyisimKutusu.sendKeys(faker.name().lastName());
        String yeniii = faker.name().username().replaceAll("[\\W]|_", "");
        kullaniciAdiKutusu.sendKeys(yeniii);
        emailKutusu.sendKeys(faker.internet().emailAddress());
        passwordKutusu.sendKeys(faker.internet().password());
        phoneKutusu.sendKeys(faker.numerify("571-###-####"));
        genderKutusu.click();
        bDKutusu.sendKeys(dob);
        departmanKutusu.selectByIndex(2);
        jobTitle.selectByIndex(2);
        pLanguage.click();
        btnSignUp.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement welldone = driver.findElement(By.xpath("//div//p"));
        Assert.assertTrue(welldone.getText().contains("success"), "success ifadesi gecmiyor");


    }
}
