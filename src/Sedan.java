public class Sedan extends Vehicle{
    String type = "Sedan";
    //Constructor
    public Sedan(String make, String model, String color,double price, int year, String type){
        super(make,model,color,price,year);
        this.type=type;
    }
}
