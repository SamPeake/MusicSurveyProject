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
    private Student s1;
    //private Dimension dimension1;
    
    /**
     * this is the setUp 
     */
    public void setUp()
    {
        song1 = new Song("CallMeMaybe", "pop", 2011, "Carly", 1, 2);
    }
    
    /**
     * this method is used to test the getSongnAME
     */
    public void testGetSongName()
    {
        assertEquals("CallMeMaybe", song1.getSongName());
    }
    
    /**
     * this method is used to test the genre
     */
    public void testGetGenre()
    {
        assertEquals("pop", song1.getGenre());
    }
    
    /**
     * this method is used to test the year
     */
    public void testGetYear()
    {
        assertEquals(2011, song1.getYear());
    }
    
    /**
     * this method is used to test the year
     */
    public void testGetArtist()
    {
        assertEquals("Carly", song1.getArtist());
    }
    
    /**
     * this method is used to test the the get column
     * heard
     */
    public void testGetColumnHeard()
    {
        assertEquals(1, song1.getColumnHeard());
    }
    
    /**
     * this method is used to test the the get column
     * heard
     */
    public void testGetColumnLike()
    {
        assertEquals(2, song1.getColumnLike());
    }
    
    /**
     * THIS METHOD IS to test the getDimension class 
     */
    public void testGetDimension()
    {
        assertEquals("major", song1.getDimension("major"));
    }
    
    /**
     * this method is used to test the getPercentLike
     */
    public void testGetPercentLike()
    {
        song1.getPercentHeard();
    }    
    
}
