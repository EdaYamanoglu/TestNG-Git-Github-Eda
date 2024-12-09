package qafellas.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import qafellas.function.StringFunctions;

public class StringTest {
    @Test (description = "should convert a string to uppercase one")
    public void upperCaseTest(){
        StringFunctions sf=new StringFunctions();
        String str= "Orlando";
        String expected= "ORLANDO";
        String actual= sf.toUpperCase(str);

        //Verify the original result
//        if (actual == expected){
//            System.out.println("Its a match");
//        }else{
//            System.out.println("it's not a match");
//        }

      Assert.assertEquals(actual,expected,"It is not a match");

    }
}
