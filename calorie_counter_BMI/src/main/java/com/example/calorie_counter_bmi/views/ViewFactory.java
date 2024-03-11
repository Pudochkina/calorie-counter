package com.example.calorie_counter_bmi.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewFactory {
    public ViewFactory(){}

    public void showDashboardWindow() {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/client/dashboard.fxml"));
      createStage(loader);
    }

    public void showRegisterWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/register.fxml"));
        createStage(loader);
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
        createStage(loader);
    }

    public void createStage(FXMLLoader loader){
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Calorie Counter");
        stage.show();
        stage.setResizable(false);
    }

    public void closeStage(Stage stage) {
        stage.close();
    }

}
