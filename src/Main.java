import Entity.Account;
import Service.AccountService;
import Service.DepositThread;
import Service.WithdrawThread;

import java.io.IOError;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("A123", 10000);
        double withdrawAmount = 150;
        //AccountService as = new AccountService(acc,withdrawAmount);
        WithdrawThread wd = new WithdrawThread(acc,withdrawAmount);
        double depositAmount = 55;
        DepositThread dp = new DepositThread(acc,depositAmount);
        Thread t1 = new Thread(wd);
        Thread t2 = new Thread(dp);
        try {
            t1.start();
            t1.join(); //thông báo cho t2 thực hiện đi t1 xong rồi!
            t2.start();
            t2.join();
        }catch(IOError|InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(acc);
    }
}