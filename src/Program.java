/* Name: Viral
 * Modified: February 23, 2015
 * Description: Program class  
 */
public class Program {

	public static void main(String args[]) {
		GiantPlanet saturn = new GiantPlanet(5, 550, "Saturn", "Ice");	
		System.out.println(saturn);	

		TerrestrialPlanet jupiter = new TerrestrialPlanet(7, 770, "Jupiter", false);	
		System.out.println(jupiter);	
		}	
	}
