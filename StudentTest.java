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
 *
 */
public class StudentTest extends TestCase {

    private Student wendy;
    
    /**
     * this is the set up class
     */
    public void setUp()
    {
        wendy = new Student("Computer Science", "read", "Northeast US", 
                "7", "6/12/2016 10:22:25");
    }
    
    /**
     * this method is used to test the major
     */
    public void testGetMajor()
    {
        assertEquals("Computer Science", wendy.getMajor());
    }
    
    /**
     * this method is used to test the getHobby
     */
    public void testGetHobby()
    {
        assertEquals("read", wendy.getHobby());
    }
    
    /**
     * this method is used to test the getState
     */
    public void testGetState()
    {
        assertEquals("Northeast US", wendy.getState());
    }
    
    /**
     * this method is used to test the rowNumber
     */
    public void testGetRowNumber()
    {
        assertEquals("7", wendy.getRowNumber());
    }
    
    /**
     * this method is used to test the getState
     */
    public void testGetTime()
    {
        assertEquals("6/12/2016 10:22:25", wendy.getTime());
    }
    
    /**
     * this method is used to test the toString method 
     */
    public void testToString()
    {
        String str = "Computer Science, read, Northeast US, "
                + "7, 6/12/2016 10:22:25";
        assertEquals(str, wendy.toString());
    }
    
}
