package com.example.calorie_counter_bmi.controllers.client;

import com.example.calorie_counter_bmi.views.ViewFactory;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

/** контроллер отвечающий за
 * приветствие пользователя
 * изменение веса пользователя
 * выход из аккаунта
 * выбор даты
 * отображение ежедневной нормы кбжу пользователя
 * кол-ва съеденных за день кбжу
 * списка съеденных за день продуктов
 * добавление продукта в рацион */
public class RightBoardController implements Initializable {
    /**
     * имя пользователя
     */
    public Label username_lbl;
    /**
     * вес пользователя
     */
    public TextField users_weigth_txt_fld;
    /**
     * кнопка изменить вес пользователя
     */
    public Button edit_users_weight_btn;
    /**
     * кнопка выйти
     */
    public Button logout_btn;
    /**
     * id пользователя, для обращения в таблицу хранящей то что съел пользователь
     */
    private int user_id;
    /**
     * кнопка выбрать предыдущую дату
     */
    public Button previous_date_btn;
    /**
     * календарь с выбором даты
     */
    public DatePicker calendar_date_picker;
    /**
     * кнопка выбрать следующую дату
     */
    public Button next_date_btn;
    /**
     * процентаж кол-ва съеденных углеводов
     */
    public ProgressIndicator users_carbohydrates_indicator;
    /**
     * процентаж кол-ва съеденных белков
     */
    public ProgressIndicator users_proteins_indicator;
    /**
     * процентаж кол-ва съеденных жиров
     */
    public ProgressIndicator users_fat_indicator;
    /**
     * процентаж кол-ва съеденной клетчатки
     */
    public ProgressIndicator users_fiber_indicator;
    /**
     * процентаж кол-ва съеденных калорий в целом
     */
    public ProgressIndicator users_total_indicator;
    /**
     * поле в котором отображается текущее набранное кол-во калорий
     */
    public Label users_current_total_number_label;
    /**
     * поле в котором отображается текущее набранное кол-во белков
     */
    public Label users_current_proteins_number_label;
    /**
     * поле в котором отображается текущее набранное кол-во углеводов
     */
    public Label users_current_carbohydrates_number_label;
    /**
     * поле в котором отображается текущее набранное кол-во жиров
     */
    public Label users_current_fat_number_label;
    /**
     * поле в котором отображается текущее набранное кол-во клетчатки
     */
    public Label users_current_fiber_number_label;
    /**
     * поле в котором отображается норма суточного потребления калорий
     */
    public Label users_daily_total_label;
    /**
     * поле в котором отображается норма суточного потребления белков
     */
    public Label users_daily_proteins_label;
    /**
     * поле в котором отображается норма суточного потребления углеводов
     */
    public Label users_daily_carbohydrates_label;
    /**
     * поле в котором отображается норма суточного потребления клетчатки
     */
    public Label users_daily_fiber_label;
    /**
     * поле в котором отображается норма суточного потребления жиров
     */
    public Label users_daily_fat_label;
    /**
     * таблица отображающая съеденные за день продукты
     */
    public TableView users_daily_menu_table_view;
    /**
     * название съеденного продукта
     */
    public TableColumn name_ate_product_table_column;
    /**
     * кол-во съеденного продукта
     */
    public TableColumn amount_ate_product_table_column;
    /**
     * калории полученные в результате съедания продукта
     */
    public TableColumn calories_ate_product_table_column;
    /**
     * кнопка которая отвечает за добавление названия и запоминание id съеденного продукта в форму
     * а также за открытие окна с интерефейсом по поиску и добавлению своего продукта
     */
    public Button add_new_product_btn;
    /**
     * кнопка отвечающая за добавление съеденного продукта в рацион питания
     */
    public Button add_new_dish_btn;
    /**
     * поле в которое вводиться кол-во съеденного продукта
     */
    public Spinner<Integer> add_new_dish_amount_spinner;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        logout_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                ViewFactory.changeSceneFromLogInToCenterBoard(actionEvent, "/fxml/login.fxml", "Log In", null,0, null, null, null, null, null, null);
            }
        });

    }
    /**
     * метод который вызывается в классе DBUtils в методе changeSceneFromLogInToCenterBoard
     * используется для того, чтобы при входе в аккаунт
     * данные пользователя отобразились на странице
     */
    public void setUserInformation(int id, String name, Double weight, Double calories, Double proteins, Double carbo, Double fat, Double fiber){
        user_id = id;
        users_daily_total_label.setText("" + calories);
        users_daily_proteins_label.setText("" + proteins);
        users_daily_carbohydrates_label.setText("" + carbo);
        users_daily_fat_label.setText("" + fat);
        users_daily_fiber_label.setText("" + fiber);
        username_lbl.setText(name);
        users_weigth_txt_fld.setText("" + weight);
    }

}
