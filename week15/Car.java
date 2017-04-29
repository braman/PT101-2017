public abstract class Car {
	public final String color;
	public final int hoursePower;
	public final CarType carType;
	
	public Car(String color, int hoursePower, CarType carType) {
		this.color = color;
		this.hoursePower = hoursePower;
		this.carType = carType;
	}
}
enum CarType {
	SPORT_CAR, SEDAN, SUV;	
}
abstract class SportCar extends Car {
	public final int year;
	public final int cost;
	
	public SportCar(int year, int cost, String color, int hoursePower) {
		super(color, hoursePower, CarType.SPORT_CAR);
		this.year = year;
		this.cost = cost;
	}
	
	public abstract int getMaxSpeed();
}
class Bugatti extends SportCar {
	public Bugatti() {
		//RED, 2017, 1000, 350, 1_000_000
		super(2017, 1_000_000, "RED", 1000);
	}	
	@Override
	public int getMaxSpeed() {
		return 350;
	}
}