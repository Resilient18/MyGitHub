package inherit;

public class Child extends Parent {

	public static void main(String[] args) {
		
		pet();   //inheritance - question #1
		
		furnish();  // this will execute the furnish method in the child class and overrides the method in the parent class. 
		
		Child 	sing = new Child();
		sing.singer();
		
		sing.defaul();
		Parent.furnish();                // not inheritance
		
		pet("dog"); // overload
		
		Parent obj = new Parent();
	
		System.out.println(obj.getGift()); // Getter method
		obj.setGift(50);				   // Setter method
		System.out.println(obj.getGift());
			

	}
	public static void furnish() {
		System.out.println("Contemporary");         
	}
	public static String furnish(String sofa) {
		return sofa;
		         
	}
	
	void defaul() {
		System.out.println("Executing Default Access Modifier");
	}
	
	public void singer() {
		super.singer();                 // calling a parent method inside a non static method using the keyword super
		System.out.println("Dua Lipa");
		
		System.out.println("---------------------------------");
		super.furnish();               // calling a static method using the Java keyword super inside a non static method
	}
	
	public static String pet(String dog) {     // to show method override - concept of polymorphism in java - here there is a parameter where as the parent class has none.
		System.out.println("Overload");
		System.out.println("Biscuit");
		return dog;
	}
}

	

