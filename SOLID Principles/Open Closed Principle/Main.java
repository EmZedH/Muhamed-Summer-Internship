import java.util.*;

public class Main {
    public static void main(String[] args) {
        StandardMessage.welcomeMessage();
        ArrayList<String> restaurantList = new ArrayList<>();

        KFCRestaurant kfcRestaurant = new KFCRestaurant();
        restaurantList=kfcRestaurant.restaurantList(restaurantList);

        MCDonaldsRestaurant mcDonaldsRestaurant = new MCDonaldsRestaurant();
        restaurantList = mcDonaldsRestaurant.restaurantList(restaurantList);

        DominoesRestaurant dominoesRestaurant = new DominoesRestaurant();
        restaurantList=dominoesRestaurant.restaurantList(restaurantList);

        PizzaHutRestaurant pizzaHutRestaurant = new PizzaHutRestaurant();
        restaurantList=pizzaHutRestaurant.restaurantList(restaurantList);


        PrintList.printList(restaurantList);

        int choice = UserInput.choiceInput();

        String restaurantChoice = restaurantList.get(choice);

        StandardMessage.confirmMessage(restaurantChoice);

    }
}
