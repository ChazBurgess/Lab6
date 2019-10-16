
public class Car {

    private int yearModel;
    private String make;
    private int speed;

    public static void main(String[] args) {
        Car car1 = new Car(2006, "Toyota");
		for (int i = 1; i <= 5; i++)
		{
			car1.accelerate();
			System.out.println("The current speed is: " + car1.getSpeed());
		}
		for (int i = 1; i <= 5; i++)
		{
			car1.Brake();
			System.out.println("The current speed is: " + car1.getSpeed());
		}		
    }

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
        // make a top speed, dont exceed even though it wont reach it 
        if (speed != 130) {
            speed = speed + 5;
        }
    }

    public void Brake() {
        //subtract 5 from the speed field each time it is called
        //lowest speed of 0, dont go below
        if (speed != 0) {
            speed = speed - 5;
        }
    }

}
