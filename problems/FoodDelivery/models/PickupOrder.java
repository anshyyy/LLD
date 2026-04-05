package problems.FoodDelivery.models;

public class PickupOrder extends Order {
    private String resturantAddress;

    PickupOrder(String address, Restaurant restaurant, User user,int id){
        super(id, restaurant, user);
        this.resturantAddress = address;
    }    
}
