package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnTest {
    @Test
    public void oL(){
        System.out.println("O/L");
//        Assert.fail();
    }

    @Test(dependsOnMethods = "oL")
    public void aL(){
        System.out.println("A/L");
    }

    @Test(dependsOnMethods = {"oL", "aL"}, alwaysRun = true)
    public void campus(){
        System.out.println("Campus");
    }
}
