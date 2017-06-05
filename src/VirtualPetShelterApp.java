

import java.util.Scanner;



public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		VirtualPetShelter shelter = new VirtualPetShelter();
		VirtualRescuePets rescue = new VirtualRescuePets();
		
		//New Starter Pet
		VirtualPet bigglesworth = new VirtualPet("Bigglesworth", 101, "Siamese", 20, 20, 10);
		shelter.putPet(bigglesworth);
		
		//New Starter Pet
		VirtualPet yoshi = new VirtualPet("Yoshi P", 102,"Husky", 10, 20, 20);
		shelter.putPet(yoshi);
			
		System.out.println("Two new pets have joined the shelter!");
		System.out.println(shelter.shelterPets.values());

		
		do {
			System.out.println("\n----------------------------------------------------");
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
					shelter.allTick();
					break;
				case 2: 
					if(shelter.displaySize() == 1) {
						System.out.println("Your shelter pet is given water.");
					} else {
						System.out.println("All " + shelter.displaySize() + " animals have been given water!");		
					}
					shelter.drinkAll();
					shelter.allTick();
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

									switch(userChoice2) {
									case 1:
										shelter.getPetFeed(userChoice);
										System.out.println("\nPet is fed! Reminder: pet food is corporate property. Eating is stealing!");
										shelter.allTick();
										break;
									case 2:
										shelter.getPetDrink(userChoice);
										System.out.println("\nThe pet drank some water. Questioning your life choices yet?");
										shelter.allTick();
										break;
									case 3: 
										shelter.getPetPlay(userChoice);
										System.out.println("The pet plays with you. It relies on you for food, so it has no choice.");
										shelter.allTick();
										break;
									default:
										System.out.println("This isn't rocket surgery. Go back to the main menu.");
									}
						}
						shelter.allTick();
						break;
				case 4:	
					System.out.println("You've chosen to adopt! That's a lot of responsiblity for someone that doesn't have their life together.");
					System.out.println("\nOur corporate overlords insist we reduce the shelter animals to faceless numbers. Apologies!\n");
					shelter.displayEntries();
					System.out.println("\nEnter the PET ID of the pet you wish to adopt....forever: ");
					int userChoice3 = input.nextInt();
						if(!shelter.idCheck(userChoice3)) {
							System.out.println("\nYour PET ID is invalid.\nEnter the PET ID of the pet you wish to play with: ");
							userChoice3 = input.nextInt();
						} else {
							shelter.adopt(userChoice3);
							System.out.println("Congratulations on your new pet! The adoption fees are non-refundable, by the way.");
						}
						shelter.allTick();
						break;
				case 5:
					System.out.println("You've chosen to admit a pet of your own.\n");
					System.out.println("Please enter the pet's name: ");
					String userPetName = input.next();
					
					System.out.println("\nPlease enter the pet breed or species: ");
					String userBreed = input.next();
					
					System.out.println("\nFinally, enter a Pet ID number. Preferably three digits.");
					int userPetId = input.nextInt();
					
					VirtualPet newbie = new VirtualPet(userPetName, userPetId, userBreed);
					shelter.putPet(newbie);
					System.out.println("\nYour new pet has joined the shelter. Gods help us.");
					shelter.allTick();
				default: 
					System.out.println("\nIf you keep typing gibberish, there will be a mandatory drug test");
					shelter.allTick();
			} //end switch
		
		} while (shelter.allAlive());
		
		
		System.out.println("Well, it seems you've killed a pet. Either it starved, died of thirst, or simply succumbed to utter boredom.");
		System.out.println("\nIt's safe to assume murder goes on your permanent record.");
		System.exit(0);
		
		
		
		
		input.close();
	} // end main

	
	
//	if (userChoice2 == 1) {
//	shelter.getPetFeed(userChoice);
//	System.out.println("\nPet is fed! Reminder: pet food is corporate property. Eating is stealing!");
//} else if (userChoice2 == 2) {
//	shelter.getPetDrink(userChoice);
////	System.out.println("\nThe pet drank some water. Questioning your life choices yet?");
//} else if (userChoice2 == 3) {
//	shelter.getPetPlay(userChoice);
//	System.out.println("The pet plays with you. It relies on you for food, so it has no choice.");
//} else {
//	System.out.println("Invalid input.");
//}	
	
	
	
	
}
