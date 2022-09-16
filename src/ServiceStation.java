public class ServiceStation {
    public void printCheck(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }

    public void check(Car car) {
        printCheck(car);
        car.checkEngine();

    }

    public void check(Bicycle bicycle) {
        printCheck(bicycle);

    }

    public void check(Truck truck) {
        printCheck(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

//        public void check(Car car, Bicycle bicycle, Truck truck) {
//        if (car != null) {
//            System.out.println("Обслуживаем " + car.modelName);
//            for (int i = 0; i < car.wheelsCount; i++) {
//                car.updateTyre();
//            }
//            car.checkEngine();
//        } else if (truck != null) {
//            System.out.println("Обслуживаем " + truck.modelName);
//            for (int i = 0; i < truck.wheelsCount; i++) {
//                truck.updateTyre();
//            }
//            truck.checkEngine();
//            truck.checkTrailer();
//        } else if (bicycle != null) {
//            System.out.println("Обслуживаем " + bicycle.modelName);
//            for (int i = 0; i < bicycle.wheelsCount; i++) {
//                bicycle.updateTyre();
//            }
//        }
//    }


}