public class HelloWorld{
	//all info in main is the only logic that prints.

	public static void main(String[] args) {
		System.out.println("Hello World");

		/*
		Serveral primitive data types in java
		Integer: byte, short, int, long (usually use int)
		Decimal: float, double (usually use float)
		True/False: boolean
		Void: void
		*/

		//datatype varname = value
		int id = 10;
		float price = 9.99f;
		boolean isTrue = true;
		char letter = 'A'; //use single quotes

		System.out.println(id);
		System.out.println(price);
		System.out.println(isTrue);
		System.out.println(letter);

		//Using string
		String greeting = "Hello World";
		System.out.println(greeting);

		//Control Flow (if/then, for loops, while loops, etc)
		int num = -9;
		if (num > 0) {
			System.out.println("Positive");

		} else if (num < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Number is zero.");
		}
		System.out.println("while------------------------------------");
		int counter = 0;
		while (counter < 10) {
			System.out.println(counter);
			counter++;
		}
		System.out.println("for--------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("-----------------------------------------");

		int a = 2; int b = 9;
		//System.out.println(add(a,b));

		int c = add(a,b);
		System.out.println(c);
		System.out.println("-----------------------------------------");

		String name = "Cory Warden";
		System.out.println(name.length());
		System.out.println(name.charAt(3));
	}

	/*
	Outisde of main method
	pieces to method
	Access modifiers - public, private, protected, default
	Non-Access modifiers - static, abstract, final
	Return type - void, int, boolean, etc
	Method name - whatever you'd like to call name
	After that, in parenthesis, place datatypes & arguments going into method.
	*/

	public static int add(int a, int b) {
		return a + b;
	}

	

};
