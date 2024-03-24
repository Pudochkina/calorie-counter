package com.example.calorie_counter_bmi.controllers.client;

import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

/** контроллер отвечающий за
 * выбор даты
 * отображение ежедневной нормы кбжу пользователя
 * кол-ва съеденных за день кбжу
 * списка съеденных за день продуктов
 * добавление продукта в рацион */
public class RightBoardController implements Initializable {
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
