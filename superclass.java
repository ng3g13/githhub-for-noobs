import java.util.Random;

class superclass{
	Random generator = new Random();
	int random_index(){
		return generator.nextInt(); //return a random int
	}
	
	void polymorphism_example(){
		System.out.println("without polymorphism");
	}
}