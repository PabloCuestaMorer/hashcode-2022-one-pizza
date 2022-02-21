package main.service;

import java.util.HashMap;

public class Writer {

    private int ingredientsCount = 0;
    private String ingredientName = "";

    public void getOnePizza(HashMap<String, Integer> ingredients) {
        for (String key : ingredients.keySet()) {
            if (ingredients.get(key) > 0) {
                ingredientsCount++;
                ingredientName = ingredientName + " " + key;
            }
        }

    }

}