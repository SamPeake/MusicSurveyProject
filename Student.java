/**
 * 
 */
package musicsurvey;
import java.util.LinkedList;

/**
 * @author Sam Peake (samp97)
 * @author zichen zhu (zichen)
 * @author Hytham soueid (hythams8)
 * @version 2017.08.10
 * this is the 
 */
public class Student extends LinkedList<String> {

    //fields.....................................
    private String major;
    private String hobby;
    private String state;
    private String rowNumber;
    private String time;
    
    /**
     * this is the
     * @param major is the major
     * @param hobby is the hobby
     * @param state is the state
     * @param rowNumber is the towUmber
     * @param time is the time
     */
    public Student(String major, String hobby, 
            String state, String rowNumber, String time)
    {
        this.major = major;
        this.hobby = hobby;
        this.state = state;
        this.rowNumber = rowNumber;
        this.time = time;
    }
    
    /**
     * this method is used to test the getMajor()
     * @return major this is what this used for 
     */
    public String getMajor()
    {
        return major;
    }
    
    /**
     * this method is used to return the hobby
     * @return hobby this is what it is use for 
     */
    public String getHobby()
    {
        return hobby;
    }
    
    /**
     * this method is used to return the state
     * @return state this is what it is use for 
     */
    public String getState()
    {
        return state;
    }
    
    /**
     * this method is used to return the hobby
     * @return rowNumber this is what it is use for 
     */
    public String getRowNumber()
    {
        return rowNumber;
    }
    
    /**
     * this method is used to return the hobby
     * @return hobby this is what it is use for 
     */
    public String getTime()
    {
        return time;
    }
    
    /**
     * this method is used to get the String of Student's infomaton
     * @return the  string 
     */
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(major);
        builder.append(", ");
        builder.append(hobby);
        builder.append(", ");
        builder.append(state);
        builder.append(", ");
        builder.append(rowNumber);
        builder.append(", ");
        builder.append(time);
        return builder.toString();
    }
   
}
