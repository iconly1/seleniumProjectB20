package com.cybertek.tests.Trial;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrack {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com");
        driver.findElement(By.name("_username")).sendKeys("user181" + Keys.TAB);
        driver.findElement(By.name("_password")).sendKeys("UserUser123" + Keys.ENTER);



    }
}
