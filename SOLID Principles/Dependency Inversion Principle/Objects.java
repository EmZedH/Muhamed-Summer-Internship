public class Objects {
    public static AbstractRestaurantListManager createKFCObject(){
        return new KFCRestaurant();
    }
    public static AbstractRestaurantListManager createMCDonaldsObject(){
        return new MCDonaldsRestaurant();
    }
    public static AbstractRestaurantListManager createDominoeObject(){
        return new DominoesRestaurant();
    }
    public static AbstractRestaurantListManager createPizzaHutObject(){
        return new PizzaHutRestaurant();
    }

}
