package singletonDesignPattern;


import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

    private static Singleton firstInstance = null;

    String[] scrabbleLetters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    public Singleton() {
    }

    public static Singleton getInstance() {

        if (firstInstance == null) {
            if (firstThread) {
                firstThread = false;

                try {
                    Thread.currentThread();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Singleton.class) {
                if (firstInstance == null) {
                    firstInstance = new Singleton();
                    Collections.shuffle(firstInstance.letterList);
                }
            }
        }
        return firstInstance;
    }

    public LinkedList<String> getLetters() {
        return firstInstance.letterList;
    }

    public LinkedList<String> getTiles(int howMany) {
        LinkedList<String> tiles = new LinkedList<String>();

        for (int i = 0; i < howMany; i++) {
            tiles.add(firstInstance.letterList.remove(0));
        }
        return tiles;
    }


}



















