/*
  	ISYS 320
  	Name(s):Drew Schulte
  	Date: 3/17/2018
*/

public class RestaurantBillComputer {
	public static void main(String[] args) {
		
		double bill = 20; 
		double tax = .05; 
		double tip1 = .15;
		double tip2 = .18;
		double tip3 = .2;
		
		
		System.out.println("with a 15% tip the total would be");
		System.out.println((bill * tax) + (bill * tip1) + bill);
		
		System.out.println("with a 18% tip the total would be");
		System.out.println((bill * tax) + (bill * tip2) + bill);
		
		System.out.println("with a 20% tip the total would be:");
		System.out.println((bill * tax) + (bill * tip3) + bill);
	}
}