public class Car extends Vehicle {
    boolean airCondition;


    public Car(String name, double capacity, double avrComsumptionPer, boolean airCondition) {
        super(name, capacity, avrComsumptionPer);

        this.airCondition = airCondition;
        if (airCondition){
            avrComsumptionPer+=0.8;
        }
    }

    public boolean isAirCondition() {
        return airCondition;
    }
}
