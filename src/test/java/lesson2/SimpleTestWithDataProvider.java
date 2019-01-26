package lesson2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimpleTestWithDataProvider {

    @DataProvider
    private Object[][] simpleDataProvider(){
        return new Object[][]{
                {7},

        };
    }


    @Test(dataProvider = "simpleDataProvider")
    public void simpleTest(int i) {
        System.out.println("int = " + i + "\n" + "String = " );

    }
}
