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

    // private Dimension dimension1;

    /**
     * this is the setUp
     */
    public void setUp() {
        song1 = new Song("CallMeMaybe", "pop", 2011, "Carly");
        //major = new Dimension(Math, CS, Engi, Other);
        dimension1 = new Dimension(read, art, sports, music);
        

        wendy = new Student("Math", "read", "Northeast US", 7, "6/12/2016 10:22:25");
        //Math = major.getCategory(1);
        //CS = major.getCategory(2);
        //Engi = major.getCategory(3);
        //Other = major.getCategory(4);
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
        assertEquals(2011, song1.getYear());
    }

    /**
     * this method is used to test the year
     */
    public void testGetArtist() {
        assertEquals("Carly", song1.getArtist());
    }

    /**
     * this method is used to test the the get column heard
     */
    //public void testGetColumnHeard() {
        //assertEquals(1, song1.getColumnHeard());
    //}

    /**
     * this method is used to test the the get column heard
     */
    //public void testGetColumnLike() {
        //assertEquals(2, song1.getColumnLike());
    //}

    /**
     * THIS METHOD IS to test the getDimension class
     */
    public void testGetDimension() {
        //assertEquals(read, song1.getDimension("major").getCategory(1));
        //assertEquals(major, song1.getDimension("major"));
        assertEquals(major, song1.getDimension("major"));
        assertEquals(hobby, song1.getDimension("hobby"));
        assertEquals(location, song1.getDimension("location"));
        assertEquals(major, song1.getDimension("oliver"));
        assertEquals(read, dimension1.getCategory(1));
    }

    /**
     * this method is used to test toString
     */
    public void testToString() {
        String str = "Song Name: CallMeMaybe" + "\n" + "Song Artist: Carly" + "\n" + "Song Genre: pop" + "\n"
                + "Song Year: 2011";
        // System.out.println(song1.toString());
        assertEquals(str, song1.toString());
    }
    
    /**
     * this method is used to test the getCategory
     */
    public void testGetCategory()
    {
        assertEquals(read, dimension1.getCategory(1));
        assertEquals(art, dimension1.getCategory(2));
        assertEquals(sports, dimension1.getCategory(3));
        assertEquals(music, dimension1.getCategory(4));
    }
    
    /**
     * this method is used to test the getDimension
     */
    public void testGetDimension1()
    {
        assertEquals(major, song1.getDimension(1));
        assertEquals(hobby, song1.getDimension(2));
        assertEquals(location, song1.getDimension(3));
        assertEquals(major, song1.getDimension(4));
        
    }

}
