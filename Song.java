/**
 * 
 */
package musicsurvey;

//import java.util.Comparator;

/**
 * @author Sam Peake (samp97)
 * @author zichen zhu (zichen)
 * @author Hytham soueid (hythams8)
 * @version 2017.08.10
 * this is the 
 */
public class Song extends Category {

    // this is the fields.........................
    private String songName;
    private String genre;
    private String year;
    private String artist;
    private Dimension major;
    private Dimension hobby;
    private Dimension location;
    private int columnHeard;
    private int columnLike;

    /**
     * this is the Constructor for the Song class
     * 
     * @param songName is the 
     * @param genre is the 
     * @param year is the 
     * @param artist is the  
     */
    public Song(String songName, String artist, String genre, String year) {
        this.songName = songName;
        this.genre = genre;
        this.year = year;
        this.artist = artist;
        this.columnHeard = 0;
        this.columnLike = 0;
        this.major = new Dimension();
        this.hobby = new Dimension();
        this.location = new Dimension();
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
    public String getYear() {
        return year;
    }

    /**
     * this method is used to return the name of the Artist
     * 
     * @return Artist is the
     */
    public String getArtist() {
        return artist;
    }

    /**
     * 
     * @return columnHeart is the number of times of heard
     */
    public int getColumnHeard() {
        return columnHeard;
    }

    /**
     * 
     * @param newColumn is the 
     */
    public void setColumnHeard(int newColumn) {
        columnHeard = newColumn;
    }

    /**
     * @return colunmLike is the times of like
     */
    public int getColumnLike() {
        return columnLike;
    }

    /**
     * 
     * @param newColumn is the 
     */
    public void setColumnLike(int newColumn) {
        columnLike = newColumn;
    }

/**
 * 
 * @param dimension is the dimension
 * @return different thing
 */
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
     * @return the string that reprensent 
     */
    public String toString() {

        String ans = "Song Name: " + getSongName() + "\n" + "Song Artist: " 
            + getArtist() + "\n" + "Song Genre: "
                + getGenre() + "\n" + "Song Year: " + getYear();
        return ans;

    }

}