package com.SDA.mentoring.tasks;

import org.testng.annotations.Test;

public class T02PracticeTest {

//    Task 2: TestNG Annotation Attributes Practice
//    Objective: Implement various TestNG annotation attributes
//    Requirements:
//    Create a class called AttributePracticeTest
//            Create 5 test methods with different priorities (1, 3, 2, 5, 4)
//    Create one test method with enabled = false
//    Create a test method with timeout of 3 seconds that includes Thread.sleep(2000)
//    Create a test method with timeout of 1 second that includes Thread.sleep(2000) 6.
//    Add meaningful descriptions to all test methods
//    Create test methods with groups: "smoke"
//            ,
//            "regression"
//            ,
//            "api"


    @Test(groups = "smoke" , description = "Priority is 1")
    void test01() {
        System.out.println("Test 01 & smoke");
    }

    @Test(groups = "regression" ,description = "Priority is 4")
    void test04() {
        System.out.println("Test 04 & regression"); // The test will be performed in numerical sequence .
    }

    @Test (timeOut = 3000 , groups = "smoke" , description = "Priority is 2")
    void test02() throws InterruptedException {
        System.out.println("Test 02 & smoke");
        Thread.sleep(2000);
    }

    @Test(enabled = false , groups = "regression" ,description = "Priority is 3")
// This class well be skipped .
    void test03() {
        System.out.println("Test 03 & regression");
    }

    @Test (timeOut = 3000 , groups = "api" , description = "Priority is 5")
    void test05() throws InterruptedException {
        System.out.println("Test 05 & api");
        Thread.sleep(2000);
    }

}


