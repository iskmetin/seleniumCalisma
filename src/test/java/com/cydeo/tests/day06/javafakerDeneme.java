package com.cydeo.tests.day06;
import com.github.javafaker.*;
import org.testng.annotations.Test;


public class javafakerDeneme {

    @Test
    public void uret1(){
        Faker faker=new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.funnyName().name());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.address().zipCodeByState("NY"));


        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.pokemon().name());
        System.out.println(faker.numerify("505-###-####"));
    }
}
