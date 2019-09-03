
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
	
	public void displayStats() {
		System.out.println("Tancy's hunger level is " + hunger + ".");
		System.out.println("Tancy's thirst level is " + thirst + ".");
		System.out.println("Tancy's bladder level is " + bladder + ".");
		System.out.println("Tancy's playfulness is " + entertainment + ".");
		System.out.println("Tancy's wakefulness is " + wakefulness + ".");
		
	
	for(int i = 0; i < 0; i++){

		if (hunger == 10){
		System.out.println("Tancy has a full belly!");}
			
		if (thirst == 10){
		System.out.println("Tancy's thirst is quenched");}
		
		if (bladder == 10){ 
		System.out.println("Tancy no longer needs to empty bladder");}

		//feed Tancy
		System.out.println("Would you like to feed Tancy? enter 0 for no, 1 for yes.");
		int a = input.nextInt();
		if (a == 1){
		System.out.println("You fed Tancy some small children!");
		
		}
		
		System.out.println("Give Tancy water? enter 0 for no, 1 for yes.");
		int b = input.nextInt();
		if (b == 1){
		System.out.println("Tancy is no longer thirsty");
		
		}
		
		System.out.println("Take Tancy to restroom? enter 0 for no, 1 for yes.");
		int c = input.nextInt();
		if (c == 1){
		System.out.println("Tancy is feeling much better!");
		
		}
		
		//play with Tancy
				System.out.print("Play with Tancy? enter 0 for no, 1 for yes.");
				int d = input.nextInt();
				if (d == 1){
				System.out.println("You played Jumanji with Tancy!");
				}
		
		System.out.println("Tuck Tancy into bed? enter 0 for no, 1 for yes.");
		int e = input.nextInt();
		if (e == 1){
		System.out.println("Tancy is well rested.");
		
		
		}
		displayStats();
		

		}
		System.out.println("Tancy murdered you and ran off. RIP! Better luck next time.");
		}
		}

