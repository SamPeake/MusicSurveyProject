/**
 * 
 */
package musicsurvey;

import java.util.Comparator;

/**
 * @author zichen
 * @version 2017.08.05
 *
 */
public class Song extends Category{

    // this is the fields.........................
    private String songName;
    private String genre;
    private int year;
    private String Artist;
    private Dimension major;
    private Dimension hobby;
    private Dimension location;
    private int columnHeard;
    private int columnLike;

    /**
     * this is the Constructor for the Song class
     * 
     * @param songName
     * @param genre
     * @param year
     * @param Artist
     * @param columnHeard
     * @param columnlike
     */
    public Song(String songName, String Artist, String genre, int year) {
        this.songName = songName;
        this.genre = genre;
        this.year = year;
        this.Artist = Artist;
        this.columnHeard = 0;
        this.columnLike = 0;
    }
    

    /**
     * this method is used to return thesongName
     * 
     * @return songName is the name of song
     */
    public String getSongName() {
        return songName;
    }

    /**
     * this method is used to return the genre
     * 
     * @return genre is the style of the music
     */
    public String getGenre() {
        return genre;
    }

    /**
     * this method is used to get the year of the song
     * 
     * @return year is the data that song was published
     */
    public int getYear() {
        return year;
    }

    /**
     * this method is used to return the name of the Artist
     * 
     * @return Artist is the
     */
    public String getArtist() {
        return Artist;
    }

    /**
     * @return columnHeart is the number of times of heard
     */
    public int getColumnHeard() {
        return columnHeard;
    }
    
    public void setColumnHeard(int newColumn) {
        columnHeard = newColumn;
    }

    /**
     * @return colunmLike is the times of like
     */
    public int getColumnLike() {
        return columnLike;
    }

    public void setColumnLike(int newColumn) {
        columnLike = newColumn;
    }
    /**
     * @return
     */
    public Dimension getDimension(String str) {
        if (str == "major") {
            return major;
        } 
        else if (str == "hobby") {
            return hobby;
        } 
        else {
            return location;
        }
    }
    
    public Dimension getDimension(int dimension) {
        if (dimension == 1) {
            return major;
        } 
        else if (dimension == 2) {
            return hobby;
        } 
        else {
            return location;
        }
    }
        
        /**
         * this method is used to return a string 
         */
        public String toString() {
        
            String ans = "Song Name: " + getSongName() + "\n"
                    + "Song Artist: " + getArtist() + "\n"
                    + "Song Genre: " + getGenre() + "\n"
                    + "Song Year: " + getYear();
            return ans;
        
    }
        

}