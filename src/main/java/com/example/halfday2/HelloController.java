package com.example.halfday2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private TextField city_name;
    @FXML
    private Label welcomeText;
    @FXML
    private Button submit_button;

    private int temperature;
//    @FXML
//    protected void onHelloButtonClick() {
//
//    }

    @FXML
    protected  void submitButton(){
        welcomeText.setText("The weather is " + temperature + "degrees");

    }
}