package com.cbt.utilities;

public class StringUtility {
    public static void  verifyEquals(String expected, String actual){
        if (expected.equalsIgnoreCase(actual)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }

   public static void verifyTitles(String titleOne, String titleTwo, String titleThree){
        if (titleOne.equalsIgnoreCase(titleTwo) && titleTwo.equalsIgnoreCase(titleThree)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }


    public static  void verifyUrls(String urlOne, String urlTwo, String urlThree, String checkUrl){
        if ( urlOne.startsWith(checkUrl) && urlTwo.startsWith(checkUrl) && urlThree.startsWith(checkUrl)) {
            System.out.println("urlOne: " + urlOne + " urlTwo: " + urlTwo + " urlThree: " + urlThree);
            System.out.println("pass");
        }else{
            System.out.println("urlOne: " + urlOne + " urlTwo: " + urlTwo + " urlThree: " + urlThree);
            System.out.println("fail");
        }

    }
}
