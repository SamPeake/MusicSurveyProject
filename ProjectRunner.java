/**
 * 
 */
package musicsurvey;

/**
 * @author Sam Peake (samp97)
 * @author zichen zhu (zichen)
 * @author Hytham soueid (hythams8)
 * @version 2017.08.10
 * this is the 
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