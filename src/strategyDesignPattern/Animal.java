package strategyDesignPattern;


public class Animal {

    private String name;
    private String description;
    private int age;

    private Fly flyType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFly() {
        return flyType.setFly();
    }

    public void setFly(Fly fly) {
        this.flyType = fly;
    }
}
