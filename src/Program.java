/* Name: Viral
 * Modified: February 23, 2015
 * Description: Program class has two objects created of GiantPlanet and TerrestrialPlanet class  
 */

//class contains main method 
public class Program {

	public static void main(String args[]) {
		
		//created object of GiantPlanet class and passed values to parameters
		GiantPlanet saturn = new GiantPlanet(5, 550, "Saturn", "Ice");	
		System.out.println(saturn);	

		//created object of TerrestrialPlanets class and passed values to parameters
		TerrestrialPlanet jupiter = new TerrestrialPlanet(7, 770, "Jupiter", false);	
		System.out.println(jupiter);	
		}	
	}
