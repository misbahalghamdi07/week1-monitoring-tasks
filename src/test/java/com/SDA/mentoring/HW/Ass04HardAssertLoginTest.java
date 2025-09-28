package com.SDA.mentoring.HW;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class Ass04HardAssertLoginTest extends TestBase {


//    Task 4: Hard Assertions Practice
//    Objective: Implement hard assertions for login functionality
//    Test Case: Positive Login Test
// 1. Navigate to
//    https://claruswaysda.github.io/signIn.html
//            2. Enter username: "admin"
//            3. Enter password: "123"
//            4. Click Submit button
// 5. Use hard assertions to verify:
//    New page URL is "
//    https://claruswaysda.github.io/signIn.html"
//    Page contains text "Employee Table"
//    Implementation Requirements:
//    Create class
//    HardAssertLoginTest
//    Use appropriate WebDriver setup and teardown
//    Implement proper element locators
//    Use meaningful assertion messages


    @Test
    public void logInTest(){

        driver.get("https://claruswaysda.github.io/signIn.html");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("123" , Keys.ENTER);

        String expectedUrl = "https://claruswaysda.github.io/signIn.html";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl, " The page URL after login is incorrect!");

        String pageSource = driver.getPageSource();
        assertTrue(pageSource.contains("Employee Table"), "'Employee Table' text not found on the page!");






    }
}
