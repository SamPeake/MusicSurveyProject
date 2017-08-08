/**
 * 
 */
package musicsurvey;

import java.util.Comparator;

/**
 * @author sampe
 *
 */
public class ArtistComparator implements Comparator<Song> {

    public ArtistComparator() {
        super();
    }
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
}
