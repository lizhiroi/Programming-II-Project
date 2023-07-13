package package2;

import package1.Airplane;

public class Helicopter extends Airplane {
	protected int cylinders;
	protected int creationYear;
	protected int passengerCapacity;

	public Helicopter(String band, double price, int horsepower, int cylinders, int creationYear, int passengerCapacity){
		super(band, price, horsepower);
		this.cylinders = cylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}

	public Helicopter(int cylinders, int creationYear, int passengerCapacity){
		super();
		this.cylinders = cylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}

	public Helicopter(Helicopter helicopter){
		this(helicopter.band, helicopter.price, helicopter.horsepower, 
				helicopter.cylinders, helicopter.creationYear, helicopter.passengerCapacity);
	}
	
	public Helicopter() {
		this(0,0,0);
	}
	
	public int getCylinders() {
		return cylinders;
	}
	
	public int getCcreationYear() {
		return creationYear;
	}
	
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	
	public void setCcreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
	
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	@Override
	public String toString() {
		 return "Helicopter is a kind of " + super.toString()
				 + ", it has "+ cylinders + " cylinders" 
				 + ", the creation year is " + creationYear 
				 + ", it can carry " + passengerCapacity+" passenger(s)";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o instanceof Helicopter) {
			Helicopter h = (Helicopter) o;
			if(super.equals(h) && h.cylinders == this.cylinders && h.creationYear == this.creationYear && h.passengerCapacity == this.passengerCapacity ) {
				return true;
			}
		}
		
		return false;
	}
}
