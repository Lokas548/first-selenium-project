package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mironovivan/Desktop/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:8080");
    }
}