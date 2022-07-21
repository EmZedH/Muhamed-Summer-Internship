import java.util.*;

public class Main {
    public static void main(String[] args) {
        StandardMessage.welcomeMessage();
        ArrayList<String> restaurantList = new ArrayList<>();

        AbstractRestaurantListManager kfcRestaurant = Objects.createKFCObject();
        restaurantList=kfcRestaurant.restaurantList(restaurantList);

        AbstractRestaurantListManager mcDonaldsRestaurant = Objects.createMCDonaldsObject();
        restaurantList = mcDonaldsRestaurant.restaurantList(restaurantList);

        AbstractRestaurantListManager dominoesRestaurant = Objects.createDominoeObject()    ;
        restaurantList=dominoesRestaurant.restaurantList(restaurantList);

        AbstractRestaurantListManager pizzaHutRestaurant = Objects.createPizzaHutObject();
        restaurantList=pizzaHutRestaurant.restaurantList(restaurantList);


        PrintList.printList(restaurantList);

        int choice = UserInput.choiceInput();

        String restaurantChoice = restaurantList.get(choice);

        StandardMessage.confirmMessage(restaurantChoice);

    }
}
