/*
                                   SDA3011
                               Misbah AL:Ghamdi
                               First Assaigment


 */



package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class T2 {
    public void main(String[] args) {

        /*


                      T2 : Verify Title Test

  */



        // Invoke FireFox Driver
        WebDriver driver = new FirefoxDriver();

        //Go to https://www.youtube.com/
        driver.get("https://www.youtube.com/");

        //Verify the page title contains video .
        String FirefoxDriverTitle = driver.getTitle();
        if (FirefoxDriverTitle.toLowerCase().contains("video")) {
            System.out.println("Title contains video, Test Passed");
        } else {
            System.out.println("Title dosn't contain video, Test Failed");
        }




        //Close the driver
        driver.quit();


    }
}
