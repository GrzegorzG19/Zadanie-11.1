public class Test {
    public static void main(String[] args) {

        Truck truck = new Truck("cięzarowka", 100, 3, true, 10000);
        Car car = new Car("Volvo", 20, 2, true);
        System.out.println(truck.name + " " + truck.capacity + " " + truck.airCondition + " " + truck.weight + " " + truck.avrComsumptionPer + " ");
        System.out.println(car.name + " " + car.capacity + " " + car.avrComsumptionPer + " " + car.airCondition);

        System.out.println(Method.range(car.capacity,car.avrComsumptionPer) + "KM");
    }
}
