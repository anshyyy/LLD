package problems.FoodDelivery.models;

public class MenuItem {

    private int id;
    public String name;
    public String description;
    public double price;
    
    MenuItem(String name,String description,double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
