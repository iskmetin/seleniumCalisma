package com.cydeo.tests.day02;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGGiris {
    @Test(priority = 1)
    public void test1(){
        Assert.assertEquals("metin","metin");
    } @Test(priority = 2)
    public void test2(){
        Assert.assertEquals("metin","mtin");
    }@Test(priority = 3)
    public void test3(){
        Assert.assertFalse(7<6);
    }

    @BeforeClass
    public void once(){
        System.out.println("Testler Baslatiliyor");
    }

    @AfterClass
    public void sonra(){
        System.out.println("Testler Bitti");
    }

    @BeforeMethod
    public void onmetod(){
        System.out.println("Metod basliyor");
    }@AfterMethod
    public void sonrametod(){
        System.out.println("Metod bitiyor");
    }



}
