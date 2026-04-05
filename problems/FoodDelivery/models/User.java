package problems.FoodDelivery.models;

public class User {
    
    int id;
    public String fullName;
    private String address;
    Cart cart;

    User(int id,String name, String address){
        this.id = id;
        this.fullName = name;
        this.address = address;
        this.cart = new Cart();
    }


}
