package ipday2;

public class summof0to10 {
	
	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i = 0; i <=10; i++) {
			
			
			sum=sum+i;
			
			
		}
		
		System.out.println(sum);
	}

}


/*						i   +  sum
 * 
 *   i=0    0+1=1       1      1+    
 *   i=1    1+1=2       2      2+1=3
 *   i=2    2+1=3       3      3+3=6
 *   i=3    3+1=4       4      4+6=10
 *   i=4    4+1=5       5      5+10=15
 *   i=5    5+1=6       6      6+15=21
 *   i=6    6+1=7       7      7+21=28
 *   i=7    7+1=8       8      8+28=36
 *   i=8    8+1=9       9      9+36=45
 *   i=9    9+1=10      10     10+45=55
 *   i=10   10+1=11     11!=10 loop terminate
 * 
 * 
 * 
 * 
 * 
 * */
