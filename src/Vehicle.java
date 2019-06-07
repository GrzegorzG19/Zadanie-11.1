public class Vehicle {
   private String name;
   private double capacity;
   private double avrComsumptionPer;

    public Vehicle(String name, double capacity, double avrComsumptionPer) {
        this.name = name;
        this.capacity = capacity;
        this.avrComsumptionPer = avrComsumptionPer;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAvrComsumptionPer() {
        return avrComsumptionPer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setAvrComsumptionPer(double avrComsumptionPer) {
        this.avrComsumptionPer = avrComsumptionPer;
    }
}
