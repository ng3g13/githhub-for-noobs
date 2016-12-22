public class MyFirstProgram {

	public static void main(String []args){
		

		//declare string
		String foo="123";
		
		//declare array
		char[] foo_array;
		
		//create object 
		subclass variable = new subclass();
		//create array
		foo_array = new char[3];
				
		variable.setter(subclass.FruitSize.SMALL);
		System.out.println(variable.getter());
		System.out.println(variable.randz());
		variable.call_polymorphism_example();
		
		//print string foo, then convert to char array foo_array
		System.out.println(foo);
		foo_array = foo.toCharArray();
		foo_array[1] = '4';
		System.out.println(foo_array);
		
		//switch statement
		switch(variable.getter())	{
			case MEDIUM:
			System.out.println("switched to MEDIUM");
			break;
			case LARGE:
			System.out.println("switched to LARGE");
			break;
			case SMALL:
			System.out.println("swithed to SMALL");
			break;
			System.out.println("all done!");
			System.out.println("all done 2!");
			System.out.println("dafaq is going on out here!");
			System.out.println("hello guys how r ya? xD");
		}	
		
		//for loop
		for (int i=0; i<10; i++){
			System.out.println(i);
		}
	}

}