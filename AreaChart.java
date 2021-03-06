/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billboard2;

import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author vita
 */
public class AreaChart  {

    final StackedAreaChart<Number, Number> ac;
    
    public AreaChart() {
        final NumberAxis x_Axis = new NumberAxis(4, 40, 2);
        final NumberAxis y_Axis = new NumberAxis();
        ac = 
            new StackedAreaChart<>(x_Axis,y_Axis);
        ac.setTitle("T");
 
        XYChart.Series ss1= new XYChart.Series();
        ss1.setName("a");
        ss1.getData().addAll(new XYChart.Data(1, 4),
            new XYChart.Data(6, 12),
            new XYChart.Data(3, 18),
            new XYChart.Data(3, 10));
        
        
        XYChart.Series ss2 = new XYChart.Series();
        ss2.setName("May");
        ss2.getData().addAll(new XYChart.Data(1, 20),
            new XYChart.Data(3, 17),
            new XYChart.Data(9, 11),
        
            new XYChart.Data(12, 10));
        
        ac.getData().addAll(ss1, ss2);
    }    

    
    
}
