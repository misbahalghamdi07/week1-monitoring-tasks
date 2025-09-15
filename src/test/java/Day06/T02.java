package Day06;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class T02 {

//    Go to URL: http://demo.guru99.com/test/guru99home/
//    Find the number of iframes on the page
//    Switch to the third iframe (JMeter Made Easy)
//    Click the link (https://www.guru99.com/live-selenium-project.html)
//    Exit the iframe and return to the main page

    static WebDriver driver;

    @BeforeAll
    static void setUp() {


//    Go to URL: http://demo.guru99.com/test/guru99home/
//    Find the number of iframes on the page (two frame)

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/guru99home/");


    }

//    Switch to the third iframe (JMeter Made Easy)
//    Click the link (https://www.guru99.com/live-selenium-project.html)
//    Exit the iframe and return to the main page

    @Test
    public void frames() throws InterruptedException{

        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
        System.out.println("The number of iframes on the page =" + iframes.size());

        driver.switchTo().frame(1);
        WebElement page = driver.findElement(By.xpath("//a[contains(@href,'live-selenium-project')]"));
        page.click();
        Thread.sleep(700);

        driver.switchTo().defaultContent();


    }

    @AfterAll
    static void tearDown(){

        driver.quit();

    }

}
