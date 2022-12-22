package ipday3;

import java.util.Set;
import java.util.TreeSet;

public class rmvDuplicateArray {
	
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,10,30,50,60};
		
		Set<Integer> s=new TreeSet<>();
		
		for (int i = 0; i < a.length; i++) {
			
			s.add(a[i]);
			
			
		}
		
		System.out.println(s);
		
		
	}
	
	
	
	

}
