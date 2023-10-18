public class SUV extends Vehicle{
    String type = "SUV";
    //Constructor
    public SUV(String make, String model, String color,double price, int year, String type){
        super(make,model,color,price,year);
        this.type=type;
    }

}
