package package1;

import package2.Helicopter;
import package2.Quadcopter;
import package3.Multirotor;
import package4.UAV;
import package5.AgriculturalDrone;
import package5.MAV;

public class driver {
	
	public static void findLeastAndMostExpensiveUAV(Object[] object) {
		double leastPrice=-1;
		double mostPrice=-1;
		double price=0;
		int leastPriceNum=0;
		int mostPriceNum=0;
		
		int count = 0;
		int uavNum = 0;

		for(Object o : object) {
			if(o instanceof UAV || o instanceof AgriculturalDrone || o instanceof MAV) {
				uavNum++;
				price = ((UAV) o).getPrice();
				if(uavNum==1) {
					leastPrice = price;
					mostPrice = price;
					leastPriceNum = count;
					mostPriceNum = count;
				}
				
				if(price<leastPrice) {
					leastPrice = price;
					leastPriceNum = count;
				}
				if(price>mostPrice) {
					mostPrice = price;
					mostPriceNum = count;
				}
			}
			count++;
		}
		
		if(uavNum==0) {
			System.out.println("There is NO any UAV flying object in this array.");
		} else if(uavNum==1) {
			System.out.println("The only UAV flying object is a(n) " + object[0].getClass() + ", its price is $"
						+ String.format("%.2f", price));
		} else {
			System.out.println("The Least Expensive UAV is a(n) " + objName(object[leastPriceNum]) + ", the price is $"
					+ String.format("%.2f", leastPrice));
			System.out.println("The  Most Expensive UAV is a(n) " + objName(object[mostPriceNum]) + ", the price is $"
					+ String.format("%.2f", mostPrice));
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
		System.out.println(multirotor2);

		Multirotor multirotor3=new Multirotor("DJI", 550, 60, 6, 2022, 0, 6);
		System.out.println(multirotor3);
		
		Multirotor multirotor4=new Multirotor(multirotor3);
		System.out.println(multirotor3);
		
		System.out.println("\nInitializing UAV flying objects...\n");

//		public UAV(double weight, double price)
		UAV uav1=new UAV(33, 250);
		System.out.println(uav1);
		
		UAV uav2=new UAV(44, 360);
		System.out.println(uav2);
		
		UAV uav3=new UAV(55, 480);
		System.out.println(uav3);
		
//		public AgriculturalDrone(double weight, double price, String brand, int carryCapacity)
		AgriculturalDrone agriculturalDrone1=new AgriculturalDrone(55, 3600, "MeasurDrone", 60);
		System.out.println(agriculturalDrone1);

		AgriculturalDrone agriculturalDrone2=new AgriculturalDrone(55, 3700, "MeasurDrone", 60);
		System.out.println(agriculturalDrone2);
		
		AgriculturalDrone agriculturalDrone3=new AgriculturalDrone(agriculturalDrone1);
		System.out.println(agriculturalDrone3);
		
//		public MAV(double weight, double price, String model, double size)
		MAV mav1=new MAV(55, 150, "MavTech Q4T", 860);
		System.out.println(mav1);
		
		MAV mav2=new MAV(33, 250, "Honeywell", 550);
		System.out.println(mav2);

		MAV mav3=new MAV(uav2, "Honeywell", 550);
		System.out.println(mav3);
		
//		Test the equality of some of the created objects using the equals() method. You should test at least
//		the equality of two objects from different classes, two objects from the same class with different
//		values and two objects with similar values. In other words, you should include enough test cases to
//		test your implementation.
		
		System.out.println("\n\nComparing two multirotors... \n");
		if(multirotor1.equals(multirotor2)) {
			System.out.println("multirotor 1 equals with multirotor 2");
		} else {
			System.out.println("multirotor 1 NOT equals with multirotor 2");
		}
		
		if(multirotor2.equals(multirotor3)) {
			System.out.println("multirotor 2 equals with multirotor 3");
		} else {
			System.out.println("multirotor 2 NOT equals with multirotor 3");
		}
		
		if(multirotor2.equals(multirotor4)) {
			System.out.println("multirotor 2 equals with multirotor 4");
		} else {
			System.out.println("multirotor 2 NOT equals with multirotor 4");
		}
		
		if(multirotor1.equals(helicopter1)) {
			System.out.println("multirotor 1 equals with helicopter 1");
		} else {
			System.out.println("multirotor 1 NOT equals with helicopter 1");
		}
		
		if(mav1.equals(uav1)) {
			System.out.println("MAV 1 equals with UAV 1");
		} else {
			System.out.println("MAV 1 NOT equals with UAV 1");
		}
		
		if(mav2.equals(mav3)) {
			System.out.println("MAV 2 equals with MAV 3");
		} else {
			System.out.println("MAV 2 NOT equals with MAV 3");
		}
		
		
//		Create 2 arrays, each of 15 to 20 of these flying objects and fill these arrays with various objects
//		from these classes. The first array must include at least one object from each of the classes
		
		System.out.println("\nInitializing two arrays of flying objects...\n");
		System.out.println("The first array of flying objects...");

		Object[] flyingObj1 = new Object[16];
		flyingObj1[0] = airplane1;
		flyingObj1[1] = helicopter1;
		flyingObj1[2] = quadcopter1;
		flyingObj1[3] = multirotor1;
		flyingObj1[4] = multirotor2;
		flyingObj1[5] = multirotor3;
		flyingObj1[6] = multirotor4;
		flyingObj1[7] = uav1;
		flyingObj1[8] = uav2;
		flyingObj1[9] = uav3;
		flyingObj1[10] = agriculturalDrone1;
		flyingObj1[11] = agriculturalDrone2;
		flyingObj1[12] = agriculturalDrone3;
		flyingObj1[13] = mav1;
		flyingObj1[14] = mav2;
		flyingObj1[15] = mav3;
		
//		while the second array should not have any UAV objects.
		
		System.out.println("The second array of flying objects...");

		Object[] flyingObj2 = new Object[20];
		flyingObj2[0] = airplane1;
		flyingObj2[1] = helicopter1;
		flyingObj2[2] = quadcopter1;
		flyingObj2[3] = multirotor1;
		flyingObj2[4] = multirotor2;
		flyingObj2[5] = multirotor3;
		flyingObj2[6] = multirotor4;
		flyingObj2[7] = airplane1;
		flyingObj2[8] = helicopter1;
		flyingObj2[9] = quadcopter1;
		flyingObj2[10] = multirotor1;
		flyingObj2[11] = multirotor2;
		flyingObj2[12] = multirotor3;
		flyingObj2[13] = multirotor4;		
		flyingObj2[14] = airplane1;
		flyingObj2[15] = helicopter1;
		flyingObj2[16] = quadcopter1;
		flyingObj2[17] = multirotor1;
		flyingObj2[18] = multirotor2;
		flyingObj2[19] = multirotor3;
		
//		Finally call the findLeastAndMostExpensiveUAV() once with the first array as a parameter and
//		once with the second array. This should display what is needed!
		
		System.out.println("\nChecking out the first array...\n");

		findLeastAndMostExpensiveUAV(flyingObj1);

		System.out.println("\nChecking out the second array...\n");
		
		findLeastAndMostExpensiveUAV(flyingObj2);
		
	}
	
	public static String objName(Object object) {
		String str = object.getClass().toString();
		String [] s=str.split("\\.", 0);
		
		return s[s.length-1];
	}
}
