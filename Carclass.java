package week1.day1;

public class Carclass {
	
	
	
	public void  applyBreak() {
	
		System.out.println("Please apply the break");
		
	}
	
	public void applyGear() {
		
		System.out.println("Please Switch on to Next Gear");
	}
	
	public void switchonAC() {
		System.out.println("Switch on the Current AC");
	}
	
	public void applyAcclerate() {
		
	 System.out.println("Apply Acclerate for Moving");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carclass obj= new Carclass();
		obj.applyAcclerate();
		obj.switchonAC();
		obj.applyGear();
		obj.applyBreak();
	}

}
