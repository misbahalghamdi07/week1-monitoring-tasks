package com.SDA.mentoring.tasks;

import Utilities.TestBase;
import org.testng.annotations.Test;

public class T03DependencyTest extends TestBase {


//    Task 3: Dependency Testing
//    Objective: Create interdependent test methods using dependsOnMethods
//    Requirements:
//    Create a class called DependencyTest
//    Create a @BeforeClass method to set up WebDriver
//    Create the following dependent test chain:
//    openGoogle() - Navigate to Google
//    openBing() - Navigate to Bing (depends on Google test)
//    openDuckDuckGo() - Navigate to DuckDuckGo (depends on Bing test)
//    Add intentional failure in Yahoo test and observe behavior
//    Create @AfterClass method to close driver

    @Test
    public void openGoogle(){
        driver.get("https://www.google.com");
        // Assert.fail();
    }

    @Test(dependsOnMethods = "openGoogle")
    public void openBing(){
        driver.get("https://www.bing.com");
    }

    @Test(dependsOnMethods = {"openBing","openGoogle"})
    void openDuckDuckGo(){
        driver.get("https://www.duckduck.com");
    }

}
