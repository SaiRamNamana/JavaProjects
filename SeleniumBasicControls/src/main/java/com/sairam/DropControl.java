package com.sairam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropControl {
     public static void main(String [] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(300);
        WebElement w = d.findElement(By.id("course"));
        Select drp = new Select(w);
        List<WebElement> listdrp = drp.getOptions();
        for (WebElement webElement : listdrp) {
            System.out.println(webElement.getText());
        }
        Thread.sleep(3000);
        drp.selectByIndex(1);
        Thread.sleep(3000);
        drp.selectByValue("net");
        Thread.sleep(3000);
        drp.selectByVisibleText("Python");
        Thread.sleep(3000);
        System.out.println(drp.getFirstSelectedOption().getText());
    }
}