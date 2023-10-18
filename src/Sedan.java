public class Sedan extends Vehicle{
    String type = "Sedan";
    double price;
    //Constructor
    public Sedan(String make, String model, String color,double price, int year, String type){
        super(make,model,color,year);
        this.type=type;
        this.price=setPrice(price);
    }
    //Abstract method implementation
    @Override
    public double setPrice(double price){

        return price;
    };

    @Override
    public String getType(){
        return type;
    };
    //overloaded toString method to include appropriate price and type information
    @Override
    public String toString(){
        return super.toString() +"\nType: " + getType() + "\nPrice: "+ setPrice(price);
    }
}
