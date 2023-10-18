import javax.swing.JOptionPane;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //array list to store vehicles
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        //loop to create multiple vehicles and store in the arraylist.
        while(true) {
            //Get attribute information from user.

            String type = JOptionPane.showInputDialog("Is this for an SUV or a Sedan(please enter SUV or SED)?:");
            String make = JOptionPane.showInputDialog("Please enter make:");
            String model = JOptionPane.showInputDialog("Please enter model:");
            String color = JOptionPane.showInputDialog("Please enter color:");
            int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year:"));
            double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price:"));
            //Create vehicle object based on user input
            Vehicle vehicle;
            //call appropriate constructor based on type input
            if (type.equalsIgnoreCase("SUV")) {
                vehicle = new SUV(make, model, color, price, year, type);
            } else if (type.equalsIgnoreCase("SED")) {
                vehicle = new Sedan(make, model, color, price, year, type);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid vehicle type.");
                continue;
            }
            //Add vehicles to a list
            vehicles.add(vehicle);
            //Create another vehicle?
            int choice = JOptionPane.showConfirmDialog(null,"Do you want to create another vehicle?");
            if(choice!=JOptionPane.YES_OPTION){
                break;}
        }

        //Display the vehicle information.
        for (Vehicle vehicle : vehicles) {
            String vehicleInfo = vehicle.toString();
            JOptionPane.showMessageDialog(null,vehicleInfo);
        }
    }
}