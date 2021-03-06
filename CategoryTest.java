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
 * this is the ArtistCompartore
 */
public class CategoryTest extends TestCase {

    
    private Category cate1;
    //private Category cate2;
    
    /**
     * this is the set up 
     */
    public void setUp()
    {
        cate1 = new Category();
        //cate2 = new Category(0, 0, 0);
    }
    
    /**
     * this method is used to test the update like
     */
    public void testUpDateLike()
    {
        cate1.upDateLike();
        assertEquals(1, cate1.getNumbeOfLikes());
        //assertEquals(1, cate1.getTotal());
    }
    
    /**
     * this method is used to test the update Heard
     */
    public void testUpDateHeard()
    {
        cate1.upDateHeard();
        assertEquals(1, cate1.getNumbeOfHeard());
        //assertEquals(1, cate1.getTotal());
    }
    
    /**
     * this method is used to test the update Heard
     */
    public void testUpDateTotal()
    {
        cate1.upDateTotal();
        //assertEquals(1, cate1.getTotal());
        cate1.upDateTotal();
        assertEquals(0, cate1.getNumbeOfHeard());
    }
    
    /**
     * this method is used to test the percent like
     */
    public void testGetPercentLike()
    {
        cate1.upDateLike();
        cate1.upDateTotal();
        System.out.println(cate1.getPercentLike());
        assertEquals(1.0, cate1.getPercentLike(), 0.00001);
        //assertEquals(2, cate1.getTotal());
    }
    
    /**
     * this method is used to test the update percent heard
     */
    public void testGetPercentHeard()
    {
        cate1.upDateHeard();
        cate1.upDateTotal();
        //assertTrue(1.0 == cate1.getPercentHeard());
        assertEquals(1, cate1.getPercentHeard(), 0.001);
       // assertEquals(2, cate1.getTotal());
    }
    
    /**
     * this method is used to test the getPercentLike
     * the case that the total number and number of heard 
     * both zero
     */
    public void testGetPercentLike2()
    {
        assertEquals(0, cate1.getNumbeOfLikes());
        assertEquals(0.0, cate1.getPercentLike(), 0.0001);
    }
    
    /**
     * this method is used to test the getPercentHeard
     * the case that the total number and number of heard 
     * both zero
     */
    public void testGetPercentHeard2()
    {
        assertEquals(0, cate1.getNumbeOfHeard());
        assertEquals(0.0, cate1.getPercentHeard(), 0.0001);
    }
    
    
}
