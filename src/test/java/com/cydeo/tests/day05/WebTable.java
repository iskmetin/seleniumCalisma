package com.cydeo.tests.day05;

import com.cydeo.tests.utilities.BrowserFactory;
import com.cydeo.tests.utilities.utilitiesMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTable {

    public WebDriver driver;

    @BeforeClass
    public void setupDriver() {
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }


    @Test
    public void ilkSiraKontrol() {
        List<WebElement> basliklar = driver.findElements(By.xpath("//table[@class='SampleTable']//th"));
        String baslikText = "";
        for (int i = 0; i < basliklar.size(); i++) {
            baslikText = baslikText + basliklar.get(i).getText();

        }
        Assert.assertTrue(baslikText.contains("Name"), "name yok");
        Assert.assertTrue(baslikText.contains("Pizza Type"), "pizza type yok");
        Assert.assertTrue(baslikText.contains("Amount"), "amount yok");
    }
    @Test
    public void amountSutunKontrol() {
        List<WebElement> sayilar = driver.findElements(By.xpath("//table[@class='SampleTable']//tr/td[4]"));

        for (int i = 0; i < sayilar.size(); i++) {
            Assert.assertTrue(utilitiesMethods.isNumeric(sayilar.get(i).getText()));
        }
    }
    @Test
    public void checkboxTikla() {
        List<WebElement> kutular = driver.findElements(By.xpath("//table[@class='SampleTable']//tr/td[1]/input"));

        for (int i = 0; i < kutular.size(); i++) {
            kutular.get(i).click();
            Assert.assertTrue(kutular.get(i).isSelected());
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

            kutular.get(i).click();
            Assert.assertFalse(kutular.get(i).isSelected());
        }

    }
}
