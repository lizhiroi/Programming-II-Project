package package5;

import package4.UAV;

//----------------------------------------------------
//Project
//Project A Part 1
//Written by : Linlin Xie 2343895, Qingjun Bao 2398022, Zhi Li 0645750, 
//----------------------------------------------------


public class AgriculturalDrone extends UAV{
	protected String brand;
	protected int carryCapacity;

	public AgriculturalDrone(double weight, double price, String brand, int carryCapacity){
		super(weight, price);
		this.brand = brand;
		this.carryCapacity = carryCapacity;
	}

	public AgriculturalDrone(String brand, int carryCapacity){
		super();
		this.brand = brand;
		this.carryCapacity = carryCapacity;
	}
	
	public AgriculturalDrone(AgriculturalDrone ad){
		this(ad.weight, ad.price, ad.brand, ad.carryCapacity);
	}
	
	public AgriculturalDrone() {
		this("", 0);
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getCarryCapacity() {
		return carryCapacity;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	
	@Override
	public String toString() {
		 return "AgriculturalDrone is a kind of " + super.toString() 
				 + " is manufactured by "+ brand 
				 + ", it can carry up to " + carryCapacity+" kg.";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o instanceof AgriculturalDrone) {
			AgriculturalDrone a = (AgriculturalDrone) o;
			if(a.brand == this.brand && a.carryCapacity == this.carryCapacity) {
				return true;
			}
		}
		
		return false;
	}
}
