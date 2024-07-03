
public class Demo7 {

	public static void main(String[] args) {

//		String a = "automationjavajavaisjavajava";
//
//		String n = "";
//
//		// write java code to indetify how many time "java" occured in the string
//
//		for (int i = 0; i < a.length(); i++) {
//
//			if (a.charAt(i) == ) {
//
//				n += a.charAt(i);
//			}
//			
//		}
//
		String str = "automationjavajavaisjavajava";
		String findStr = "java";
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {
			lastIndex = str.indexOf(findStr, lastIndex);
			System.out.println(lastIndex);

			if (lastIndex != -1) {
				count++;
				lastIndex += findStr.length();
			}
		}

		System.out.println("Number of occurrences: " + count);
	}

}
