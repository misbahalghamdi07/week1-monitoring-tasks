/*
                                   SDA3011
                               Misbah AL:Ghamdi
                               First Assaigment


 */

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 {
    public static void main(String[] args) throws InterruptedException {


        /* TC - 01

                   Setup Chrom Driver

         */

        //Create Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Go to https://www.google.com/
        driver.get("https://www.google.com/");

        //Get the title on page
        String ChromeDriverTitle = driver.getTitle();
        System.out.println("Title is: " + ChromeDriverTitle);

        //Get the current URL on page
        String url = driver.getCurrentUrl();
        System.out.println("Current URL is: " + url);


        driver.quit();// Terminates the session -> closes all tabs




    }
}


