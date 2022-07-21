import java.util.ArrayList;

public class PizzaHutRestaurant implements AbstractRestaurantListManager{
    public ArrayList<String> restaurantList(ArrayList<String> arrayList){
        arrayList.add("PIZZA HUT");
        return arrayList;
    }
}
