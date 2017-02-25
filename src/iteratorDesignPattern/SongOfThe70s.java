package iteratorDesignPattern;


import java.util.ArrayList;
import java.util.Iterator;

public class SongOfThe70s implements SongIterator {

    ArrayList<SongInfo> bestSongs;

    public SongOfThe70s() {
        bestSongs = new ArrayList<SongInfo>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("God save the queen", "Sex Pistols", 1977);
        addSong("London calling", "The Clash", 1979);
    }

    private void addSong(String songName, String bandName, int yearRealeased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearRealeased);
        bestSongs.add(songInfo);
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
