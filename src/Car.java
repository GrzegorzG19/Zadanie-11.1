public class Car extends Vehicle {
    boolean airCondition;


    public Car(String name, double capacity, double avrComsumptionPer, boolean airCondition) {
        super(name, capacity, avrComsumptionPer);

        this.airCondition = airCondition;

            this.avrComsumptionPer = comsum(avrComsumptionPer, airCondition);

    }
    public double comsum(double avrComsumptionPer, boolean airCondition){
        if (airCondition) {
            avrComsumptionPer += avrComsumptionPer * 0.8;
        }
        return avrComsumptionPer;
    }

}
