/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplicationfxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javax.annotation.Resources;
import jfxtras.labs.util.event.MouseControlUtil;

/**
 *
 * @author pax
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Rectangle rect;
    @FXML
    private AnchorPane pane;
    @FXML
    private Label label;
    @FXML
    private Button button2;
    @FXML
    private Button button;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        button2.setText("OOO");
        button.setText("");
    }

     @FXML
    private void handleButtonAction2(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        button.setText("AAA");
        button2.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        MouseControlUtil.makeDraggable(rect);
        Circle circle=new Circle();
        circle.setFill(Color.KHAKI);
        circle.setStroke(Color.OLIVE);
        circle.setStrokeWidth(5);
        circle.setStrokeType(StrokeType.OUTSIDE);
        circle.setCenterX(50);
        circle.setCenterY(50);
        circle.setRadius(50);
        MouseControlUtil.makeDraggable(circle);
        pane.getChildren().add(circle);
    }
}
