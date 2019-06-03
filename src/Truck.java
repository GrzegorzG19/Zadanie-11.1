public class Truck extends Car {
    double weight;

    public Truck(String name, double capacity, double avrComsumptionPer, boolean airCondition, double weight) {
        super(name, capacity, avrComsumptionPer, airCondition);
        this.weight = weight;
        if (airCondition){
            avrComsumptionPer+=1.6;
        }
        avrComsumptionPer+= 0.5 * (weight/100);
    }
}
