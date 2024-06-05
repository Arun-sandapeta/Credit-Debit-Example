package Account;

public class AccountTest {
    public static void main(String[] args){


        Account account1 = new Account();
        account1.accountNumber=123456789;
        account1.accountHolderName="Arun";
        account1.IFSC="HDFC1234";
        account1.balance=500000;


        Account account = new Account();
        account.accountHolderName="Sai";
        account.accountNumber=789561;
        account.IFSC="HDFC1234";
        account.balance=400000;


        AccountService accountService = new AccountService();
        Account test = accountService.withdraw(account1,1000);


        AccountService accountService1 = new AccountService();
        Account test1 = accountService1.credit(account1,25000);


        AccountService accountService2 = new AccountService();
        Account test2 = accountService.withdraw(account,1000);


        AccountService accountService3 = new AccountService();
        Account test3 = accountService1.credit(account,25000);


    }
}
