public class EnergyBill {
    // Create attributes
    private String customerName;
    private String customerAddress;
    private double electricityUsageKWh;
    private double gasUsageUnit;

    // Constants for the rates
    private static final double ELECTRICITY_RATE = 0.122;
    private static final double GAS_RATE = 0.04;

    // Constructor for each attribute
    public EnergyBill(String customerName, String customerAddress, double electricityUsageKWh, double gasUsage) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.electricityUsageKWh = electricityUsageKWh;
        this.gasUsageUnit = gasUsage;
    }

    // Getter for the customerName field
    public String getCustomerName() {
        return customerName;
    }

    // Getter for the customerAddress field
    public String getCustomerAddress() {
        return customerAddress;
    }

    // Calculate the total charge for the electricity usage
    public double calculateElectricityCharge() {
        double electricityCharge = this.electricityUsageKWh * ELECTRICITY_RATE;
        return electricityCharge;
    }

    // Calculate the total charge for the gas usage
    public double calculateGasCharge() {
        double gasCharge = this.gasUsageUnit * GAS_RATE;
        return gasCharge;
    }

    // Calculate the total charge (electricity + gas)
    public double calculateTotalCharge() {
        return calculateElectricityCharge() + calculateGasCharge();
    }
    

    // Print the electricity charge
    public void printElectricityCharge() {
        double electricityCharge = calculateElectricityCharge();
        System.out.println("Electricity charge: $" + electricityCharge);
    }

    // Print the gas charge
    public void printGasCharge() {
        double gasCharge = calculateGasCharge();
        System.out.println("Gas charge: $" + gasCharge);
    }

    // Print the total charge
    public void printTotalCharge() {
        double totalCharge = calculateElectricityCharge() + calculateGasCharge();
        System.out.println("Total payment: $" + totalCharge);
        System.out.println("* Would you be interested in installing solar panels to receive a monthly $15 deduction and contribute to saving the planet? For further infomation, please contact Lisa at 'phone:111-222-3333' or 'email:lisa@toronto.gas-electric.com'.");
    }
}
