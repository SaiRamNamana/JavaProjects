package com.sairam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HandleBasicHTMLControls {
    public static void main(String [] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.hyrtutorials.com/p/basic-controls.html");
        Thread.sleep(300);
        d.findElement(By.id("femalerb")).click();
        Thread.sleep(3000);
        d.findElement(By.id("englishchbx")).click();
        Thread.sleep(3000);
        WebElement n = d.findElement(By.id("hindichbx"));
        n.click();
        Thread.sleep(3000);
        if(n.isSelected()){
            n.click();
            Thread.sleep(3000);
        }
        d.findElement(By.id("registerbtn")).click();
        Thread.sleep(3000);
        System.out.println(d.findElement(By.id("msg")).getText());
        Thread.sleep(3000);
        d.findElement(By.partialLinkText("Click here")).click();
        Thread.sleep(3000);
    }
}
