package com.example.calorie_counter_bmi.controllers.client;

import com.example.calorie_counter_bmi.models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/** контроллер отвечающий за
 * приветствие пользователя
 * изменение веса пользователя
 * выход из аккаунта */
public class LeftBoardController implements Initializable {
    public Label username_lbl;
    public TextField users_weigth_txt_fld;
    public Button edit_users_weight_btn;
    public Button logout_btn;
    public Label error_text_fld;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        logout_btn.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        Stage stage = (Stage) logout_btn.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showLoginWindow();
    }

}
