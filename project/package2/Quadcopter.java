package package2;



public class Quadcopter extends Helicopter{
	protected int maxFlyingSpeed;
//	For instance, the parameterized constructor of the Quadcopter
//	class must accept 7 parameters to initialize the brand, the price, the horse power, the number of
//	cylinders, the creation year, the passenger capacity, and the maximum flying speed. 
	public Quadcopter(String band, double price, int horsepower, int cylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed){
		super(band, price, horsepower, cylinders, creationYear, passengerCapacity);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}

	public Quadcopter(int maxFlyingSpeed){
		super();
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
//	The copy constructor creates a new object that is an exact copy of the passed object
	public Quadcopter(Quadcopter quadcopter){
		this(quadcopter.band, quadcopter.price, quadcopter.horsepower, 
				quadcopter.cylinders, quadcopter.creationYear, quadcopter.passengerCapacity, 
				quadcopter.maxFlyingSpeed);
	}
//	An object creation using the default constructor must trigger the default constructor of its ancestor 
//	classes, while creation using parameterized constructors must trigger the parameterized constructors 
//	of the ancestors.
	public Quadcopter() {
		this(0);
	}
	
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}
	
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	@Override
	public String toString() {
		 return "Quadcopter is kind of "+super.toString() 
				 + ", the max flying speed is " + maxFlyingSpeed + "km/h.";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o instanceof Quadcopter) {
			Quadcopter q = (Quadcopter) o;
			if(super.equals(q) && q.maxFlyingSpeed == this.maxFlyingSpeed) {
				return true;
			}
		}
		
		return false;
	}
}
