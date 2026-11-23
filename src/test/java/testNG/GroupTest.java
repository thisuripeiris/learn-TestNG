package testNG;

import org.testng.annotations.Test;

public class GroupTest {
    //S= Smoke, R = Regression

    @Test(groups = {"S", "R"})
    public void Test01(){
        System.out.println("Smoke and Regression");
    }

    @Test(groups = {"R"})
    public void Test02(){
        System.out.println("Regression");
    }

    @Test
    public void Test03(){
        System.out.println("Not Smoke or Regression");
    }

    @Test(groups = {"S"})
    public void Test04(){
        System.out.println("Smoke");
    }

    @Test(groups = {"S", "R"})
    public void Test05(){
        System.out.println("Smoke and Regression");
    }
}
