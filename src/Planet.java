/**
 * Name: Viral
 * Modified: February 23, 2015
 * Description: Abstract class which has all the private properties, constructor and methods
 */
//abstract class
public abstract class Planet {

	//private properties
	private double diameter;
	private double mass;
	private int moonCount;
	private String name;
	private double orbitalPeriod;
	private int ringCount;
	private double rotationPeriod;

	//parameterized constructor
	public Planet(double diameter, double mass, String name) {
		super();
		this.diameter = diameter;
		this.mass = mass;
		this.name = name;
	}

	public int getMoonCount() {
		return moonCount;
	}

	public void setMoonCount(int moonCount) {
		this.moonCount = moonCount;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(double orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}

	public int getRingCount() {
		return ringCount;
	}

	public void setRingCount(int ringCount) {
		this.ringCount = ringCount;
	}

	public double getRotationPeriod() {
		return rotationPeriod;
	}

	public void setRotationPeriod(double rotationPeriod) {
		this.rotationPeriod = rotationPeriod;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getMass() {
		return mass;
	}

	public String getName() {
		return name;
	}

	//override method to display properties to console
	@Override
	public String toString() {
		return "Planet Properties: \nName: " + name + " \nDiameter: " + diameter + " \nMass: "+ mass;
	}
}
