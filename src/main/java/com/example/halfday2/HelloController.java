package com.example.halfday2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Label tempText;

//    @FXML
//    protected void onHelloButtonClick() {
//
//    }

    @FXML
    protected  void onSubmitButtonClick(){
        tempText.setText("Welcome to JavaFX Application!");
    }
}