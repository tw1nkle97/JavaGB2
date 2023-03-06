package seminars.sem1;

public class Program {
    public static void main(String[] args) {
        PassangerCar car = new PassangerCar("Red", "Ferrari", (float)1.5, (float)250);
        Truck truck = new Truck("Blue", "Camaz", (float)10, (float)100);
        Bicycle bicycle = new Bicycle("Yellow", "STELS", (float)10, (float)100);
        Bike bike = new Bike("White", "Ducatti", (float) 500, (float)250);
        car.drive(50);
        truck.drive(30);
        bicycle.drive(10);
        bike.drive(100);

    }
}
