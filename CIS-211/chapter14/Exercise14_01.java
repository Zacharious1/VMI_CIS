package chapter14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class Exercise14_01 extends Application {
    public void start1(Stage primaryStage) {

// Create a javaFX grid pane object to display the flag images
        GridPane pane = new GridPane();

        pane.setAlignment(Pos.CENTER);

// Play with the following two commands and find their functionality
        pane.setHgap(5);
        pane.setVgap(5);

// Explain your finding about setHgap and setVgap from your play with them
// They are the horizontal and vertical gaps in the pane

// Add four flag images into the grid pane you created in the above:
// Use four flag images given in the image folder: germany, china, France, and us
// Fill the following blanks to create one ImageView object to display one flag image
        ImageView imageView1 = new ImageView("image/uk.bmp");
        ImageView imageView2 = new ImageView("image/canada.bmp");
        ImageView imageView3 = new ImageView("image/china.jpg");
        ImageView imageView4 = new ImageView("image/usa.bmp");

// Now add the four ImageView objects into the grid pane using their designated locations in the pane.
// The location to display each flag is specified using the row and column indexes in the pane:
// pane.add(imageview object, row index, column index);
        pane.add(imageView1, 0, 0);
        pane.add(imageView2, 0, 1);
        pane.add(imageView3, 1, 0);
        pane.add(imageView4, 1, 1);

// Create a scene and place it in the stage
        //????????

// Set the stage title as
        //????????

// Now, place the scene in the stage - i.e set the scene to the stage
        //?????????

// Now, finally display the entire stage
        //?????????

    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
// TODO Auto-generated method stub

    }
}
