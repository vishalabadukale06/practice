package JavaPractice;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String c = "selenium";
		
		String e = "" ;

		for (int i = 0; i <= c.length() - 1; i++) {

			String n = "";

			e += c.charAt(i);

			for (int j = i + 1; j <= c.length() - 1; j++) {

				if (c.charAt(i) == c.charAt(j)) {

					continue;
					
				} else {

					n += c.charAt(j);
				}
			}
			c = e+n;
		}

		System.out.println(c);
	}

}