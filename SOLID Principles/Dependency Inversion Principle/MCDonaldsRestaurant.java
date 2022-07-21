import java.util.ArrayList;

public class MCDonaldsRestaurant implements AbstractRestaurantListManager{
    public ArrayList<String> restaurantList(ArrayList<String> arrayList){
        arrayList.add("MCDONALDS");
        return arrayList;
    }
}
