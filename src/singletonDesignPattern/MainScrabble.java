package singletonDesignPattern;


public class MainScrabble {

    public static void main(String[] args) {
        Runnable firstPlayer = new GetTheTiles();
        Runnable secondPlayer = new GetTheTiles();

        new Thread(firstPlayer).start();
        new Thread(secondPlayer).start();
    }
}
