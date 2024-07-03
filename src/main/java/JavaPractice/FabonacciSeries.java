package JavaPractice;

public class FabonacciSeries {

	public static void main(String[] args) {
		
		int c = 0;
		
		int n = 1;
		
		int m = 0; 
		
		
		for(int i=0;i<=10;i++) {
			
			m = c+n;
			
			for(int j=1;j<=1;j++) {
				
				c = n+m;
			}
			
			for(int q=1;q<=1;q++) {
				
				n=c+m;
			}
			System.out.print(m+" ");
			System.out.print(c+" ");
			System.out.print(n+" ");
		
			
		}
		
		
	}

}
