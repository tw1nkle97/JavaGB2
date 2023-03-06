package sem1;

public class TransportVehicle {
    protected int wheelsNumber;
    protected String model;
    protected String color;
    protected float weight;
    protected float maxSpeed;
    protected float currentSpeed;

    public TransportVehicle(String color, String model, int wheelsNumber,  
        float weight, float maxSpeed){

            this.color = color;
            this.model = model;
            this.wheelsNumber = wheelsNumber;
            this.weight = weight;
            this.maxSpeed = maxSpeed;
    }

    public void drive(int speed){
        System.out.println("Модель: " + model + "\nЦвет: "+ color + "\nКоличество колес: "+ wheelsNumber  + "\nМаксимальная скорость: "+ maxSpeed + "\nТекущая скорость: " + speed);
        System.out.println();
    }

}
