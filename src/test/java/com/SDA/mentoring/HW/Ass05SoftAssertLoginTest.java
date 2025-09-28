package com.SDA.mentoring.HW;

import Utilities.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class Ass05SoftAssertLoginTest extends TestBase {

//    Task 5: Soft Assertions Practice
//    Objective: Implement soft assertions for negative test scenarios
//    Test Case: Negative Login Test
// 1. Navigate to
//    https://claruswaysda.github.io/signIn.html
//            2. Enter username: "wronguser"
//            3. Enter password: "wrongpass"
//            4. Click Submit button
// 5. Use soft assertions to verify:
//    JavaScript alert is displayed
//    Alert message text is "Incorrect username or password"
//    Implementation Requirements:
//    Create class
//    SoftAssertLoginTest
// Handle JavaScript alert using WebDriver's Alert interface
//    Use SoftAssert object for assertions
//    Include proper assertAll() call
//    Add meaningful assertion messages

    @Test
    public void logInTest() {

        SoftAssert softAssert = new SoftAssert();

        driver.get("https://claruswaysda.github.io/signIn.html");
        driver.findElement(By.id("username")).sendKeys("wronguser");
        driver.findElement(By.id("password")).sendKeys("wrongpass" , Keys.ENTER);

        Alert alert = driver.switchTo().alert();

        softAssert.assertNotNull(alert,"Alert was not displayed after wrong login");

        String expectedMessage = "Incorrect username or password!!";
        String actualMessage = alert.getText();
        softAssert.assertEquals(actualMessage, expectedMessage, "Alert message is incorrect!");
        alert.accept();

        softAssert.assertAll();

    }
}
