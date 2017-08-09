/**
 * 
 */
package musicsurvey;

/**
 * @author zichen
 * @version 2017.08.05
 *
 */
public class Dimension {

    // fields...................
    private Category category1;
    private Category category2;
    private Category category3;
    private Category category4;

    /**
     * this is the constructor
     */
        public Dimension(Category category1, Category category2, Category category3, Category category4) {
        this.category1 = category1;
        this.category2 = category2;
        this.category3 = category3;
        this.category4 = category4;

    }
    
    /**
     * @return 
     */
    public Category getCategory(int i)
    {
        if(i == 1)
        {
            return category1;
        }
        else if(i == 2)
        {
            return category2;
        }
        else if(i == 3)
        {
            return category3;
        }
        else
        {
            return category4;
        }
    }

}
