package Day08;

import Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T02 extends TestBase {

    /*
Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
Click all the buttons and verify they are all clicked
   */


    @Test
    void JavaScriptEventsTesting() throws InterruptedException{
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html

        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        //Click all the buttons and verify they are all clicked
        List<WebElement> buttons = driver.findElements(By.tagName("button"));


        for (WebElement button : buttons ){

            try {
                button.click();
                Thread.sleep(700);


            }
            catch (Exception m){
                    System.out.println("Skip button" + button.getAttribute("id"));
                }
            }
        }


    }


