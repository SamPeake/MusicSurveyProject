/**
 * 
 */
package musicsurvey;

import java.util.Comparator;

/**
 * @author sampe
 *
 */
public class GenreComparator implements Comparator<Song> {

    public GenreComparator() {
        super();
    }
    @Override
    public int compare(Song o1, Song o2) {
       return o1.getGenre().compareTo(o2.getGenre());
    }

}
