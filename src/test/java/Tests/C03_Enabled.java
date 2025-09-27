package Tests;

import org.testng.annotations.Test;

public class C03_Enabled {

    /*
    Determines if we want to run specific test methods in the existing suite/class
    Sometimes we don't want to run several tests due to requirement changes
    We don't want to break existing work for that particular function
    Provides a way to temporarily disable tests
     */

    @Test
    void test01(){
        System.out.println("Test 01");
    }
    @Test(enabled = false) // This class well be skipped .
    void test04(){
        System.out.println("Test 04"); // The test will be performed in numerical sequence .
    }
    @Test
    void test02(){
        System.out.println("Test 02");
    }
    @Test
    //Ignore : as well as (enabled = false)
    void test03(){
        System.out.println("Test 03");
    }

    @Test
    void test05(){
        System.out.println("Test 05");
    }
}
