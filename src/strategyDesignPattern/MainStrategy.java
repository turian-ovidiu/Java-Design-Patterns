package strategyDesignPattern;


public class MainStrategy {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Name"+dog.getName()+"\nDesc:"+dog.getDescription()+"\nAge: "+dog.getAge()+"\nFly Type: "+dog.getFly()+"\n");
        System.out.println("Name"+bird.getName()+"\nDesc:"+bird.getDescription()+"\nAge: "+bird.getAge()+"\nFly Type: "+bird.getFly()+"\n");
    }
}
