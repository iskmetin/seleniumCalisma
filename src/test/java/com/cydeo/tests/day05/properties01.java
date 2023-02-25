package com.cydeo.tests.day05;

import com.cydeo.tests.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class properties01 {
    public WebDriver driver;

    @BeforeClass
    public void driverSetup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void propertyOku() {
        driver.get("https://qa.hectorware.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        System.out.println("Os ismi: "+System.getProperty("os.name"));
        System.out.println("kullanici ismi: "+System.getProperty("user.name"));
        System.out.println("tarayici ismi: "+System.getProperty("browser"));

    }
}
