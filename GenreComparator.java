/**
 * 
 */
package musicsurvey;

import java.util.Comparator;

/**
 * @author Sam Peake (samp97)
 * @author zichen zhu (zichen)
 * @author Hytham soueid (hythams8)
 * @version 2017.08.10
 * this is the ArtistCompartore
 */
public class GenreComparator implements Comparator<Song> {

    /**
     * this is the constructor
     */
    public GenreComparator() {
        super();
    }
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }

}