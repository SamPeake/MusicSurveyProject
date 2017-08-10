/**
 * 
 */
package musicsurvey;

/**
 * @author sampe
 *
 */
public class ProjectRunner {

    public ProjectRunner() {
        
    }
    
    public static void main(String[] args) {
        if(args.length == 2) {
            new DisplayWindow(new GraphSolver(args[0], args[1]));
        }
    }
}
