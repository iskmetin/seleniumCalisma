package com.cydeo.tests.day07;

import com.cydeo.tests.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class quiz {


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
    public void testt(){


    }
}
