package models;

import java.util.List;

/**
 * @author Pablo Cuesta Morer
 */
public class Customer {
    private List<String> likedIngredients;
    private List<String> dislikedIngredients;

    public Customer(List<String> likedIngredients, List<String> dislikedIngredients) {
        this.likedIngredients = likedIngredients;
        this.dislikedIngredients = dislikedIngredients;
    }

    public List<String> getLikedIngredients() {
        return likedIngredients;
    }

    public List<String> getDislikedIngredients() {
        return dislikedIngredients;
    }

    @Override
    public String toString() {
        return "Customer{" + "likedIngredients=" + likedIngredients + ", dislikedIngredients=" + dislikedIngredients + '}';
    }
}
