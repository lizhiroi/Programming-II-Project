package package1;
//----------------------------------------------------
//Project
//Project A Part 1
//Written by : Linlin Xie 2343895, Qingjun Bao 2398022, Zhi Li 0645750, 
//----------------------------------------------------

public class Airplane {
	protected String band;
	protected double price;
	protected int horsepower;

	public Airplane(String band, double price, int horsepower){
		this.band = band;
		this.price = price;
		this.horsepower = horsepower;
	}

	public Airplane(Airplane airplane){
		this(airplane.band, airplane.price, airplane.horsepower);
	}
	
	public Airplane() {
		this("", 0.0, 0);
	}
	
	public String getBand() {
		return band;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getHorsepower() {
		return horsepower;
	}
	
	public void setBand(String band) {
		this.band = band;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	@Override
	public String toString() {
		 return "Airplane, it is manufactured by "+ band 
				 + ", the price is " + String.format("%.2f",price) + "$"
				 + ", horsepower is " + horsepower+"hp";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(o instanceof Airplane) {
			Airplane a = (Airplane) o;
			if(a.band == this.band && a.price == this.price && a.horsepower == this.horsepower ) {
				return true;
			}
		}
		
		return false;
	}
}
