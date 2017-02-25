package iteratorDesignPattern;


public class SongInfo {

    private String songName;
    private String bandName;
    private int yearRealeased;

    public SongInfo(String songName, String bandName, int yearRealeased) {
        this.songName = songName;
        this.bandName = bandName;
        this.yearRealeased = yearRealeased;
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getYearRealeased() {
        return yearRealeased;
    }
}
