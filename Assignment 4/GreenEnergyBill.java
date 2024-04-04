// Deifine a subclass (Green Energy Bill) that inherites the attributes and methods from the superclass (Energy Bill)
public class GreenEnergyBill extends EnergyBill {
    
    // Create an attribute that only exists in the subclass
    private boolean hasSolarPanels;
    
    // Constructor 
    public GreenEnergyBill(String customerName, String customerAddress, double electricityUsageKWh, double gasUsageUnits) {
        super(customerName, customerAddress, electricityUsageKWh, gasUsageUnits);
    }    

    // Setter for the hasSolarPanels field
    public void setHasSolarPanels(boolean hasSolarPanels) {
        this.hasSolarPanels = hasSolarPanels;
    }

    // Getter for the hasSolarPanels field
    public boolean getHasSolarPanels() {
        return hasSolarPanels;
    }

    // Override the method calculating the total charge from the superclass
    // Deduct $15, if the user has solar panels
    @Override
    public double calculateTotalCharge() {
        double totalCharge = super.calculateTotalCharge();
        if(hasSolarPanels) {
            totalCharge -= 15;
        }
        return totalCharge;
    }

    // Override the method printing the total charge from the superclass
    // A message informing the deduction is added
    @Override
    public void printTotalCharge() {
        double totalCharge = calculateTotalCharge(); 
        System.out.println("Total payment:$" + totalCharge);
        System.out.println("* You have earned a $15 deduction for the green energy contribution. Your contribution has saved the planet.");
    }
    
    }