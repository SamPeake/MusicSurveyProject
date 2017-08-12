/**
 * 
 */
package musicsurvey;

//import binarySearchTree.ItemNotFoundException;
import student.TestCase;

/**
 * @author zichen
 *
 */
public class GraphSolverTest extends TestCase {

    // fields...............................
    private GraphSolver solver1;
    private GraphSolver solver2;
    private GraphSolver solver3;
    private int pageCounter;

    /**
     * this method should get ready all the files
     */
    @Override
    public void setUp() {
        solver1 = new GraphSolver("SongList2016S.csv",
                "MusicSurveyData2016S.csv");
        pageCounter = 0;
        solver1.readSurveyFile();

        solver1.makePlayList();

    }

    /**
     * this method is used to test the makePlayList method
     */
    public void testMakePlayList() {
        /**
         * NoDataSourceException thrown = null; try { solver2.makePlayList(); }
         * catch (NoDataSourceException exception) { thrown = exception; }
         * assertNotNull(thrown);
         */
        // solver1.readSongFile();
        assertEquals(59, solver1.getNumberOfSongs());
        assertEquals(solver1.getPlayList().size(), 59);
    }

    /**
     * this method is used to test the upDatePlayList
     */
    public void testUpDatePlayList() {
        solver1.upDatePlayList();
    }

    /**
     * this method is used to test the sortSong method
     */
    public void testSortSongs() {

        solver1.readSongFile();
        solver1.sortSongs("Song");
        // System.out.println(solver1.getPlayList().removeFirst().toString());
        String str = "Song Name: All These Things I've Done\n"
                + "Song Artist: The Killers\n" + "Song Genre: alternative\n"
                + "Song Year: 2005";
        assertEquals(str, solver1.getPlayList().removeFirst().toString());
        solver1.sortSongs("Artist");
        solver1.sortSongs("Genre");
        solver1.sortSongs("as");
        // System.out.println(solver1.getPlayList().removeFirst().toString());
    }

    /**
     * this method is used to test the filpPage method
     */
    public void testFlipPage() {
        solver1.flipPage(false);
        assertEquals(-1, solver1.getPage());
    }

    /**
     * this method is used to test the getPAGE
     */
    public void testGetPage() {
        solver1.flipPage(true);
        assertEquals(1, solver1.getPage());
    }

    /**
     * this method is used to test the getPercenteard
     */
    public void testgetPercentHeard() {

        solver1.readSongFile();
        solver1.getPercentHeard(1, 1, 1);
        // System.out.println(solver1.getPercentHeard(1, 1, 1));
        assertEquals(0.0, solver1.getPercentHeard(1, 1, 1), 0.0001);
    }

    /**
     * this method is used to test the getPercentLike
     */
    public void testgetPercentLike() {
        solver1.readSongFile();
        solver1.getPercentLike(1, 1, 1);
        // System.out.println(solver1.getPercentHeard(1, 1, 1));
        assertEquals(0.0, solver1.getPercentLike(1, 1, 1), 0.0001);
    }

}
