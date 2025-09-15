package Day06;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;


public class T01 {

    static WebDriver driver;

//    Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
//    Maximize the website
//    Click on the second emoji
//    Click on all second emoji items
//    Return to the parent iframe
//    Fill out the form and press the apply button

    @BeforeAll
    public static void setUp() {


        //    Go to https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        //    Maximize the website


        driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        driver.manage().window().maximize();

    }

        //    Click on the second emoji

        @Test
            void emojiTest() throws InterruptedException{


            driver.switchTo().frame("emoojis");
            WebElement secondEmoji = driver.findElement(By.xpath("//a[@href='#nature']"));
            secondEmoji.click();


            //    Click on all second emoji items
            List<WebElement> emojiList = driver.findElements(By.xpath("//div[@id='nature']//img"));
            for (WebElement emoji : emojiList) {
                emoji.click();

            }

            //    Return to the parent iframe

            driver.switchTo().defaultContent();

            //    Fill out the form and press the apply button

            driver.findElement(By.id("text")).sendKeys("Name");
            driver.findElement(By.id("smiles")).sendKeys("Fun");
            driver.findElement(By.id("food")).sendKeys("Burger");
            driver.findElement(By.id("send")).click();

            Thread.sleep(700);

        }

        @AfterAll
         public static void tearDown(){
        driver.quit();
        }




    }

