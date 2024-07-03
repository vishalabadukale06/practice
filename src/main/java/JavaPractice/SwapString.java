package JavaPractice;

public class SwapString {

	public static void main(String[] args) {
		String a = "java";
		String b = "selenium";

		String c = a+b;
		
		b = c.substring(0,c.length()-b.length());
		a = c.substring(b.length());
       
		System.out.println(b);
		System.out.println(a);
	}

}
