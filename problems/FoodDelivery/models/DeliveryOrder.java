package problems.FoodDelivery.models;

public class DeliveryOrder extends Order {
    private String userAddress;

    DeliveryOrder(String userAddString, Restaurant restaurant, User user,int id){
        super(id, restaurant, user);
        this.userAddress = userAddString;
    }
    
}
