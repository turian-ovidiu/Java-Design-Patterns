package decoratorDesignPattern;


public abstract class HamburgerDecorator implements Hamburger {

    protected Hamburger hamburgerObj;

    public HamburgerDecorator(Hamburger newHamburger) {
        hamburgerObj = newHamburger;
    }

    @Override
    public String getDescription() {
        return hamburgerObj.getDescription();
    }

    @Override
    public double getCost() {
        return hamburgerObj.getCost();
    }
}
