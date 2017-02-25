package stateDesignPattern;


public class FirstYearKid implements KidState{

    @Override
    public void kidEat() {
        System.out.println("The kid eat milk");
    }

    @Override
    public void kidPlay() {
        System.out.println("The kid plays with his hands");
    }
}
