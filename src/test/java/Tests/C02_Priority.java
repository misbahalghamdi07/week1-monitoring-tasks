package Tests;

import org.testng.annotations.Test;

public class C02_Priority {

     /*
        Helps to prioritize test annotations execution order
        Default priority starts with 0
        Tests are executed in ascending order (0, 1, 2, 3...)
        If test annotation doesn't have priority attribute, priority is considered zero
        TestNG executes @Test annotations in alphabetical order by default
     */

    @Test
    void test01(){
        System.out.println("Test 01");
    }
    @Test
    void test04(){
        System.out.println("Test 04"); // The test will be performed in numerical sequence .
    }
    @Test
    void test02(){
        System.out.println("Test 02");
    }
    @Test
    void test03(){
        System.out.println("Test 03");
    }

    @Test
    void test05(){
        System.out.println("Test 05");
    }

    /*
    Order:
    Test 04
    SetUp Method
    Test 02
    Test 03
    Test 01
    Test 05
     */

}
