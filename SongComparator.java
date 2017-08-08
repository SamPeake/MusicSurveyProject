/**
 * 
 */
package musicsurvey;

import java.util.Comparator;

/**
 * @author sampe
 *
 */
public class SongComparator implements Comparator<Song> {

    public SongComparator() {
        super();
    }
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getSongName().compareTo(o2.getSongName());
    }

}
