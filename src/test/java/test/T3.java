/*
                                   SDA3011
                               Misbah AL:Ghamdi
                               First Assaigment


 */


package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3 {
    public static void main(String[] args) {

        /*  Driver Manage Window Command on Chrome */

// First create chrome driver
        WebDriver driver = new ChromeDriver();
        // Now go to the Amazon URL https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Print the position and size of the page
        System.out.println("Position is : " + driver.manage().window().getPosition());
        System.out.println("Size is : " + driver.manage().window().getSize());

        //Adjust the position and size of the page as desired .
        driver.manage().window().setPosition(new Point(300,150));
        driver.manage().window().setSize(new Dimension(500,200));


        //Test that the page is in the  position and size .
        System.out.println("New position is : " + driver.manage().window().getPosition());
        System.out.println("New size is : " + driver.manage().window().getPosition());


        driver.close(); // Close the active tab
        //In ths last close the page
        driver.quit();

    }
}
