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
    //getter & setters

    public String getMake() {
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //method
    public String toString(){
        return String.format("----Vehicle Information----\nMake:%s\nModel:%s\nColor:%s\nPrice:%4.2f\nYear:%d",make, model,color, price,year);
    }

}
