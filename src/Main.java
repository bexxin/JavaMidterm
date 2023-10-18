import javax.swing.JOptionPane;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Get attribute information from user.
        String type= JOptionPane.showInputDialog("Is this for an SUV or a Sedan(please enter SUV or SED)?:");
        String make= JOptionPane.showInputDialog("Please enter make:");
        String model= JOptionPane.showInputDialog("Please enter model:");
        String color= JOptionPane.showInputDialog("Please enter color:");
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year:"));
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price:"));
        //Create vehicle object based on user input
        Vehicle vehicle=null;

        if(type.equalsIgnoreCase("SUV")){
            vehicle = new SUV(make,model,color,price,year,type);
        } else if (type.equalsIgnoreCase("SED")) {
            vehicle = new Sedan(make,model,color,price,year,type);
        }else{
            JOptionPane.showMessageDialog(null,"Invalid vehicle type.");
        }
        //Display the vehicle information.
        assert vehicle != null;
        String vehicleInfo = vehicle.toString();
        JOptionPane.showMessageDialog(null,vehicleInfo);


    }
}