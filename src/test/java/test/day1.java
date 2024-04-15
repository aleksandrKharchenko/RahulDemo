package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

    @AfterTest
    public void lastExecution(){
        System.out.println("I will execute last");
        System.out.println("I will execute last 2");
        System.out.println("I will execute last 3");
        System.out.println("I will execute last 4");
        System.out.println("I will execute last 5");
        System.out.println("I will execute last 6");
    }

    @Test
    public void Demo() {
        System.out.println("hello");
        Assert.assertTrue(false);
    }

    @Test
    public void DemoOne() {
        System.out.println("hello one");
        Assert.assertTrue(false);
    }

    @Test
    public void DemoTwo() {
        System.out.println("hello two");
        Assert.assertTrue(false);
    }

    @AfterSuite
    public void Afsuite(){
        System.out.println("I am no 1 from last");
    }
    @Test
    public void SecondTest() {
        System.out.println("bye");
    }
}