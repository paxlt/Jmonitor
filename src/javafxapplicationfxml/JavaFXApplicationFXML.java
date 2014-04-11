/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplicationfxml;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import jfxtras.labs.scene.control.window.Window;
import jfxtras.labs.scene.layout.ScalableContentPane;
import jfxtras.labs.util.event.MouseControlUtil;

/**
 *
 * @author pax
 */
public class JavaFXApplicationFXML extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Parent np = FXMLLoader.load(getClass().getResource("Module.fxml"));
        //ScalableContentPane scp = new ScalableContentPane();
        //Pane root = scp.getContentPane();

        //Window w1 = new Window("my new window");
        //w1.setPrefSize(100, 100);
        //root.getChildren().add(w1);

        Rectangle circle1 = new Rectangle(100, 100, 50, 50);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeType(StrokeType.INSIDE);
        circle1.setArcHeight(20);
        circle1.setArcWidth(20);

        //Light.Distant light = new Light.Distant();
        //light.setAzimuth(-135.0);
        Lighting lighting = new Lighting();
        //lighting.setLight(light);
        //lighting.setSurfaceScale(5.0);
        circle1.setEffect(lighting);
        circle1.setFill(Color.AQUA);


        Text text = new Text();
        text.setText("JavaFX!");
        text.setFill(Color.STEELBLUE);
        text.setFont(Font.font(null, FontWeight.BOLD, 60));
        text.setX(10.0);
        text.setY(10.0);
        text.setTextOrigin(VPos.TOP);

        text.setEffect(lighting);



        //MouseControlUtil.makeDraggable(circle1);
        //root.getChildren().add(circle1);

        Scene scene = new Scene(root, 400, 400);
        scene.getStylesheets().add("javafxapplicationfxml/testcss.css");
        stage.setScene(scene);
        stage.show();
        circle1.getStyleClass().add("circle1");
        /*
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Text Files", "*.txt"),
                new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
                new ExtensionFilter("All Files", "*.*"));
        */
        //File selectedFile = fileChooser.showOpenDialog(stage);

        //Circle circle=new Circle();
        //circle.setFill(Color.CORAL);
        //circle.setStroke(Color.OLIVE);
        //circle.setStrokeWidth(5);
        //circle.setStrokeType(StrokeType.OUTSIDE);
        //circle.setCenterX(50);
        //circle.setCenterY(50);
        //circle.setRadius(50);

        MouseControlUtil.makeDraggable(np);
        AnchorPane pn = (AnchorPane)root.lookup("#MainPane");
        pn.getChildren().add(np);
        pn.getChildren().add(text);
        pn.getChildren().add(circle1);
        //((Group)scene.getRoot()).getChildren().add(circle1);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
