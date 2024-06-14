package com.sairam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertControl {
     public static void main(String [] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(300);
        //Alert Box
        d.findElement(By.id("alertBox")).click();
        System.out.println(d.switchTo().alert().getText());
        d.switchTo().alert().accept();
        //Confirm Box
        d.findElement(By.id("confirmBox")).click();
        System.out.println(d.switchTo().alert().getText());
        d.switchTo().alert().accept();
        //Prompt Box
        d.findElement(By.id("promptBox")).click();
        System.out.println(d.switchTo().alert().getText());
        d.switchTo().alert().sendKeys("Sai Ram Namana");
        d.switchTo().alert().accept();
        d.close();
     }
}
