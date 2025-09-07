/*
                                   SDA3011
                               Misbah AL:Ghamdi
                              Second Assignment


 */
package AssignmentTwo;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Page source validation
public class C02{

// Task 2: Page Source Validation
//Setup:
//Use @BeforeEach to open Chrome and maximize.
//Test 1:
//Navigate to https://www.selenium.dev/.
//Verify that the page source contains the word "WebDriver".
//Test 2:
//Navigate to https://www.python.org/.
//Assert the page source contains "Python".
//Teardown:
//Close the browser with @AfterEach.

    WebDriver driver;

    //Use @BeforeEach to open Chrome and maximize.

    @BeforeEach
    void setup(){

        driver  = new ChromeDriver();
        driver.manage().window().maximize();
    }
    //Test 1:
//Navigate to https://www.selenium.dev/.
//Verify that the page source contains the word "WebDriver".
    @Test
    void sourceSeleniumTest(){

       driver.navigate().to(" https://www.selenium.dev/");
         String pageSource = driver.getPageSource();
        assert pageSource.contains("WebDriver");

    }
    //Test 2:
//Navigate to https://www.python.org/.
//Assert the page source contains "Python".

    @Test
    void sourcePythonTest(){

        driver.navigate().to(" https://www.python.org/");
        String pageSource = driver.getPageSource();
        assert pageSource.contains("Python");

    }


    //Teardown:
//Close the browser with @AfterEach.

    @AfterEach
    void teardown(){
        driver.quit();
    }

}
