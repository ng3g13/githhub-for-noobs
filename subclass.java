//external class with data size and actions setter+getter

class subclass extends superclass{ //inheritance
	enum FruitSize{ SMALL, MEDIUM, LARGE }
	private FruitSize size; //encapsulation
	superclass superobject = new superclass();
	
	void setter(FruitSize lolz){
		size = lolz;
	}
	
	FruitSize getter(){
		return size;
	}
	
	int randz(){
		return superobject.random_index();
	}
	
	
	//comment this in to enable override of superclass method.
	//void polymorphism_example(){
	//	System.out.println("with polymorphism");
	//}
	
	void call_polymorphism_example(){
		polymorphism_example();
	}
}