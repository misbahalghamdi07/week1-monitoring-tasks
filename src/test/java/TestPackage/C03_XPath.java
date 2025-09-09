package TestPackage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_XPath {

    WebDriver driver;


    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();


    }

    @Test
    void absoluteXPathTest(){





    }
}
