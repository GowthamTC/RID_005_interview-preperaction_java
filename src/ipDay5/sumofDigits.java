package ipDay5;


// sum of digits 

public class sumofDigits {
	public static void main(String[] args) {
		
		
		int num=87687;
		
		int rem=0;
		int rev=0;
		
		while (num > 0) {
			
			rem= num % 10;
			
			rev= rev + rem ;
			
			num= num / 10;
			
		}
		
		System.out.println("Sum of digits   "+rev);
		
		
	}
	

}
