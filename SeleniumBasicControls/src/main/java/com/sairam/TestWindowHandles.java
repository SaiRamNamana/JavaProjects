package com.sairam;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindowHandles {
    public static void main(String [] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        //Single Window
        String parentWindowHandle = d.getWindowHandle();
        d.findElement(By.id("newWindowBtn")).click();
        Set<String> windowHandles = d.getWindowHandles();
        for (String string : windowHandles) {
            if(!parentWindowHandle.equals(string)){
                d.switchTo().window(string);
               WebElement w = d.findElement(By.id("selectnav2"));
                Select drp = new Select(w);
                drp.selectByIndex(3);
                d.close();
            }
        }
        d.switchTo().window(parentWindowHandle).findElement(By.id("name")).sendKeys("I'm Done.....");
        Thread.sleep(3000);

        //Single tab
        d.findElement(By.id("newTabBtn")).click();
        Set<String> tabHandles = d.getWindowHandles();
        for (String string : tabHandles) {
            if(!parentWindowHandle.equals(string)){
                d.switchTo().window(string);
                d.findElement(By.id("alertBox")).click();
                System.out.println(d.switchTo().alert().getText());
                d.switchTo().alert().accept();
                d.close();
            }
        }
        d.switchTo().window(parentWindowHandle).findElement(By.id("name")).sendKeys("I'm Done With Tabs.....");
        d.quit();

    }
    
}
