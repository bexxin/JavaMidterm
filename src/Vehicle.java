public abstract class Vehicle {
    //Variables
    private String make;
    private String model;
    private String color;
    //Note: assignment instructions somewhat ambiguous, I moved price attribute to sedan/suv class
    // to be initialized there
    //was unable to find solution to setting this attribute without changing it to protected
    //or using a setPrice
    private int year;
    //Constructor
    public Vehicle(String make, String model, String color, int year){
        this.make=make;
        this.model=model;
        this.color=color;
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

    //methods
    @Override
    public String toString(){
        return String.format("----Vehicle Information----\nMake:%s\nModel:%s\nColor:%s\nYear:%d",getMake(), getModel(),getColor(),getYear());
    }
    public abstract double setPrice(double price);

    public abstract String getType();


}
