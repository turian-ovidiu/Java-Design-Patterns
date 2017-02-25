package facadeDesignPattern;


public class AccountNumber {

    private int accountNumber = 7654321;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int acctNumCheck) {

        if (acctNumCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
