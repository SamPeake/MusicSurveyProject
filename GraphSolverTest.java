/**
 * 
 */
package musicsurvey;

import javax.media.NoDataSourceException;

//import binarySearchTree.ItemNotFoundException;
import student.TestCase;

/**
 * @author zichen
 *
 */
public class GraphSolverTest extends TestCase {

    //fields...............................
    private GraphSolver solver1;
    private GraphSolver solver2;
    private GraphSolver solver3;
    private int pageCounter;
    
    /**
     * this method should get ready all the files
     */
    public void setUp()
    {
        solver1 = new GraphSolver("SongList2016S.csv", "MusicSurveyData2016S.csv");
        pageCounter = 0;
        
    }
    
    /**
     * this method is used to test the makePlayList method 
     */
    public void testMakePlayList()
    {
        /**
        NoDataSourceException thrown = null;
        try 
        {
            solver2.makePlayList();
        } 
        //catch (NoDataSourceException exception) 
        {

            thrown = exception;
        }
        assertNotNull(thrown);
        */
    }
    
    /**
     * this method is used to test the upDatePlayList
     */
    public void testUpDatePlayList()
    {
        
    }
    
    /**
     * this method is used to test the sortSong method 
     */
    public void testSortSongs()
    {
        
    }
    
    /**
     * this method is used to test the filpPage method 
     */
    public void testFilpPage()
    {
        solver1.flipPage(false);
        assertEquals(-1, solver1.getPage());
    }
    
    /**
     * this method is used to test the getPAGE
     */
    public void testGetPage()
    {
        solver1.flipPage(true);
        assertEquals(1, solver1.getPage());
    }
    
    /**
     * this method is used to test the getPercenteard
     */
    public void testgetPercentHeard()
    {
        
    }
    
    /**
     * this method is used to test the getPercentLike
     */
    public void testgetPercentLike()
    {
        
    }
}
