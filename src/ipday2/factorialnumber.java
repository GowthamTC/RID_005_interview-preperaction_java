package ipday2;

public class factorialnumber {
	
	// factorial of given number
	
	public static void main(String[] args) {
		
		int num=5;
		int fact=1;  // anything X 0 =0 so we use 1
		
		for (int i = 1; i <=num; i++) {  //i=1
			
			fact=fact * i;
			
		}
		
		System.out.println("Factorial or "+num+" is "+fact);
		
		
	}

}
