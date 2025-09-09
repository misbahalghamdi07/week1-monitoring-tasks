package Day04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class T02CheckboxInteraction {

      /*
    Task: Go to "https://the-internet.herokuapp.com/checkboxes"
.   Write a method that:

    Checks the current state of both checkboxes
    Ensures both checkboxes are selected (click only if not already selected)
    Verify both checkboxes are checked after the operations
    Print the status of each checkbox to console */

    @Test
    public void setup(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement box1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        WebElement box2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));


        if (!box1.isSelected()){
            box1.click();
        }
        if (!box2.isSelected()){
            box2.click();
        };

        Assertions.assertTrue(box1.isSelected(),"Check box 1 must selected");
        Assertions.assertTrue(box2.isSelected(),"Check box 2 must selected");

        System.out.println("The selected Check box 1 is : "+box1.isSelected());
        System.out.println("The selected Check box 2 is : "+box2.isSelected());


        driver.quit();
    }




}
