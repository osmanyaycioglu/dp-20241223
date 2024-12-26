package org.training.sqills.pattern.behavioral.command;


import java.math.BigDecimal;

public class Account {
    private EAccountType accountType;
    private String       name;
    private BigDecimal amount;
    private String accountNumber;


    public Account() {
    }

    public Account(final EAccountType accountTypeParam,
                   final String nameParam,
                   final BigDecimal amountParam,
                   final String accountNumberParam) {
        accountType   = accountTypeParam;
        name          = nameParam;
        amount        = amountParam;
        accountNumber = accountNumberParam;
    }

    public EAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(final EAccountType accountTypeParam) {
        accountType = accountTypeParam;
    }

    public String getName() {
        return name;
    }

    public void setName(final String nameParam) {
        name = nameParam;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(final BigDecimal amountParam) {
        amount = amountParam;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final String accountNumberParam) {
        accountNumber = accountNumberParam;
    }

    @Override
    public String toString() {
        return "Account{" +
               "accountType=" + accountType +
               ", name='" + name + '\'' +
               ", amount=" + amount +
               ", accountNumber='" + accountNumber + '\'' +
               '}';
    }
}
