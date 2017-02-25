package stateDesignPattern;


public class Kid {

    KidState kidState;

    private int year;

    public int getYear() {
        return year;
    }

    public Kid(int age) {
        this.year = age;

        chooseKid();
    }

    private void chooseKid() {
        if (getYear() == 1) {
            kidState = new FirstYearKid();
        }
        if (getYear() == 2) {
            kidState = new SecondYearKid();
        } else {
            kidState = new FirstYearKid();
        }
    }

    public void kidEat() {
        kidState.kidEat();
    }

    public void kidPlay() {
        kidState.kidPlay();
    }
}
