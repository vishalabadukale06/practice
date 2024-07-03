import java.util.ArrayList;

public class Demo11 {

	public static void main(String[] args) {

		int[] a1 = { 10, 20 };
		int[] a2 = { 30, 40, 50 };
		int[] a3 = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {

			a3[i] += a1[i];
		}
		for (int j = 0; j < a2.length; j++) {

			a3[j + a1.length] += a2[j];
		}

		ArrayList ls = new ArrayList();

		for (int j = 0; j < a3.length; j++) {

			ls.add(a3[j]);

		}
		ls.add(1, a3[2]);
		
		ls.remove(3);
		
		System.out.println(ls);

	}

	// output a3[10,30,20,40,50]
}
