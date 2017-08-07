/**
 * 
 */
package musicsurvey;

import student.TestCase;

/**
 * @author zichen
 * @version 2017.08.06
 */
public class DimensionTest extends TestCase {

    private Dimension dimension1; 
    private Category read;
    private Category art;
    private Category sports;
    private Category music;
    
    /**
     * this is the setUp 
     */
    public void setUp()
    {
        dimension1 = new Dimension(read, art, sports, music);
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
}
