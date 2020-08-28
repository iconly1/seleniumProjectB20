package com.cybertek.tests.Day2_locators_getText_GetAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #1: Google Title Verification1.Open Chrome browser2.Go to https://www.google.com3.Verify title: Expected: GoogleTC #2: Cybertek
verifications1.Open Chrome browser2.Go to https://practice.cybertekschool.com3.Verify URL containsExpected: cybertekschool4.Verify title: Expected: Practice
 */
public class P1_GoogleTittleVerification {
    public static void main(String[] args) {
        //TC #1: Google Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.google.com 3. Verify title:
        //Expected: Google

        WebDriverManager.chromedriver().setup();

        WebDriver driver  = new ChromeDriver();

        driver.get("https://www.google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else{
            System.out.println("Title verification Failed!");
        }
    }
}
