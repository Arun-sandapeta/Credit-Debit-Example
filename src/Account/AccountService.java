package Account;

public class AccountService {
    public Account withdraw(Account account,double withdrawAmount ){

        if (account.balance>withdrawAmount){
            System.out.println(account.accountHolderName+" withdrawn "+ withdrawAmount);

            account.balance = account.balance - withdrawAmount;
            System.out.println(account.balance);

        }else {
            System.out.println("you dont have enough balance to withdraw "+ account.balance);
        }

        return account;
    }


    public Account credit(Account account, double creditAmount){
        if (creditAmount>0){
            account.balance=account.balance+creditAmount;
            System.out.println(account.balance+ " deposited to your account");
        }else {
            System.out.println("deposit amount should be >0");
        }

        return account;
    }

    void details(Account account){
        System.out.println("Accounr HolderName "+account.accountHolderName);
        System.out.println("Accounnt Number "+account.accountNumber);
        System.out.println("IFSC code "+account.IFSC);
        System.out.println("Balance Amount "+account.balance);
    }
}
