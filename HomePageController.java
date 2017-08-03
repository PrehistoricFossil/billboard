
package billboard;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class HomePageController {

    @FXML
    private RadioButton sqlRadioButton;

    @FXML
    private ToggleGroup dataBaseToggle;

    @FXML
    private RadioButton csvRadioButton;

    @FXML
    private RadioButton barChartRB;

    @FXML
    private ToggleGroup chartTypeToggle;

    @FXML
    private RadioButton lineChartRB;

    @FXML
    private RadioButton pieChartRB;

    @FXML
    private RadioButton scatterChartRB;

    @FXML
    private RadioButton areaChartRB;

    @FXML
    private RadioButton bubbleChartRB;

    @FXML
    private Button createGraphButton;

    @FXML
    void handleButtonAction(ActionEvent event) throws IOException {
        if (barChartRB.isSelected()){
            try{
                Parent barChart_parent = FXMLLoader.load(getClass().getResource("BarGraph.fxml"));
                Stage barChart_stage = new Stage();
                barChart_stage.setTitle("Billboard: Bar Chart");
                barChart_stage.setScene(new Scene(barChart_parent));
                barChart_stage.show();
            } catch(Exception e){
               System.out.println("Error");
            }
        }
    }

}
