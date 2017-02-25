package facadeDesignPattern;


public class Funds {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdraw) {
        cashInAccount -= cashWithdraw;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {
        if (cashToWithdrawal > getCashInAccount()) {
            System.out.println("Error : You don`t have enough money");
            System.out.println("Current balance : " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdraw complete : Current Balance is " + getCashInAccount());
            return true;
        }
    }

    public void depositCash(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete : Current Balance is " + getCashInAccount());
    }
}
