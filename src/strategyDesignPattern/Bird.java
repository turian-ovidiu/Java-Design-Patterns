package strategyDesignPattern;


public class Bird extends Animal {

    public Bird() {
        super();
        setName("Udy");
        setDescription("Udy is a bird");
        setAge(4);
        setFly(new CanFly());
    }
}
