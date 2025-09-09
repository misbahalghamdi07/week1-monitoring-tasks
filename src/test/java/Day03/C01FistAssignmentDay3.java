package Day03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class C01FistAssignmentDay3{

    WebDriver driver;

    // Navigate to: https://opensource-demo.orangehrmlive.com/

    @Test
    public void testNavigation(){

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // TODO: Locate username using absolute XPath
        String absoluteUsernameXPath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]"; // Fill absolute path for Username
        String absolutePasswordXPath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div"; // Fill absolute path for Password


        // TODO: Locate username using relative XPath
        String relativeUsernameXPath = "//input[@name='username']"; // Fill relative path
        String relativePasswordXPath = "//input[@name='password']";
        String relativeLoginXPath = "//button[@type='submit']";



        // TODO: Locate password using both methods
        // TODO: Locate login button using both methods
        // TODO: Test both approaches work

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));


        WebElement usernameAbsolute = driver.findElement(By.xpath(absoluteUsernameXPath));
        WebElement usernameRelative = driver.findElement(By.xpath(relativeUsernameXPath));

        Assertions.assertTrue(usernameAbsolute.isDisplayed());
        Assertions.assertTrue(usernameRelative.isDisplayed());

        driver.quit();




    }
}