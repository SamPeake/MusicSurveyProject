/**
 * 
 */
package musicsurvey;

import student.TestCase;

/**
 * @author zichen
 *
 */
public class SongTest extends TestCase {

    private Song song1;
    private Dimension major;
    private Dimension hobby;
    private Dimension location;
    private Category Math;
    private Category CS;
    private Category Engi;
    private Category Other;
    private Student wendy;
    private Dimension dimension1;
    private Category read;
    private Category art;
    private Category sports;
    private Category music;
    private Category location1;
    private Category location2;
    private Category location3;
    private Category location4;

    // private Dimension dimension1;

    /**
     * this is the setUp
     */
    @Override
    public void setUp() {
        song1 = new Song("CallMeMaybe", "Carly", "pop", "2011");
        // major = new Dimension(Math, CS, Engi, Other);
        hobby = new Dimension(read, art, sports, music);
        location = new Dimension(location1, location2, location3, location4);
        major = new Dimension(Math, CS, Engi, Other);
        wendy = new Student("Math", "read", "Northeast US", "7",
                "6/12/2016 10:22:25");

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

    }

}
