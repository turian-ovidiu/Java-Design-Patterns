package facadeDesignPattern;


public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumber acctCheck;
    SecurityCode codeCheck;
    Funds fundCheck;
    WelcomeToBank welcomeToBank;

    public BankAccountFacade(int newAcctNum, int newSecCode) {
        accountNumber = newAcctNum;
        securityCode = newSecCode;

        welcomeToBank = new WelcomeToBank();
        acctCheck = new AccountNumber();
        codeCheck = new SecurityCode();
        fundCheck = new Funds();

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }


    public void withdrawMoney(double cashToGet) {

        if (acctCheck.accountActive(getAccountNumber()) &&
                codeCheck.isCodeCorrect(getSecurityCode()) &&
                fundCheck.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction Complete");
        } else {
            System.out.println("Transaction Failed");
        }
    }

    public void depositMoney(double cashToDeposit) {
        if (acctCheck.accountActive(getAccountNumber()) &&
                codeCheck.isCodeCorrect(getSecurityCode())) {
            fundCheck.depositCash(cashToDeposit);
            System.out.println("Transaction Complete");
        } else {
            System.out.println("Transaction Failed");
        }
    }

}



















