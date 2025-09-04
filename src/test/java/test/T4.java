/*
                                   SDA3011
                               Misbah AL:Ghamdi
                               First Assaigment


 */



package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class T4 {

    public static void main(String[] args) throws InterruptedException {


        /*  T4 : Driver Mange Window Commands on Chrome  */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //Maximize the window
        driver.manage().window().maximize();

        //Print the position and size of the page
        System.out.println("Maximized position of the window" + driver.manage().window().getPosition());
        System.out.println("Maximized size of the window " + driver.manage().window().getSize());

        //Minimize the page
        driver.manage().window().minimize();

        //Wait 5 seconds in the icon state and then maximize again
        Thread.sleep(5000);
        driver.manage().window().maximize();

        //Print the position and dimensions of the page in maximized state .
        System.out.println("Maximized position of the window" + driver.manage().window().getPosition());
        System.out.println("Maximized size of the window" + driver.manage().window().getSize());

        //Make the page full screen
        driver.manage().window().fullscreen();

        driver.close(); // Close the active tab
        //close the browser
        driver.quit();





    }
}
