package main.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Reader {

    public HashMap<String, Integer> readFromFileToHashMap(String fileName) throws  IOException {
        HashMap<String, Integer> ingredients = new HashMap<>();

        int numCustomers;
        try (BufferedReader br = new BufferedReader(new FileReader("input\\" + fileName))) {
            System.out.println("\n------- START reading from: input/" + fileName);
            numCustomers = Integer.parseInt(br.readLine());

            String line;
            for (int i = 0; i < numCustomers * 2; i++) {
                line = br.readLine();

                String [] ingredientsInput = line.split(" ");
                //Like -> par. Ex; line 2,4,6
                //Dislike -> odd Ex; line 1,3,5
                checkIngredient(ingredients, ingredientsInput, i % 2 == 0);
            }
        }
        return ingredients;
    }


    public String getOnePizza(HashMap<String, Integer> ingredients) {
        int ingredientsCount = 0;
        String ingredientName = "";
        for (String key : ingredients.keySet()) {
            if (ingredients.get(key) > 0) {
                ingredientsCount++;
                ingredientName = ingredientName + " " + key;
            }
        }
        return ingredientsCount + ingredientName;
    }

    private void checkIngredient(HashMap<String, Integer> ingredients, String[] ingredientsInput, boolean like) {
        for (int j = 0; j < ingredientsInput.length; j++) {
            if (j != 0) {
                if (ingredients.containsKey(ingredientsInput[j])) {
                    ingredients.put(ingredientsInput[j], like ? ingredients.get(ingredientsInput[j]) + 1 : ingredients.get(ingredientsInput[j]) - 1);
                } else {
                    ingredients.put(ingredientsInput[j], like ? 1 : 0);
                }
            }
        }
    }
}
