public class Ch44 {

	public static void main(String[] args) {

		String abc = "publicpusgdlhhs";

		int[] n = new int[abc.length()];

		char[] ls = abc.toCharArray();

		String cv = "";
		String cb = "";

		for (int i = 0; i < abc.length(); i++) {

			n[i] = 1;

			for (int j = i + 1; j < abc.length(); j++) {

				if (ls[i] == ls[j]) {

					n[i]++;

					ls[j] = '-';

 				}

			}
		}

		for (int i = 0; i < abc.length(); i++) {

			if (n[i] == 1 && ls[i] != ' ' && ls[i] != '-') {

				cv += ls[i];

			}
		}

		for (int i = 0; i < abc.length(); i++) {

			for (int j = i + 1; j < abc.length(); j++) {

				if (abc.charAt(i) == abc.charAt(j)) {

				}

			}

		}
		System.out.println(cb);
	}

}