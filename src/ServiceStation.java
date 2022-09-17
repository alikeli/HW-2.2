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


}