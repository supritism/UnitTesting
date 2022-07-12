package Junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringHelper01Test {
    StringHelper01 helper01 = new StringHelper01();

    /*
    Step 3:
    1. We use @Test annotation to signify something is a unit test.
    2. We use assertEquals() to check two values match.
     */
    @Test
    public void test() {
        //fail("Not yet implemented");
        //AACD => CD ACD => CD CDEF => CDEF
        String case1_actual = helper01.truncateAInFirst2Positions("AACD");
        String case2_actual = helper01.truncateAInFirst2Positions("ACD");
        String case3_actual = helper01.truncateAInFirst2Positions("CDEF");
        assertEquals("AACD => CD usecase check" ,"CD",case1_actual); //case 1
        assertEquals("ACD => CD usecase check " ,"CD",case2_actual); //case 2
        assertEquals("CDEF => CDEF usecase check ","CDEF",case3_actual); //case 3
    }

    /*
    Step 4:
    1. Give a meaningful name to the test to make it clear as to what is it testing.
    2. Unit test method must be 'public void'. No other method signature is acceptable.
    3. A unit test in most cases tests 1 specific usecase and not multiple usecases.
    So the above unit test i.e test() is a bad unit test example. See below for a desired one.
     */
    @Test
    public void testTrucateAInFirst2Positions() {
        String case_actual = helper01.truncateAInFirst2Positions("AACD");
        assertEquals("AACD => CD usecase check" ,"CD",case_actual); //case 1
    }

    /*
    Step 5: Another JUnit example with assertTrue and assertFalse.
    Example is to test if first and last 2 characters in a string are the same.
     */
    //ABCD => false ; ABAB => true, AB => true, A => false
    @Test
    public void testAreFirstAndLast2CharactersInStringSame() {
        boolean actualValue_01 = helper01.areFirstAndLastTwoCharactersTheSame("ABCD");
        assertEquals(false, actualValue_01);
        assertFalse("Last and first 2 characters matched which is expected!",actualValue_01); //Better option than assertEquals()

        boolean actualValue_02 = helper01.areFirstAndLastTwoCharactersTheSame("ABAB");
        assertTrue("Last and first 2 characters did not match!",actualValue_02);
    }

}

