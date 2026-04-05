package problems.FoodDelivery.models;

import java.util.ArrayList;

import problems.FoodDelivery.enums.OrderStatus;
import problems.FoodDelivery.enums.OrderType;
import problems.FoodDelivery.strategies.PaymentStrategy;



public class Order {

    private int id;
    public Restaurant restaurant;
    public ArrayList<MenuItem> items;
    public double total;
    private User user;
    public OrderStatus status;
    public OrderType orderType;
    public PaymentStrategy paymentStrategy;

    Order(int id, Restaurant restaurant,User user){
       this.id = id;
       this.restaurant = restaurant;
       this.user = user;
       this.status = OrderStatus.PENDING;
       this.orderType = OrderType.DELIVERY;
    }


    public void processOrder(){
        this.paymentStrategy.pay(this.total);
    };
}
