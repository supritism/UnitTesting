package Junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/*
Step 11 : Parametrized test
 */
@RunWith(Parameterized.class)
public class StringHelper_ParameterizedTest {
    //AACD => CD ACD => CD CDEF => CDEF
    StringHelper01 helper01 = new StringHelper01();

    String input;
    String actualOutput;

    public StringHelper_ParameterizedTest(String input, String actualOutput) {
        this.input = input;
        this.actualOutput = actualOutput;
    }

    @Parameterized.Parameters
    public static List<String[]> testConditions() {
        String[][] expectedOutputs = {
                {"AACD" , "CD"},
                {"ACD" , "CD"},
                {"CDEF", "CDEF"}
        };
        return Arrays.asList(expectedOutputs); //Arrays.asList is to convert an Array to a List
    }

    @Test
    public void testTruncateAInFirst2Positions() {
        Assert.assertEquals("AACD => CD usecase check" ,actualOutput, helper01.truncateAInFirst2Positions(input));

//        assertEquals("AACD => CD usecase check" ,"CD", helper01.truncateAInFirst2Positions("AACD")); //case 1
//        assertEquals("ACD => CD usecase check " ,"CD", helper01.truncateAInFirst2Positions("ACD")); //case 2
//        assertEquals("CDEF => CDEF usecase check ","CDEF", helper01.truncateAInFirst2Positions("CDEF")); //case 3

    }

}

