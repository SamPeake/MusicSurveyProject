/**
 * 
 */
package musicsurvey;

import student.TestCase;

/**
 * @author Sam Peake (samp97)
 * @author zichen zhu (zichen)
 * @author Hytham soueid (hythams8)
 * @version 2017.08.10
 * this is the 
 */
public class YearComparatorTest extends TestCase {

    private YearComparator acom1;
    private Song song1;
    private Song song2;
    private Song song3;
   
    
    /**
     * this is the setUp
     */
    public void setUp()
    {
        acom1 = new YearComparator();
        song1 = new Song("songName1", "Artist1", "genre1", "year1");
        song2 = new Song("songName1", "Artist1", "genre1", "year1");
        song3 = new Song("songName3", "Artist3", "genre3", "year3");
    }
    
    /**
     * this method is used to compare the song Artist
     */
    public void testCompare()
    {
        
        assertEquals(acom1.compare(song1, song2), 0);
        assertEquals(acom1.compare(song1, song1), 0);
        assertNotSame(acom1.compare(song1, song3), 0);
    }
}
