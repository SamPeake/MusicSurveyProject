/**
 * 
 */
package musicsurvey;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Observable;

import javax.media.NoDataSourceException;

/**
 * @author sampe
 *
 */
public class GraphSolver extends Observable {

    private LinkedList<Song> playList;
    private int pageCounter;
    private BufferedReader songFile;
    private BufferedReader surveyFile;

    public GraphSolver(String songFile, String surveyFile) {

        try {
            this.songFile = new BufferedReader(new FileReader(songFile));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            this.surveyFile = new BufferedReader(new FileReader(surveyFile));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        playList = new LinkedList<Song>();
        pageCounter = 1;
    }

    public String[] readSurveyFile(int index) {
        String line = "";

        try {
            line = surveyFile.readLine();
            if (line != null) {

                String[] responses;
                // just reading the first row with the column names
                if (index == 0) {

                    responses = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)",
                            -1);

                }
                // survey responses ,
                // limiting the index range so that system.out can show
                // everything

                else {
                    responses = line.split(",");

                }

                return responses;
            }
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String[] readSongFile(boolean firstRow) {
        String line = "";

        try {
            line = surveyFile.readLine();
            if (line != null) {

                String[] responses;
                // just reading the first row with the column names
                if (firstRow) {

                    responses = null;

                }
                // survey responses ,
                // limiting the index range so that system.out can show
                // everything

                else {
                    responses = line.split(",");

                }

                return responses;
            }
            return null;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void makePlayList() {
        readSongFile(true);
        String[] newSong = readSongFile(false);
        try {
        if (newSong != null) {
            while (newSong != null) {
                int year = Integer.parseInt(newSong[2]);
                playList.add(
                        new Song(newSong[0], newSong[3], year, newSong[1]));
                newSong = readSongFile(false);
            }
        }
        else {
            throw new NoDataSourceException();
        }
        } catch (NoDataSourceException e) {
            e.printStackTrace();
        }
    }
    private Student makeStudent() {
        int index = 1;
        String[] row = readSurveyFile(index);
        int rowNumber = Integer.parseInt(row[0]);
        Student newStudent = new Student(row[2], row[3], row[4], rowNumber,
                row[1]);
        for (int i = 5; i < row.length; i++) {
            newStudent.add(row[i]);
        }
        return newStudent;

    }
    private void upDateSong(Student student) {
        for (int i = 0; i < playList.getLength(); i++) {

            String dim = "hobby";
            if (student.getHobby() == "reading") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(1)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(1)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(1)
                            .upDateLike();
                }

            }
            else if (student.getHobby() == "sports") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(2)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(2)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(2)
                            .upDateLike();
                }
            }
            else if (student.getHobby() == "arts") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(3)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(3)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(3)
                            .upDateLike();
                }
            }
            else if (student.getHobby() == "music") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(4)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(4)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(4)
                            .upDateLike();
                }
            }
            else {
                throw new IllegalArgumentException();
            }

            // Major
            dim = "major";
            if (student.getMajor() == "Math or CMDA") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(1)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(1)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(1)
                            .upDateLike();
                }

            }
            else if (student.getMajor() == "Computer Science") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(2)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(2)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(2)
                            .upDateLike();
                }
            }
            else if (student.getMajor() == "Other") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(3)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(3)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(3)
                            .upDateLike();
                }
            }
            else if (student.getMajor() == "Other Engineering") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(4)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(4)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(4)
                            .upDateLike();
                }
            }
            else {
                throw new IllegalArgumentException();
            }

            // Location
            dim = "location";
            if (student.getState() == "Northeast") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(1)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(1)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(1)
                            .upDateLike();
                }

            }
            else if (student.getState() == "Southeast") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(2)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(2)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(2)
                            .upDateLike();
                }
            }
            else if (student
                    .getState() == "United States (other than Southeast or Northwest)") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(3)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(3)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(3)
                            .upDateLike();
                }
            }
            else if (student.getState() == "Outside of United States") {
                String answer = student.get((i * 2) + 5);
                String answer2 = student.get((i * 2) + 6);
                if (answer == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(4)
                            .upDateHeard();
                }
                else {
                    playList.getEntry(i).getDimension(dim).getCategory(4)
                            .upDateTotal();
                }

                if (answer2 == "Yes") {
                    playList.getEntry(i).getDimension(dim).getCategory(4)
                            .upDateLike();
                }
            }
            else {
                throw new IllegalArgumentException();
            }
        }

    }

    public void upDatePlayList() {

        readSurveyFile(0);
        try {
            Student newStudent = makeStudent();
            while (newStudent != null) {
                upDateSong(newStudent);
            }
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
    
    public void sortSongs(String dimension) {
        if (dimension == "Song") {
            Comparator<Song> sort = new SongComparator();
            Collections.sort(playList, new SongComparator());
        }
    }

}
