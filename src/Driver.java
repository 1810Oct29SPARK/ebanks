
public class Driver {

	public static void main(String[] args) {
		//make some cars
		Car myCar = new Car(2016,"Elantra","Hyundai");
		Car myOtherCar = new Car(2018,"Model M","Tesla");
		myCar.setMilesSinceOilChange(100);
		if(myCar.getMilesSinceOilChange() >= Car.milesBetweenOilChanges){
			System.out.println("Time to change the oil");
		} else {
			int milesLeft = Car.milesBetweenOilChanges - myCar.getMilesSinceOilChange();
			System.out.println("You have "+milesLeft+" miles left.");
		}
	}

	
	public static  void init(){

		
		System.out.println("this is the point of entry into my program");
		
		//make a car object with no set fields
		//declare the variable carOne and assign a new Car to it
		Car carOne = new Car();
		//toString is a method inherited from Object
		System.out.println("carOne: "+carOne.toString());
		
		//make a car object with instance variables set in the constructor
		//declare the variable CarTwo and assign an new Car to it
		Car carTwo = new Car(1972,"DeLorean","DMC");
		//check out the toString result
		System.out.println("carTwo: "+carTwo.toString());
	
		//try to view instance variables of carTwo
		//this does NOT COMPILE		System.out.println(carTwo.model);
		System.out.println("model of carTwo: "+carTwo.getModel());
		
		//reset the model of carTwo
		carTwo.setModel("NotDeLorean");
		System.out.println("model of carTwo: "+carTwo.getModel());
	
		//test out carTwo's inherited move() method
		carTwo.move();


		//new Boat vehicle
		Boat boatOne = new Boat("Kwasaki","Blue");
		System.out.println("boatOne brand: "+boatOne.getBrand());
		System.out.println("boatOne color: "+boatOne.getColor());
		boatOne.move();

		Boat boatTwo = new Boat("Jetson","Green");
		System.out.println("boatTwo brand: "+boatTwo.getBrand());
		System.out.println("boatTwo color: "+boatTwo.getColor());
		boatTwo.move();

		//Declared variable garage which is an array of Vehicles 
		//created an empty arry with give elements and assigned it to a garage
		Vehicle[] garage = new Vehicle[5];
		//add vehicles to array
		garage[0] = carOne; 
		garage[1] = new Boat("The Black Pearl","black"); 
		garage[2] = new Car(1880,"Horse","Horse"); 
		garage[3] = carTwo; 
		garage[4] = new Boat("Boaty McBoatface","green"); 
		for (int i=0; i < garage.length; i++) {
			garage[i].move();
		
	}

	
	}
}


