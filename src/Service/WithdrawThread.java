package Service;

import Entity.Account;

public class WithdrawThread extends AccountService implements Runnable{
    public WithdrawThread(Account acc, double amount){
        super(acc, amount);
    }
    @Override public Account transactionRequest(){
        //check amount available// ?
        super.getAccount().setBalance(super.getAccount().getBalance()-super.getAmount());
        //super.getAccount().setId(super.getAccount().getId());
        return super.getAccount();
    }
    @Override
    public void run() {
        transactionRequest();
    }
}
