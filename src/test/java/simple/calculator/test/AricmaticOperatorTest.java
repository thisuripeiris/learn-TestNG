package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import simple.calculator.AricmaticOperator;

public class AricmaticOperatorTest {
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 0)
    public void testSum(){
        System.out.println("******** First Test Case For Calc Sum ********");
        int actualValueSum1 = AricmaticOperator.calSum(20, 5);
        System.out.println("Actual Sum Value is: " + actualValueSum1);
        softAssert.assertEquals(actualValueSum1, 20, "Failed to calc sum1");


        System.out.println("******** Second Test Case For Calc Sum ********");
        int actualValueSum2 = AricmaticOperator.calSum(10, 20);
        System.out.println("Actual Sum Value is: " + actualValueSum2);
        softAssert.assertEquals(actualValueSum2, 30, "Failed to calc sum2");

        System.out.println("******** Third Test Case For Calc Sum ********");
        int actualValueSum3 = AricmaticOperator.calSum(4, 8);
        System.out.println("Actual Sum Value is: " + actualValueSum3);
        softAssert.assertEquals(actualValueSum3, 12, "Failed to calc sum3");

        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void testSub(){
        System.out.println("******** First Test Case For Calc Sub ********");
        int actualValueSub1 = AricmaticOperator.calSub(20, 5);
        System.out.println("Actual Sub Value is: " + actualValueSub1);
        softAssert.assertEquals(actualValueSub1, 1, "Failed to calc sub1");


        System.out.println("******** Second Test Case For Calc Sub ********");
        int actualValueSub2 = AricmaticOperator.calSub(50, 20);
        System.out.println("Actual Sub Value is: " + actualValueSub2);
        softAssert.assertEquals(actualValueSub2, 30, "Failed to calc sub2");

        softAssert.assertAll();
    }

}
