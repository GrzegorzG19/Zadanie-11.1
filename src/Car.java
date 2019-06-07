public class Car extends Vehicle {
    private boolean airCondition;


    public Car(String name, double capacity, double avrComsumptionPer, boolean airCondition) {
        super(name, capacity, avrComsumptionPer);

        this.setAirCondition(airCondition);

        this.setAvrComsumptionPer(comsum(avrComsumptionPer, airCondition));

    }

    public double comsum(double avrComsumptionPer, boolean airCondition) {
        if (airCondition) {
            avrComsumptionPer += avrComsumptionPer  + 0.8;
        }
        return avrComsumptionPer;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    public boolean isAirCondition() {
        return airCondition;
    }
}
