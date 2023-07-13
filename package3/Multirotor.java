package package3;

import package2.Helicopter;

//----------------------------------------------------
//Project
//Project A Part 1
//Written by : Linlin Xie 2343895, Qingjun Bao 2398022, Zhi Li 0645750, 
//----------------------------------------------------

public class Multirotor extends Helicopter{
	protected int rotorsNumber;

	public Multirotor(String band, double price, int horsepower, int cylinders, int creationYear, int passengerCapacity, int rotorsNumber){
		super(band, price, horsepower, cylinders, creationYear, passengerCapacity);
		this.rotorsNumber = rotorsNumber;
	}

	public Multirotor(int rotorsNumber){
		super();
		this.rotorsNumber = rotorsNumber;
	}
	
	public Multirotor(Multirotor multirotor){
		this(multirotor.band, multirotor.price, multirotor.horsepower, 
				multirotor.cylinders, multirotor.creationYear, multirotor.passengerCapacity, 
				multirotor.rotorsNumber);
	}
	
	public Multirotor() {
		this(0);
	}
	
	public int getRotorsNumber() {
		return rotorsNumber;
	}
	
	public void setRotorsNumber(int rotorsNumber) {
		this.rotorsNumber = rotorsNumber;
	}
	
	@Override
	public String toString() {
		 return "Multirotor is kind of " + super.toString()
				 + ", has "+ rotorsNumber + " rotors.";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o instanceof Multirotor) {
			Multirotor q = (Multirotor) o;
			if(super.equals(q) && q.rotorsNumber == this.rotorsNumber) {
				return true;
			}
		}
		
		return false;
	}
}
