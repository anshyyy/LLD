package problems.FoodDelivery.models;

import java.util.ArrayList;

public class Cart {

     private int id;
     public double total;
     private ArrayList<MenuItem> items;
     private Restaurant restaurant;

     Cart(){}
     
     Cart(Restaurant restaurant){
        this.restaurant = restaurant;
     }
 
     public void addToCart(MenuItem item){
        this.items.add(item);
        this.total += item.price;
     }

     public void clear(){
        this.items.clear();
     }
}
