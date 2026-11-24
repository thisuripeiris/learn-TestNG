package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
//    String name = "Ticuri";

//    @Test
//    public void checkEquals(){
//        if(name.equals("Nethmi")){
//            System.out.println("Name is Equals.");
//        } else {
//            System.out.println("Name is not Equals.");
//        }
//    }

    SoftAssert softAssert = new SoftAssert();
    String actualValue = "Thisuri";

    @Test(priority = 0)
    public void valuesEqualsCheck(){
        String expectedValue = "Thisuri11";
        System.out.println("Prior to valuesEqualsCheck Assertion");
        softAssert.assertEquals(actualValue, expectedValue, "Values miss matched!");
        System.out.println("After valuesEqualsCheck Assertion");
        softAssert.assertAll();
    }

    @Test(priority = 1)
    public void valuesNotEqualsCheck(){
        String expectedValue = "Nethmi";
        System.out.println("Prior to valuesEqualsCheck Assertion");
        softAssert.assertNotEquals(actualValue, expectedValue, "Values matched!");
        System.out.println("After valuesEqualsCheck Assertion");
    }

    @Test(priority = 2)
    public void trueConditionCheck(){
        System.out.println("Prior to valuesEqualsCheck Assertion");
        softAssert.assertTrue(actualValue.startsWith("T"), "Condition return a False!");
        System.out.println("After valuesEqualsCheck Assertion");
    }

    @Test(priority = 3)
    public void falseConditionCheck(){
        System.out.println("Prior to valuesEqualsCheck Assertion");
        softAssert.assertFalse(actualValue.isBlank(), "Condition return a True!");
        System.out.println("After valuesEqualsCheck Assertion");
    }
}
