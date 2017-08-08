/**
 * 
 */
package musicsurvey;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author sampe
 *
 */
public class PlayList extends LinkedList<Song> {

    
    
    public PlayList() {
        super();
    }
    public void sortBySong() {
        
        
        for (int i = 0; i < super.size(); i++) {
            Song song1 = this.get(i);
            Song song2 = song1;
            int index = i;
            for (int j = i + 1; j < super.size(); j++) {
                song2 = super.get(j);
                
                if (song1.getSongName().compareTo(song2.getSongName()) > 0) {
                    index = j;
                }

            }
            if(index == i) {
                song2 = song1;
            }
            super.remove(index);
            super.add(index, song1);
            super.remove(i);
            super.add(i, song2);
        }


    }
    

    public void sortByArtist() {

        for (int i = 0; i < super.size(); i++) {
            Song song1 = super.get(i);
            Song song2 = song1;
            int index = i;
            for (int j = i; j < super.size(); j++) {
                song2 = super.get(j);
                
                if (song1.getArtist().compareTo(song2.getArtist()) < 0) {
                    index = j;
                }

            }
            if(index != i) {
                super.remove(index);
                super.add(index, song1);
                super.remove(i);
                super.add(i, song2);
            }
            
        }
    }

    public void sortByGenre() {

        for (int i = 0; i < super.size(); i++) {
            Song song1 = this.get(i);
            Song song2 = song1;
            int index = i;
            for (int j = i; j < super.size(); j++) {
                song2 = super.get(j);
                
                if (song1.getGenre().compareTo(song2.getGenre()) > 0) {
                    index = j;
                }

            }
            if(index == i) {
                song2 = song1;
            }
            super.remove(index);
            super.add(index, song1);
            super.remove(i);
            super.add(i, song2);
        }
    }

    public void sortByYear() {

        for (int i = 0; i < super.size(); i++) {
            Song song1 = this.get(i);
            Song song2 = song1;
            int index = i;
            for (int j = i; j < super.size(); j++) {
                song2 = super.get(j);
                
                if ((song1.getYear() - song2.getYear()) > 0) {
                    index = j;
                }

            }
            if(index == i) {
                song2 = song1;
            }
            super.remove(index);
            super.add(index, song1);
            super.remove(i);
            super.add(i, song2);
        }
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