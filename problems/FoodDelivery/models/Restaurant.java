package problems.FoodDelivery.models;

import java.util.ArrayList;

public class Restaurant {
    private int id;
    public String name;
    public String address;
    private ArrayList<MenuItem>menu;

    Restaurant( String name, String address, ArrayList<MenuItem>menu ){
        this.address = address;
        this.menu = menu;
        this.menu = menu;
    }
}
