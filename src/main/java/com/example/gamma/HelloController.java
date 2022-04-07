package com.example.gamma;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {

    @FXML
    private Button button2;

    @FXML
    private Button signin;


    @FXML
    private Button button3;

    @FXML
    private TextField login;

    @FXML
    private PasswordField pin;


    @FXML
    private Label error;

    @FXML
    protected void doSwitch(ActionEvent event) throws IOException {

        Stage stage;
        Parent root;
        int s = 0;

        if (event.getSource() == signin) {
            s++;
            stage = (Stage) signin.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }


        if (event.getSource() == button3) {
            stage = (Stage) button3.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        if (event.getSource() == button2) {
            String l = login.getText();
            String pass = pin.getText();

                String rlog = "Amir";
                String rpin = "amir";

                if (l.equals(rlog)) {

                    if (pass.equals(rpin)) {

                        if (event.getSource() == button2) {
                            stage = (Stage) button2.getScene().getWindow();
                            root = FXMLLoader.load(getClass().getResource("test.fxml"));
                        } else {
                            stage = (Stage) button3.getScene().getWindow();
                            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
                        }
                        Scene scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    } else {
                        error.setText("Error!");
                    }

                } else {
                    error.setText("Error!");
                }
            }



        }


}


