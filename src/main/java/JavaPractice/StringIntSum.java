package JavaPractice;

public class StringIntSum {

	public static void main(String[] args) {

		String c = "b3m2v5";

		int sum = 0;

		char[] v = c.toCharArray();

		for (char n : v) {

			if (Character.isDigit(n)) {

				int num = Character.getNumericValue(n);

				sum += num;
			}

		}
		System.out.println(sum);

	}

}
