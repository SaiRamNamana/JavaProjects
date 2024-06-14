package com.sairam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://github.com/login");
        Thread.sleep(3000);
        WebElement w = d.findElement(By.id("login_field"));
        if(w.isDisplayed()){
            if(w.isEnabled()){
                w.sendKeys("Sai Ram Namana");
                String str = w.getAttribute("value");
                System.out.println(str);
                Thread.sleep(3000);
                w.clear();
            }else System.err.println("Textbox is not enabled");
        }else System.err.println("Textbox is not displayed");
        }
}
