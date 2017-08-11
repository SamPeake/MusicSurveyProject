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
            new GUIDisplayWindow(new GraphSolver(args[0], args[1]));
        }
        else
        {
            new GUIDisplayWindow(new GraphSolver("SongList2016S.csv", "MusicSurveyData2016S.csv"));       
        }
    }
}