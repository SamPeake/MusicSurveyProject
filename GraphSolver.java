import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import methods.Song;

/**
 * 
 */

/**
 * This creates the graphSolver class
 * 
 * @author Hytham Soueid (Hythams8)
 * @version 2017.08.07
 */
public class GraphSolver {
    // Fields
    /**
     * ReadFile field
     */
    private ReadFile reader;
    /**
     * Playlist field
     */
    private LinkedList<Song> playList;
    /**
     * input field
     */
    private String input;
    /**
     * int field
     */
    private int pageCounter;
    /**
     * student info
     */
    private String studentInfo;
    /**
     * song info
     */
    private String songInfo;

    // Constructor
    /**
     * Constructor for the class
     */
    public GraphSolver(String studentInfo, String songInfo) {

    }

    // Methods
    /**
     * Creates the PlayList
     */
    public void makePlaylist() {

    }

    /**
     * Makes the student
     */
    private Student makeStudent() {

    }

    /**
     * Updates the song
     */
    private Song upDateSong(Student) {
        
    }

    /**
     * Updates the playlist
     */
    public void upDatePlaylist() {

    }

    /**
     * Gets the next nine songs
     */
    public Song[] getNextNineSongs() {

    }

    /**
     * Gets the previous nine songs
     */
    public Song[] getPrevNineSongs() {

    }

    /**
     * Reads the file within the class
     * 
     * @param args
     */
    public String readFile() {
        String csvFile = "MusicSurveyData2016S.csv";
        String line = "";
        String csvSplitBy = ",";
        try (BufferedReader reader =
                new BufferedReader(new FileReader(csvFile))) {
            int index = 0;
            while ((line = reader.readLine()) != null) {

                // just reading the first row with the column names
                if (index == 0) {
                    System.out.println("first line:" + line);

                    String[] tokens =
                            line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    for (String t : tokens) {
                        System.out.println("> " + t);
                    }
                }
                else if (index > 0 & index < 15) {
                    String[] responses = line.split(csvSplitBy);
                    for (String t : responses) {
                        System.out.println("response # " + index + ":" + t);
                    }
                }
                index++;
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
