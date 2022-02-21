import service.Reader;

import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        HashMap<String, Integer> ingredients = reader.getInputFromFile("d_difficult_in.txt");

        int ingredientsCount = 0;
        String ingredientName = "";

        for (String key : ingredients.keySet()){
            if (ingredients.get(key) > 0) {
                ingredientsCount++;
                ingredientName = ingredientName + " " + key;
            }
        }
        System.out.println(ingredientsCount + ingredientName);
    }
}
