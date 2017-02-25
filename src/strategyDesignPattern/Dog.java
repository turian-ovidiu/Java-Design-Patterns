package strategyDesignPattern;


public class Dog extends Animal {

    public Dog(){
        super();
        setName("Jack");
        setDescription("Jack is a dog");
        setAge(2);
        setFly(new CantFly());
    }
}
