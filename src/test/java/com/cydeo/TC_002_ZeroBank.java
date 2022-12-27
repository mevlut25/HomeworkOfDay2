package com.cydeo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002_ZeroBank {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement headerText = driver.findElement(By.tagName("h3"));
        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();
        System.out.println(actualHeaderText);
        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header Text Verification PASSED!");
        } else {
            System.out.println("Header Text Verification FAILED!!!");
        }
    }
}
 