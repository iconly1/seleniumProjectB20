package com.cybertek.tests.Day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1- setup WebDriver
        WebDriverManager.chromedriver().setup();

        //2 - Create the instance of chrome driver
        WebDriver driver = new ChromeDriver();

        //3- test driver is working
        driver.get("https://practice.cybertekschool.com");
        System.out.println("The title of the page is: " + driver.getTitle());
        String actualTitle = driver.getTitle();
        System.out.println("ACTUAL TITLE STRING: "+ actualTitle);
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);//shortcut to print out new variable soutv
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        //driver.navigate().to("https://www.facebook.com");
        driver.navigate().to("https://www.onlinepianist.com/virtual-piano");
        System.out.println("op");

    }
}
