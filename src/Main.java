import java.util.*;

public class Main {
    public static void main(String[] args) {
        StandardMessage.welcomeMessage();
        ArrayList<String> restaurantList = new ArrayList<>();
        restaurantList = RestaurantListManager.restaurantList(new ArrayList<String>());

        PrintList.printList(restaurantList);

        int choice = UserInput.choiceInput();

        String restaurantChoice = restaurantList.get(choice);

        StandardMessage.confirmMessage(restaurantChoice);

    }
}
