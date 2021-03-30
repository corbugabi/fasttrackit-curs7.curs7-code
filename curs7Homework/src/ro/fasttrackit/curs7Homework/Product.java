package ro.fasttrackit.curs7Homework;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price , int quantity, String category ){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    boolean isCategory(String category){
        if(this.category == category){
            return true;
        }else{
            return false;
        }
    }

    boolean hasStock(){
        if(this.quantity != 0){
            return true;
        }else{
            return false;
        }
    }

    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    int getQuantity(){
        return this.quantity;
    }

    String getCategory(){
        return this.category;
    }
}
