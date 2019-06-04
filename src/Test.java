public class Test {
    public static void main(String[] args) {

        Truck truck = new Truck("cięzarowka", 100, 2, true, 10000);
        Car car = new Car("Volvo", 20, 2, true);
        System.out.println(truck.name + " " + truck.capacity + " " + truck.airCondition + " " + truck.weight + " " + truck.avrComsumptionPer + " ");
        System.out.println(car.name + " " + car.capacity + " " + car.avrComsumptionPer + " " + car.airCondition);

        System.out.println(Method.range(car.capacity,car.avrComsumptionPer) + "KM");



        Car[] cars = new Car[4];
        cars[0] = new Car("Sam", 24, 2, false);
        cars[1] = new Car("Porsche", 53, 6, false);
        cars[2] = new Car("Maluch", 64, 3, false);
        cars[3] = new Car("Mitsu", 85, 4, false);

        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i].name + " " + cars[i].capacity + " " + cars[i].avrComsumptionPer + " " + cars[i].airCondition);
            System.out.println(Method.range(cars[i].capacity,cars[i].avrComsumptionPer) + "KM ma zasięg ten pojazd");
        }

        for (int i = 0; i <cars.length ; i++) {
            cars[i].airCondition = true;
            cars[i] = new Car(cars[i].name, cars[i].capacity, cars[i].avrComsumptionPer,cars[i].airCondition);
        }
        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i].name + " " + cars[i].capacity + " " + cars[i].avrComsumptionPer + " " + cars[i].airCondition);
            System.out.println(Method.range(cars[i].capacity,cars[i].avrComsumptionPer) + "KM ma zasięg ten pojazd");
        }



    }
}
