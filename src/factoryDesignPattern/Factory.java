package factoryDesignPattern;


public class Factory {

    // This could be used as a static method if we
    // are willing to give up subclassing it

    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;

        if (newShipType.equals("U")) {
            return new UFOShip();
        }

        if (newShipType.equals("R")) {
            return new RocketShip();
        }

        return newShip;
    }

}
