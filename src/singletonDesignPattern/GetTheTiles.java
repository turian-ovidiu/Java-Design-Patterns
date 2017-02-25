package singletonDesignPattern;


import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();

        System.out.println("First instance id : "+System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetters());

        LinkedList<String> playerTiles = newInstance.getTiles(8);
        System.out.println("Player : "+playerTiles);
    }
}
