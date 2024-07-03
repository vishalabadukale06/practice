public class Ch7 {

	public static void main(String[] args) {

		String v = "cjkyytsrjjhbvmhjn";

		String abc = "";

		String c = "";

		for (int i = 0; i <= v.length(); i++) {

			for (int j = i + 1; j < v.length(); j++) {

				if (v.charAt(i) == (v.charAt(j))) {

					abc += v.charAt(i);

				} else {

					if (j == v.length() - 1) {

						c += v.charAt(i);

					}
					continue;
				}

			}

		}
		System.out.println(c);
	}


}