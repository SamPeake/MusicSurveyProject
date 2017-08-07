/**
 * 
 */
package musicsurvey;

/**
 * @author zichen
 * @version 2017.08.05
 *
 */
public class Song extends Category {

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
    public Song(String songName, String genre, int year, String Artist, int columnHeard, int columnLike) {
        this.songName = songName;
        this.genre = genre;
        this.year = year;
        this.Artist = Artist;
        this.columnHeard = columnHeard;
        this.columnLike = columnLike;
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

    /**
     * @return colunmLike is the times of like
     */
    public int getColumnLike() {
        return columnLike;
    }

    /**
     * @return
     */
    public Dimension getDimension(String str) {
        if (str == "major") {
            return major;
        } else if (str == "hobby") {
            return hobby;
        } else {
            return location;
        }
    }

    /**
     * @return
     */
    public double getPercentLike(String str) {
        // hobby.....................
        if (str == "read") {
            return this.getDimension("hobby").getCategory(1).getNumbeOfLikes() / totalNumber;
        } else if (str == "art") {
            return this.getDimension("hobby").getCategory(2).getNumbeOfLikes() / totalNumber;
        } else if (str == "sports") {
            return this.getDimension("hobby").getCategory(3).getNumbeOfLikes() / totalNumber;
        } else if (str == "music") {
            return this.getDimension("hobby").getCategory(4).getNumbeOfLikes() / totalNumber;
        }

        // major..........................
        if (str == "Computer Science") {
            return this.getDimension("major").getCategory(1).getNumbeOfLikes() / totalNumber;
        } else if (str == "Other Engineering") {
            return this.getDimension("major").getCategory(2).getNumbeOfLikes() / totalNumber;
        } else if (str == "Math or CMDA") {
            return this.getDimension("major").getCategory(3).getNumbeOfLikes() / totalNumber;
        } else if (str == "Other") {
            return this.getDimension("major").getCategory(4).getNumbeOfLikes() / totalNumber;
        }

        // locaton.............................
        if (str == "Northeast US") {
            return this.getDimension("location").getCategory(1).getNumbeOfLikes() / totalNumber;
        } else if (str == "Southeast US") {
            return this.getDimension("location").getCategory(2).getNumbeOfLikes() / totalNumber;
        } else if (str == "the rest of US") {
            return this.getDimension("location").getCategory(3).getNumbeOfLikes() / totalNumber;
        } else //if (str == "outside the US") 
            {
            return this.getDimension("location").getCategory(4).getNumbeOfLikes() / totalNumber;
        }
    }

    /**
     * @return
     * 
     *         still need to divide something
     */
    public double getPercentHeard(String str) {
        // hobby..........................
        if (str == "read") {
            return this.getDimension("hobby").getCategory(1).getPercentHeard() / totalNumber;
        } else if (str == "art") {
            return this.getDimension("hobby").getCategory(2).getNumbeOfHeard() / totalNumber;
        } else if (str == "sports") {
            return this.getDimension("hobby").getCategory(3).getPercentHeard() / totalNumber;
        } else if (str == "music") {
            return this.getDimension("hobby").getCategory(4).getNumbeOfHeard() / totalNumber;
        }

        // major..................................
        if (str == "Computer Science") {
            return this.getDimension("major").getCategory(1).getPercentHeard() / totalNumber;
        } else if (str == "Other Engineering") {
            return this.getDimension("major").getCategory(2).getNumbeOfHeard() / totalNumber;
        } else if (str == "Math or CMDA") {
            return this.getDimension("major").getCategory(3).getPercentHeard() / totalNumber;
        } else if (str == "Other") {
            return this.getDimension("major").getCategory(4).getNumbeOfHeard() / totalNumber;
        }

        // location................................
        if (str == "Northeast US") {
            return this.getDimension("location").getCategory(1).getPercentHeard() / totalNumber;
        } else if (str == "Southeast US") {
            return this.getDimension("location").getCategory(2).getNumbeOfHeard() / totalNumber;
        } else if (str == "the rest of US") {
            return this.getDimension("location").getCategory(3).getPercentHeard() / totalNumber;
        } else //if (str == "outside the US") 
            {
            return this.getDimension("location").getCategory(4).getNumbeOfHeard() / totalNumber;
        }
    }

}
