package stateDesignPattern;


public class SecondYearKid implements KidState {

    @Override
    public void kidEat() {
        System.out.println("The kid eat food");
    }

    @Override
    public void kidPlay() {
        System.out.println("The kid plays with toys");
    }
}
