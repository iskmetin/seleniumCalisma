package com.cydeo.tests.day01.aksamDersi;

public class tryCatch {
    public static void main(String[] args) {

        int[] arr=new int[6];


        try {
            System.out.println(arr[7]);
        }catch (Exception e) {
            System.out.println("aralik disinda bir int girdin");
        }


    }
}
