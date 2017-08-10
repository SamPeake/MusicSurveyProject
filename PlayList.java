/**
 * 
 */
package musicsurvey;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collector;

/**
 * @author sampe
 *
 */
public class PlayList extends LinkedList<Song> {

    public PlayList() {
        super();
    }
    public void sortBySong() {

     
        Collections.sort(this, new SongComparator());

    }

    public void sortByArtist() {

        Collections.sort(this, new ArtistComparator());
    }

    public void sortByGenre() {

        Collections.sort(this, new GenreComparator());
    }

    public void sortByYear() {

        Collections.sort(this, new YearComparator());
    }

    public String toSongString() {
        StringBuilder str = new StringBuilder();
        str.append('[');
        if (!super.isEmpty()) {
            str.append(super.get(0).getSongName());
            for (int i = 1; i < super.size(); i++) {
                str.append(", ").append(super.get(i).getSongName());
            }
        }
        str.append(']');
        return str.toString();
    }

    public String toArtistString() {

        StringBuilder str = new StringBuilder();
        str.append('[');
        if (!super.isEmpty()) {
            str.append(super.get(0).getArtist());
            for (int i = 1; i < super.size(); i++) {
                str.append(", ").append(super.get(i).getArtist());
            }
        }
        str.append(']');
        return str.toString();
    }

    public String toGenreString() {

        StringBuilder str = new StringBuilder();
        str.append('[');
        if (!super.isEmpty()) {
            str.append(super.get(0).getGenre());
            for (int i = 1; i < super.size(); i++) {
                str.append(", ").append(super.get(i).getGenre());
            }
        }
        str.append(']');
        return str.toString();
    }

    public String toYearString() {

        StringBuilder str = new StringBuilder();
        str.append('[');
        if (!super.isEmpty()) {
            str.append(super.get(0).getYear());
            for (int i = 1; i < super.size(); i++) {
                str.append(", ").append(super.get(i).getYear());
            }
        }
        str.append(']');
        return str.toString();
    }
}