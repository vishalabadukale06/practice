import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 5, 6, 7 };

		ArrayList ls = new ArrayList();

		for (int i = 0; i < a.length; i++) {

		
				
				ls.add(a[i+1]);

				i--;

				ls.add(a[i]);

		
		
			System.out.println(ls);

		}
	}
}
