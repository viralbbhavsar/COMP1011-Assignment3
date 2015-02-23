/**
 * Name: Viral
 * Modified: February 23, 2015
 * Description: TerrestrialPlanet class which has constructor with parameter from its superclass 
 * 				and implements two interfaces
 */

public class TerrestrialPlanet extends Planet implements IHabitable, IHasMoons {
	
	//private variable
	private boolean oxygen;

	// parameterized constructor
	public TerrestrialPlanet(double diameter, double mass, String name, boolean oxygen) {
		super(diameter, mass, name);
		this.oxygen = oxygen;
	}

	//habitable method returns true if oxygen is set to true
	public boolean habitable() {
		if(oxygen) {
			return true;	
		}
		else return false;
	}
	
	// hasMoons method returns true if moon property is greater then 0
	public boolean hasMoons() {
		if (super.getMoonCount() > 0) {
			return true;	
		}
		else {
			return false;	
		}
	}

	//override method to display properties to console
	@Override
	public String toString() {
		
		return super.toString();	
	}

}	