import java.util.Arrays;



public class Demo6 {

	public static void main(String[] args) {
		
		
				int a[] = { 1, 2, 3, 4, 5 ,6};
			

				for (int i = 0; i <= a.length - 1; i++) 
				{
					int temp = a[i];
					a[i] = a[a.length - 1];
					a[a.length - 1] = temp;
				}
				
				System.out.println(Arrays.toString(a));

			}

		}

	
