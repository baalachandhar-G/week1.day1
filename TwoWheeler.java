package week1.day1;

public class TwoWheeler {
	
	int NoOfWheels=4;
	short noofMirros=5;
	long ChasisNumber=23456789L;
	boolean isPunctured= true;
	String bikename="royal enfield";
	double runningKM=1500.34;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler TW= new TwoWheeler();
		
		System.out.println(TW.NoOfWheels);
		System.out.println(TW.noofMirros);
		System.out.println(TW.ChasisNumber);
		System.out.println(TW.bikename);
		System.out.println(TW.runningKM);
		System.out.println(TW.isPunctured);
	}

}
