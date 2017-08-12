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
public class SongTest extends TestCase {

    private Song song1;


    /**
     * this is the setUp
     */
    @Override
    public void setUp() {
        song1 = new Song("CallMeMaybe", "Carly", "pop", "2011");
       

    }

    /**
     * this method is used to test the getSongnAME
     */
    public void testGetSongName() {
        assertEquals("CallMeMaybe", song1.getSongName());
    }

    /**
     * this method is used to test the genre
     */
    public void testGetGenre() {
        assertEquals("pop", song1.getGenre());
    }

    /**
     * this method is used to test the year
     */
    public void testGetYear() {
        assertEquals("2011", song1.getYear());
    }

    /**
     * this method is used to test the year
     */
    public void testGetArtist() {
        assertEquals("Carly", song1.getArtist());
    }

    /**
     * this method is used to test toString
     */
    public void testToString() {
        String str = "Song Name: CallMeMaybe" + "\n" + "Song Artist: Carly"
                + "\n" + "Song Genre: pop" + "\n" + "Song Year: 2011";
        assertEquals(str, song1.toString());
    }

    /**
     * this method is used to test the getDimension
     */
    public void testGetDimension1() {
        song1.getDimension(1);
        song1.getDimension(2);
        song1.getDimension(3);

        // assertEquals(major, song1.getDimension(1));
        // assertEquals(hobby, song1.getDimension(2));
        // assertEquals(location, song1.getDimension(3));
        // assertEquals(major, song1.getDimension(4));

        String str = "Song Name: CallMeMaybe" + "\n" + "Song Artist: Carly"
                + "\n" + "Song Genre: pop" + "\n" + "Song Year: 2011";
        assertEquals(str, song1.toString());
    }

}