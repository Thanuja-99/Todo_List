package controller;

import db.DataBaseConnector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Task;

import java.io.IOException;
import java.util.List;

public class TaskAddForm {

    @FXML
    private CheckBox chkEight;

    @FXML
    private CheckBox chkFive;

    @FXML
    private CheckBox chkFour;

    @FXML
    private CheckBox chkOne;

    @FXML
    private CheckBox chkSeven;

    @FXML
    private CheckBox chkSix;

    @FXML
    private CheckBox chkThree;

    @FXML
    private CheckBox chkTwo;

    @FXML
    private Label lblEightTask;

    @FXML
    private Label lblFiveTask;

    @FXML
    private Label lblFourTask;

    @FXML
    private Label lblOneTask;

    @FXML
    private Label lblSevenTask;

    @FXML
    private Label lblSixTask;

    @FXML
    private Label lblThreeTask;

    @FXML
    private Label lblTwoTask;

    @FXML
    private TextField txtTask;


    List<Task> userList = DataBaseConnector.getInstance().getConnection();

    @FXML
    void btnAddOnAction(ActionEvent event) {

        String taskText = txtTask.getText();
        txtTask.setText("");
        if (!taskText.isEmpty()) {
            if (lblOneTask.getText().isEmpty()) {
                lblOneTask.setText(taskText);
                lblOneTask.setDisable(false);
            } else if (lblTwoTask.getText().isEmpty()) {
                lblTwoTask.setText(taskText);
                lblTwoTask.setDisable(false);
            } else if (lblThreeTask.getText().isEmpty()) {
                lblThreeTask.setText(taskText);
                lblThreeTask.setDisable(false);
            } else if (lblFourTask.getText().isEmpty()) {
                lblFourTask.setText(taskText);
                lblFourTask.setDisable(false);
            } else if (lblFiveTask.getText().isEmpty()) {
                lblFiveTask.setText(taskText);
                lblFiveTask.setDisable(false);
            } else if (lblSixTask.getText().isEmpty()) {
                lblSixTask.setText(taskText);
                lblSixTask.setDisable(false);
            } else if (lblSevenTask.getText().isEmpty()) {
                lblSevenTask.setText(taskText);
                lblSevenTask.setDisable(false);
            } else if (lblEightTask.getText().isEmpty()) {
                lblEightTask.setText(taskText);
                lblEightTask.setDisable(false);
            }

        }
    }


    @FXML
    void btnMyDayOnAction(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/my_day_form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }
    @FXML
    void btnFinshDayOnAction(ActionEvent event) {
        saveSelectedTasks();

    }


    private void saveSelectedTasks() {
        if (chkOne.isSelected() && !lblOneTask.getText().isEmpty()) {
            Task taskOne = new Task();
            taskOne.setText(lblOneTask.getText());
            userList.add(taskOne);
        }

        if (chkTwo.isSelected() && !lblTwoTask.getText().isEmpty()) {
            Task taskTwo = new Task();
            taskTwo.setText(lblTwoTask.getText());
            userList.add(taskTwo);
        }

        if (chkThree.isSelected() && !lblThreeTask.getText().isEmpty()) {
            Task taskThree = new Task();
            taskThree.setText(lblThreeTask.getText());
            userList.add(taskThree);
        }

        if (chkFour.isSelected() && !lblFourTask.getText().isEmpty()) {
            Task taskFour = new Task();
            taskFour.setText(lblFourTask.getText());
            userList.add(taskFour);
        }

        if (chkFive.isSelected() && !lblFiveTask.getText().isEmpty()) {
            Task taskFive = new Task();
            taskFive.setText(lblFiveTask.getText());
            userList.add(taskFive);
        }

        if (chkSix.isSelected() && !lblSixTask.getText().isEmpty()) {
            Task taskSix = new Task();
            taskSix.setText(lblSixTask.getText());
            userList.add(taskSix);
        }

        if (chkSeven.isSelected() && !lblSevenTask.getText().isEmpty()) {
            Task taskSeven = new Task();
            taskSeven.setText(lblSevenTask.getText());
            userList.add(taskSeven);
        }

        if (chkEight.isSelected() && !lblEightTask.getText().isEmpty()) {
            Task taskEight = new Task();
            taskEight.setText(lblEightTask.getText());
            userList.add(taskEight);
        }
    }

}
