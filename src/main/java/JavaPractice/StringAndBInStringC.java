package JavaPractice;

public class StringAndBInStringC {

	public static void main(String[] args) {

		String s1 = "ABDDEFH";
		String s2 = "CDEFPQRS";
		
		String s3 = "ABDDEFHCDEFPQRS";
		
		int s3SizeBefore = s3.length();
		
		String s4 = s1 + s2 ;
		
		int s4Size = s4.length();
		
		char [] c = s4.toCharArray();
		
		for(int i=0;i<=c.length-1;i++) {
			
			String subS3 = "";
			
			int count = 0 ;
			
			char [] v = s3.toCharArray();
			
			for(int j=0;j<=v.length-1;j++) { 
				
				if(v[j]==c[i]) {
					
					count += 1;
					
					if(count > 1) {
						
						subS3 += v[j] ;
					}
				}
				
				else {
					
					subS3 += v[j];
				}
			}
			
			s3 = subS3 ;	
			System.out.println(s3);
		}
		
		int s3SizeAfter = s3.length();
		
		if((s3SizeBefore-s3SizeAfter)==s4Size) {
			
			System.out.println("s1 and s2 String are present in String s3");
		}
		else {
			
			System.out.println("s1 and s2 String are not present in String s3");
		}

	}

	}
