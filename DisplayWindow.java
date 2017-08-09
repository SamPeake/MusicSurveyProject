/**
 * 
 */
package musicsurvey;

import CS2114.Button;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * @author zichen
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
        previousButton.onClick(this, "generateGlyphs");
        previousButton.disable();
        
        nextButton = new Button("Next ->");
        window.addButton(nextButton, WindowSide.NORTH);
        nextButton.onClick(this, "generateGlyphs");
        
        artistButton = new Button("Sort by Artist Name");
        window.addButton(artistButton, WindowSide.NORTH);
        artistButton.onClick(this, "generateGlyphs");
        
        titleButton = new Button("Sort by Song Name");
        window.addButton(titleButton, WindowSide.NORTH);
        titleButton.onClick(this, "generateGlyphs");
        
        dateButton = new Button("Sort by Release Year");
        window.addButton(dateButton, WindowSide.NORTH);
        dateButton.onClick(this, "generateGlyphs");
        
        genreButton = new Button("Sort by Genre");
        window.addButton(genreButton, WindowSide.NORTH);
        genreButton.onClick(this, "generateGlyphs");
        
        hobbyButton = new Button("Represent Hobby");
        window.addButton(hobbyButton, WindowSide.SOUTH);
        hobbyButton.onClick(this, "generateGlyphs");
        
        majorButton = new Button("Represent Major");
        window.addButton(majorButton, WindowSide.SOUTH);
        majorButton.onClick(this, "generateGlyphs");
        
        locationButton = new Button("Represent Region");
        window.addButton(locationButton, WindowSide.SOUTH);
        locationButton.onClick(this, "generateGlyphs");

    }
    
    /**
     * this method is used to display the window
     */
    public Window getWindow()
    {
        return window;
    }
    
    /**
     * this method is used to make the clickedMajor
     */
    public void clickedMajor()
    {}
        
    
    
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

    
}
