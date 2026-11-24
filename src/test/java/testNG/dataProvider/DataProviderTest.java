package testNG.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "getData", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String un, String pwd){
        System.out.println(un + " " + pwd);
    }


}
