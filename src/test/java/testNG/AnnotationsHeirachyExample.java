package testNG;

import org.testng.annotations.*;

public class AnnotationsHeirachyExample {
    @Test
    public void test01() {
        System.out.println("Imma Test");
    }

    @Test
    public void test02() {
        System.out.println("Imma Test2");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Imma Before Method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Imma After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Imma before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Imma After Class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Imma Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Imma After Test");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Imma Before Suit");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("Imma After Suit");
    }
}
