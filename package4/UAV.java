package package4;

import package1.Airplane;

//----------------------------------------------------
//Project
//Project A Part 1
//Written by : Linlin Xie 2343895, Qingjun Bao 2398022, Zhi Li 0645750, 
//----------------------------------------------------


public class UAV extends Airplane {
	protected double weight;
	protected double price;

	public UAV(double weight, double price){
		this.weight = weight;
		this.price = price;
	}

	public UAV(UAV uav){
		this(uav.weight, uav.price);
	}
	
	public UAV() {
		this(0.0, 0.0);
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		 return "UAV(Unmanned aerial vehicle / Drone), it weighs " + weight + " pounds"
				 + ", the price is " + String.format("%.2f",price)+"$";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o instanceof UAV) {
			UAV u = (UAV) o;
			if(u.weight == this.weight && u.price == this.price) {
				return true;
			}
		}
		
		return false;
	}
}
