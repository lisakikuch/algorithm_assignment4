import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // prompt user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, valued customer! This is Lisa, your virtual assistant from Toronto Gas-Electric System Limited.");
        System.out.println("To calculate your monthly bill, please enter your name.");
        String customerName = scanner.nextLine();
        System.out.println("Please enter your address.");
        String customerAddress = scanner.nextLine();
        System.out.println("Please enter your monthly electricity usage in kWh.");
        double electricityUsageKWh = scanner.nextDouble();
        System.out.println("Please enter your monthly gas usage in unit.");
        double gasUsageUnit = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Have you installed solar panels? Please input 'true' or 'false'.");
        boolean hasSolarPanels = scanner.nextBoolean();

        // Declare a variable for the EnergyBill type to hold the instance
        EnergyBill myEnergyBill;
        // If the user input 'true' for the solar panel usage, an instance of the GreenEnergyBill subclass is created
        if (hasSolarPanels) {
            myEnergyBill = new GreenEnergyBill(customerName, customerAddress, electricityUsageKWh, gasUsageUnit);
            ((GreenEnergyBill) myEnergyBill).setHasSolarPanels(hasSolarPanels);
        // Otherwise, create an instance of the EnergyBill class
        } else {
            myEnergyBill = new EnergyBill(customerName, customerAddress, electricityUsageKWh, gasUsageUnit);
        }

        // Print the output
        System.out.println("Thank you for your input " + myEnergyBill.getCustomerName() + ", at " + myEnergyBill.getCustomerAddress() + ".");
        System.out.println("Your monthly payment is as follows:");
        myEnergyBill.printElectricityCharge();
        myEnergyBill.printGasCharge();
        myEnergyBill.printTotalCharge();
        System.out.println("Thank you for choosing to stay with us.");
        scanner.close();
    }
}
