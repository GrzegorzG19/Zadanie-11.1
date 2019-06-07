public class Method {
    public static double range(Vehicle vehicle) {
        double rangeKM = vehicle.getCapacity() / vehicle.getAvrComsumptionPer();
        return rangeKM;
    }
}
