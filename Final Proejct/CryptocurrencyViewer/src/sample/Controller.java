package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import org.json.JSONArray;
import org.json.JSONObject;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Controller {

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private LineChart<String, Number> lineChart ;

    public void dayButtonPressed(ActionEvent event) {
        GetApi am = new GetApi();
        String content = am.histoDayApi();
        parseData(content);
    }

    public void hourButtonPressed(ActionEvent event) {
        GetApi am = new GetApi();
        String content = am.histoHourApi();
        parseData(content);
    }

    public void minuteButtonPressed(ActionEvent event) {
        GetApi am = new GetApi();
        String content = am.histoMinuteApi();
        parseData(content);
    }

    public void parseData(String content) {
        JSONObject obj = new JSONObject(content);
        JSONArray data = obj.getJSONArray("Data");

        xAxis = new CategoryAxis();
        yAxis = new NumberAxis("Price", 30500, 31000, 1000);
        lineChart = new LineChart<String,Number>(xAxis,yAxis);

        XYChart.Series series = new XYChart.Series();

        for (int i=0; i<data.length(); i++) {

            Integer time = data.getJSONObject(i).getInt("time");

            final DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("HH:mm:ss");
            final String formattedDtm = Instant.ofEpochSecond(time)
                    .atZone(ZoneId.of("GMT-4"))
                    .format(formatter);
            Float high = data.getJSONObject(i).getFloat("high");
            Float low = data.getJSONObject(i).getFloat("low");
            Float open = data.getJSONObject(i).getFloat("open");
            Float close = data.getJSONObject(i).getFloat("close");
            series.getData().add(new XYChart.Data(formattedDtm,open));
            series.getData().add(new XYChart.Data(formattedDtm, low));
            series.getData().add(new XYChart.Data(formattedDtm, high));
            series.getData().add(new XYChart.Data(formattedDtm, close));
        }
        lineChart.getData().add(series);
    }

}