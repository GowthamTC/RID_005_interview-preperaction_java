package ipday2;


//To get even number count 

public class getEvenNoCount {//class
	
	public static void main(String[] args) {//main
		
		int count=0;
		
		for (int i = 0; i <=10; i++) {// for
			
			if (i % 2 ==0) {//if
				
				count++;
				
			}//if
			

			
		}//for
		
		System.out.println(count);
		
	}//main

}///class



                          
/* 
 * 					    i    %
 * 
 *   i=0    0+1=1       1    1%2   
 *   i=1    1+1=2       2
 *   i=2    2+1=3       3
 *   i=3    3+1=4       4     
 *   i=4    4+1=5       5      
 *   i=5    5+1=6       6      
 *   i=6    6+1=7       7      
 *   i=7    7+1=8       8      
 *   i=8    8+1=9       9      
 *   i=9    9+1=10      10     
 *   i=10   10+1=11     11!=10 loop terminate
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
