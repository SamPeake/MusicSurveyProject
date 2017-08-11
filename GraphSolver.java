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
import java.util.LinkedList;
import java.util.Comparator;
import java.util.Observable;

import javax.media.NoDataSourceException;

/**
 * @author sampe
 *
 */
public class GraphSolver {

    private LinkedList<Song> playList;
    private int pageCounter;
    private String songFile;
    private String surveyFile;

    public GraphSolver(String songFile, String surveyFile) {

        this.songFile = songFile;
        this.surveyFile = surveyFile;

        playList = new LinkedList<Song>();
        pageCounter = 0;
    }

    private LinkedList<Student> readSurveyFile() {
        int index = 0;
        String line = "";
        LinkedList<Student> students = null;

        try (BufferedReader br = new BufferedReader(
                new FileReader(this.surveyFile))) {

            students = new LinkedList<Student>();
            while ((line = br.readLine()) != null) {

                String[] responses;
                // just reading the first row with the column names
                if (index == 0) {

                    responses = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)",
                            -1);

                }
                // survey responses ,
               
                // everything

                else {
                    responses = line.split(",", -1);
                    Student newStudent = makeStudent(responses);
                    students.add(newStudent);

                }

                
                index++;
            }

            if (students.isEmpty()) {
                return null;
            }
           
            return students;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private void readSongFile() {
        String line = "";
        int index = 0;

        try (BufferedReader br = new BufferedReader(
                new FileReader(this.songFile))) {

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
                    playList.add(new Song(responses[0], responses[1], responses[3],
                            responses[2]));

                }

                

                index++;
            }
           

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makePlayList() {
        readSongFile();
    }
    private Student makeStudent(String[] row) {

        //int rowNumber = Integer.parseInt(row[0]);
        Student newStudent = new Student(row[2], row[4], row[3], row[0],
                row[1]);
        for (int i = 5; i < row.length; i++) {
            newStudent.add(row[i]);
        }
        return newStudent;

    }
    private void upDateSong(Student student) {
        for (int i = 0; i < playList.size(); i++) {

            String answer = student.get((i));
            if (i == student.size() - 1) {
              
            }
            String answer2 = student.get((i + 1));
            int dim = 2;
            String hobby = student.getHobby();
                    
            if (student.getHobby().replaceAll("\\s+", "")
                    .contains("reading")) {
             
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(1)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(1)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(1)
                            .upDateLike();
                }

            }
            else if (student.getHobby().replaceAll("\\s+", "")
                    .contains("sports")) {
               
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(2)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(2)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(2)
                            .upDateLike();
                }
            }
            else if (student.getHobby().replaceAll("\\s+", "")
                    .contains("art")) {
              
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(3)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(3)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(3)
                            .upDateLike();
                }
            }
            else if (student.getHobby().replaceAll("\\s+", "")
                    .contains("music")) {
               
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(4)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(4)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(4)
                            .upDateLike();
                }
            }
            else {
               
                throw new IllegalArgumentException();
            }

            // Major
            dim = 1;
            if (student.getMajor().replaceAll("\\s+", "")
                    .contains("MathorCMDA")) {
               
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(1)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(1)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(1)
                            .upDateLike();
                }

            }
            else if (student.getMajor().replaceAll("\\s+", "")
                    .contains("ComputerScience")) {
                
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(2)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(2)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(2)
                            .upDateLike();
                }
            }
            else if (student.getMajor().replaceAll("\\s+", "")
                    .contains("Other")) {
               
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(3)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(3)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(3)
                            .upDateLike();
                }
            }
            else if (student.getMajor().replaceAll("\\s+", "")
                    .contains("OtherEngineering")) {
            
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(4)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(4)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(4)
                            .upDateLike();
                }
            }
            else {
                throw new IllegalArgumentException();
            }

            // Location
            dim = 3;
            if (student.getState().replaceAll("\\s+", "")
                    .contains("Northeast")) {
               
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(1)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(1)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(1)
                            .upDateLike();
                }

            }
            else if (student.getState().replaceAll("\\s+", "")
                    .contains("Southeast")) {
               
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(2)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(2)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(2)
                            .upDateLike();
                }

            }
            else if (student.getState().replaceAll("\\s+", "").contains(
                    "UnitedStates(otherthanSoutheastorNorthwest)")) {
                
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(3)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(3)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(3)
                            .upDateLike();
                }
            }
            else if (student.getState().replaceAll("\\s+", "")
                    .contains("OutsideofUnitedStates")) {
                
                if (answer.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(4)
                            .upDateHeard();
                }
                else {
                    playList.get(i).getDimension(dim).getCategory(4)
                            .upDateTotal();
                }

                if (answer2.replaceAll("\\s+", "").equalsIgnoreCase("Yes")) {
                    playList.get(i).getDimension(dim).getCategory(4)
                            .upDateLike();
                }
            }
            
            
            else {              
                throw new IllegalArgumentException();
            }
        }

    }

    public void upDatePlayList() {

        try {
            LinkedList<Student> students = readSurveyFile();
            students.remove(84);
           
            for (int i = 0; i < students.size(); i++) {
                
                upDateSong(students.get(i));
            }
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void sortSongs(String dimension) {
        if (dimension.equals("Song")) {
            Collections.sort(playList, new SongComparator());
        }
        else if (dimension.equals("Artist")) {
            Collections.sort(playList, new ArtistComparator());
        }
        else if (dimension.equals("Genre")) {
            Collections.sort(playList, new GenreComparator());
        }
        else {
            Collections.sort(playList, new YearComparator());
        }
    }

    public void flipPage(boolean direction) {
        if (direction) {
            pageCounter++;
        }

        else {
            pageCounter--;
        }
    }

    public int getPage() {
        return pageCounter;
    }

    public double getPercentLike(int index, int dimension, int category) {
        return playList.get(index).getDimension(dimension).getCategory(category)
                .getPercentLike();
    }

    public double getPercentHeard(int index, int dimension, int category) {
        return 0;
    }

    public LinkedList<Song> getPlayList() {
        return playList;
    }

    public int getNumberOfSongs() {
        return playList.size();
    }

}