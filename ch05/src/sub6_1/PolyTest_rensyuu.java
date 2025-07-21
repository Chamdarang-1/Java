package sub6_1;



public class PolyTest_rensyuu {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		printSound(dog);
		printSound(cat);
	
	}
	
	public static void printSound(Pet pet) { // << static을 사용해야 한다.
		pet.makeSound();
	}
}
