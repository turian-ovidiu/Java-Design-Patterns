package decoratorDesignPattern;


public class MainHamburger {

    public static void main(String[] args) {
        Hamburger california = new Meat(new Cheese(new HamburgerSimple()));

        System.out.println("Hamburger description : " + california.getDescription());
        System.out.println("Hamburger total cost : " + california.getCost());
    }
}
