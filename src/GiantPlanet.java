
/**
 * Name: Viral
 * Modified: February 23, 2015
 * Description: GiantPlanet class which has constructor with parameter from its superclass 
 * 				and implements two interfaces
 */

//Class extends its superclass and two subclasses 
public class GiantPlanet extends Planet implements IHasMoons, IHasRings {
	
	// Private String variable 
	private String type;
	
	//Public constructor with parameter of its superclass
	public GiantPlanet(double diameter, double mass, String name, String type) {      
		super(diameter, mass, name);
		this.type = type;
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
	
	//hasRings method returns true if ring property is greater then 0
	public boolean hasRings() {
		if (super.getRingCount() > 0) {
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
