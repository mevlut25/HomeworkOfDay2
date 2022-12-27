package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_003_BackAndForwardNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.findElement(By.className("gb_j")).click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Gmail Title Verification PASSED!");
        } else {
            System.out.println("Gmail Title Verification FAILED!!!");
        }
        Thread.sleep(3000);
        driver.navigate().back();
        String currentTitle=driver.getTitle();
        if (currentTitle.contains("Google")){
            System.out.println("Google Title Verification PASSED!");
        }else{
            System.out.println("Google Title Verification FAILED");
        }
    }
}
/*
Gmail: Private and secure email at no cost | Google Workspace
Gmail Title Verification PASSED!
Google Title Verification PASSED!

Process finished with exit code 0

 */