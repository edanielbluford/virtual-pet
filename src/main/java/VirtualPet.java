
public class VirtualPet {
	String hunger;	
	String thirst;
	String bladder;
	String entertainment;
	String wakefulness; 
	
	
	public VirtualPet(String hunger, String thirst, String bladder, String entertainment, String wakefulness) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.bladder = bladder;
		this.entertainment = entertainment;
		this.wakefulness = wakefulness;
	}
}
	
	//Beginning of the game all except bladder behaviors are @ 50. Bladder is @ 0
	
	// Tancy is hungry if her hunger falls below 40
	// Tancy is really hungry if her hunger falls below 20
	// Tancy is starving if hunger falls below 10
	// Tancy will break out of her enclosure and devour you if hunger falls below 0

//Tancy is thirsty if her thirst falls below 30
//Tancy is dehydrated if her thirst falls below 10
//Tancy is delirious and will maul you by accident if thirst falls to 0

//Tancy needs to go potty if her bladder is above 20
//Tancy will start getting antsy if her bladder is above 30
//Tancy will drown you in waste if her bladder gets to 50
