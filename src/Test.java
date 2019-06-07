public class Test {
    public static void main(String[] args) {

        Truck truck = new Truck("cięzarowka", 100, 2, true, 10000);
        Car car = new Car("Volvo", 20, 2, true);
        System.out.println(truck.getName() + " " + truck.getCapacity() + " " + truck.isAirCondition() + " " + truck.getWeight() + " " + truck.getAvrComsumptionPer() + " ");
        System.out.println(car.getName() + " " + car.getCapacity() + " " + car.getAvrComsumptionPer() + " " + car.isAirCondition());

        System.out.println(Method.range(car) + "KM");


        Car[] cars = new Car[4];
        cars[0] = new Car("Sam", 24, 2, false);
        cars[1] = new Car("Porsche", 53, 6, false);
        cars[2] = new Car("Maluch", 64, 3, false);
        cars[3] = new Car("Mitsu", 85, 4, false);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getName() + " " + cars[i].getCapacity() + " " + cars[i].getAvrComsumptionPer() + " " + cars[i].isAirCondition());
            System.out.println(Method.range(cars[i]) + "KM ma zasięg ten pojazd");
        }

        for (int i = 0; i < cars.length; i++) {

            cars[i] = new Car(cars[i].getName(), cars[i].getCapacity(), cars[i].getAvrComsumptionPer(), true);
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getName() + " " + cars[i].getCapacity() + " " + cars[i].getAvrComsumptionPer() + " " + cars[i].isAirCondition());
            System.out.println(Method.range(cars[i]) + "KM ma zasięg ten pojazd");
        }


    }
}
