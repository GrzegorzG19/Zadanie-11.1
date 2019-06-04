public class Truck extends Car {
    double weight;

    public Truck(String name, double capacity, double avrComsumptionPer, boolean airCondition, double weight) {
        super(name, capacity, avrComsumptionPer, airCondition);
        this.weight = weight;
        this.avrComsumptionPer = comsum(avrComsumptionPer,airCondition);

    }

    @Override
    public double comsum(double avrComsumptionPer, boolean airCondition) {
        if (airCondition) {
            avrComsumptionPer += (avrComsumptionPer * 1.6) + (0.5 * (weight / 100));
        }
        else
        {
            avrComsumptionPer += (0.5 * (weight / 100));
        }

        return avrComsumptionPer;
    }
}
