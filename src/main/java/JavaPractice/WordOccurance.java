package JavaPractice;

public class WordOccurance {

	public static void main(String[] args) {

		String a = "java selenium java cucumber selenium java";
 
		String[] v = a.split(" ");

		int cc = v.length;

		String[] y = new String[cc];

		for (int u = 0; u <= y.length - 1; u++) {

			y[u] = v[u];

		}
		String m = "";

		String vv = "";

		for (int i = 0; i <= y.length - 1; i++) {

			String n = "";

			m += y[i] + " ";

			n += m;

			int count = 1;

			for (int j = i + 1; j <= y.length - 1; j++) {

				if (y[i].equals(y[j])) {

					count += 1;
				}

				else {

					n += y[j] + " ";
				}
			}

			String[] q = n.split(" ");

			y = new String[q.length];

			for (int s = 0; s <= q.length - 1; s++) {

				y[s] = q[s];
			}

			vv += count;
		}
		
		for (int u = 0; u <= y.length - 1; u++) {

			y[u] += "=" + vv.charAt(u);

			System.out.println(y[u]);

		}
	}
}
