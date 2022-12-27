package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_005_FacebookTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        String expectedTitle = "Facebook – log in or sign up";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Facebook Title Verification PASSED!");
        }else{
            System.out.println("Facebook Title Verification FAILED!!!");
        }

    }
}
