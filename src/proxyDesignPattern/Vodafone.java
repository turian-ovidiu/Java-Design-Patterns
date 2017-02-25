package proxyDesignPattern;


public class Vodafone implements ISP{

    @Override
    public String getResources(String site) {
        switch (site){
            case "www.google.com":
                return "Gooooogle";
            case "www.yahoo.com":
                return "Yahhhhooo";
            default:
                return "Sorry no resource found";
        }
    }
}
