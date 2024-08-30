package controller;
import db.DataBaseConnector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import model.Task;

import java.util.List;

public class MyDayForm {

    @FXML
    private Label lblEightDay;

    @FXML
    private Label lblFiveDay;

    @FXML
    private Label lblFourDay;

    @FXML
    private Label lblOneDay;

    @FXML
    private Label lblSevenDay;

    @FXML
    private Label lblSixDay;

    @FXML
    private Label lblThreeDay;

    @FXML
    private Label lblTwoDay;




    @FXML
    void btnLoadMyDayOnAction(ActionEvent event) {

            List<Task> userList = DataBaseConnector.getInstance().getConnection();
            ObservableList<Task> taskObservableList = FXCollections.observableArrayList(userList);


            Label[] dayLabels = {lblOneDay, lblTwoDay, lblThreeDay, lblFourDay, lblFiveDay, lblSixDay, lblSevenDay, lblEightDay};


            for (Label label : dayLabels) {
                label.setText("");
            }


            for (int i = 0; i < taskObservableList.size() && i < dayLabels.length; i++) {
                dayLabels[i].setText(taskObservableList.get(i).getText());
            }
        }

}




