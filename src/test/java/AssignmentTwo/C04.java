/*
                                   SDA3011
                               Misbah AL:Ghamdi
                              Second Assignment


 */
package AssignmentTwo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04 {

    //Task 4: Multiple Navigation and Verification
    //Setup:
    //Launch Chrome and maximize in @BeforeEach.
    //Test 1:
    //Navigate Google → YouTube → LinkedIn.
    //Assert titles contain "Google", "YouTube", "LinkedIn" respectively.
    //Test 2:
    //Navigate back twice and assert the URL of Google.
    //Navigate forward twice and assert URL of LinkedIn.
    //Teardown:
    //Use @AfterAll to quit the browser.

    static WebDriver driver;

    //Setup:
    //Launch Chrome and maximize in @BeforeEach.


    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    //Test 1:
    //Navigate Google → YouTube → LinkedIn.

    @Test
    void NavigateManyTabs(){

        driver.navigate().to("https://www.google.com/");
        Assertions.assertTrue(driver.getTitle().contains("Google"), "Title must contain Google");

        driver.navigate().to("https://www.youtube.com/");
        Assertions.assertTrue(driver.getTitle().contains("Youtube"), "Title must contain Youtube");

        driver.navigate().to("https://www.linkedin.com/");
        Assertions.assertTrue(driver.getTitle().contains("linkedin"), "Title must contain linkedin");

    }

    //Test 2:
    //Navigate back twice and assert the URL of Google.
    //Navigate forward twice and assert URL of LinkedIn.

    @Test
    void NavigateURLTest(){

        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().to("https://www.linkedin.com/");

        driver.navigate().back();
        driver.navigate().back();
        Assertions.assertEquals("https://www.google.com/" , driver.getCurrentUrl(), "The URL must be Google");


        driver.navigate().forward();
        driver.navigate().forward();
        Assertions.assertEquals("https://www.linkedin.com/" , driver.getCurrentUrl(), "The URL must be LinkedIn");


    }


    //Teardown:
    //Use @AfterAll to quit the browser.

    @AfterAll
    public static void close(){

        driver.quit();

    }



}
