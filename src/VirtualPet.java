
public class VirtualPet {

	String name;
	String breed;
	int id;
	
	int hunger;
	int thirst;
	int ennui;
	
	int hygiene;
	
	//not currently used:
	int obedience;
	int intelligence;
	
	
	public VirtualPet(String name, int id, String breed, int hunger, int thirst, int ennui) {
		this.name = name;
		this.id = id;
		this.breed = breed;
		this.hunger = hunger;
		this.thirst = thirst;
		this.ennui = ennui;	
		this.hygiene = 10;
	}
	
	public VirtualPet(String userPetName, int userPetId, String userBreed) { 
		this.name = userPetName;
		this.id = userPetId;
		this.breed = userBreed;	
		this.hunger = 30;
		this.thirst = 30;
		this.ennui = 5;
	}
	
	


	@Override
	public String toString() {
		return name;
	}
	
	
	void feed() {
		hunger -= 20;
	}
	
	void drink() {
		thirst -= 20;
	}
	
	void play() {
		ennui =- 15;
	}
	
	void train() {
		obedience += 20;
	}
	
	void clean() {
		hygiene = 10;
	}
	
	
	/*****************
	 * Boolean Tests
	 ******************/
	boolean isClean() {
		return hygiene >= 4;
	}
	
	boolean isHungry() {
		return hunger >= 20;
	}
	
	boolean isThirsty() {
		return thirst >= 20;
	}
	
	boolean isBored() {
		return ennui >= 20;
	}
	
	boolean isAlive() {
		return hunger <= 60 && thirst <= 60;
	}
	
/*******************
 * Tick method
 ******************/
	
	void tick() {
		hunger += 5;
		thirst += 5;
		ennui += 5;
		hygiene -= 1;
	}
	
	
}
