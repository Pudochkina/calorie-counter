package com.example.calorie_counter_bmi.controllers;

import com.example.calorie_counter_bmi.models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public Label error_text_fld;
    public TextField username_txt_fld;
    public TextField password_txt_fld;
    public Button login_btn;
    public Button clear_btn;
    public Button register_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> onLogin());
        register_btn.setOnAction(event -> onRegister());
    }

    private void onLogin() {
        Stage stage = (Stage) login_btn.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showDashboardWindow();
    }

    private void onRegister() {
        Stage stage = (Stage) register_btn.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showRegisterWindow();
    }
}
