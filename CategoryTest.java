/**
 * 
 */
package musicsurvey;

import student.TestCase;

/**
 * @author zichen
 * @versio 2017.08.06
 *
 */
public class CategoryTest extends TestCase {

    
    private Category cate1;
    
    /**
     * this is the set up 
     */
    public void setUp()
    {
        cate1 = new Category();
    }
    
    /**
     * this method is used to test the update like
     */
    public void testUpDateLike()
    {
        cate1.upDateLike();
        assertEquals(1, cate1.getNumbeOfLikes());
        assertEquals(1, cate1.getTotal());
    }
    
    /**
     * this method is used to test the update Heard
     */
    public void testUpDateHeard()
    {
        cate1.upDateHeard();
        assertEquals(1, cate1.getNumbeOfHeard());
        assertEquals(1, cate1.getTotal());
    }
    
    /**
     * this method is used to test the update Heard
     */
    public void testUpDateTotal()
    {
        cate1.upDateTotal();
        //assertEquals(1, cate1.getNumbeOfHeard());
        assertEquals(1, cate1.getTotal());
    }
    
    /**
     * this method is used to test the percent like
     */
    public void testGetPercentLike()
    {
        cate1.upDateLike();
        cate1.upDateTotal();
        //cate1.upDateTotal();
        assertTrue(0.5 == cate1.getPercentLike());
        assertEquals(2, cate1.getTotal());
    }
    
    /**
     * this method is used to test the update percent heard
     */
    public void testGetPercentHeard()
    {
        cate1.upDateHeard();
        cate1.upDateTotal();
        //cate1.upDateTotal();
        assertTrue(0.5 == cate1.getPercentHeard());
        assertEquals(2, cate1.getTotal());
    }
    
    
}
