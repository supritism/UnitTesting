package Junit;

import org.junit.*;

/*
 Step 6 and 7:
        @Before annotation is used for methods that run before each test.
        @After annotation is used for methods that run after each test.

        @BeforeEach and @BeforeAll are the JUnit 5 equivalents of @Before and @BeforeClass.

        @BeforeClass annotation is used for "static" method that must be executed once and before all tests in the class.
        @AfterClass annotation is used for method that must be executed once and before all tests in the class.
        As these are static method, only class level things can be referenced here and not any instance variables or methods.
 */
public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass executed");
    }

    @Before
    public void setup() {
        System.out.println("@Before executed");
    }

    @Test
    public void test1(){
        System.out.println("test1() executed");
    }

    @Test
    public void test2(){
        System.out.println("test2() executed");
    }

    @After
    public void cleanup() {
        System.out.println("@After executed");
    }

    @AfterClass
    public static void aftereClass() {
        System.out.println("AfterClass executed");
    }
}

/*
BeforeClass executed
@Before executed
test1() executed
@After executed
@Before executed
test2() executed
@After executed
AfterClass executed
 */