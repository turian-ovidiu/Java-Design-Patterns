package strategyDesignPattern;


public interface Fly {

    String setFly();
}

class CanFly implements Fly {
    @Override
    public String setFly() {
        return "This animal fly high";
    }
}

class CantFly implements Fly {
    @Override
    public String setFly() {
        return "This animal cant fly";
    }
}
