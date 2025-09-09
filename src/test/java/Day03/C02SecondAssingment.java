package Day03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02SecondAssingment {

    // TODO: Navigate to test pages
    WebDriver driver;


    @Test
    public void TestNavigation(){

        driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");


        // TODO: Click on "Locators - Find By Playground Test Page"
        driver.findElement(By.linkText("Locators - Find By Playground Test Page")).click();

        // TODO: Print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // TODO: Navigate back
        driver.navigate().back();

        // TODO: Print URL after going back
        System.out.println( "URL after going back: " + driver.getCurrentUrl());


        // TODO: Click on "WebDriver Example Page"
        driver.findElement(By.linkText("WebDriver Example Page")).click();

        // TODO: Print current URL
        System.out.println("WebDriver page URL: " + driver.getCurrentUrl());

        // TODO: Enter value 20 in number input
        driver.findElement(By.id("numentry")).sendKeys("20");

        // I try to enter value by this way but didn't work .

//       WebElement numberInput = driver.findElement(By.id("number"));
//       numberInput.sendKeys("20");
//       numberInput.sendKeys(Keys.ENTER);

        // TODO: Verify 'two, zero' message appears

        WebElement message = driver.findElement(By.id("message"));
        Assertions.assertTrue(message.getText().contains("two,zero"));

        driver.quit();



    }



}
