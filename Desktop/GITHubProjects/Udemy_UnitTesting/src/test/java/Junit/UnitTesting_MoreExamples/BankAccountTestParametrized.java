package Junit.UnitTesting_MoreExamples;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParametrized {

    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParametrized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before //This will run before every test method invocation
    public void setup(){
        account = new BankAccount("Sana", "Mohanty", 1000.0, BankAccount.CHECKING);
        System.out.println("Running a Test ...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {100.00, true, 1100.00},
                {200.00, true, 1200.00},
                {325.14, true, 1325.14},
                {489.33, true, 1489.33},
                {1000.00, true, 2000.00}
        });
    }

    @Test
    public void deposit() {
        account = new BankAccount("Sana", "Mohanty", 1000.0, BankAccount.CHECKING);
        account.deposit(this.amount, this.branch);
        assertEquals(this.expected, account.getBalance(), 0.01);
    }
}
