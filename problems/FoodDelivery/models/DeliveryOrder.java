package problems.FoodDelivery.models;

public class DeliveryOrder extends Order {
    private String userAddress;

    DeliveryOrder(String userAddString){
        this.userAddress = userAddString;
    }

}
