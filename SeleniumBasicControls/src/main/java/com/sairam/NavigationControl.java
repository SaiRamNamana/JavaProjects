package com.sairam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationControl {
     public static void main(String [] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.google.com/");
        d.findElement(By.name("q")).sendKeys("Hello");
        Thread.sleep(3000);
        d.findElement(By.name("q")).submit();
        Thread.sleep(3000);
        d.navigate().to("https://facebook.com/");
        Thread.sleep(300);
        d.findElement(By.id("email")).sendKeys("sairam@gmail.com");
        Thread.sleep(3000);
        d.navigate().refresh();
        Thread.sleep(3000);
        d.navigate().back();
        Thread.sleep(3000);
        d.navigate().forward();
        Thread.sleep(3000);
        d.close();
     }
}
