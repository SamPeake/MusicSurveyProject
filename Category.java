/**
 * 
 */
package musicsurvey;

/**
 * @author zichen
 * @version 2017.08.05
 */
public class Category {

    // this is fields................
    // private double percentHeard;
    // private double percentLike;
    private int numberofHeard;
    private int numberofLike;
    // private int numberofResponses;
    protected int totalNumber;

    /**
     * this is the constructor
     * 
     * @param numberofHeard
     * @param totalNumber
     * @param numberofLike
     */
    public Category() {
        // numberofHeard = this.numberofHeard;
        // numberofLike = this.numberofLike;
        // totalNumber = this.totalNumber;
        numberofHeard = 0;
        numberofLike = 0;
        totalNumber = 0;
    }

    /**
     * this is the method that update the number of likes
     */
    public void upDateLike() {
        numberofLike = numberofLike + 1;
        upDateTotal();
    }

    /**
     * this is the method that update the number of likes
     */
    public void upDateTotal() {

        totalNumber = totalNumber + 1;
    }

    /**
     * this is the method that update the number of likes
     */
    public void upDateHeard() {

        numberofHeard = numberofHeard + 1;
        upDateTotal();
    }

    /**
     * this method is used to getToal
     * 
     * @return total number
     */
    public int getTotal() {
        return totalNumber;
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
        if (totalNumber == 0 && numberofLike == 0) {
            return 0;
        } else {
            double percentLike = (double) numberofLike / totalNumber;
            return percentLike;
        }
    }

    /**
     * @return the percentage of likes
     */
    public double getPercentHeard() {
        if(totalNumber == 0 && numberofHeard == 0)
        {
            return 0;
        }
        else
        {
        double percentHeard = (double) numberofHeard / totalNumber;
        return percentHeard;
        }
    }

}
