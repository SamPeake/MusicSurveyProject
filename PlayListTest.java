/**
 * 
 */
package musicsurvey;

import student.TestCase;

/**
 * @author sampe
 *
 */
public class PlayListTest extends TestCase {

    private PlayList test;
    private PlayList test2;
    private Song song1;
    private Song song2;
    private Song song3;
    private Song song4;
    private Song song5;
    
    public void setUp() {
        test = new PlayList();
        test2 = new PlayList();
        song1 = new Song("Abcde", "Bcdea", 3, "Cdeab", 1);
        song2 = new Song("Bcdea", "Cdeab", 4, "Deabc", 1);
        song3 = new Song("Eabcd", "Abcde", 2, "Bcdea", 1);
        song4 = new Song("Cdeab", "Deabc", 1, "Eabcd", 1);
        song5 = new Song("Abcde", "Bcdea", 2, "Cdeab", 1);
        test.add(song1);
        test.add(song2);
        test.add(song3);
        test.add(song4);
        test.add(song5);
    }
    
    public void testSortBySong() {
     
        test.sortBySong();
        System.out.println("Song order: " + test.toSongString());
        assertEquals("[Abcde, Abcde, Bcdea, Cdeab, Eabcd]", test.toSongString());
        test2.sortBySong();
        assertEquals("[]", test2.toSongString());
    }
    
    public void testSortByArtist() {
        
        test.sortByArtist();
        System.out.println("Artist order: " + test.toArtistString());
        System.out.println(test.toSongString());
        System.out.println("Expected artist order: [Abcde, Bcdea, Bcdea, Cdeab, Deabc]");
        assertEquals("[Bcdea, Cdeab, Cdeab, Deabc, Eabcd]", test.toArtistString());
        test2.sortBySong();
        assertEquals("[]", test2.toArtistString());
    }
    
}
