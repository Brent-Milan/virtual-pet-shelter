import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;

public class VirtualPetShelter {
	
	Map<Integer, VirtualPet> shelterPets = new HashMap<Integer, VirtualPet>();

	void putPet(VirtualPet pet) {
		shelterPets.put(pet.id, pet);
	}
	
	
	void displayMenu() {
		System.out.println(" Name\t     | hunger | thirst | ennui |");
		System.out.println("--------------------------------------");
		for(VirtualPet current: shelterPets.values()) {
			System.out.println(current + ": \t " + current.hunger + "\t " +current.thirst + "\t " + current.ennui);	
		}
	}
	
	int displaySize() {
		return shelterPets.size();
	}
	
	void displayValues() {
		int i = 1;
		for(VirtualPet current: shelterPets.values()) {
			for(int x = 1; x < shelterPets.size(); x++) {
				System.out.println(i + ". " + current);
				i += 1;
			}
		}
	}
	
	void displayEntries() {
		for(Entry<Integer, VirtualPet> current: shelterPets.entrySet()) {
				int petID = current.getKey();
				VirtualPet pet = current.getValue();
				System.out.println("ID: " + petID + "  Name: " + pet.name); 
		}
	}

	
	void feedAll() {
		for(VirtualPet current: shelterPets.values()){
			current.feed();
		} 
	} 
	
	void drinkAll() {
		for(VirtualPet current: shelterPets.values()){
			current.drink();
		}
	}
	
	void getPetFeed(int number) {
		VirtualPet petX = shelterPets.get(number);
		petX.feed();
	}
	
	void getPetDrink(int number) {
		VirtualPet petX = shelterPets.get(number);
		petX.drink();
	}
	
	void getPetPlay(int number){
		VirtualPet petX = shelterPets.get(number);
		petX.play();
	}
	
	
	boolean idCheck(int number) {
		return shelterPets.containsKey(number);
	}
	
	
	
	
	
} //end class
	
	
	
//	void displayEntries() {
//		for(VirtualPet current: shelterPets.values()) {
//			System.out.println(current + ": " + current.hunger + " hunger, " + current.thirst + " thirst, " + current.ennui + " ennui.");	
//		}
//	}
//	