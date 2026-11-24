package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.AricmaticOperator;

public class AricmaticOperatorDataProviderTest {

    @Test(dataProvider = "setOfData")
    public void testSum(int input1, int input2, int expectedOutput){
        Assert.assertEquals(AricmaticOperator.calSum(input1, input2), expectedOutput, "Failed to calc sum");
    }

    @DataProvider(name = "setOfData")
    public Object[][] getData(){
        Object[][] data = {
                {0,1,1},
                {0,-1,-1},
                {-22344,-1,-22345},
                {2222,3333,5555}
        };
        return data;
    }

}
