package package1;

import package2.Helicopter;
import package2.Quadcopter;
import package3.Multirotor;
import package4.UAV;
import package5.AgriculturalDrone;
import package5.MAV;

public class driver {
	public static void findLeastAndMostExpensiveUAV(Object[] obj) {
			if(!(obj[0] instanceof UAV)) {
				System.out.println("This flying object is not a UAV.");
			} else {
				if(obj.length==1) {
					UAV uav = (UAV) obj[0];
					System.out.println("The UAV array has only 1 UAV, the Least and Most Expensive UAV is $" 
									+ String.format("%.2f",uav.getPrice())+"$");
				} else {
					double leastPrice=-1;
					double mostPrice=-1;
					double price;
					int leastPriceNum=0;
					int mostPriceNum=0;
					int count = 0;
					
					for(Object o : obj) {
						UAV uav = (UAV) o;
						count++;
						price = uav.getPrice();
						if(leastPrice==-1 || leastPrice>price) {
							leastPrice = price;
							leastPriceNum = count;
						}
						if(mostPrice==-1 || mostPrice<price) {
							mostPrice = price;
							mostPriceNum = count;
						}
					}
					System.out.println("The Least Expensive UAV is No."+leastPriceNum+" costs $"	+ String.format("%.2f", leastPrice));
					System.out.println("The Most Expensive UAV is No."+mostPriceNum+" costs $" + String.format("%.2f", mostPrice));
				}
			}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    - An Airplane class, which has the following attributes: a brand (String type), price (double type) 
//			and horsepower (int type).
//	    - A Helicopter is an Airplane that additionally has the following: a number of cylinders (int type), 
//			a creation year(int type), and a passenger capacity (int type).
//	    - A Quadcopter, is a Helicopter that additionally has the following: max flying speed (int type), 
//			which indicates its maximum moving speed.
//	    - A Multirotor is a Helicopter that additionally has the following: number of rotors (int type), 
//			which indicates its number of rotors/blades that it has.
//	    - A UAV (Unmanned aerial vehicle / Drone) class has the following attributes: weight (double type), 
//			and price (double type).
//	    - An AgriculturalDrone (which is used for crop production) is UAV that additionally has the following: 
//			brand(Sting type), and carry capacity (int type).
//	    - A MAV (Micro Air Vehicle), is a miniature UAV that has a size restriction (and can be as small as 
//			few centimeters. It has the following: model (String type) and size (double type)
//	    		
//		Create at least 15 objects from the 7 classes, and display their information 
//		(you must take advantage of the toString() method)
		
//		public Airplane(String band, double price, int horsepower)
		Airplane airplane1=new Airplane("AAC", 12000000, 100000);
		System.out.println(airplane1);
		
//		public Helicopter(String band, double price, int horsepower, int cylinders, int creationYear, int passengerCapacity)
		Helicopter helicopter1=new Helicopter("Bell Textron", 500000, 20000, 12, 2016, 4);
		System.out.println(helicopter1);
		
//		Quadcopter(String band, double price, int horsepower, int cylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed)
		Quadcopter quadcopter1=new Quadcopter("APEX", 8000, 500, 4, 2020, 1, 200);
		System.out.println(quadcopter1);
		
//		public Multirotor(String band, double price, int horsepower, int cylinders, int creationYear, int passengerCapacity, int rotorsNumber)
		Multirotor multirotor1=new Multirotor("DEERC", 350, 50, 4, 2018, 1, 4);
		System.out.println(multirotor1);
		
		Multirotor multirotor2=new Multirotor("DJI", 550, 60, 6, 2022, 0, 6);
		System.out.println(multirotor1);
		
//		public UAV(double weight, double price)
		UAV uav1=new UAV(33, 250);
		System.out.println(uav1);
		
//		public AgriculturalDrone(double weight, double price, String brand, int carryCapacity)
		AgriculturalDrone agriculturalDrone1=new AgriculturalDrone(55, 3600, "MeasurDrone", 60);
		System.out.println(agriculturalDrone1);
		
//		public MAV(double weight, double price, String model, double size)
		MAV mav1=new MAV(55, 3600, "MavTech Q4T", 860);
		System.out.println(mav1);
		
		
		
		
//		Test the equality of some of the created objects using the equals() method. You should test at least
//		the equality of two objects from different classes, two objects from the same class with different
//		values and two objects with similar values. In other words, you should include enough test cases to
//		test your implementation.
		
		
//		Create 2 arrays, each of 15 to 20 of these flying objects and fill these arrays with various objects
//		from these classes. The first array must include at least one object from each of the classes; while
//		the second array should not have any UAV objects.
		
//		 Finally call the findLeastAndMostExpensiveUAV() once with the first array as a parameter and
//		 once with the second array. This should display what is needed!
		
	}

}
