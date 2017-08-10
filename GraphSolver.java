/**
 * 
 */
package musicsurvey;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Observable;

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

    @SuppressWarnings("unchecked")
    public String[] readSurveyFile(int index) {
        String line = "";
        String[] main;
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
        for(int i = 0; i < playList.getLength(); i++) {
            int dim = 1;
        //Hobby
            dim = 2;
        if (student.getHobby() == "reading") {
            String answer = student.get((i * 2) + 5);
            String answer2 = student.get((i * 2) + 6);
            if ( answer == "Yes") {
            playList.getEntry(i).getDimension("hobby").getCategory(1).upDateHeard();
            }
            else {
                playList.getEntry(i).getDimension("hobby").getCategory(1).upDateTotal(); 
            }
            
            if (answer == "Yes") {
                playList.getEntry(i).getDimension("hobby").getCategory(1).upDateHeard();
            }
            
            
        }
        else if (student.getHobby() == "sports") {
            
        }
        else if (student.getHobby() == "arts") {
            
        }
        else if (student.getHobby() == "music") {
            
        }
        else {
            throw new IllegalArgumentException();
        }
        playList.getEntry(i).getDimension(student.getHobby()).getCategory(1);
        }
        
        
    } 
}
