
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		VirtualPetShelter shelter = new VirtualPetShelter();
		
		//New Starter Pet
		VirtualPet bigglesworth = new VirtualPet("Bigglesworth", 101, "Siamese", 20, 20, 10);
		shelter.putPet(bigglesworth);
		
		//New Starter Pet
		VirtualPet yoshi = new VirtualPet("Yoshi P", 102,"Husky", 10, 20, 20);
		shelter.putPet(yoshi);
		//System.out.println(yoshi.hunger);
			
		System.out.println("Two new pets have joined the shelter!");
		System.out.println(shelter.shelterPets.values());
		
		//start Do loop here
		System.out.println("\nWelcome to the *Altruistic Hipster* Pet Shelter:\n");
		System.out.println("Thank you for interning. We're happy to not pay you!\n");
		
		System.out.println("This is the current status of your pets: \n");
		
		shelter.displayMenu();
			
		System.out.println("\nWhat would you like to do?");
		System.out.println("1. Feed the Pets.");
		System.out.println("2. Water the Pets.");
		System.out.println("3. Play with a pet");
		System.out.println("4. Adopt a pet");
		System.out.println("5. Admit a pet");
		int userInput = input.nextInt();
		
		
		switch(userInput) {
			case 1:
				if(shelter.displaySize() == 1) {
					System.out.println("Your shelter pet has been fed!");
				} else {
					System.out.println("All " + shelter.displaySize() + " animals have been fed!");
				}
				shelter.feedAll();
				break;
			case 2: 
				if(shelter.displaySize() == 1) {
					System.out.println("Your shelter pet is given water.");
				} else {
					System.out.println("All " + shelter.displaySize() + " animals have been given water!");		
				}
				shelter.drinkAll();
				break;
			case 3:
				System.out.println("These are your current shelter pets: \n");
				//shelter.displayValues();
				shelter.displayEntries();
				System.out.println("\nOur corporate overlords insist we reduce the shelter animals to faceless numbers. Apologies!");
				System.out.println("\nEnter the PET ID of the pet you wish to play with: ");
				int userChoice = input.nextInt();
					if(!shelter.idCheck(userChoice)) {
						System.out.println("\nYour PET ID is invalid.\nEnter the PET ID of the pet you wish to play with: ");
						userChoice = input.nextInt();
					} else {
						System.out.println("\n Pet located. What would you like to do?");
								System.out.println("\n1. Feed\n2. Give Water\n3. Play");
								int userChoice2 = input.nextInt();
								do {
								switch(userChoice2) {
									case 1:
										shelter.getPetFeed(userChoice);
										System.out.println("\nPet is fed! Reminder: pet food is corporate property. Eating is stealing!");
										break;
									case 2:
										shelter.getPetDrink(userChoice);
										System.out.println("\nThe pet drank some water. Questioning your life choices yet?");
										break;
									case 3: 
										shelter.getPetPlay(userChoice);
										System.out.println("The pet plays with you. It relies on you for food, so it has no choice.");
										break;
									default:
										System.out.println("This isn't rocket surgery. Pick 1, 2, or 3");
										userChoice2 = input.nextInt();
								} 
							} while (userChoice2 != 1 && userChoice2 !=2 && userChoice != 3);		
					}		
			case 4:	
			case 5:
				
				
				
		} //end switch
		
		
		
		
		
		
		
		
		input.close();
	} // end main

}
