package facadeDesignPattern;


public class SecurityCode {

    private int securityCode = 12345;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int secCodeCheck) {

        if (secCodeCheck == getSecurityCode()) {
            return true;
        } else {
            return false;
        }
    }
}
