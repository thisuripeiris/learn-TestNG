package testNG;

import org.testng.annotations.Test;

public class TestNGAnnotation01 {
    public static void main(String[] args) {
        System.out.println("HEELOOO testNG!!!");
        TestNGAnnotation01 testNGAnnotation01 = new TestNGAnnotation01();
        testNGAnnotation01.helloTestNG();
    }

    public void helloTestNG(){
        System.out.println("Ayyoo Not a method lu...");
    }

    @Test
    public void test(){
        System.out.println("Test 01");
    }
}
