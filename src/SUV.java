public class SUV extends Vehicle{
    String type = "SUV";
    double price;
    //Constructor
    public SUV(String make, String model, String color,double price, int year, String type){
        super(make,model,color,year);
        this.type=type;
        this.price=setPrice(price);
    }

    //Abstract method implementation
    @Override
    public double setPrice(double price){
        //applied 10% discount to SUV
        return price*0.9;

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
