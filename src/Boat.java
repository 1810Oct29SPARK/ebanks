public class Boat extends Vehicle {
    //variable declaration, pls don't forget
	private String brand;
	private String color;

    //no args 
    public Boat() {
        super(); //calls the superclass constructor, implicitly added if not included
    }

    //constructor
    public Boat(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    //getters and setters
    public String getBrand() {
        return this.brand;
    }
    public String getColor() {
        return this.color;
    }
    public void setBrand(String brand){
	    this.brand = brand;
    }
    public void setColor(String color){
	    this.color = color;
    }

    //override move()
    @Override
	public void move(){
        System.out.println("Boat is moving in water");
    }
    

}