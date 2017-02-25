package proxyDesignPattern;


import java.util.Calendar;

public class InternetProxy implements ISP {

    @Override
    public String getResources(String site) {
        this.logRequest(site);

        if (this.isBlocked(site)) {
            return "This site is blocked !";
        }

        NetworkSettings networkSettings = new NetworkSettings();
        return networkSettings.getISP().getResources(site);
    }

    private void logRequest(String site) {
        System.out.println(Calendar.getInstance().getTime() + " Request for -" + site);
    }

    public boolean isBlocked(String site) {
        switch (site) {
            case "www.google.com":
                return false;
            case "www.yahoo.com":
                return false;
            default:
                return true;
        }
    }
}
