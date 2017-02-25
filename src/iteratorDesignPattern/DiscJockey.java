package iteratorDesignPattern;


import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class DiscJockey {

    SongIterator iterator70sSongs;
    SongIterator iterator80sSongs;
    SongIterator iterator90sSongs;

    public DiscJockey(SongIterator it70, SongIterator it80, SongIterator it90) {
        this.iterator70sSongs = it70;
        this.iterator80sSongs = it80;
        this.iterator90sSongs = it90;
    }

    public void showTheSongs() {
        System.out.println("The songs : \n");

        Iterator iter70 = iterator70sSongs.createIterator();
        Iterator iter80 = iterator80sSongs.createIterator();
        Iterator iter90 = iterator90sSongs.createIterator();

        System.out.println("Song of the 70 : ");
        printTheSongs(iter70);

        System.out.println("Song of the 80 : ");
        printTheSongs(iter80);

        System.out.println("Song of the 90 : ");
        printTheSongs(iter90);

    }

    public void printTheSongs(Iterator iterSong) {

        while (iterSong.hasNext()) {

            SongInfo songInfo = (SongInfo) iterSong.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearRealeased() + "\n");
        }

    }

}
