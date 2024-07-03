package JavaPractice;

import java.util.TreeSet;

public class Class7 {

	public static void main(String[] args) {
		
			String a = "race";
			String b = "care";

			// check string is Anagram or not using Collection
			char[] p = a.toCharArray();

			TreeSet<Character> t1 = new TreeSet<Character>();

			for (int i = 0; i < p.length; i++) {
				t1.add(p[i]);
			}

			char[] s = b.toCharArray();

			TreeSet<Character> t2 = new TreeSet<Character>();

			for (int i = 0; i < s.length; i++) {
				t2.add(s[i]);
			}

			if (t1.equals(t2)) {
				System.out.println("String is anagram");
			} else {
				System.out.println("String is not anagram");

			}

		}
	}


