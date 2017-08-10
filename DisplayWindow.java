/**
 * 
 */
package musicsurvey;

import CS2114.Button;
import CS2114.Shape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * @author hythams8
 *
 */
public class DisplayWindow {

    //fields....................
    private Window window;
    private Button majorButton;
    private Button hobbyButton;
    private Button locationButton;
    private Button artistButton;
    private Button titleButton;
    private Button genreButton;
    private Button dateButton;
    private Button nextButton;
    private Button previousButton;
    private Button quitButton;
    private Shape title;
    private GraphSolver solver;
    
    /**
     * this is the constructor forDisPlayWindow
     */
    public DisplayWindow(Song song)
    {
        window = new Window();
    
    
    /**
     * Buttons
     */
        previousButton = new Button("<- Prev");
        window.addButton(previousButton, WindowSide.NORTH); 
        previousButton.onClick(this, "clickedPrevious");
        previousButton.disable();
        
        nextButton = new Button("Next ->");
        window.addButton(nextButton, WindowSide.NORTH);
        nextButton.onClick(this, "clickedNext");
        
        artistButton = new Button("Sort by Artist Name");
        window.addButton(artistButton, WindowSide.NORTH);
        artistButton.onClick(this, "clickedArtist");
        
        titleButton = new Button("Sort by Song Name");
        window.addButton(titleButton, WindowSide.NORTH);
        titleButton.onClick(this, "clickedTitle");
        
        dateButton = new Button("Sort by Release Year");
        window.addButton(dateButton, WindowSide.NORTH);
        dateButton.onClick(this, "clickedDate");
        
        genreButton = new Button("Sort by Genre");
        window.addButton(genreButton, WindowSide.NORTH);
        genreButton.onClick(this, "clickedgenre");
        
        hobbyButton = new Button("Represent Hobby");
        window.addButton(hobbyButton, WindowSide.SOUTH);
        hobbyButton.onClick(this, "clickedHobby");
        
        majorButton = new Button("Represent Major");
        window.addButton(majorButton, WindowSide.SOUTH);
        majorButton.onClick(this, "clickedMajor");
        
        locationButton = new Button("Represent Region");
        window.addButton(locationButton, WindowSide.SOUTH);
        locationButton.onClick(this, "generatelocation");
        
        Button quitButton = new Button("Quit");
        window.addButton(quitButton, WindowSide.NORTH);
        quitButton.onClick(this, "clickedQuit");
        
        
        window.setTitle("Music Preference Visualization");

    }
    
    /**
     * this method is used to display the window
     */
    public Window getWindow()
    {
        return window;
    }

    
    /**
     * this method is used to move song
     */
    public void moveSong(Position source, Position endSpot)
    {}
        
    
    
    /**
     * this method is used to fillWindow
     */
    public void fillWindow(song[])
    {
        
    }
    
    /**
     * clickedQuit(Button button) call System.exit() with a zero for its parameter.
     * This means there was no errors.
     */
    public void clickedQuit(Button button) {
        System.exit(0);
    }
    /**
     * this method gets the next nine songs
     */
    public void getNextNineSongs() {
       
        window.removeAllShapes();
        fillWindow();
        }if(solver.getPage()*(9)+(9))==0)

    {
        nextButton.disable();
    }if(solver.getPage==0)previousButton.disable();if(solver.getPage()*(9)+(9))!=0)&&(solver.getPage!=0)
    {
            nextButton.enable();
            previousButton.enable();
        }
    }

    /**
     * this method gets the previous nine songs
     */
    public Song[] getPrevNineSongs() {
        window.removeAllShapes();
        fillWindow();
        }if(solver.getPage()*(9)+(9))==0)

    {
        previousButton.disable();
    }if(solver.getPage==0)nextButton.disable();if(solver.getPage()*(9)+(9))!=0)&&(solver.getPage!=0)
    {
        previousButton.enable();
        nextButton.enable();
    }
}

        
}
