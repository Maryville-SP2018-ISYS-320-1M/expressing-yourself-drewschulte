/*
  	ISYS 320
  	Name(s):Drew Schulte
  	Date: 3/17/2018
*/

public class ComputePay {
	public static void main(String[] args) {
		
		int hoursworked = 4 + 5 + 8 + 4; 
		double hourlypay = 8.75; 
		System.out.println("My total hours worked:");
		System.out.println(hoursworked);
		
		System.out.println("My hourly salary:");
		System.out.println(hourlypay);
		
		System.out.println("My total pay:");
		System.out.println(hourlypay * hoursworked);
	}
}