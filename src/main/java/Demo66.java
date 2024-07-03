public class Demo66 {

	public static void main(String[] args) {

		String a = "automationjavajavaisjavajava";

		int fromIndex = 0;

		String str = "java";

		int count = 0;

		while (fromIndex != -1) {

			fromIndex = a.indexOf(str, fromIndex);

			if (fromIndex != -1) {

				count += 1;

				fromIndex += str.length();

			}
		}
		
		System.out.println("Number of Occurance is " + count);


	}

}
