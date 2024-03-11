package com.example.calorie_counter_bmi.controllers;

import com.example.calorie_counter_bmi.models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {
    public RadioButton male_radio_btn;
    public RadioButton female_radio_btn;
    public Spinner birth_year_spinner;
    public Spinner weight_spinner;
    public Spinner height_spinner;
    public TextField username_txt_fld;
    public PasswordField password_txt_fld;
    public CheckBox show_password_check_bx;
    public PasswordField confirm_password_txt_fld;
    public Button register_btn;
    public Button clear_btn;
    public Button login_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        login_btn.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        Stage stage = (Stage) login_btn.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showLoginWindow();
    }

}
