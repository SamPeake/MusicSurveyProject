/**
 * 
 */
package musicsurvey;

import java.util.Comparator;

/**
 * @author sampe
 *
 */
public class YearComparator implements Comparator<Song> {

    public YearComparator() {
        super();
    }
    @Override
    public int compare(Song o1, Song o2) {
        return o1.getYear().compareTo(o2.getYear());
    }

}