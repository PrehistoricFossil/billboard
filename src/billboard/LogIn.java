/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billboard;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author vita
 */
public class LogIn implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent main_page_parent = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene main_page_scene = new Scene(main_page_parent);
        Stage app_main = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_main.setScene(main_page_scene);
        app_main.show();
        
        label.setTextFill(Color.GREEN);
        label.setText("Success");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
