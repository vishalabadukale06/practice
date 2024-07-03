package JavaPractice;

public class AnagramProgram {
	
	public static void main(String [] args) {
	
	String c = "race";
	String v = "care";
	
	
	char [] cc = c.toCharArray();
	
	
	for(char nn : cc) {
		
		String n = "" ;
		
		int count = 0;
		
		char [] vv = v.toCharArray();
		
		for(char mm : vv) {
			
			if(nn==mm) {
				
			   count += 1;	
			  
			   if(count > 1 ) {
				    
				   n += mm;  
			   }
			}
			else {
				
				n += mm;
			}
		}
		//System.out.println(count);
		//System.out.println(n);
		v = n;
	}
	
	if(v.equals("")) {
		
		System.out.println("v is anagram String");
	}
	
	else {
		
		System.out.println("v is not anagram String");
	}
	
	
  
	
	
	
	

}
}