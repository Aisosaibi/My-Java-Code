package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account aisosaibi;

    @BeforeEach
    public void setUp () {
        aisosaibi = new Account();
    }

    @Test
    public void testThatDepositInEmptyAccountBecomesNewAccountBalance () {
        aisosaibi.deposit(new BigDecimal("200"));
        assertEquals(new BigDecimal("200"), aisosaibi.getBalance());
    }

    @Test
    public void testThatDepositNegativeAmountHasNoEffectOnAccountBalance () {
        BigDecimal amount = new BigDecimal("-50");
        aisosaibi.deposit(amount);
        assertEquals(new BigDecimal("0"), aisosaibi.getBalance());
    }

    @Test
    public void testThatAccountBalanceReflectsTotalDeposits () {
        aisosaibi.deposit(new BigDecimal("200"));
        aisosaibi.deposit(new BigDecimal("500"));
        assertEquals(new BigDecimal("700"), aisosaibi.getBalance());
    }

    @Test
    public void testThatWithdrawWithoutCorrectPinReturnsException () {
        aisosaibi.deposit(new BigDecimal("200"));
        assertThrows(SecurityException.class, () -> aisosaibi.withdraw(5678, new BigDecimal("200")));
    }

    @Test
    public void testThatFinalAccountBalanceEqualsDepositsMinusWithdraw () {
        aisosaibi.deposit(new BigDecimal ("700"));
        aisosaibi.withdraw(1234, new BigDecimal("300"));
        assertEquals(new BigDecimal("400"), aisosaibi.getBalance());
    }

    @Test
    public void testThatAccountCanWithdrawExactBalance() {
        aisosaibi.deposit(new BigDecimal("300"));
        aisosaibi.withdraw(1234, new BigDecimal("300"));
        assertEquals(new BigDecimal("0"), aisosaibi.getBalance());
    }

    @Test
    public void testThatAccountCannotWithdrawMoreThanBalance () {
        aisosaibi.deposit(new BigDecimal("200"));
        aisosaibi.withdraw(1234, new BigDecimal("300"));
        assertEquals(new BigDecimal("200"), aisosaibi.getBalance());
    }

    @Test
    public void testThatWithdrawNegativeAmountHasNoEffectOnBalance() {
        aisosaibi.deposit(new BigDecimal("200"));
        aisosaibi.withdraw(1234, new BigDecimal("-50"));
        assertEquals(new BigDecimal("200"), aisosaibi.getBalance());
    }

    @Test
    public void testThatAccountBalanceReflectsTotalTransactions () {
        aisosaibi.deposit(new BigDecimal("1000"));
        aisosaibi.withdraw(1234, new BigDecimal("400"));
        aisosaibi.deposit(new BigDecimal("400"));
        aisosaibi.withdraw(1234, new BigDecimal("800"));
        assertEquals(new BigDecimal("200"), aisosaibi.getBalance());
    }

    @Test
    public void testThatAccountBalanceRemainsZeroAsItCannotWithdrawFromEmptyAccount () {
        aisosaibi.withdraw(1234, new BigDecimal("300"));
        assertEquals(new BigDecimal("0"), aisosaibi.getBalance());
    }

    @Test
    public void testThatsetPinReassignsAccountPreviousPin() {
        aisosaibi.deposit(new BigDecimal("500"));
        int previousPin = 1234, currentPin = 5678;
        aisosaibi.setPin(previousPin, currentPin);
        aisosaibi.withdraw(currentPin, new BigDecimal("400"));
        assertEquals(new BigDecimal("100"), aisosaibi.getBalance());
    }

    @Test
    public void testThatsetPinThrowsSecurityExceptionCorrectPreviousPin() {
        int previousPin = 2467, currentPin = 5678;
        assertThrows(SecurityException.class, ()-> aisosaibi.setPin(previousPin, currentPin));
    }

    @Test
    public void testThatOldPinFailsAfterSetPin() {
        aisosaibi.deposit(new BigDecimal("500"));
        aisosaibi.setPin(1234, 5678);
        assertThrows(SecurityException.class, () -> aisosaibi.withdraw(1234, new BigDecimal("100")));
    }

}



//package bankApp;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class AccountTest {
//
//    private Account aisosaibi;
//
//    @BeforeEach
//    public void setUp () {
//        aisosaibi = new Account();
//    }
//
//    @Test
//    public void testThatDepositInEmptyAccountBecomesNewAccountBalance () {
//        aisosaibi.deposit(200);
//        assertEquals(200, aisosaibi.getBalance());
//    }
//
//    @Test
//    public void testThatDepositNegativeAmountHasNoEffectOnAccountBalance () {
//        aisosaibi.deposit(-50);
//        assertEquals(0, aisosaibi.getBalance());
//    }
//
//    @Test
//    public void testThatAccountBalanceReflectsTotalDeposits () {
//        aisosaibi.deposit(200);
//        aisosaibi.deposit(500);
//        assertEquals(700, aisosaibi.getBalance());
//    }
//
//    @Test
//    public void testThatWithdrawWithoutCorrectPinReturnsException () {
//        aisosaibi.deposit(200);
//        assertThrows(SecurityException.class, ()-> aisosaibi.withdraw(5678, 100));
//    }
//
//    @Test
//    public void testThatFinalAccountBalanceEqualsDepositsMinusWithdraw () {
//        aisosaibi.deposit(700);
//        aisosaibi.withdraw(1234, 300);
//        assertEquals(400, aisosaibi.getBalance());
//    }
//
//    @Test
//    public void testThatAccountCanWithdrawExactBalance() {
//        aisosaibi.deposit(300);
//        aisosaibi.withdraw(1234, 300);
//        assertEquals(0, aisosaibi.getBalance());
//    }
//
//    @Test
//    public void testThatAccountCannotWithdrawMoreThanBalance () {
//        aisosaibi.deposit(200);
//        aisosaibi.withdraw(1234, 300);
//        assertEquals(200, aisosaibi.getBalance());
//    }
//
//    @Test
//    public void testThatWithdrawNegativeAmountHasNoEffectOnBalance() {
//        aisosaibi.deposit(200);
//        aisosaibi.withdraw(1234, -50);
//        assertEquals(200, aisosaibi.getBalance());
//    }
//
//    @Test
//    public void testThatAccountBalanceReflectsTotalTransactions () {
//        aisosaibi.deposit(1000);
//        aisosaibi.withdraw(1234, 400);
//        aisosaibi.deposit(400);
//        aisosaibi.withdraw(1234, 800);
//        assertEquals(200, aisosaibi.getBalance());
//    }
//
//    @Test
//    public void testThatAccountBalanceRemainsZeroAsItCannotWithdrawFromEmptyAccount () {
//        aisosaibi.withdraw(1234, 300);
//        assertEquals(0, aisosaibi.getBalance());
//    }
//
//    @Test
//    public void testThatsetPinReassignsAccountPreviousPin() {
//        aisosaibi.deposit(500);
//        int previousPin = 1234, currentPin = 5678;
//        aisosaibi.setPin(previousPin, currentPin);
//        aisosaibi.withdraw(currentPin, 400);
//        assertEquals(100, aisosaibi.getBalance());
//    }
//
//    @Test
//    public void testThatsetPinThrowsSecurityExceptionCorrectPreviousPin() {
//        int previousPin = 2467, currentPin = 5678;
//        assertThrows(SecurityException.class, ()-> aisosaibi.setPin(previousPin, currentPin));
//    }
//
//    @Test
//    public void testThatOldPinFailsAfterSetPin() {
//        aisosaibi.deposit(500);
//        aisosaibi.setPin(1234, 5678);
//        assertThrows(SecurityException.class, () -> aisosaibi.withdraw(1234, 100));
//    }
//
//}