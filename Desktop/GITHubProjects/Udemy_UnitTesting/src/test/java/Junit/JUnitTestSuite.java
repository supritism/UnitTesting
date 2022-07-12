package Junit;/*
Step 12 : Organise Junit in suites
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( {QuickBeforeAfterTest.class, StringHelper_ParameterizedTest.class} )
public class JUnitTestSuite {

}
