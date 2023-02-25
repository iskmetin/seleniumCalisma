package com.cydeo.tests.day02;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.cydeo.tests.utilities.BrowserFactory;
public class deneme {
    public static void main(String[] args)  {
        String[] browserTypes = {"chrome", "firefox"};

        for (String browser : browserTypes) {
            //1. Open browser
            WebDriver driver = BrowserFactory.getDriver(browser);

            //2. Go to website https://google.com/
            driver.get("https://google.com/");

            //3. Save the title in a string variable
            String titleGoogle = driver.getTitle();

            //4. Go to https://etsy.com/
            driver.get("https://etsy.com/");

            //5. Save the title in a string variable
            String titleEtsy = driver.getTitle();

            //6. Navigate back to previous page
            driver.navigate().back();
            //Save the title again to use in verification
            String titleTest1 = driver.getTitle();

            //7. Verify that title is same is in step 3
            System.out.println("Test: " + titleTest1 + " with browser: " + browser);
            Assert.assertEquals(titleTest1, titleGoogle);

            //8. Navigate forward to previous page
            driver.navigate().forward();
            String titleTest2 = driver.getTitle();

            //9. Verify that title is same is in step 5
            System.out.println("Test: " + titleTest2 + " with browser: " + browser);
            Assert.assertEquals(titleTest2, titleEtsy);

            driver.quit();
        }
    }
}
