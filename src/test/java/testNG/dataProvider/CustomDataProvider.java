package testNG.dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider
    public Object[][] getData(){
        Object[][] data = {
                {"abc@gmail.com", "abc123"}, {"efg@gmail.com", "efg123"},{"xyz@gmail.com", "xyz123"}
        };
        return data;
    }
}
