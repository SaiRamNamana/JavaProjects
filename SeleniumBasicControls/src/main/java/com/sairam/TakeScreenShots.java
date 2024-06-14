package com.sairam;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShots {
      public static void main(String [] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        ChromeDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.amazon.com/");
        //file type
        // File source = d.getScreenshotAs(OutputType.FILE);
        // File dest = new File("./screenshots/img1.jpg");
        // FileUtils.copyFile(source, dest);
        //Byte file
        // byte[] source = d.getScreenshotAs(OutputType.BYTES);
        // File dest = new File("./screenshots/img2.jpg");
        // FileOutputStream fo = new FileOutputStream(dest);
        // fo.write(source);
        // fo.close();
        //Base64
        String source = d.getScreenshotAs(OutputType.BASE64);
        byte[] byt = Base64.getDecoder().decode(source);
        File dest = new File("./screenshots/img3.jpg");
        FileOutputStream fo = new FileOutputStream(dest);
        fo.write(byt);
        fo.close();
        d.close();
      }
    
}
