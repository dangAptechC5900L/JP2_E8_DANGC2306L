package Service;

import Entity.Account;

public class DepositThread extends AccountService implements Runnable{

    public DepositThread(Account acc, double amount){
        super(acc,amount);
    }
    @Override public Account transactionRequest(){
        super.getAccount().setBalance(super.getAccount().getBalance()+super.getAmount());
        return super.getAccount();
    }
    @Override
    public void run() {
        transactionRequest();
    }
}
