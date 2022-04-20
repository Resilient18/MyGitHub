package inherit;

public class Parent {

	
	  private int gift = 35; 
	  
	public static void furnish() {
		System.out.println("Classic");
	}
	public void singer() {
		System.out.println("Alicia Keys");
	}
	
	public static void pet() {
		System.out.println("Puppy");
	}
	
	public int getGift() { 
		return gift;
	}
	public void setGift(int a) {
		this.gift =a;
	}
	
}