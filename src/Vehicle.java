public abstract class Vehicle {
    //Variables
    private String make;
    private String model;
    private String color;
    private double price;
    private int year;
    //Constructor
    public Vehicle(String make, String model, String color,double price, int year){
        this.make=make;
        this.model=model;
        this.color=color;
        this.price=price;
        this.year=year;

    }
    //method
    public String toString(){
        return String.format("----Vehicle Information----\nMake:%s\nModel:%s\nColor:%s\nPrice:%4.2f\nYear:%d",make, model,color, price,year);
    }

}
