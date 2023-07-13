package project.part2;


import package1.Airplane;
import package2.Helicopter;
import package2.Quadcopter;
import package3.Multirotor;
import package4.UAV;
import package5.AgriculturalDrone;
import package5.MAV;

//----------------------------------------------------
//Project
//Project A Part 2
//Written by : Linlin Xie 2343895, Qingjun Bao 2398022, Zhi Li 0645750, 
//----------------------------------------------------
public class Driver {
	
	// create copyFlyingObjects array method
	public static <T extends Airplane> Airplane[] copyFlyingObjects(T[] flyingObjects) {

		Airplane[] copyArray = new Airplane[flyingObjects.length];
		for (int i = 0; i < flyingObjects.length; i++) {
			copyArray[i] = flyingObjects[i];
		}
		return copyArray;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create objects from Airplane class
        Airplane airplane1 = new Airplane("Boeing", 1000000.0, 2000);
        Airplane airplane2 = new Airplane("Airbus", 1500000.0, 2500);
        Airplane airplane3 = new Airplane("Cessna", 800000.0, 1800);

        // Create objects from Helicopter class
        Helicopter helicopter1 = new Helicopter("Bell", 500000.0, 1500, 6, 2010, 8);
        Helicopter helicopter2 = new Helicopter("Robinson", 250000.0, 1800, 4, 2018, 4);
        Helicopter helicopter3 = new Helicopter("Eurocopter", 400000.0, 1500, 5, 2015, 6);

        // Create objects from Quadcopter class
        Quadcopter quadcopter1 = new Quadcopter("DJI", 2000.0, 100, 4, 2022, 2, 60);
        Quadcopter quadcopter2 = new Quadcopter("Yuneec", 1800.0, 900, 6, 2020, 2, 80);
        Quadcopter quadcopter3 = new Quadcopter("Autel Robotics", 2500.0, 1200, 8, 2021, 4, 100);

        // Create objects from Multirotor class
        Multirotor multirotor1 = new Multirotor("Yuneec", 1500.0, 800, 8, 2015, 4, 8);
        Multirotor multirotor2 = new Multirotor("DJI", 1200.0, 700, 6, 2019, 3, 6);
        Multirotor multirotor3 = new Multirotor("Freefly", 1000.0, 600, 4, 2017, 2, 4);

        // Create objects from UAV class
        UAV uav1 = new UAV(10.5, 500.0);
        UAV uav2 = new UAV(8.2, 600.0);
       

        // Create objects from AgriculturalDrone class
        AgriculturalDrone agriculturalDrone1 = new AgriculturalDrone(5.7, 2000.0, "John Deere", 10);
        AgriculturalDrone agriculturalDrone2 = new AgriculturalDrone(3.5, 1500.0, "SenseFly", 6);
        AgriculturalDrone agriculturalDrone3 = new AgriculturalDrone(2.1, 1000.0, "DJI", 8);

        // Create objects from MAV class
        MAV mav1 = new MAV(2.3, 1000.0, "Nano MAV", 50.0);
        MAV mav2 = new MAV(1.8, 800.0, "MicroDrone", 40.0);
        MAV mav3 = new MAV(1.5, 600.0, "PowerVision", 30.0);

        // Create an array to store all objects
        Airplane[] flyingObjects = new Airplane[] {
            airplane1, airplane2, airplane3,
            helicopter1, helicopter2, helicopter3,
            quadcopter1, quadcopter2, quadcopter3,
            multirotor1, multirotor2, multirotor3,
            uav1, uav2, 
            agriculturalDrone1, agriculturalDrone2, agriculturalDrone3,
            mav1, mav2, mav3
        };

        // print out the objects in the flyingObjects array
        System.out.println("This is original flying objects array: ");
        System.out.println("=========================================================================================");
        for (Airplane flyingObject : flyingObjects) {
            System.out.println(flyingObject);
        }
        System.out.println();
        
        // call copyFlyingObjects array method
        Airplane[] copiedArray = copyFlyingObjects(flyingObjects);
        
        System.out.println("This is copied flying objects array: ");
        System.out.println("=========================================================================================");
        //print out the copiedArray
        for (Airplane flyingObject : copiedArray) {
        	 System.out.println(flyingObject);
        	
        }
	}

}
