package week1.day1;

public class Mobile {
	
	
	
	public void makecall() {
		
		System.out.println("Please call me");
		
	}
	
	public void sendmsg() {
		
		System.out.println("Check your message");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mobile obj = new Mobile();

		System.out.println("My First Mobile Program");
		obj.makecall();
		obj.sendmsg();
	}

}
