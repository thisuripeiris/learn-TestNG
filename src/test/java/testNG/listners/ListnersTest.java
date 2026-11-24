package testNG.listners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListners.class)
public class ListnersTest {
    @Test
    public void test1(){
        System.out.println("I am Test 1");
    }

    @Test
    public void test2(){
        System.out.println("I am Test 2");
    }

    @Test
    public void test3(){
        System.out.println("I am Test 3");
    }

    @Test
    public void test4(){
        System.out.println("I am Test 4");
    }
}
