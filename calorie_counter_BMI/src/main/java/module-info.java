module com.example.calorie_counter_bmi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.calorie_counter_bmi to javafx.fxml;
    exports com.example.calorie_counter_bmi;
    exports com.example.calorie_counter_bmi.controllers;
    exports com.example.calorie_counter_bmi.models;
    exports com.example.calorie_counter_bmi.controllers.client;
    exports com.example.calorie_counter_bmi.controllers.admin;
    exports com.example.calorie_counter_bmi.views;
}