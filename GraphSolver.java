/**
 * 
 */
package musicsurvey;

import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
//import java.util.Comparator;
//import java.util.Observable;

//import javax.media.NoDataSourceException;

/**
 * @author Sam Peake (samp97)
 * @author zichen zhu (zichen)
 * @author Hytham soueid (hythams8)
 * @version 2017.08.10
 * this is the ArtistCompartore
 */
public class GraphSolver {

    private LinkedList<Song> playList;
    private int pageCounter;
    private LinkedList<Student> students;
    private String songFile;
    private String surveyFile;

    /**
     * this is the constructor
     * 
     * @param songFile
     *            is the file of songs
     * @param surveyFile
     *            is the files of Files
     */
    public GraphSolver(String songFile, String surveyFile) {

        this.songFile = songFile;
        this.surveyFile = surveyFile;

        playList = new LinkedList<Song>();
        students = new LinkedList<Student>();
        pageCounter = 0;
    }

    /**
     * 
     * @return students that is the
     * @version 2017.08.11
     */
    public LinkedList<Student> readSurveyFile() {
        int index = 0;
        String line = "";

        try (BufferedReader br = 
                new BufferedReader(new FileReader(this.surveyFile))) {

            while ((line = br.readLine()) != null) {

                String[] responses;
                // just reading the first row with the column names
                if (index == 0) {

                    responses = line.split(",(?=(?:["
                            + "^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                }
                // survey responses ,

                // everything

                else {
                    responses = line.split(",", -1);
                    Student newStudent = makeStudent(responses);
                    this.students.add(newStudent);

                }

                index++;
            }

            if (students.isEmpty()) {
                return null;
            }

            return this.students;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * this is the songFile reader
     */
    public void readSongFile() {
        String line = "";
        int index = 0;
        try (BufferedReader br = new BufferedReader(new 
                FileReader(this.songFile))) {
            while ((line = br.readLine()) != null) {
                String[] responses;
                // just reading the first row with the column names
                if (index == 0) {
                    responses = null;
                }
                // survey responses ,
                // everything
                else {
                    responses = line.split(",", -1);
                    playList.add(new Song(responses[0], 
                            responses[1], responses[3], responses[2]));
                }
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * this is the makePlistList which is the
     *  public version of the make playList
     */
    public void makePlayList() {
        readSongFile();
    }

    /**
     * 
     * @param row
     *            is the row of
     * @return newStudent is the type that we get
     */
    private Student makeStudent(String[] row) {

        // int rowNumber = Integer.parseInt(row[0]);
        Student newStudent = new Student(row[2], row[4],
                row[3], row[0], row[1]);
        for (int i = 5; i < row.length; i++) {
            newStudent.add(row[i]);
        }
        return newStudent;

    }

    /**
     * this is the upDateSong class
     * 
     * @param student
     *            is the sum
     */
    private void upDateSong(Student student) {
        for (int i = 0; i < playList.size(); i++) {

            String answer = student.get((i));
           
            String answer2 = student.get((i + 1));
            int dim = 2;
            //String hobby = student.getHobby();

            if (student.getHobby().replaceAll("\\s+", "").contains("reading")) {

                yesCheck(answer, answer2, dim, 1, i);

            } 
            else if (student.getHobby().replaceAll("\\s+", "")
                    .contains("sports")) {

                yesCheck(answer, answer2, dim, 2, i);
            } 
            else if (student.getHobby().replaceAll("\\s+", "")
                    .contains("art")) {

                yesCheck(answer, answer2, dim, 3, i);
            } 
            else if (student.getHobby().replaceAll("\\s+", "")
                    .contains("music")) {

                yesCheck(answer, answer2, dim, 4, i);
            } 
            else {

                throw new IllegalArgumentException();
            }

            // Major
            dim = 1;
            if (student.getMajor().replaceAll("\\s+", "")
                    .contains("MathorCMDA")) {

                yesCheck(answer, answer2, dim, 1, i);

            } 
            else if (student.getMajor().
                    replaceAll("\\s+", "").contains("ComputerScience")) {

                yesCheck(answer, answer2, dim, 2, i);
            } 
            else if (student.getMajor().
                    replaceAll("\\s+", "").contains("Other")) {

                yesCheck(answer, answer2, dim, 3, i);
            } 
            else if (student.getMajor().
                    replaceAll("\\s+", "").contains("OtherEngineering")) {

                yesCheck(answer, answer2, dim, 4, i);
            } 
            else {
                throw new IllegalArgumentException();
            }

            // Location
            dim = 3;
            if (student.getState().replaceAll("\\s+", "")
                    .contains("Northeast")) {

                yesCheck(answer, answer2, dim, 1, i);
            } 
            else if (student.getState().replaceAll("\\s+", "")
                    .contains("Southeast")) {

                yesCheck(answer, answer2, dim, 2, i);

            } 
            else if (student.getState().replaceAll("\\s+", "")
                    .contains("UnitedStates(otherthanSoutheastorNorthwest)")) {

                yesCheck(answer, answer2, dim, 3, i);
            }
            else if (student.getState().replaceAll("\\s+", "")
                    .contains("OutsideofUnitedStates")) {

                yesCheck(answer, answer2, dim, 4, i);
            }

            else {
                throw new IllegalArgumentException();
            }
        }
    }
    /**
     * This is yesCheck method
     * @param answer parameter for answer
     * @param answer2 parameter for answer2
     * @param dim parameter for dim
     * @param category parameter for category
     * @param i parameter for i
     */
    private void yesCheck(String answer, String answer2, 
            int dim, int category, int i) {
        if (answer.replaceAll("\\s+", "").contains("Yes")) {
            playList.get(i).
            getDimension(dim).getCategory(category).upDateHeard();

        }

        if (answer2.replaceAll("\\s+", "").contains("Yes")) {
            playList.
            get(i).getDimension(dim).getCategory(category).upDateLike();
        }

        playList.get(i).getDimension(dim).getCategory(category).upDateTotal();
    }

    /**
     * this is the upDatePlayList
     */
    public void upDatePlayList() {

        try {
            LinkedList<Student> studentss = readSurveyFile();
            studentss.remove(84);

            for (int i = 0; i < studentss.size(); i++) {

                upDateSong(studentss.get(i));
            }
        } 
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * this is the 
     * @param sortType is the int 
     */
    public void sortSongs(int sortType) {
        if (sortType == 1) {
            Collections.sort(playList, new SongComparator());
        } 
        else if (sortType == 2) {
            Collections.sort(playList, new ArtistComparator());
        } 
        else if (sortType == 3) {
        
            Collections.sort(playList, new GenreComparator());
        } 
        else {
           
            Collections.sort(playList, new YearComparator());
            
        }
    }

    /**
     * this is the class that used to flip the page
     * 
     * @param direction is the
     */
    public void flipPage(boolean direction) {
        if (direction) {
            pageCounter++;
        }

        else {
            pageCounter--;
        }
    }

    /**
     * this is class that getPage
     * 
     * @return pageCount is the 
     */
    public int getPage() {
        return pageCounter;
    }

    /**
     * 
     * @param index
     *            is the index
     * @param dimension
     *            is the dimension
     * @param category
     *            is the category
     * @return the percent like
     */
    public double getPercentLike(int index, int dimension, int category) {
        return playList.get(index).getDimension(dimension).
                getCategory(category).getPercentLike();
    }

    /**
     * 
     * @param index
     *            is the index
     * @param dimension
     *            is the dimension
     * @param category
     *            is the category
     * @return the percent heard
     */
    public double getPercentHeard(int index, int dimension, int category) {
        return playList.get(index).getDimension(dimension).
                getCategory(category).getPercentHeard();
    }

    /**
     * this is class which
     * 
     * @return playList this is the 
     */
    public LinkedList<Song> getPlayList() {
        return playList;
    }

    /**
     * this is the class
     * 
     * @return size this is the 
     */
    public int getNumberOfSongs() {
        return playList.size();
    }

}