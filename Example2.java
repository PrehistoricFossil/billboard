package example2;

import javafx.application.Application;
import javafx.stage.Stage;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

  


public class Example2 extends Application {  
  
  
  @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("tableView.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Billboard");
        stage.setScene(scene);
        stage.show();
        
        
    }    
public static void main(String[] args) {  
       Application.launch(args);  
  }  
        
}       
    
    
