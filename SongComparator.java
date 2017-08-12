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
 * this is the SongComparator
 */
public class SongComparator implements Comparator<Song> {

    /**
     * this is the constructor
     */
    public SongComparator() {
        super();
    }
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getSongName().compareTo(o2.getSongName());
    }

}