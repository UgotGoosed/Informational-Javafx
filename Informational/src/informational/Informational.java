/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Author: Michael Ganschow
*/
package informational;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author gansc
 */
public class Informational extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a border pane
        BorderPane pane = new BorderPane();
        
        // place nodes in pane
        pane.setTop(getHbox());
        pane.setBottom(getVbox());
        
   
        // create scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("The Paladin");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    // Hbox node to display picture, multiple pictures would be set side by side
    private HBox getHbox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15,5,5,5));
        hBox.setStyle("-fx-background-color: gold");
        ImageView imageView = new ImageView(new Image("file:paladin.jpg"));
        hBox.getChildren().add(imageView);
        return hBox;
    }

    // Vbox node to display information about the picture in the hbox. 
    private VBox getVbox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15,5,5,5));
        Text text1 = new Text(20,20, "Paladin Class!");
        text1.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        vBox.getChildren().add(text1);
        Text text2 = new Text(50,100, "Protection Paladin:");
        text2.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 10));
        vBox.getChildren().add(text2);
        Text text3 = new Text(20,20, "The Protection paladin is the tank specialization\n" +
                " of the Paladin class. These paladins weild a \n" + 
                "shield and a one handed weapon. Prot Paladins \n" +
                "use the power of the light to smite its foes \n" +
                "and bring justice to the land");
        vBox.getChildren().add(text3);
        vBox.getChildren().add(new Button("Next Specialization"));
        return vBox;
        
    }
    
}
