package Testing;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class TestingTest {
    @Test
    void testcase1(){
        System.out.println("this is my first test case 1 ");
    }
    @Test
    void testcase2(){
        System.out.println("this is my first test case 2 ");
    }
    @BeforeEach
    void preCondition (){
        System.out.println("test case preCondition");
    }
    @AfterEach
    void postCondition (){
        System.out.println("test case postCondition");
    }
}