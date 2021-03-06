/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billboard2;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Pane;

public class LineGraph  {
    
    final LineChart<Number,Number> lc;
    
    public LineGraph() {
        final NumberAxis x_Axis = new NumberAxis();
        final NumberAxis y_Axis = new NumberAxis();
        x_Axis.setLabel("Nt");
        //creating the chart
        lc = new LineChart<Number,Number>(x_Axis,y_Axis);
        lc.setTitle("110");
        //defining a series
        XYChart.Series ss = new XYChart.Series();
        ss.setName("go");
        //populating the series with data
        ss.getData().addAll(new XYChart.Data(1, 23),
            new XYChart.Data(10, 17),
            new XYChart.Data(11, 29),
            new XYChart.Data(12, 25));
        
        lc.getData().add(ss);
        
    }    

    
}
