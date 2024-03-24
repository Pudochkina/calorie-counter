package com.example.calorie_counter_bmi.controllers.client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/** контроллер отвечающий за
 * отображение списка продуктов
 * добавление нового продукта
 * поиск продукта */
public class CenterBoardController implements Initializable {
    /**
     * поле в которое вводиться продукт для добавления в рацион
     */
    public TextField search_product_txt_fld;
    /**
     * таблица отображающая список продуктов из бд
     */
    public TableView list_of_products_table_view;
    /**
     * столбец названия продукта
     */
    public TableColumn name_can_eat_product_table_column;
    /**
     * столбец калорийности выбираемого продукта в 100г/100мл
     */
    public TableColumn calorie_dose_can_eat_product_table_column;
    /**
     * столбец кол-ва белка выбираемого продукта в 100г/100мл
     */
    public TableColumn proteins_dose_can_eat_product_table_column;
    /**
     * столбец кол-ва жиров выбираемого продукта в 100г/100мл
     */
    public TableColumn fat_dose_can_eat_product_table_column;
    /**
     * столбец кол-ва углеводов выбираемого продукта в 100г/100мл
     */
    public TableColumn carbohydrates_dose_can_eat_product_table_column;
    //кол-во клетчатки выбираемого продукта в 100г/100мл
    /**
     * столбец кол-ва клетчатки добавляемого продукта в 100г/100мл
     */
    public TableColumn fiber_dose_can_eat_product_table_column;
    /**
     * текстовое поле для названия продукта которое пользователь хочет добавить
     */
    public TextField add_new_product_txt_fld;
    /**
     * кнопка добавить новый продукт
     */
    public Button add_new_product_btn;
    /**
     * кол-во белков добавляемого продукта в 100г/100мл
     */
    public TextField new_product_proteins_dose_txt_fld;
    /**
     * кол-во жиров добавляемого продукта в 100г/100мл
     */
    public TextField new_product_fat_dose_txt_fld;
    /**
     * кол-во клетчатки добавляемого продукта в 100г/100мл
     */
    public TextField new_product_fiber_dose_txt_fld;
    /**
     * кол-во углеводов добавляемого продукта в 100г/100мл
      */
    public TextField new_product_carbohydrates_dose_txt_fld;
    /**
     * калорийность добавляемого продукта в 100г/100мл
     */
    public TextField new_product_calories_dose_txt_fld;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
