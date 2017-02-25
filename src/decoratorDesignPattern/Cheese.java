package decoratorDesignPattern;


public class Cheese extends HamburgerDecorator{

    public Cheese(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" plus cheese";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of cheese "+ 3.38);
        return super.getCost()+3.38;
    }
}
