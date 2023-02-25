package com.cydeo.tests.utilities;

public class utilitiesMethods {
    public static boolean isNumeric(String yazi){
        if(yazi.isEmpty()){
            return false;
        }
        try{

            int sayi=Integer.parseInt(yazi);

        }catch (NumberFormatException nfe ){
            return false;
        }
        return true;

    }
}
