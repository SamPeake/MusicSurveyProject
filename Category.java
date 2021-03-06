/**
 * 
 */
package musicsurvey;

/**
 * @author Sam Peake (samp97)
 * @author zichen zhu (zichen)
 * @author Hytham soueid (hythams8)
 * @version 2017.08.10
 * this is the Category
 */
public class Category {

    // this is fields................
    // private double percentHeard;
    // private double percentLike;
    private int numberofHeard;
    private int numberofLike;

    private int totalNumberLike;
    private int totalNumberHeard;

    /**
     * this is the constructor
     * 
     * @param numberofHeard
     * @param totalNumber
     * @param numberofLike
     */
    public Category() {

        numberofHeard = 0;
        numberofLike = 0;
        totalNumberLike = 0;
        totalNumberHeard = 0;
    }

    /**
     * this is the method that update the number of likes
     */
    public void upDateLike() {
        numberofLike = numberofLike + 1;

    }

    /**
     * this is the method that update the number of likes
     */
    public void upDateTotal() {

        totalNumberLike++;
        totalNumberHeard++;
    }

    /**
     * this is the method that update the number of likes
     */
    public void upDateHeard() {

        numberofHeard++;
    }

    /**
     * this method is used to getTotal
     * 
     * @return total number
     */
    public int getTotalLike() {
        return totalNumberLike;
    }

    /**
     * 
     * @return totalNumberHeard is the number of 
     */
    public int getTotalHeard() {
        return totalNumberHeard;
    }

    /**
     * @return the number of likes
     */
    public int getNumbeOfLikes() {
        return numberofLike;
    }

    /**
     * @return the number of heard
     */
    public int getNumbeOfHeard() {
        return numberofHeard;
    }

    /**
     * @return the percentage of likes
     * 
     */
    public double getPercentLike() {
        if (totalNumberLike == 0) {
            return 0;
        } 
        else {
            double percentLike = (double) numberofLike / totalNumberLike;
            return percentLike;
        }
    }

    /**
     * @return the percentage of likes
     */
    public double getPercentHeard() {
        if (totalNumberHeard == 0) {
            return 0;
        } 
        else {
            double percentHeard = (double) numberofHeard / totalNumberHeard;
            return percentHeard;

        }
    }
}