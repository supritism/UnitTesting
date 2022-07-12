package Junit.UnitTesting_MoreExamples;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @BeforeClass //This will be run once before the class or any of it's tests run.
    public static void beforeClass(){
        System.out.println("This is executed before any test case runs and count is: " + count++);
    }

    @Before //This will run before every test method invocation
    public void setup(){
        account = new BankAccount("Sana", "Mohanty", 1000.0, BankAccount.CHECKING);
        System.out.println("Running a Test .....and count is: " + count++);
    }

    @Test
    public void deposit() {
        // fail("Empty stubs. Fail method as yet to be implemented");
        // BankAccount account = new BankAccount("Sana", "Mohanty", 1000.0, BankAccount.CHECKING); //moved it to setup()
        double balance = account.deposit(200.00, true);
        assertEquals(1200, balance, 0); // the third parameter 'delta' - allows some leeway in the double values comparison.
    }

    @Test
    public void withdraw_branch() {
        //fail("Empty stubs. Fail method as yet to be implemented");
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
        account.withdraw(600.00, false);
        fail("Should have thrown an IllegalArgumentException"); //This will show when this method fails i.e when branch:true and no IAE is thrown
    }
    /* another way of doing the above is below :
    @org.junit.Test
    public void withdraw_notBranch() {
    try {
        account.withdraw(600.00, false);
    } catch(IllegalArgumentException e) {

    }
    */

    @Test
    public void getBalance_deposit() {
        //fail("Empty stubs. Fail method as yet to be implemented");
        // BankAccount account = new BankAccount("Sana", "Mohanty", 1000.0, BankAccount.CHECKING); //moved it to setup()
        account.deposit(200.00, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdrawal() {
        //fail("Empty stubs. Fail method as yet to be implemented");
        //BankAccount account = new BankAccount("Sana", "Mohanty", 1000.0, BankAccount.CHECKING); //moved it to setup()
        account.withdraw(200.00, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {
        //BankAccount account = new BankAccount("Sana", "Mohanty", 1000.0, BankAccount.CHECKING); //moved it to setup()
        //assertEquals(true, account.isChecking());
        assertTrue("Account type is not Checking account", account.isChecking()); //better here to use 'assertTrue' than 'assertEqual'
    }

    @AfterClass //This will run once after all the tests in a run have completed.
    public static void afterClass(){
        System.out.println("This is executed after all test methods have run and count is: " + count++);
    }

}
