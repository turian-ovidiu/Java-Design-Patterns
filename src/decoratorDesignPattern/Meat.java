package decoratorDesignPattern;


public class Meat extends HamburgerDecorator {

    public Meat(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " plus meat";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of meat " + 5.32);
        return super.getCost() + 5.32;
    }
}
