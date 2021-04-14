package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

public class ShowArc extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {   
    Arc arc1 = new Arc(150, 100, 80, 80, 30, 35); // Create an arc
    arc1.setFill(Color.RED); // Set fill color
    arc1.setType(ArcType.ROUND); // Set arc type
    
    Arc arc2 = new Arc(150, 100, 80, 80, 30 + 90, 35);
    arc2.setFill(Color.WHITE);
    arc2.setType(ArcType.ROUND);
    arc2.setStroke(Color.BLACK);

    Arc arc3 = new Arc(150, 100, 80, 80, 30 + 180, 35);
    arc3.setFill(Color.WHITE);
    arc3.setType(ArcType.ROUND);
    arc3.setStroke(Color.BLACK);
    
    Arc arc4 = new Arc(150, 100, 80, 80, 30 + 270, 35);
    arc4.setFill(Color.GREEN);
    arc4.setType(ArcType.ROUND);
    arc4.setStroke(Color.BLACK);

    Arc arc5 = new Arc(150, 100, 80, 80, 60, 35); // Create an arc
    arc5.setFill(Color.RED); // Set fill color
    arc5.setType(ArcType.ROUND); // Set arc type

    Arc arc6 = new Arc(150, 100, 80, 80, 60 + 90, 35);
    arc6.setFill(Color.WHITE);
    arc6.setType(ArcType.ROUND);
    arc6.setStroke(Color.BLACK);

    Arc arc7 = new Arc(150, 100, 80, 80, 60 + 180, 35);
    arc7.setFill(Color.WHITE);
    arc7.setType(ArcType.ROUND);
    arc7.setStroke(Color.BLACK);

    Arc arc8 = new Arc(150, 100, 80, 80, 60 + 270, 35);
    arc8.setFill(Color.GREEN);
    arc8.setType(ArcType.ROUND);
    arc8.setStroke(Color.BLACK);
    
    // Create a group and add nodes to the group
    Group group = new Group();
    group.getChildren().addAll(new Text(210, 40, "arc1: round"), 
      arc1, new Text(20, 40, "arc2: open"), arc2,
      new Text(20, 170, "arc3: chord"), arc3, 
      new Text(210, 170, "arc4: chord"), arc4);
    group.getChildren().addAll(new Text(210, 40, "arc1: round"),
      arc5, new Text(20, 40, "arc2: open"), arc6,
      new Text(20, 170, "arc3: chord"), arc7,
      new Text(210, 170, "arc4: chord"), arc8);

    // Create a scene and place it in the stage
    Scene scene = new Scene(new BorderPane(group), 300, 200);
    primaryStage.setTitle("ShowArc"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
