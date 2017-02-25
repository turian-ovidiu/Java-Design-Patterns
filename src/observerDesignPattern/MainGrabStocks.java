package observerDesignPattern;

/**
 * Created by Ovi on 11/13/2016.
 */
public class MainGrabStocks {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(126.8);
        stockGrabber.setAaplPrice(145.32);
        stockGrabber.setGoogPrice(132.73);

        StockObserver stockObserver2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(156.9);
        stockGrabber.setAaplPrice(185.57);
        stockGrabber.setGoogPrice(192.23);
    }
}
