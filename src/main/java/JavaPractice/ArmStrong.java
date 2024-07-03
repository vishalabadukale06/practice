package JavaPractice;

public class ArmStrong {

	public static void main(String[] args) {

		int v = 370;

		String c = "";

		c += v;

		int ls = c.length();

		int sum = 0;

		for (int i = 0; i <= c.length() - 1; i++) {

			String str = "";

			char chr = c.charAt(i);

			str += chr;

			int sNo = Integer.parseInt(str);

			double sq = Math.pow(sNo, ls);

			System.out.println(sq);

			sum += sq;
		}

		System.out.println(sum);

		if (v == sum) {

			System.out.println(v + " is ArmStrong number");
		}

		else {

			System.out.println(v + " is not ArmStrong number");
		}

	}

}
