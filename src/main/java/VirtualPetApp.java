public class VirtualPetApp {
	
	//I know I failed this assignment. I honestly thought I had it on Wednesday, but I obviously don't. I'm just going to re-do Module 1 and 2 and re-read the book sections. I'm just struggling with syntax and how to even start codes.
	
	String hunger;	
	String thirst;
	String bladder;
	String entertainment;
	String wakefulness;

	public static void main (String[] args) {
		System.out.println("Congratulations! You have adopted Tancy the tiger! She's adorable. Take care of her or she'll kill you...literally.");
		
		System.out.println("As Tancy's new owner it's up to you to make sure all of her needs are met.");
		System.out.println("Tancy's needs are: Hunger, Thirst, Boredom, and Wakefulness.");
		System.out.println("Each need cannot exceed 10. Keep these values as low as possible.");
		System.out.println("If Tancy's needs are not maintained and don't stay below the maximum range, she will kill you and run off.");
	}
		
	
			public VirtualPetApp(String hunger, String thirst, String boredom, String wakefulness) {
				this.hunger = hunger;
				this.thirst = thirst;
				this.entertainment = boredom;
				this.wakefulness = wakefulness;
			}
			
			public void displayStats() {
				System.out.println("Tancy's hunger level is " + hunger + ".");
				System.out.println("Tancy's thirst level is " + thirst + ".");
				System.out.println("Tancy's boredom is " + entertainment + ".");
				System.out.println("Tancy's wakefulness is " + wakefulness + ".");
		
	
			
			if (hunger || thirst || boredom || entertainment || wakefulness !< 1); {
				  System.out.println("Tancy murdered you and ran off. RIP! Better luck next time.");
				}
				else {
				  System.out.println(displayStats + //ask player to choose an option);
				}
				
			for(int i = 0; i < 0; i++){

				if (hunger <= 3){
				System.out.println("Tancy is starving and looking at you like food!");}
					
				if (thirst <= 2){
				System.out.println("Tancy is dehydrated");}
				
				if (boredom <= 3){ 
				System.out.println("Tancy is super bored!");}
				
				if (wakefulness <= 3) {
					System.out.println("Tancy is falling asleep. Zzz");
				}

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
				
				
				//play with Tancy
						System.out.print("Play with Tancy? enter 0 for no, 1 for yes.");
						int c = input.nextInt();
						if (c == 1){
						System.out.println("You played Jumanji with Tancy!");
						}
				
				System.out.println("Tuck Tancy into bed? enter 0 for no, 1 for yes.");
				int d = input.nextInt();
				if (d == 1){
				System.out.println("Tancy is well rested.");
				}


			
	}