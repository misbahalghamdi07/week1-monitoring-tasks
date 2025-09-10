/*
                                   SDA3011
                               Misbah AL:Ghamdi


 */
package Day05;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import java.time.Duration;


public class T02 {

//    Launch browser
//    Open https://demoqa.com/select-menu
//    Select Standard Multi-Select using element id
//    Verify element is multi-select
//    Select 'Opel' using index, then deselect using index
//    Select 'Saab' using value, then deselect using value
//    Deselect all options
//    Close browser


    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


    }

    //  Launch browser

    @Test
    public void multiSelectTest() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/select-menu");
            driver.manage().window().maximize();

            By multiLocator = By.id("cars");
            WebElement multiElement = driver.findElement(multiLocator);
            Select multiSelect = new Select(multiElement);

            Assertions.assertTrue(multiSelect.isMultiple(), "The dropdown is not multi!");

            multiSelect.selectByIndex(2);
            System.out.println("Selected by index: Opel");
            Thread.sleep(200);
            multiSelect.deselectByIndex(2);
            System.out.println("Deselected by index: Opel");

            multiSelect.selectByValue("saab");
            System.out.println("Selected by value: Saab");
            Thread.sleep(200);
            multiSelect.deselectByValue("saab");
            System.out.println("Deselected by value: Saab");


            multiSelect.selectByVisibleText("Volvo");
            multiSelect.selectByVisibleText("Opel");
            multiSelect.selectByVisibleText("Saab");


        //    Deselect all options

            System.out.println("Select mlti options to test ' deselect all '");
            Thread.sleep(300);
            multiSelect.deselectAll();
            System.out.println("All selected");
        }

    //    Close browser

        @AfterEach
                void tearDown(){
        driver.quit();


        }









    }

