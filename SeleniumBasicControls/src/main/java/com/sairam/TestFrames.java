package com.sairam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFrames {
     public static void main(String [] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.hyrtutorials.com/p/frames-practice.html");
        d.findElement(By.id("name")).sendKeys("HELLO RAM");
        d.switchTo().frame("frm1");
        Select s = new Select(d.findElement(By.id("selectnav1")));
        s.selectByIndex(4);
        d.switchTo().defaultContent();
        d.findElement(By.id("name")).sendKeys(" RAM");
        d.switchTo().frame("frm3");
        d.switchTo().frame("frm1");
        d.findElement(By.partialLinkText("HOME")).click();
     }
    
}
