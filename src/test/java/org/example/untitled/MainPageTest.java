package org.example.untitled;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest {
    @Test
    public void openPage() {

        System.setProperty("webdriver.chrome.driver", "C:\\tools\\SeleniumDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");

        String expected ="Google";
        String actual = driver.getTitle();

        Assert.assertEquals(actual,expected);


    }
}