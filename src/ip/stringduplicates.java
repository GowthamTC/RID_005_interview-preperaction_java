package ip;
// To get duplicates in string
public class stringduplicates {
	
	public static void main(String[] args) {
		
		String s="Annamalai University";
		
		for (int i = 0; i < s.length(); i++) {
			
		
			char  az= s.charAt(i);
			
			if (az=='n') {
				
				System.out.println(az);
				System.out.println(i);
				
			}
							
		}
		
	}
	
}
