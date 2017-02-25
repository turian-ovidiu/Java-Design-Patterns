package factoryDesignPattern;


import java.util.Scanner;

public class MainFactory {

    public static void main(String[] args) {

        Factory factory = new Factory();
        EnemyShip enemyShip = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a type of ship (R or U)");

        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            enemyShip = factory.makeEnemyShip(typeOfShip);

            if (enemyShip != null) {
                displayDescription(enemyShip);
            } else {
                System.out.println("Please enter R or U next time");
            }
            userInput.close();
        }

    }

    private static void displayDescription(EnemyShip enemyShip) {
        System.out.println("Ship name : " + enemyShip.getName());
        System.out.println("Damage : " + enemyShip.getDamage());
        System.out.println("Speed : " + enemyShip.getSpeed());
    }
}
