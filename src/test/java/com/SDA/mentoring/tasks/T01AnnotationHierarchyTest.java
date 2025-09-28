package com.SDA.mentoring.tasks;

import org.testng.annotations.*;

public class T01AnnotationHierarchyTest {

//    AnnotationHierarchyTest
//    Task 1: Basic TestNG Setup and Annotations
//    Objective: Create a TestNG class demonstrating annotation hierarchy
//            Requirements:
//    Create a TestNG class called AnnotationHierarchyTest
//            Implement all TestNG annotations (@BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod,
//    @Test, @AfterMethod, @AfterClass, @AfterTest, @AfterSuite)
//    Add print statements in each method to observe execution order
//    Create 2 test methods
//    Run the test and analyze console output


    @BeforeSuite
    void beforeSuite(){
        System.out.println("@BeforeSuite"); //Must run with test .
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("@AfterSuite");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("@BeforeTest");
    }
    @AfterTest
    void afterTest(){
        System.out.println("@AfterTest");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("@BeforeClass");
    }
    @AfterClass
    void afterClass(){
        System.out.println("@AfterClass");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("@BeforeMethod");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("@AfterMethod");
    }
    @Test
    void test01(){
        System.out.println("Test 01");
    }
    @Test
    void test02(){
        System.out.println("Test 02");
    }

}
