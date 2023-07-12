package package5;

import package4.UAV;

public class MAV extends UAV{
	protected String model;
	protected double size;

	public MAV(double weight, double price, String model, double size){
		super(weight, price);
		this.model = model;
		this.size = size;
	}

	public MAV(String model, double size){
		super();
		this.model = model;
		this.size = size;
	}
	
	public MAV(UAV uav, String model, double size){
		this(uav.getWeight(), uav.getPrice(), model, size);
	}
	
	public MAV(MAV mav){
		this(mav.weight, mav.price, mav.model, mav.size);
	}
	
	public MAV() {
		this("", 0.0);
	}
	
	public String getModel() {
		return model;
	}
	
	public double getSize() {
		return size;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		 return "MAV(Micro Air Vehicle) is a kind of " + super.toString() 
				 + " is manufactured by " + model 
				 + ", the size is " + size +"mm.";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o instanceof MAV) {
			MAV m = (MAV) o;
			if(m.model == this.model && m.size == this.size) {
				return true;
			}
		}
		
		return false;
	}
}
