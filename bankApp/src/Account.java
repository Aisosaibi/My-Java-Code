package bankApp;

import java.math.BigDecimal;

public class Account {
    private int pin = 1234;
    private BigDecimal balance = BigDecimal.ZERO;

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        boolean amountIsPositive = amount.compareTo(BigDecimal.ZERO) > 0;
        if (amountIsPositive) balance = balance.add(amount);
    }

    public void withdraw(int pin, BigDecimal amount) {
        boolean amountIsPositive = amount.compareTo(BigDecimal.ZERO) > 0;
        if (pin != this.pin) throw new SecurityException("Invalid Pin");
        if (amount.compareTo(balance) <= 0 && amountIsPositive){
            balance = balance.subtract(amount);
        }
    }

    public void setPin(int previousPin, int currentPin) {
        if (previousPin != pin) throw new SecurityException("Invalid Pin");
        pin = currentPin;
    }
}


//package bankApp;
//
//public class Account {
//    private int pin = 1234;
//    private int balance;
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void deposit(int amount) {
//        boolean amountIsPositive = amount > 0;
//        if (amountIsPositive) balance = balance + amount;
//    }
//
//    public void withdraw(int pin, int amount) {
//        boolean amountIsPositive = amount > 0;
//        if (pin != this.pin) throw new SecurityException("Invalid Pin");
//        if (amount <= balance && amountIsPositive){
//            balance = balance - amount;
//        }
//    }
//
//    public void setPin(int previousPin, int currentPin) {
//        if (previousPin != pin) throw new SecurityException("Invalid Pin");
//        pin = currentPin;
//    }
//}