package facadeDesignPattern;


public class MainBank {

    public static void main(String[] args) {

        BankAccountFacade theBank = new BankAccountFacade(7654321, 12345);

        theBank.withdrawMoney(45.00);
        theBank.withdrawMoney(320.00);
        theBank.depositMoney(500.00);
    }
}
