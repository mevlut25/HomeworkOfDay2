package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_006_FacebookLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement inputBox=driver.findElement(By.name("email"));
        inputBox.sendKeys("incorrect@gmail.com");
        WebElement password=driver.findElement(By.name("pass"));
        password.sendKeys("password1@"+ Keys.ENTER);
        Thread.sleep(3000);
        String expectedTitle="Log into Facebook";
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("New Title Verification PASSED!");
        }else{
            System.out.println("New Title Verification FAILED");
        }
    }
}
/*
Facebook – log in or sign up
New Title Verification FAILED

Process finished with exit code 0

 */