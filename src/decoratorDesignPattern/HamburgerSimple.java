package decoratorDesignPattern;


public class HamburgerSimple implements Hamburger {

    @Override
    public String getDescription() {
        return "Hamburger simple";
    }

    @Override
    public double getCost() {
        System.out.println("The cost of a simple hamburger " + 4.25);
        return 4.25;
    }
}
