package problems.FoodDelivery.managers;

import java.util.ArrayList;

import problems.FoodDelivery.models.Restaurant;

public class RestaurantManager {
    private ArrayList<Restaurant> restaurants;
    static RestaurantManager instance;

    private RestaurantManager() {};

    static RestaurantManager getInstance() {
        if (instance == null) {
            synchronized (RestaurantManager.class) {
                if (instance == null) {
                    instance = new RestaurantManager();
                }
            }
        }
        return instance;
    }

    public void addRestaurant(Restaurant restaurant) {
        try {
            this.restaurants.add(restaurant);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public ArrayList<Restaurant> searchRestaurants(String location) {
            // just mimicing
            ArrayList<Restaurant>resultRestaurants = new ArrayList<Restaurant>();
            for(Restaurant restaurant : this.restaurants){
                if(restaurant.address.equals(location)){
                    resultRestaurants.add(restaurant);
                }
            }
            return resultRestaurants;
    }
}
