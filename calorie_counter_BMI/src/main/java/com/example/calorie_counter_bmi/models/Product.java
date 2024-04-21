package com.example.calorie_counter_bmi.models;

public class Product {

    public static Double[] calculateNutrition(Double amount, Double caloriesPer100g,
                                              Double proteinPer100g, Double fatPer100g, Double carbsPer100g, Double fiberPer100g) {
        Double calories = Math.round((amount / 100) * caloriesPer100g * 100.0) / 100.0;
        Double protein =  Math.round((amount / 100) * proteinPer100g * 100.0) / 100.0;
        Double fat =  Math.round((amount / 100) * fatPer100g * 100.0) / 100.0;
        Double carbs =  Math.round((amount / 100) * carbsPer100g * 100.0) / 100.0;
        Double fiber =  Math.round((amount / 100) * fiberPer100g * 100.0) / 100.0;

        return new Double[]{calories, protein, fat, carbs, fiber};
    }

    public static void main(String[] args) {
        Double amount = 150.0; // вес или объем продукта в граммах или миллилитрах
        Double caloriesPer100g = 89.0; // калории на 100 г продукта
        Double proteinPer100g = 1.1; // белки на 100 г продукта
        Double fatPer100g = 0.3; // жиры на 100 г продукта
        Double carbsPer100g = 22.8; // углеводы на 100 г продукта
        Double fiberPer100g = 2.6; // клетчатка на 100 г продукта

        Double[] nutritionValues = calculateNutrition(amount, caloriesPer100g, proteinPer100g, fatPer100g, carbsPer100g, fiberPer100g);

        System.out.println("Употреблено калорий: " + nutritionValues[0]);
        System.out.println("Употреблено белков: " + nutritionValues[1] + " г");
        System.out.println("Употреблено жиров: " + nutritionValues[2] + " г");
        System.out.println("Употреблено углеводов: " + nutritionValues[3] + " г");
        System.out.println("Употреблено клетчатки: " + nutritionValues[4] + " г");
    }

}
