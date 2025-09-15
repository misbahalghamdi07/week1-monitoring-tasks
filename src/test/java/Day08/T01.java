package Day08;

import Utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class T01 extends TestBase {


    private Assertions Assertion;

    /*
     * Open a demo login page (e.g. https://the-internet.herokuapp.com/login).
     * Click into the username field.
     * Type the username using sendKeys.
     * Use the Robot class to:
     * Press Tab → go to password field.
     * Type the password using sendKeys.
     * Press Enter → submit the form.
     * Verify login success or error message.
     */
    @Test
    void loginPage() throws Exception{

// Open a demo login page (e.g. https://the-internet.herokuapp.com/login).
        driver.get("https://the-internet.herokuapp.com/login");

        // Click into the username field.
        // Type the username using sendKeys
        // Use the Robot class to:

        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("Someone");

        // Press Tab → go to password field.
        Robot robot = new Robot();
        robot.setAutoDelay(100);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        // Type the password using sendKeys.
        WebElement passwordField = driver.switchTo().activeElement();
        passwordField.sendKeys("Great Password");


        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(1000);

        String logInSuccessfully = driver.findElement(By.id("flash")).getText();
        Assertion.assertTrue(logInSuccessfully.contains("Login successfully"),("Login not successfully"));


    }

}
