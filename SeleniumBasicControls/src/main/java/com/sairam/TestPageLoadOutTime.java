package com.sairam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPageLoadOutTime {
     public static void main(String [] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        d.manage().window().maximize();
        d.get("https://www.amazon.com/");
        d.close();
     }
}
