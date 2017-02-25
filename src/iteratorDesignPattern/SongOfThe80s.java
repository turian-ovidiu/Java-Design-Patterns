package iteratorDesignPattern;


import java.util.Arrays;
import java.util.Iterator;

public class SongOfThe80s implements SongIterator {

    SongInfo[] bestSongs;

    int arrayValue = 0;

    public SongOfThe80s() {
        bestSongs = new SongInfo[3];

        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);
    }

    private void addSong(String songName, String bandName, int yearRealesed) {

        SongInfo songInfo = new SongInfo(songName, bandName, yearRealesed);
        bestSongs[arrayValue] = songInfo;
        arrayValue++;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
