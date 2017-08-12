/**
 * 
 */
package musicsurvey;

/**
 * @author Sam Peake (samp97)
 * @author zichen zhu (zichen)
 * @author Hytham soueid (hythams8)
 * @version 2017.08.10 this is the ArtistCompartore
 *
 */
public class Dimension {

    // fields...................
    private Category category1;
    private Category category2;
    private Category category3;
    private Category category4;

    /**
     * this is the
     * 
     * @param category1
     *            this is the 1
     * @param category2
     *            this is the 2
     * @param category3
     *            this is 3
     * @param category4
     *            this is the 4
     */
    public Dimension(Category category1, 
            Category category2, Category category3, Category category4) {
        this.category1 = category1;
        this.category2 = category2;
        this.category3 = category3;
        this.category4 = category4;

    }

    /**
     * this is the constructor
     */
    public Dimension() {
        this.category1 = new Category();
        this.category2 = new Category();
        this.category3 = new Category();     
        this.category4 = new Category();
       
    }

    /**
     * @return the category 
     * @param i this is the parameter
     */
    public Category getCategory(int i) {
        if (i == 1) {
            return category1;
        } 
        else if (i == 2) {
            return category2;
        } 
        else if (i == 3) {
            return category3;
        } 
        else {
            return category4;
        }
    }

}
