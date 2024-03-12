package com.example.calorie_counter_bmi.controllers.client;

import com.example.calorie_counter_bmi.models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    public Label username_lbl;
    public TextField users_weigth_txt_fld;
    public Button edit_users_weight_btn;
    public Button logout_btn;
    public Button previous_date_btn;
    public DatePicker calendar_date_picker;
    public Button next_date_btn;
    public ProgressIndicator users_carbohydrates_indicator;
    public ProgressIndicator users_proteins_indicator;
    public ProgressIndicator users_fat_indicator;
    public ProgressIndicator users_fiber_indicator;
    public ProgressIndicator users_total_indicator;
    public Label users_current_total_number_label;
    public Label users_current_proteins_number_label;
    public Label users_current_carbohydrates_number_label;
    public Label users_current_fat_number_label;
    public Label users_current_fiber_number_label;
    public Label users_daily_total_label;
    public Label users_daily_proteins_label;
    public Label users_daily_fiber_label;
    public Label users_daily_fat_label;
    public TableView users_daily_menu_table_view;
    public TableColumn name_ate_product_table_column;
    public TableColumn amount_ate_product_table_column;
    public TableColumn calories_ate_product_table_column;
    public TextField add_new_dish_txt_fld;
    public Button add_new_dish_btn;
    public Spinner add_new_dish_amount_spinner;
    public TextField search_product_txt_fld;
    public TableView list_of_products_table_view;
    public TableColumn name_can_eat_product_table_column;
    public TableColumn calorie_dose_can_eat_product_table_column;
    public TableColumn proteins_dose_can_eat_product_table_column;
    public TableColumn fat_dose_can_eat_product_table_column;
    public TableColumn carbohydrates_dose_can_eat_product_table_column;
    public TableColumn fiber_dose_can_eat_product_table_column;
    public TextField add_new_product_txt_fld;
    public Button add_new_product_btn;
    public TextField new_product_proteins_dose_txt_fld;
    public TextField new_product_fat_dose_txt_fld;
    public TextField new_product_fiber_dose_txt_fld;
    public TextField new_product_carbohydrates_dose_txt_fld;
    public TextField new_product_calories_dose_txt_fld;

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
