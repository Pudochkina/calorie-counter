package com.example.calorie_counter_bmi;

import com.example.calorie_counter_bmi.models.User;
import com.example.calorie_counter_bmi.views.ViewFactory;
import javafx.event.ActionEvent;
import java.sql.*;
import javafx.scene.control.Alert;

public class DBUtils {

    /** метод отвечающий за регистрацию пользователя
     * считывает значения введенные пользователем
     * производит валидацию
     * рассчитывает кбжу
     * заносит в бд
     * */
    public static void signUpUser(String username, String password, String gender, int height, Double weight) {
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExist = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calorie_counter_app", "root", "qwerty1234");
            psCheckUserExist = connection.prepareStatement("SELECT * FROM users WHERE user_name = ?");
            psCheckUserExist.setString(1, username);
            resultSet = psCheckUserExist.executeQuery();
            if (resultSet.isBeforeFirst()) {
                System.out.println("User already exists!");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You cannot use this username.");
                alert.show();
            } else {
                Double[] dailyIntakeValues = User.calculateDailyIntakeValues(Double.valueOf(height), weight, gender);
                psInsert = connection.prepareStatement("INSERT INTO " +
                        "users (user_name, user_password, user_gender, user_height," +
                        " user_weight, user_dt_calories, user_dt_proteins, user_dt_fat, user_dt_fiber, user_dt_carbo) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                psInsert.setString(1, username);
                psInsert.setString(2, password);
                psInsert.setString(3, gender);
                psInsert.setInt(4, height);
                psInsert.setDouble(5, weight);
                psInsert.setDouble(6, dailyIntakeValues[4]);
                psInsert.setDouble(7, dailyIntakeValues[0]);
                psInsert.setDouble(8, dailyIntakeValues[1]);
                psInsert.setDouble(9, dailyIntakeValues[3]);
                psInsert.setDouble(10, dailyIntakeValues[2]);
                psInsert.executeUpdate();

                System.out.println("User successfully created!");
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("User successfully created!");
                alert.show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (psCheckUserExist != null) {
                try {
                    psCheckUserExist.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (psInsert != null) {
                try {
                    psInsert.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /** метод отвечающий за вход пользователя
     * считывает значения введенные пользователем
     * производит валидацию
     * берет из бд данные
     * и отображает на странице
     * */
    public static void logInUser(ActionEvent event, String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/calorie_counter_app", "root", "qwerty1234");
            preparedStatement = connection.prepareStatement("SELECT user_id, user_password, user_weight, user_dt_calories, user_dt_proteins, user_dt_fat, user_dt_fiber, user_dt_carbo FROM users WHERE user_name = ?");
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();

            if (!resultSet.isBeforeFirst()) {
                System.out.println("User not found in database!");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Provided credentials are incorrect!");
                alert.show();
            } else {
                while (resultSet.next()){
                    int retrid = resultSet.getInt("user_id");
                    String retrievedPassword = resultSet.getString("user_password");
                    Double retrievedWeight = resultSet.getDouble("user_weight");
                    Double retr_dt_user_calories = resultSet.getDouble("user_dt_calories");
                    Double retr_user_dt_proteins = resultSet.getDouble("user_dt_proteins");
                    Double retr_user_dt_fat = resultSet.getDouble("user_dt_fat");
                    Double retr_user_dt_fiber = resultSet.getDouble("user_dt_fiber");
                    Double retr_user_dt_carbo = resultSet.getDouble("user_dt_carbo");
                    if (retrievedPassword.equals(password)) {
                        ViewFactory.changeSceneFromLogInToCenterBoard(event, "/fxml/client/right_product_dashboard.fxml", "Calorie Counter", username, retrid, retrievedWeight, retr_dt_user_calories, retr_user_dt_proteins, retr_user_dt_carbo, retr_user_dt_fat, retr_user_dt_fiber);
                    } else {
                        System.out.println("Password did not match!");
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("The provided credentials are incorrect!");
                        alert.show();
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
