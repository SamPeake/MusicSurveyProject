/**
 * 
 */
package musicsurvey;

import java.awt.Color;

import CS2114.Button;
import CS2114.Shape;
import CS2114.TextShape;
import CS2114.Window;
import CS2114.WindowSide;

/**
 * @author zichen
 *
 */
public class GUIDisplayWindow {

    // fields....................
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
    private int dimension;
    private GraphSolver solver;
    private final int LEGEND_GAP = 10;

    /**
     * this is the constructor forDisPlayWindow
     */
    public GUIDisplayWindow(GraphSolver solver) {
        this.solver = solver;
        dimension = 0;
        window = new Window();

        solver.makePlayList();
        solver.upDatePlayList();

        /**
         * Buttons
         */

        // Next and Previous
        previousButton = new Button("<- Prev");
        window.addButton(previousButton, WindowSide.NORTH);
        previousButton.onClick(this, "clickedPage");
        previousButton.disable();

        // Sorting Buttons
        artistButton = new Button("Artist");
        window.addButton(artistButton, WindowSide.NORTH);
        artistButton.onClick(this, "clickSort");

        titleButton = new Button("Song");
        window.addButton(titleButton, WindowSide.NORTH);
        titleButton.onClick(this, "clickSort");

        dateButton = new Button("Year");
        window.addButton(dateButton, WindowSide.NORTH);
        dateButton.onClick(this, "clickSort");

        nextButton = new Button("Next ->");
        window.addButton(nextButton, WindowSide.NORTH);
        nextButton.onClick(this, "clickedPage");

        genreButton = new Button("Genre");
        window.addButton(genreButton, WindowSide.NORTH);
        genreButton.onClick(this, "clickSort");

        // Dimensions
        hobbyButton = new Button("Hobby");
        window.addButton(hobbyButton, WindowSide.SOUTH);
        hobbyButton.onClick(this, "clickedHobby");

        majorButton = new Button("Major");
        window.addButton(majorButton, WindowSide.SOUTH);
        majorButton.onClick(this, "clickedMajor");

        locationButton = new Button("Region");
        window.addButton(locationButton, WindowSide.SOUTH);
        locationButton.onClick(this, "generatelocation");

        window.setTitle("Music Preference Visualization");

        previousButton.disable();
        if (solver.getPage() + 9 >= solver.getNumberOfSongs()) {
            nextButton.disable();
        } else {
            nextButton.enable();
        }

        fillWindow();

    }

    /**
     * this method is used to display the window
     */
    public Window getWindow() {
        return window;
    }

    /**
     * this method is used to fillWindow
     */
    private void fillWindow() {

        for (int i = 0; i < 9; i++) {
            int index = (solver.getPage() * 9) + i;
            int j = i + 1;
            Position column;
            Position row;
            if ((j % 3) == 0) {
                column = Position.BackEnum;
            } else if ((j % 2) == 0) {
                column = Position.MiddleEnum;
            } else {
                column = Position.BackEnum;
            }

            if (j > 5) {
                row = Position.BackEnum;
            } else if (j > 2) {
                row = Position.MiddleEnum;
            } else {
                row = Position.FrontEnum;
            }

            placeEntry(column, row, index);
            placeGraph(column, row, index);
            addLegend();

        }
    }

    private void addLegend() {
        Shape legendBorder = new Shape(0, (window.getGraphPanelHeight() * 9) / 10, window.getGraphPanelWidth(), 5,
                Color.BLACK);
        window.addShape(legendBorder);
        int x = window.getGraphPanelWidth() / 10;
        int y = (window.getGraphPanelHeight() * 19) / 20;
        if (dimension == 1) {
            // 1 = Math or CMDA
            TextShape category1 = new TextShape(x, y, "Math or CMDA", getColor(dimension, 1));
            category1.setBackgroundColor(Color.WHITE);
            category1.setX(x - (category1.getWidth() / 2));
            x = x * 3;
            window.addShape(category1);
            TextShape category2 = new TextShape(x, y, "Computer Science", getColor(dimension, 2));
            category2.setBackgroundColor(Color.WHITE);
            category2.setX(x - (category2.getWidth() / 2));
            x = (x / 3) * 5;
            
            window.addShape(category2);
            TextShape category3 = new TextShape(x, y, "Other", getColor(dimension, 3));
            category3.setBackgroundColor(Color.WHITE);
            category3.setX(x - (category3.getWidth() / 2));
            x = (x / 5) * 7;
            window.addShape(category3);

            TextShape category4 = new TextShape(x, y, "Other Engineering", getColor(dimension, 4));
            category4.setBackgroundColor(Color.WHITE);
            category4.setX(x - (category4.getWidth() / 2));
            window.addShape(category4);
        }
        // hobby
        else if (dimension == 2) {

            // 1 = Math or CMDA
            TextShape category1 = new TextShape(x, y, "Read", getColor(dimension, 1));
            category1.setBackgroundColor(Color.WHITE);
            category1.setX(x - (category1.getWidth() / 2));
            x = x * 3;
            window.addShape(category1);
            TextShape category2 = new TextShape(x, y, "Sports", getColor(dimension, 2));
            category2.setBackgroundColor(Color.WHITE);
            category2.setX(x - (category2.getWidth() / 2));
            x = (x / 3) * 5;
            
            window.addShape(category2);
            TextShape category3 = new TextShape(x, y, "", getColor(dimension, 3));
            category3.setBackgroundColor(Color.WHITE);
            category3.setX(x - (category3.getWidth() / 2));
            x = (x / 5) * 7;
            window.addShape(category3);

            TextShape category4 = new TextShape(x, y, "Other Engineering", getColor(dimension, 4));
            category4.setBackgroundColor(Color.WHITE);
            category4.setX(x - (category4.getWidth() / 2));
            window.addShape(category4);
        }
        // location
        else {
            // 1 = Math or CMDA
            TextShape category1 = new TextShape(x, y, "Math or CMDA", getColor(dimension, 1));
            category1.setBackgroundColor(Color.WHITE);
            category1.setX(x - (category1.getWidth() / 2));
            x = x * 3;
            window.addShape(category1);
            TextShape category2 = new TextShape(x, y, "Computer Science", getColor(dimension, 2));
            category2.setBackgroundColor(Color.WHITE);
            category2.setX(x - (category2.getWidth() / 2));
            x = (x / 3) * 5;
            
            window.addShape(category2);
            TextShape category3 = new TextShape(x, y, "Other", getColor(dimension, 3));
            category3.setBackgroundColor(Color.WHITE);
            category3.setX(x - (category3.getWidth() / 2));
            x = (x / 5) * 7;
            window.addShape(category3);

            TextShape category4 = new TextShape(x, y, "Other Engineering", getColor(dimension, 4));
            category4.setBackgroundColor(Color.WHITE);
            category4.setX(x - (category4.getWidth() / 2));
            window.addShape(category4);
        }

    }

    private void placeEntry(Position column, Position row, int index) {
        TextShape title = new TextShape(0, 0, "");
        TextShape artist = new TextShape(0, 0, "");
        TextShape year = new TextShape(0, 0, "");
        TextShape genre = new TextShape(0, 0, "");
        int x = 0;
        int y = 0;
        int columnFactor = 1;
        int rowFactor = 1;
        // column
        if (column == Position.FrontEnum) {

            columnFactor = 1;

        } else if (column == Position.BackEnum) {
            columnFactor = 5;
        } else {
            columnFactor = 3;
        }

        // row
        if (row == Position.FrontEnum) {

            rowFactor = 1;

        } else if (row == Position.BackEnum) {
            rowFactor = 5;
        } else {
            rowFactor = 3;
        }

        genre.setText(solver.getPlayList().get(index).getGenre());
        x = (window.getGraphPanelWidth() * (columnFactor / 6)) - (genre.getWidth() / 2);
        y = (window.getGraphPanelHeight() * (rowFactor / 6)) - title.getHeight() - this.LEGEND_GAP;
        genre.setX(x);
        genre.setY(y);
        window.addShape(genre);
        window.moveToFront(genre);

        year.setText(solver.getPlayList().get(index).getYear() + "");
        x = (window.getGraphPanelWidth() * (columnFactor / 6)) - (year.getWidth() / 2);
        y = y - year.getHeight();
        year.setX(x);
        year.setY(y);
        window.addShape(year);
        window.moveToFront(year);

        artist.setText(solver.getPlayList().get(index).getArtist());
        x = (window.getGraphPanelWidth() * (columnFactor / 6)) - (artist.getWidth() / 2);
        y = y - artist.getHeight();
        artist.setX(x);
        artist.setY(y);
        window.addShape(artist);
        window.moveToFront(artist);

        title.setText(solver.getPlayList().get(index).getSongName());
        x = (window.getGraphPanelWidth() * (columnFactor / 6)) - (title.getWidth() / 2);
        y = y - title.getHeight();
        title.setX(x);
        title.setY(y);
        window.addShape(title);
        window.moveToFront(title);
    }

    private void placeGraph(Position column, Position row, int index) {
        int height = window.getGraphPanelHeight() / 48;

        int x1;
        int y;
        int x2;
        Shape axis = new Shape(0, 0, 6, (height * 4) + 5, Color.BLACK);
        if (column == Position.FrontEnum) {
            x1 = (window.getGraphPanelWidth() / 6) - (axis.getWidth() / 2);
            axis.setX(x1);
            x1 = axis.getX() + axis.getWidth();

        } else if (column == Position.MiddleEnum) {
            x1 = (window.getGraphPanelWidth() / 2) - (axis.getWidth() / 2);
            axis.setX(x1);
            x1 = axis.getX() + axis.getWidth();

        } else {
            x1 = ((window.getGraphPanelWidth() * 5) / 6) - (axis.getWidth() / 2);
            axis.setX(x1);
            x1 = axis.getX() + axis.getWidth();

        }

        // row
        if (row == Position.FrontEnum) {

            y = ((window.getGraphPanelHeight() - this.LEGEND_GAP) / 6) + 5;
            axis.setY(y);

        } else if (row == Position.MiddleEnum) {
            y = ((window.getGraphPanelHeight() - this.LEGEND_GAP) / 2) + 5;
            axis.setY(y);
        } else {
            y = (((window.getGraphPanelHeight() - this.LEGEND_GAP) * 5) / 6) + 5;
            axis.setY(y);
        }

        window.addShape(axis);
        double widthPercent = solver.getPercentLike(index, dimension, 1);
        double maxPercent = window.getGraphPanelWidth() / 6;
        int widthLike = (int) Math.round(maxPercent * widthPercent);
        widthPercent = solver.getPercentHeard(index, dimension, 1);
        int widthHeard = (int) Math.round(maxPercent * widthPercent);
        x2 = axis.getWidth() - widthHeard;
        Shape heardBar1 = new Shape(x2, y, widthHeard, height, getColor(dimension, 1));
        Shape likeBar1 = new Shape(x1, y, widthLike, height, getColor(dimension, 1));
        window.addShape(likeBar1);
        window.addShape(heardBar1);
        y = y + height;

        widthPercent = solver.getPercentLike(index, dimension, 2);
        widthLike = (int) Math.round(maxPercent * widthPercent);
        widthPercent = solver.getPercentHeard(index, dimension, 2);
        widthHeard = (int) Math.round(maxPercent * widthPercent);
        x2 = axis.getWidth() - widthHeard;
        Shape heardBar2 = new Shape(x2, y, widthHeard, height, getColor(dimension, 2));
        Shape likeBar2 = new Shape(x1, y, widthLike, height, getColor(dimension, 2));
        window.addShape(likeBar2);
        window.addShape(heardBar2);
        y = y + height;

        widthPercent = solver.getPercentLike(index, dimension, 3);
        widthLike = (int) Math.round(maxPercent * widthPercent);
        widthPercent = solver.getPercentHeard(index, dimension, 3);
        widthHeard = (int) Math.round(maxPercent * widthPercent);
        x2 = axis.getWidth() - widthHeard;
        Shape heardBar3 = new Shape(x2, y, widthHeard, height, getColor(dimension, 3));
        Shape likeBar3 = new Shape(x1, y, widthLike, height, getColor(dimension, 3));
        window.addShape(likeBar3);
        window.addShape(heardBar3);
        y = y + height;

        widthPercent = solver.getPercentLike(index, dimension, 4);
        widthLike = (int) Math.round(maxPercent * widthPercent);
        widthPercent = solver.getPercentHeard(index, dimension, 4);
        widthHeard = (int) Math.round(maxPercent * widthPercent);
        x2 = axis.getWidth() - widthHeard;
        Shape heardBar4 = new Shape(x2, y, widthHeard, height, getColor(dimension, 4));
        Shape likeBar4 = new Shape(x1, y, widthLike, height, getColor(dimension, 4));
        window.addShape(likeBar4);
        window.addShape(heardBar4);

    }

    private Color getColor(int dimension, int category) {
        if (dimension == 1) {

            switch (category) {
            case (1):
                return Color.GREEN;
            case (2):
                return Color.PINK;
            case (3):
                return Color.RED;
            case (4):
                return Color.BLUE;
            default:
                return Color.ORANGE;
            }
        } else if (dimension == 2) {

            switch (category) {
            case (1):
                return Color.GREEN;
            case (2):
                return Color.PINK;
            case (3):
                return Color.RED;
            case (4):
                return Color.BLUE;
            default:
                return Color.ORANGE;
            }
        } else if (dimension == 3) {

            switch (category) {
            case (1):
                return Color.GREEN;
            case (2):
                return Color.PINK;
            case (3):
                return Color.RED;
            case (4):
                return Color.BLUE;
            default:
                return Color.ORANGE;
            }
        } else {

            switch (category) {
            case (1):
                return Color.GREEN;
            case (2):
                return Color.PINK;
            case (3):
                return Color.RED;
            case (4):
                return Color.BLUE;
            default:
                return Color.ORANGE;
            }
        }

    }

    /**
     * this method gets the next nine songs
     */
    public void getNextNineSongs() {

        window.removeAllShapes();
        solver.flipPage(true);
        fillWindow();
        if (((solver.getPage() * 9) + 9) >= solver.getNumberOfSongs()) {
            nextButton.disable();
        } else {
            nextButton.enable();
        }
        previousButton.enable();
    }

    /**
     * this method gets the previous nine songs
     */
    public void getPrevNineSongs() {
        window.removeAllShapes();
        solver.flipPage(false);
        fillWindow();
        if (solver.getPage() <= 0) {
            previousButton.disable();
        } else {
            previousButton.enable();
        }
        nextButton.enable();
    }

    public void clickSort(Button button) {
        if (button == titleButton) {
            window.removeAllShapes();
            solver.sortSongs("Song");
            fillWindow();
        } else if (button == artistButton) {
            window.removeAllShapes();
            solver.sortSongs("Artist");
            fillWindow();

        } else if (button == dateButton) {
            window.removeAllShapes();
            solver.sortSongs("Year");
            fillWindow();
        } else {
            window.removeAllShapes();
            solver.sortSongs("Genre");
            fillWindow();
        }
    }

    public void clickDimension(Button button) {
        if (button == majorButton) {

            dimension = 1;
        } else if (button == hobbyButton) {
            dimension = 2;

        } else if (button == locationButton) {
            dimension = 3;
        }
        window.removeAllShapes();
        fillWindow();

    }

    public void clickPage(Button button) {

        if (button == nextButton) {
            this.getNextNineSongs();
        } else if (button == previousButton) {
            this.getPrevNineSongs();
        }
    }
}


