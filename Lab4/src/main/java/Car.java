public class Car {

    private int yearModel;
    private String make;
    private int speed;

    public Car(int year, String makeOfTheCar) {
        yearModel = year;
        make = makeOfTheCar;
        speed = 0;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        //add 5 to  the speed field each time its called
        if (speed != 130)
            speed = speed + 5;
    }

    public void Brake() {
        //subtract 5 from the speed field each time it is called
        if (speed != 0)
            speed = speed - 5;
    }

}
