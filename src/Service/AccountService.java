package Service;

import Entity.Account;

public abstract class AccountService {
    private Account account;
    private double amount;
    public AccountService(Account acc, double amount){
        this.account = acc;
        this.amount = amount;
    }
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public abstract Account transactionRequest();

}
