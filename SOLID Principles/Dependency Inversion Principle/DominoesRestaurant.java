import java.util.ArrayList;

public class DominoesRestaurant implements AbstractRestaurantListManager {
    public ArrayList<String> restaurantList(ArrayList<String> arrayList){
        arrayList.add("DOMINOES");
        return arrayList;
    }
}

