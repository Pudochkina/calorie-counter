package com.example.calorie_counter_bmi.models;

public class Product {



    public static double[] calculateNutrition(String productName, double amount, double caloriesPer100g,
                                              double proteinPer100g, double fatPer100g, double carbsPer100g, double fiberPer100g) {
        double calories = Math.round((amount / 100) * caloriesPer100g * 100.0) / 100.0;
        double protein =  Math.round((amount / 100) * proteinPer100g * 100.0) / 100.0;
        double fat =  Math.round((amount / 100) * fatPer100g * 100.0) / 100.0;
        double carbs =  Math.round((amount / 100) * carbsPer100g * 100.0) / 100.0;
        double fiber =  Math.round((amount / 100) * fiberPer100g * 100.0) / 100.0;

        return new double[]{calories, protein, fat, carbs, fiber};
    }

    public static void main(String[] args) {
        String productName = "Banana";
        double amount = 150; // вес или объем продукта в граммах или миллилитрах
        double caloriesPer100g = 89; // калории на 100 г продукта
        double proteinPer100g = 1.1; // белки на 100 г продукта
        double fatPer100g = 0.3; // жиры на 100 г продукта
        double carbsPer100g = 22.8; // углеводы на 100 г продукта
        double fiberPer100g = 2.6; // клетчатка на 100 г продукта

        double[] nutritionValues = calculateNutrition(productName, amount, caloriesPer100g, proteinPer100g, fatPer100g, carbsPer100g, fiberPer100g);

        System.out.println("Употреблено калорий: " + nutritionValues[0]);
        System.out.println("Употреблено белков: " + nutritionValues[1] + " г");
        System.out.println("Употреблено жиров: " + nutritionValues[2] + " г");
        System.out.println("Употреблено углеводов: " + nutritionValues[3] + " г");
        System.out.println("Употреблено клетчатки: " + nutritionValues[4] + " г");
    }

}
